package nl.dslmeinte.xtext.sgml.dtd.test;

import java.io.IOException;
import java.util.Collections;

import nl.dslmeinte.xtext.dtd.DtdLanguageStandaloneSetup;
import nl.dslmeinte.xtext.dtd.dtdModel.DocumentTypeDefinition;
import nl.dslmeinte.xtext.sgml.dtd.DTD2EcoreTransformer;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.mwe.utils.StandaloneSetup;
import org.eclipse.xtext.junit.AbstractXtextTests;

public class DTD2EcoreTransformerTest extends AbstractXtextTests {

	private static final String MODELS_DIR = "nl.dslmeinte.xtext.sgml.tests/models/";

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		with(DtdLanguageStandaloneSetup.class);
		new StandaloneSetup().setPlatformUri("..");
	}

	private DocumentTypeDefinition loadModel(URI uri) {
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.getResource(uri, true);
		EcoreUtil.resolveAll(resourceSet);
		return (DocumentTypeDefinition) resource.getContents().get(0);
	}

	public void test_transformation_of_trivial_dtd_file() {
		doTransformation("trivial");
	}

	private void doTransformation(String modelName) {
		DocumentTypeDefinition dtdDefinition = loadModel(URI.createPlatformResourceURI(MODELS_DIR + modelName + ".dtd", true));
//		EPackage ePackage = new DTD2EcoreWithSyntheticsTransformer(dtdDefinition).transform();
		EPackage ePackage = new DTD2EcoreTransformer(dtdDefinition).transform();
		ePackage.setName(modelName);
		ePackage.setNsPrefix(modelName.toLowerCase());
		ePackage.setNsURI("http://dslmeinte.nl/Xtext/sgml/dtd/" + modelName );
		saveModel(ePackage, URI.createPlatformResourceURI(MODELS_DIR + modelName + "-gen.ecore", true));
	}

	private void saveModel(EPackage ePackage, URI uri) {
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.createResource(uri);
		resource.getContents().add(ePackage);
		try {
			resource.save(Collections.emptyMap());
		} catch( IOException e ) {
			throw new RuntimeException(e);
		}
	}

}
