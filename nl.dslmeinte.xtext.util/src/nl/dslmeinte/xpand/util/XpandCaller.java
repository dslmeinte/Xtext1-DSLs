package nl.dslmeinte.xpand.util;

import java.io.IOException;
import java.io.OutputStream;

import org.eclipse.xpand2.XpandExecutionContext;
import org.eclipse.xpand2.XpandExecutionContextImpl;
import org.eclipse.xpand2.XpandFacade;
import org.eclipse.xpand2.output.OutputImpl;
import org.eclipse.xtend.typesystem.MetaModel;
import org.eclipse.xtend.typesystem.emf.EmfRegistryMetaModel;

/**
 * Util class to render Xpand templates programmatically into a
 * {@link OutputStream}.
 * 
 * @author Meinte Boersma  (adaptation)
 * @author Marc Schlienger (original; (c) 2009, see http://www.innoq.com/blog/mrs)
 */
public final class XpandCaller {

	private XpandCaller() {
		// (prevent instantiation)
	}

	/**
	 * Evaluates the designated Xpand template with the model element and other
	 * parameters as input, writing the output to the {@link OutputStream}
	 * passed.
	 * 
	 * @param output
	 *            - the {@link OutputStream} to write the output to
	 * @param metamodels
	 *            - an array of oAW {@link MetaModel}s which are registered with
	 *            the {@link XpandExecutionContext} used internally
	 * @param definitionName
	 *            - the name and qualification of the Xpand template definition
	 * @param targetObject
	 *            - the model element which the template definition accepts
	 * @param parameters
	 *            - (optional) other parameters for the template definition
	 */
	public static void evaluateTemplate (
			OutputStream output,
			MetaModel[] metaModels,
			String definitionName,
			Object targetObject,
			Object... parameters)
	{
		final OutputStreamWrapper out = new OutputStreamWrapper(output);

	    XpandExecutionContextImpl context = new XpandExecutionContextImpl(out, null);
	    	// (can't be reused)

	    for( MetaModel mm : metaModels ) {
		    context.registerMetaModel(mm);
	    }

	    XpandFacade facade = XpandFacade.create(context);

		try {
			facade.evaluate(definitionName, targetObject, parameters);
		} catch( Throwable throwable) {
			throw new RuntimeException( "exception thrown during evaluation of Xpand template " + definitionName, throwable );
		}
		/*
		 * Unfortunately, the catch is never hit in the case of
		 * NoClassDefFoundError arising from a missing dependency...
		 */
	}

	/**
	 * Version of
	 * {@link #evaluateTemplate(OutputStream, MetaModel[], String, Object, Object...)}
	 * which registers (only) {@link EmfRegistryMetaModel} so that all globally
	 * registered EMF models are mapped into the type system.
	 */
	public static void evaluateEmfTemplate (
			OutputStream output,
			String definitionName,
			Object targetObject,
			Object... parameters)
	{
		evaluateTemplate(output, new MetaModel[] { new EmfRegistryMetaModel() }, definitionName, targetObject, parameters);
	}

	/**
	 * Convenience version of
	 * {@link #evaluateEmfTemplate(OutputStream, String, Object, Object...)} for
	 * template definitions without optional parameters.
	 */
	public static void evaluateEmfTemplate (
		OutputStream body,
		String definitionName,
		Object targetObject)
	{
		evaluateEmfTemplate(body, definitionName, targetObject, new Object[0]);
	}

	/**
	 * Custom implementation of {@link OutputImpl} which redirects
	 * the templates' output directly to a {@link OutputStream}.
	 * 
	 * @author Meinte Boersma  (adaptation)
	 * @author Marc Schlienger (original; (c) 2009, see http://www.innoq.com/blog/mrs)
	 */
	private static class OutputStreamWrapper extends OutputImpl {

		private OutputStream body;

		public OutputStreamWrapper (OutputStream body) {
			this.body = body;
		}

		public void write (String text) {
			try {
				body.write(text.getBytes());
			} catch (IOException e) {
				throw new RuntimeException( "Couldn't write to wrapped " + OutputStream.class.getSimpleName() + " instance.", e );
			}
		}

		@Override
		public void openFile (String path, String outletName) {
			throw new UnsupportedOperationException( getClass().getName() + " can only be used for non-file templates." );
		}

	}

}

