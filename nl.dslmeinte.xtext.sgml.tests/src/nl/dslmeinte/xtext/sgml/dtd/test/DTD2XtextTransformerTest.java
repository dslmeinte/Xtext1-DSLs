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

	private final static String SIMPLE_MARKUP_BASE_PACKAGE_NAME = "nl.dslmeinte.xtext.sgml.test.simplemarkup";
	private final static String SIMPLE_MARKUP_LANGUAGE_fqName = SIMPLE_MARKUP_BASE_PACKAGE_NAME + ".SimpleMarkup";
	private final static String SIMPLE_MARKUP_nsUri = "http://dslmeinte.nl/Xtext/sgml/dtd/test/simpleMarkup";

	private static URI simpleMarkupPlatformResourceURI(String sourceFolder, String postfixPath) {
		return URI.createPlatformResourceURI(
				String.format("%s/%s/%s/%s", SIMPLE_MARKUP_BASE_PACKAGE_NAME, sourceFolder, SIMPLE_MARKUP_BASE_PACKAGE_NAME.replace('.', '/'), postfixPath),
				true
			);
	}

	@Test
	public void test_transformation_of_simple_markup_dtd_with_AOP() throws FileNotFoundException {
		DTD2XtextTransformer.transform(
				createModelsURI("simpleMarkup.dtd"),
				SIMPLE_MARKUP_LANGUAGE_fqName,
				SIMPLE_MARKUP_nsUri,
				simpleMarkupPlatformResourceURI("src", "SimpleMarkup.xtext"),
				xpandPackageQualifiedName() + "::FeatureMixin"
			);
		modifyGeneratedParsers(simpleMarkupPlatformResourceURI("src-gen", "parser/antlr/internal/InternalSimpleMarkupParser"), "Section_attributes");
	}

	/**
	 * Removes the {@code final} keyword for specific parser methods in order to
	 * be able to sub class the parser class and override those methods.
	 */
	private void modifyGeneratedParsers(URI uri, String...ruleNames) {
		// TODO  implement
	}

	private String xpandPackageQualifiedName() {
		return getClass().getPackage().getName().replaceAll("\\.", "::");
	}

}
