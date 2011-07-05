package nl.dslmeinte.xtext.sgml.dtd;

import java.util.HashMap;
import java.util.Map;

import nl.dslmeinte.ecore.util.ToEcoreTransformerSupport;
import nl.dslmeinte.xtext.dtd.DTDModelUtil;
import nl.dslmeinte.xtext.dtd.dtdModel.Alternatives;
import nl.dslmeinte.xtext.dtd.dtdModel.Attribute;
import nl.dslmeinte.xtext.dtd.dtdModel.Cardinality;
import nl.dslmeinte.xtext.dtd.dtdModel.Concatenation;
import nl.dslmeinte.xtext.dtd.dtdModel.Definition;
import nl.dslmeinte.xtext.dtd.dtdModel.DocumentTypeDefinition;
import nl.dslmeinte.xtext.dtd.dtdModel.Element;
import nl.dslmeinte.xtext.dtd.dtdModel.ElementReference;
import nl.dslmeinte.xtext.dtd.dtdModel.EmptyContent;
import nl.dslmeinte.xtext.dtd.dtdModel.Expression;
import nl.dslmeinte.xtext.dtd.dtdModel.PCData;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * Class to transform a DTD definition (file) to an Ecore model, representing
 * the same hierarchy. This version uses "synthetic" classes to try and provide
 * more type safety within the Ecore models - however, this version doesn't
 * work...
 * <p>
 * I'm using Java instead of Xtend (which would be more convenient/comfortable)
 * because that would mean learning another language, the particulars of the
 * Xtend runtime engine and configuring a launch configuration (MWE2 file or
 * such).
 * 
 * @author Meinte Boersma
 */
@Deprecated
public class DTD2EcoreWithSyntheticsTransformer extends ToEcoreTransformerSupport {

	private final Logger logger = Logger.getLogger(getClass());

	/**
	 * The source.
	 */
	private final DocumentTypeDefinition dtdDefinition;

	public DTD2EcoreWithSyntheticsTransformer(DocumentTypeDefinition dtdDefinition) {
		this.dtdDefinition = dtdDefinition;
	}

	public EPackage transform() {
		for( Definition def : dtdDefinition.getDefinitions() ) {
			if( def instanceof Element ) {
				map((Element) def);
			}
		}
		return ePackage;
	}

	private final Map<Element, EClass> element2eClassMap = new HashMap<Element, EClass>();

	/**
	 * Maps {@link Element} &rarr; top-level {@link EClass}, taking care of
	 * containment and memoisation.
	 */
	private EClass map(Element element) {
		if( element2eClassMap.containsKey(element) ) {
			return element2eClassMap.get(element);
		}

		EClass eClass = createClass(element.getName());
		handleContent(element, eClass);
		element2eClassMap.put(element, eClass);

		return eClass;
	}

	/*
	 * +-----------------------+
	 * | Actual transformation |
	 * +-----------------------+
	 */

	/**
	 * Handles the content of {@link Element} by mapping it and containing it in
	 * the given {@link EClass}.
	 */
	private void handleContent(Element element, EClass eClass) {
		for( Attribute attribute : DTDModelUtil.attributes(element) ) {
			eClass.getEStructuralFeatures().add(map(attribute));
		}

		Expression content = element.getContent();

		if( content instanceof Concatenation ) {
			mapToClass((Concatenation) content, eClass);
			return;
		}

		if( content instanceof EmptyContent ) {
			return;
		}

		if( content instanceof Cardinality ) {
			eClass.getEStructuralFeatures().add(mapToRef((Cardinality) content));
			return;
		}

		if( content instanceof PCData ) {
			eClass.getEStructuralFeatures().add(createContainingReference("#pcdata", pcData));
			return;
		}

		logger.warn("handleContent(Element, EClass): can't handle Expression instance of sub type " + content.eClass().getName() + " inside Element named " + element.getName() );
	}

	private EClass mapToClass(Concatenation expr, EClass eClass) {
		if( eClass == null ) {
			eClass = createClass("Synthetic$" + (++syntheticCount));
		}

		for( Expression nestedExpr : expr.getMembers() ) {
			if( !(nestedExpr instanceof EmptyContent) ) {
				eClass.getEStructuralFeatures().add(mapToRef(nestedExpr));
			}
		}

		return eClass;
	}

