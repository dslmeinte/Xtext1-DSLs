package nl.dslmeinte.xtext.sgml.dtd.test;

import nl.dslmeinte.xtext.sgml.dtd.DTDManager;

import org.junit.Assert;
import org.junit.Test;

public class DTDManagerTest {

	@Test
	public void test_initialization_of_DTDManager_and_finding_first_element() {
		DTDManager dtdManager = new DTDManager("models/trivial.dtd");
		Assert.assertNotNull(dtdManager);
		Assert.assertEquals("ROOT", dtdManager.getFirstElement().getName());
	}

}
