package nl.dslmeinte.xtext.examples.naming;

import nl.dslmeinte.xtext.examples.dataModelDsl.DataModel;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.mwe.utils.Reader;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.util.SimpleAttributeResolver;

public class DataModelDslNameProvider extends IQualifiedNameProvider.AbstractImpl {

	/**
	 * Behaves as default except for {@link DataModel}s for which the file name
	 * is returned without extension. This is required since otherwise the
	 * {@link DataModel}s aren't exported from the resource and in particular,
	 * the {@link Reader} will not put the read file in a slot.
	 */
	public String getQualifiedName(EObject obj) {
		if( obj instanceof DataModel ) {
			URI uri = ((DataModel) obj).eResource().getURI();
			String fileName = uri.lastSegment();
			String name = fileName.substring(0, fileName.lastIndexOf('.'));
			return name;
		}
		return SimpleAttributeResolver.NAME_RESOLVER.apply(obj);
	}

}
