package nl.dslmeinte.xtext.examples;

import nl.dslmeinte.xtext.examples.xsdLanguage.BuiltinType;
import nl.dslmeinte.xtext.examples.xsdLanguage.BuiltinTypeReference;
import nl.dslmeinte.xtext.examples.xsdLanguage.Facet;
import nl.dslmeinte.xtext.examples.xsdLanguage.Import;
import nl.dslmeinte.xtext.examples.xsdLanguage.MaxLengthFacet;
import nl.dslmeinte.xtext.examples.xsdLanguage.NonComplexTypeReference;
import nl.dslmeinte.xtext.examples.xsdLanguage.Restriction;
import nl.dslmeinte.xtext.examples.xsdLanguage.Schema;
import nl.dslmeinte.xtext.examples.xsdLanguage.TopLevelSimpleTypeReference;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.EcoreUtil2;

public class XsdModelUtil {

	public static BuiltinType baseType(NonComplexTypeReference typeReference) {
		if( typeReference instanceof BuiltinTypeReference ) {
			return ((BuiltinTypeReference) typeReference).getBuiltin();
		}

		if( typeReference instanceof TopLevelSimpleTypeReference ) {
			Restriction restriction = ((TopLevelSimpleTypeReference) typeReference).getRef().getRestriction();
			if( restriction == null ) {
				return null;
			} else {
				return baseType(restriction.getTypeRef());
			}
		}

		throw new IllegalArgumentException(
				"don't know how to compute 'baseType' for type "
				+ typeReference.getClass().getSimpleName()
				+ " (language engineer error)"
			);
	}

	public static Restriction restriction(Facet facet) {
		return (Restriction) facet.eContainer();
	}

	public static BuiltinType baseType(Facet facet) {
		return baseType(restriction(facet).getTypeRef());
	}

	public static boolean isBaseTypeString(Facet facet) {
		return baseType(facet) == BuiltinType.STRING;
	}

	public static int maxLength(Restriction restriction) {
		for( Facet facet : restriction.getFacets() ) {
			if( facet instanceof MaxLengthFacet ) {
				return ((MaxLengthFacet) facet).getMaxLength();
			}
		}

		return -1;
	}

	/**
	 * Resolves the given schema import.
	 */
	public static Schema resolveImport (Import importElt) {
		return resolveImport(importElt.eResource(), importElt.getImportURI());
	}

	public static Schema resolveImport (Resource resource, String importUri) {
		Resource importResource = EcoreUtil2.getResource(resource, importUri);
		return (Schema) importResource.getContents().get(0);
	}

	/**
	 * Returns the schema imported using the given name space prefix.
	 * 
	 * @param eObject
	 *            - a model element in the current XSD representation
	 * @param prefix
	 *            - the name space prefix
	 */
	public static Schema schema (EObject eObject, String prefix) {
		Schema thisSchema = (Schema) EcoreUtil.getRootContainer(eObject);
		for( Import importElt : thisSchema.getImports() ) {
			if( importElt.getNsPrefix().equals(prefix) ) {
				return resolveImport(importElt);
			}
		}
	
		throw new IllegalArgumentException(
				"no import with prefix '" + prefix + "' in this schema"
			);
	}

}
