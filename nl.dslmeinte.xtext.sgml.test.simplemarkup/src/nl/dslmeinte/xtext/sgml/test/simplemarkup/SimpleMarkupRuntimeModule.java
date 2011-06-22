package nl.dslmeinte.xtext.sgml.test.simplemarkup;

import nl.dslmeinte.xtext.sgml.test.simplemarkup.parser.antlr.internal.InternalSimpleMarkupParser;
import nl.dslmeinte.xtext.sgml.lexer.AntlrParserFacade;
import nl.dslmeinte.xtext.sgml.lexer.InternalModelPopulatingSgmlLexer;
import nl.dslmeinte.xtext.sgml.lexer.InternalSgmlLexerProvider;

import com.google.inject.Provider;
import com.google.inject.name.Names;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class SimpleMarkupRuntimeModule extends nl.dslmeinte.xtext.sgml.test.simplemarkup.AbstractSimpleMarkupRuntimeModule {

	public Class<? extends org.eclipse.xtext.parser.antlr.Lexer> bindLexer() {
		return InternalModelPopulatingSgmlLexer.class;
	}

	public Provider<InternalModelPopulatingSgmlLexer> provideSgmlLexer() {
		return InternalSgmlLexerProvider.create(InternalModelPopulatingSgmlLexer.class, new AntlrParserFacade(InternalSimpleMarkupParser.class));
	}

	public void configureRuntimeLexer(com.google.inject.Binder binder) {
		binder.bind(org.eclipse.xtext.parser.antlr.Lexer.class).annotatedWith(Names.named(org.eclipse.xtext.parser.antlr.LexerBindings.RUNTIME)).to(InternalModelPopulatingSgmlLexer.class);
	}

}
