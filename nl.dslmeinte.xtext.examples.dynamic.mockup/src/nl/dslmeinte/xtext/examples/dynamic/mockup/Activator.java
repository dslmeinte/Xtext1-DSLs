package nl.dslmeinte.xtext.examples.dynamic.mockup;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.service.http.HttpService;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The following bundles (and their dependencies) must be included in the OSGi
 * launch configuration (first three are dependencies of the source, the latter
 * four are required to ensure that Jetty is started):
 * <ol>
 * <li>javax.servlet</li>
 * <li>org.eclispe.osgi</li>
 * <li>org.eclispe.osgi.services</li>
 * <li>org.eclipse.equinox.http.jetty</li>
 * <li>org.eclipse.equinox.http.servlet</li>
 * <li>org.mortbay.jetty.server</li>
 * <li>org.mortbay.jetty.util</li>
 * </ol>
 * <p>
 * Add <tt>-console</tt> and optionally <tt>-debug</tt> to the Program Arguments
 * (Arguments tab) of the OSGi launch configuration. Add the following to the VM
 * Arguments:
 * 
 * <pre>
 * -Dorg.osgi.service.http.port=8080
 * </pre>
 * 
 * Make sure the following VM Arguments are present as well (they are by
 * default):
 * 
 * <pre>
 * -Declipse.ignoreApp=true -Dosgi.noShutdown=true
 * </pre>
 * <p>
 * Now you either have to tweak the location of the workspace or make sure all
 * your projects are really in the workspace (i.e., not a link).
 */
public class Activator implements BundleActivator {

	private ServiceTracker httpServiceTracker;
	
	public void start(BundleContext context) throws Exception {
		httpServiceTracker = new HttpServiceTracker(context);
		httpServiceTracker.open();
	}

	public void stop(BundleContext context) throws Exception {
		httpServiceTracker.close();
		httpServiceTracker = null;
	}

	private class HttpServiceTracker extends ServiceTracker {

		public HttpServiceTracker(BundleContext context) {
			super(context, HttpService.class.getName(), null);
		}

		public Object addingService(ServiceReference reference) {
			HttpService httpService = (HttpService) context.getService(reference);
			try {
				httpService.registerResources("/static", "/web/static", null); //$NON-NLS-1$ //$NON-NLS-2$
				httpService.registerServlet(MockupServlet.PATH_PREFIX, new MockupServlet(), null, null);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return httpService;
		}

		public void removedService(ServiceReference reference, Object service) {
			HttpService httpService = (HttpService) service;
			httpService.unregister("/static"); //$NON-NLS-1$
			httpService.unregister(MockupServlet.PATH_PREFIX);
			super.removedService(reference, service);
		}

	}

}

