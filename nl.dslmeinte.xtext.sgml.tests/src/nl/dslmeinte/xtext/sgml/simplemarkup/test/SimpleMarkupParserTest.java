package nl.dslmeinte.xtext.sgml.simplemarkup.test;

import java.io.IOException;
import java.util.Collections;

import nl.dslmeinte.xtext.sgml.dtd.test.SimpleMarkupStandaloneSetup;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Assert;
import org.junit.Test;

public class SimpleMarkupParserTest {

	static {
		SimpleMarkupStandaloneSetup.doSetup();
	}

	@Test
	public void test_parser() {
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.createResource(URI.createFileURI("models/simpleMarkup.sm"));
		try {
			resource.load(Collections.emptyMap());
		} catch (IOException e) {
			e.printStackTrace();
			Assert.fail();
		}
		if( resource.getErrors().size() > 0 ) {
			for( Diagnostic diagnostic : resource.getErrors() ) {
				System.err.println(diagnostic.getMessage() + " @L" + diagnostic.getLine() );
			}
			Assert.fail("parse errors");
		}
		EObject root = resource.getContents().get(0);
		Assert.assertNotNull(root);
	}

}
