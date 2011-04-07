package nl.dslmeinte.xtext.examples.dynamic.mockup;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nl.dslmeinte.xtext.examples.DataModelDslStandaloneSetup;
import nl.dslmeinte.xtext.examples.DynamicScreenDslStandaloneSetup;
import nl.dslmeinte.xtext.examples.dynamicScreenDsl.DynamicScreen;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.mwe.utils.StandaloneSetup;

public class MockupServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public static final String PATH_PREFIX = "/mockup";

	private static String workspaceFileUri;

	{
		DataModelDslStandaloneSetup.doSetup();
		DynamicScreenDslStandaloneSetup.doSetup();
		new StandaloneSetup().setPlatformUri("..");
		// Note: this is a bit of a hack...using platform:/resource/ didn't work for me...
		workspaceFileUri = new java.io.File("..").getAbsolutePath();
		System.err.println( "file root used: " + workspaceFileUri );
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ServletOutputStream out = response.getOutputStream();
		String requestURI = request.getRequestURI();
		String path = requestURI.substring( PATH_PREFIX.length() + 1 );
		DynamicScreen model = load(path);
		XpandCaller.evaluateEmfTemplate(out, "nl::dslmeinte::xtext::examples::dynamic::mockup::HtmlMockup::html", model);
		out.close();
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println(getClass().getName() + " started");
	}

	/**
	 * Loads a {@code .dsd} file.
	 * 
	 * @param path
	 *            Path relative to the platform URI == workspace root
	 */
	protected DynamicScreen load(String path) {	// protected visibility for testing purposes
		ResourceSet resourceSet = new ResourceSetImpl();
		// TODO  remove hack through absolute file path
		URI uri = URI.createURI("file:" + workspaceFileUri + "/" + path, true);
		Resource resource = resourceSet.createResource(uri);
		try {
			resource.load(null);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		DynamicScreen screen = (DynamicScreen) resource.getContents().get(0);
		EcoreUtil.resolveAll(screen);
		return screen;
	}

}

