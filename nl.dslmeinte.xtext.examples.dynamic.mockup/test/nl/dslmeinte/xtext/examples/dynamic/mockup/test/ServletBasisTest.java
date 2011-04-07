package nl.dslmeinte.xtext.examples.dynamic.mockup.test;

import nl.dslmeinte.xtext.examples.dynamic.mockup.MockupServlet;
import nl.dslmeinte.xtext.examples.dynamicScreenDsl.DynamicScreen;
import junit.framework.Assert;
import junit.framework.TestCase;

public class ServletBasisTest extends TestCase {

	public void test_load() {
		HackedMockupServlet servlet = new HackedMockupServlet();
		DynamicScreen model = servlet.load("nl.dslmeinte.xtext.examples.instances/simple/personalData.dsd");
		Assert.assertNotNull(model);
	}

	private class HackedMockupServlet extends MockupServlet {
		private static final long serialVersionUID = 1L;
		protected DynamicScreen load(String path) {
			return super.load(path);
		}
	}

}
