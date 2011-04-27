package nl.dslmeinte.xtext.examples.scoping;

import nl.dslmeinte.xtext.examples.XsdModelUtil;
import nl.dslmeinte.xtext.examples.xsdLanguage.Import;
import nl.dslmeinte.xtext.examples.xsdLanguage.ImportedReference;
import nl.dslmeinte.xtext.examples.xsdLanguage.ImportedTopLevelComplexTypeReference;
import nl.dslmeinte.xtext.examples.xsdLanguage.ImportedTopLevelSimpleTypeReference;
import nl.dslmeinte.xtext.examples.xsdLanguage.ImportedTopLevelTypeReference;
import nl.dslmeinte.xtext.examples.xsdLanguage.Schema;
import nl.dslmeinte.xtext.examples.xsdLanguage.TopLevelComplexType;
import nl.dslmeinte.xtext.examples.xsdLanguage.TopLevelSimpleType;
import nl.dslmeinte.xtext.examples.xsdLanguage.TopLevelType;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.scoping.impl.SimpleScope;

import com.google.common.base.Function;

public class XsdLanguageScopeProvider extends AbstractDeclarativeScopeProvider {

	/**
	 * Returns a scope for all imports in the current schema.
	 * <p>
	 * The effective name of an import is the 'nsPrefix' attribute and not the
	 * name of the schema referenced. This is done to be able to avoid name
	 * collisions (and it mimics the actual XSD construct as well).
	 */
	IScope scope_Import (Schema schema, EReference eRef) {
		return new SimpleScope(
				Scopes.scopedElementsFor(
					schema.getImports(),
					new Function<Import, String>() {
						public String apply(Import from) { return from.getNsPrefix(); }
					}
				)
			);
	}

	IScope scope_TopLevelTypeReference_ref (ImportedTopLevelTypeReference ref, EReference eRef) {
		return createTopLevelTypeScope(ref, TopLevelType.class);
	}

	IScope scope_TopLevelSimpleTypeReference_ref (ImportedTopLevelSimpleTypeReference ref, EReference eRef) {
		return createTopLevelTypeScope(ref, TopLevelSimpleType.class);
	}

	IScope scope_TopLevelComplexTypeReference_ref(ImportedTopLevelComplexTypeReference ref, EReference eRef) {
		return createTopLevelTypeScope(ref, TopLevelComplexType.class);
	}

	/**
	 * Returns a scope for a the {@code ref} cross-reference in a
	 * TopLevel<i>x</i>Reference object.
	 * 
	 * @param clazz
	 *            - the {@link Class} object corresponding to <i>x</i>; must
	 *            extend {@link TopLevelType}.
	 */
	private IScope createTopLevelTypeScope (ImportedReference importRef, Class<? extends TopLevelType> clazz) {
		Schema schema = XsdModelUtil.schema(importRef, importRef.getImport().getNsPrefix());
		return new SimpleScope(Scopes.scopedElementsFor(EcoreUtil2.typeSelect(schema.getDefinitions(), clazz)));
	}

	// TODO  use IResourceScopeCache here to do some (automatically evicted) caching...

}
