package nl.dslmeinte.xtext.sgml.test.simplemarkup.ui.parser;

import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

import nl.dslmeinte.xtext.sgml.test.simplemarkup.ui.contentassist.antlr.internal.InternalSimpleMarkupParser;

public class CustomizedInternalSimpleMarkupParser extends InternalSimpleMarkupParser {

	public CustomizedInternalSimpleMarkupParser(TokenStream input) {
		super(input);
	}

	@Override
	public void ruleReference_attributes() throws RecognitionException {
		super.ruleReference_attributes();
		// TODO  re-implement!
	}

}
