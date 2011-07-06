package nl.dslmeinte.xtext.sgml.test.simplemarkup.ui.parser;

import nl.dslmeinte.xtext.sgml.test.simplemarkup.ui.contentassist.antlr.SimpleMarkupParser;

public class CustomizedSimpleMarkupParser extends SimpleMarkupParser {

	@Override
	protected CustomizedInternalSimpleMarkupParser createParser() {
		CustomizedInternalSimpleMarkupParser result = new CustomizedInternalSimpleMarkupParser(null);
		result.setGrammarAccess(getGrammarAccess());
		return result;
	}

}
