package nl.dslmeinte.xtext.sgml.test.simplemarkup.parser;

import nl.dslmeinte.xtext.sgml.test.simplemarkup.parser.antlr.SimpleMarkupParser;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class CustomizedSimpleMarkupParser extends SimpleMarkupParser {

	@Override
	protected CustomizedInternalSimpleMarkupParser createParser(XtextTokenStream stream) {
		return new CustomizedInternalSimpleMarkupParser(stream, getElementFactory(), getGrammarAccess());
	}

}
