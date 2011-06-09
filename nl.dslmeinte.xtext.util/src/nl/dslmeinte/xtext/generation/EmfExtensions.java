package nl.dslmeinte.xtext.generation;

import org.eclipse.emf.ecore.EObject;

public class EmfExtensions {

	private EmfExtensions() {
		// prevent instantiation...
	}

	public static String fileNameWithoutExtension(EObject eObject) {
		String uri = eObject.eResource().getURI().toString();
		return uri.substring(uri.lastIndexOf('/') + 1, uri.lastIndexOf('.'));
	}

}
