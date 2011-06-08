package nl.dslmeinte.xtext.sgml.dtd.test;

import nl.dslmeinte.xtext.sgml.dtd.DTDManager;

import org.junit.Assert;
import org.junit.Test;

public class DTDManagerTest {

	@Test
	public void test_static_initialization() {
		DTDManager dtdManager = new DTDManager("src/nl/dslmeinte/xtext/sgml/dtd/test/example.dtd");
		Assert.assertNotNull(dtdManager);
		Assert.assertEquals("SISGML", dtdManager.getFirstElement().getName());
	}

}
