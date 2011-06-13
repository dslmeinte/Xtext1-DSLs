package nl.dslmeinte.xtext.generation;

import org.eclipse.emf.ecore.EObject;

/**
 * A util class to hold Java Xtensions.
 * 
 * @author Meinte Boersma
 */
public class EmfExtensions {

	private EmfExtensions() {
		// prevent instantiation...
	}

	/**
	 * @param eObject
	 *            - a model element
	 * @return the file name of the {@link Resource} the given {@link EObject}
	 *         resides in, without extension.
	 */
	public static String fileNameWithoutExtension(EObject eObject) {
		String uri = eObject.eResource().getURI().toString();
		return uri.substring(uri.lastIndexOf('/') + 1, uri.lastIndexOf('.'));
	}

}
