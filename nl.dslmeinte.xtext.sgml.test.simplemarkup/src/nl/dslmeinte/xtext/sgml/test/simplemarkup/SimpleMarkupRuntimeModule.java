package nl.dslmeinte.xtext.sgml.test.simplemarkup;

import nl.dslmeinte.xtext.sgml.lexer.SgmlLexerForParsing;
import nl.dslmeinte.xtext.sgml.test.simplemarkup.parser.CustomizedSimpleMarkupParser;

import com.google.inject.Binder;
import com.google.inject.name.Names;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class SimpleMarkupRuntimeModule extends nl.dslmeinte.xtext.sgml.test.simplemarkup.AbstractSimpleMarkupRuntimeModule {

	public void configureRuntimeLexer(Binder binder) {
		binder
			.bind(org.eclipse.xtext.parser.antlr.Lexer.class)
			.annotatedWith(Names.named(org.eclipse.xtext.parser.antlr.LexerBindings.RUNTIME))
			.to(SgmlLexerForParsing.class);
	}

	public Class<? extends org.eclipse.xtext.parser.antlr.IAntlrParser> bindIAntlrParser() {
		return CustomizedSimpleMarkupParser.class;
	}

}
