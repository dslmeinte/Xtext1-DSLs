package nl.dslmeinte.xtext.examples.scoping;

import java.util.ArrayList;
import java.util.List;

import nl.dslmeinte.xtext.examples.XsdModelUtil;
import nl.dslmeinte.xtext.examples.wsdlLanguage.Definitions;
import nl.dslmeinte.xtext.examples.wsdlLanguage.XsdImport;
import nl.dslmeinte.xtext.examples.xsdLanguage.Schema;
import nl.dslmeinte.xtext.examples.xsdLanguage.TopLevelDefinition;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.scoping.impl.SimpleScope;

/**
 * This class contains custom scoping description.
 */
public class WsdlLanguageScopeProvider extends AbstractDeclarativeScopeProvider {

	IScope scope_Part_def (Definitions document, EReference ref) {
		List<IEObjectDescription> elements = new ArrayList<IEObjectDescription> ();
		for( TopLevelDefinition def : resolve(document.getXsdImport()).getDefinitions() ) {
			elements.add(EObjectDescription.create(def.getName(), def));
		}
		return new SimpleScope(elements);
	}

	private Schema resolve (XsdImport xsdImport) {
		return XsdModelUtil.resolveImport(xsdImport.eResource(), xsdImport.getImportURI());
	}

	// TODO  we could use IResourceScopeCache here to do some (automatically evicted) caching...

}
