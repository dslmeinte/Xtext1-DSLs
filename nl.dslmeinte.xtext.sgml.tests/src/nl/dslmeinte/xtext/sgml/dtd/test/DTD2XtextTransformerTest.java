package nl.dslmeinte.xtext.sgml.dtd.test;

import java.io.FileNotFoundException;

import nl.dslmeinte.xtext.sgml.dtd.DTD2XtextTransformer;

import org.junit.Test;

public class DTD2XtextTransformerTest extends DTDTestSupport {

	@Test
	public void test_transformation_of_trivial_dtd() throws FileNotFoundException {
		DTD2XtextTransformer.transform(createModelsURI("trivial.dtd"), "http://dslmeinte.nl/Xtext/sgml/dtd/tests/trivial",createModelsURI("trivial-gen.xtext"));
	}

	@Test
	public void test_transformation_of_some_other_dtd() throws FileNotFoundException {
		DTD2XtextTransformer.transform(createModelsURI("THX.dtd"), "http://dslmeinte.nl/Xtext/sgml/dtd/tests/THX",createModelsURI("THX-gen.xtext"));
	}

}
