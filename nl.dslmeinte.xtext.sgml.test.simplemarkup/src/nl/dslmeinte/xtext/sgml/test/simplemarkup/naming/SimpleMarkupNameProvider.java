package nl.dslmeinte.xtext.sgml.test.simplemarkup.naming;

import nl.dslmeinte.xtext.sgml.test.simplemarkup.simplemarkup.Section;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.SimpleNameProvider;

public class SimpleMarkupNameProvider extends SimpleNameProvider {

	/**
	 * The qualified name of {@link Section} is
	 * {@code this.Section_tagOpen.attributes.name} without surrounding quotes -
	 * all other {@link EObject}s are delegated to {@link SimpleNameProvider}.
	 */
	@Override
	public String getQualifiedName(EObject object) {
		if( object instanceof Section ) {
			String quotedName = ((Section) object).getSection_tagOpen().getAttributes().getName();
			if( quotedName.length() > 2 ) {
				return quotedName.substring(1, quotedName.length()-1);
			} else {
				return null;
			}
		}
		return super.getQualifiedName(object);
	}

}
