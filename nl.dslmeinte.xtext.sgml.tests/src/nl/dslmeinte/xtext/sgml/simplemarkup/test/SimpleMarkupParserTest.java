package nl.dslmeinte.xtext.sgml.simplemarkup.test;

import java.io.IOException;
import java.util.Collections;

import nl.dslmeinte.xtext.sgml.test.simplemarkup.SimpleMarkupStandaloneSetup;
import nl.dslmeinte.xtext.sgml.test.simplemarkup.simplemarkup.Reference;
import nl.dslmeinte.xtext.sgml.test.simplemarkup.simplemarkup.Section;
import nl.dslmeinte.xtext.sgml.test.simplemarkup.simplemarkup.SgmlDocument;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.Assert;
import org.junit.Test;

public class SimpleMarkupParserTest {

	static {
		SimpleMarkupStandaloneSetup.doSetup();
	}

	@Test
	public void test_resolution_of_internal_crossReference() {
		SgmlDocument document = load("models/example1.sm", new ResourceSetImpl());
		EcoreUtil.resolveAll(document);
		Section to = ((Reference) document.getRoot().getContents().get(0)).getReference_tagOpen().getAttributes().getTo();
		Assert.assertNotNull(to);
		Assert.assertTrue(!to.eIsProxy());
	}

	@Test
	public void test_resolution_of_external_crossReference() {
		ResourceSet resourceSet = new ResourceSetImpl();
		load("models/example1.sm", resourceSet);
		SgmlDocument document2 = load("models/example2.sm", resourceSet);
		Section to = ((Reference) document2.getRoot().getContents().get(0)).getReference_tagOpen().getAttributes().getTo();
		Assert.assertNotNull(to);
		Assert.assertTrue(!to.eIsProxy());	// proxy gets resolved because of access
	}

	private SgmlDocument load(String fileUri, ResourceSet resourceSet) {
		Resource resource = resourceSet.createResource(URI.createFileURI(fileUri));
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
			Assert.fail("parse errors (see error console)");
		}
		EObject root = resource.getContents().get(0);
		Assert.assertNotNull(root);
		Assert.assertTrue(root instanceof SgmlDocument);
		return (SgmlDocument) root;
	}

}
