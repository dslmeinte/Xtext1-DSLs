package nl.dslmeinte.xtext.sgml.dtd.test;

import java.io.FileNotFoundException;

import nl.dslmeinte.xtext.sgml.dtd.DTD2XtextTransformer;
import nl.dslmeinte.xtext.sgml.dtd.test.support.DTDTestSupport;

import org.eclipse.emf.common.util.URI;
import org.junit.Test;

public class DTD2XtextTransformerTest extends DTDTestSupport {

	@Test
	public void test_transformation_of_trivial_dtd() throws FileNotFoundException {
		DTD2XtextTransformer.transform(
				createModelsURI("trivial.dtd"),
				"nl.dslmeinte.xtext.sgml.dtd.test.Trivial",
				"http://dslmeinte.nl/Xtext/sgml/dtd/test/trivial",
				createModelsURI("trivial-gen.xtext")
			);
	}

	@Test
	public void test_transformation_of_simple_markup_dtd() throws FileNotFoundException {
		DTD2XtextTransformer.transform(
				createModelsURI("simpleMarkup.dtd"),
				"nl.dslmeinte.xtext.sgml.test.simplemarkup.SimpleMarkup",
				"http://dslmeinte.nl/Xtext/sgml/test/simpleMarkup",
				URI.createPlatformResourceURI("nl.dslmeinte.xtext.sgml.test.simplemarkup/src/nl/dslmeinte/xtext/sgml/test/simplemarkup/SimpleMarkup.xtext", true)
			);
	}

	@Test
	public void test_transformation_of_simple_markup_dtd_with_conditional_override() throws FileNotFoundException {
		DTD2XtextTransformer.transform(
				createModelsURI("simpleMarkup.dtd"),
				"nl.dslmeinte.xtext.sgml.test.simplemarkup.SimpleMarkupConditional",
				"http://dslmeinte.nl/Xtext/sgml/dtd/test/simpleMarkup/conditional",
				URI.createPlatformResourceURI("nl.dslmeinte.xtext.sgml.test.simplemarkup/src/nl/dslmeinte/xtext/sgml/test/simplemarkup/SimpleMarkupConditional.xtext", true),
				getClass().getPackage().getName().replaceAll("\\.", "::") + "::Conditional"
			);
	}

}
