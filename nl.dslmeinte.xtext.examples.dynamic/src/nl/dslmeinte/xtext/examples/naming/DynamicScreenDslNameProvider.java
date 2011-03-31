package nl.dslmeinte.xtext.examples.naming;

import nl.dslmeinte.xtext.examples.dynamicScreenDsl.DynamicScreen;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.mwe.utils.Reader;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.util.SimpleAttributeResolver;

public class DynamicScreenDslNameProvider extends IQualifiedNameProvider.AbstractImpl {

	/**
	 * Behaves as default except for {@link DynamicScreen}s for which the English
	 * name serves as name. This is required since otherwise the
	 * {@link DynamicScreen}s aren't exported from the resource and in particular,
	 * the {@link Reader} will not put the read file in a slot.
	 */
	public String getQualifiedName(EObject obj) {
		if( obj instanceof DynamicScreen ) {
			return ((DynamicScreen) obj).getLabel().getEn();
		}
		return SimpleAttributeResolver.NAME_RESOLVER.apply(obj);
	}

}