	/**
	 * Dispatcher to map {@link Expression} sub types to {@link EReference},
	 * taking care of all underlying structure as well.
	 */
	private EReference mapToRef(Expression expr) {
		if( expr instanceof ElementReference ) {
			return mapToRef((ElementReference) expr);
		}
		if( expr instanceof Cardinality ) {
			return mapToRef((Cardinality) expr);
		}
		if( expr instanceof Concatenation ) {
			return mapToRef((Concatenation) expr);
		}
		if( expr instanceof Alternatives ) {
			return mapToRef((Alternatives) expr);
		}
		if( expr instanceof PCData ) {
			return createContainingReference("content#pcdata", pcData);
		}
		if( expr instanceof EmptyContent ) {
			return null;
		}

		logger.warn( "mapToRef(Expression): can't handle Expression instance of sub type " + expr.eClass().getName() );
		return null;
	}

	private EReference mapToRef(Cardinality expr) {
		EReference nestedRef = mapToRef(expr.getNestedExpr());
		switch( expr.getCardinality() ) {
			case OPTIONAL :
				{
					nestedRef.setLowerBound(0);
					nestedRef.setUpperBound(1);
					break;
				}
			case ONE_OR_MORE :
				{
					nestedRef.setLowerBound(1);
					nestedRef.setUpperBound(-1);
					nestedRef.setName(nestedRef.getName() + "s");
					break;
				}
			case ZERO_OR_MORE :
				{
					nestedRef.setLowerBound(0);
					nestedRef.setUpperBound(-1);
					nestedRef.setName(nestedRef.getName() + "s");
					break;
				}
		}
		return nestedRef;
	}

	private EReference mapToRef(ElementReference expr) {
		Element refElement = expr.getElement();

		EReference eReference = createContainingReference(refElement.getName().toLowerCase());
		eReference.setEType(map(refElement));

		return eReference;
	}

	private int syntheticCount = 0;

	private EReference mapToRef(Concatenation expr) {
		EClass eClass = mapToClass(expr);
		EReference eReference = createContainingReference(eClass.getName().toLowerCase());
		eReference.setEType(eClass);
		return eReference;
	}

	private EReference mapToRef(Alternatives expr) {
		EClass eSuperType = mapToClass(expr);
		String name = eSuperType.getName();
		name = "content" + name.substring(name.indexOf('$'));
		EReference eReference = createContainingReference(name);
		eReference.setEType(eSuperType);
		return eReference;
	}

	private EClass mapToClass(Expression expr) {
		if( expr instanceof Concatenation ) {
			return mapToClass((Concatenation) expr);
		}
		if( expr instanceof Alternatives ) {
			return mapToClass((Alternatives) expr);
		}
		if( expr instanceof ElementReference ) {
			return map(((ElementReference) expr).getElement());
		}
		if( expr instanceof PCData ) {
			return pcData;
		}
		// TODO  EmptyContent

		logger.warn( "mapToClass(Expression): can't handle instance of Expression sub type " + expr.eClass().getName() );
		return null;
	}

	private EClass mapToClass(Concatenation expr) {
		return mapToClass(expr, createClass("Synthetic$" + (++syntheticCount)));
	}

	private EClass mapToClass(Alternatives expr) {
		EClass eSuperType = createClass("Synthetic$" + (++syntheticCount));

		for( Expression nestedExpr : expr.getAlternatives() ) {
			mapToClass(nestedExpr).getESuperTypes().add(eSuperType);
		}

		return eSuperType;
	}


	/*
	 * +--------------+
	 * | Simple stuff |
	 * +--------------+
	 */

	private EAttribute map(Attribute attribute) {
		EAttribute eAttribute = createStringAttribute(attribute.getName());

		switch( attribute.getCardinality() ) {
			case IMPLIED :
				{
					eAttribute.setLowerBound(0);
					break;
				}
			case REQUIRED :
				{
					eAttribute.setLowerBound(1);
					break;
				}
		}

		return eAttribute;
	}

	private final EClass pcData = createClass("#PCDATA");
	private final EClass pcDataContent = createClass("#PCDataContent");
	private final EClass pcDataTextContent = createClass("#PCDataTextContent");
	private final EClass pcDataEntityReference = createClass("#PCDataEntityReference");
	private final EClass entity = createClass("Entity");

	{
		pcData.getEStructuralFeatures().add(createContainingReference("contents", pcDataContent, 0, -1));
		pcDataTextContent.getEStructuralFeatures().add(createStringAttribute("text"));
		entity.getEStructuralFeatures().add(createStringAttribute("name"));

		EReference eReference = createContainingReference("entity", entity);
		eReference.setContainment(false);
		pcDataEntityReference.getEStructuralFeatures().add(eReference);

		pcDataTextContent.getESuperTypes().add(pcDataContent);
		pcDataEntityReference.getESuperTypes().add(pcDataContent);
	}

}
