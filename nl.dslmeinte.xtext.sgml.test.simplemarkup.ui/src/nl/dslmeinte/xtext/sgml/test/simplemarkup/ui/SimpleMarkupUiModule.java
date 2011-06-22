package nl.dslmeinte.xtext.sgml.test.simplemarkup.ui;

import nl.dslmeinte.xtext.sgml.test.simplemarkup.parser.antlr.internal.InternalSimpleMarkupParser;
import nl.dslmeinte.xtext.sgml.test.simplemarkup.ui.syntaxcoloring.CustomTokenToAttributeIDMapper;
import nl.dslmeinte.xtext.sgml.lexer.AntlrParserFacade;
import nl.dslmeinte.xtext.sgml.lexer.InternalContentAssistSgmlLexer;
import nl.dslmeinte.xtext.sgml.lexer.InternalModelPopulatingSgmlLexer;
import nl.dslmeinte.xtext.sgml.lexer.InternalSgmlLexerProvider;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.editor.syntaxcoloring.antlr.AbstractAntlrTokenToAttributeIdMapper;

import com.google.inject.Binder;
import com.google.inject.name.Names;

/**
 * Use this class to register components to be used within the IDE.
 */
public class SimpleMarkupUiModule extends nl.dslmeinte.xtext.sgml.test.simplemarkup.ui.AbstractSimpleMarkupUiModule {

	public SimpleMarkupUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}

	public void configureHighlightingLexer(Binder binder) {
		binder
			.bind(org.eclipse.xtext.parser.antlr.Lexer.class)
			.annotatedWith(Names.named(org.eclipse.xtext.ui.LexerUIBindings.HIGHLIGHTING))
			.to(InternalModelPopulatingSgmlLexer.class);
	}

	public void configureContentAssistLexerProvider(Binder binder) {
		binder
			.bind(InternalContentAssistSgmlLexer.class)
			.toProvider(InternalSgmlLexerProvider.create(InternalContentAssistSgmlLexer.class, new AntlrParserFacade(InternalSimpleMarkupParser.class)));
	}

	public void configureContentAssistLexer(Binder binder) {
		binder
			.bind(org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer.class)
			.annotatedWith(Names.named(org.eclipse.xtext.ui.LexerUIBindings.CONTENT_ASSIST))
			.to(InternalContentAssistSgmlLexer.class);
	}

	public void configureTokenToAttributeIDMapper(Binder binder) {
        binder.bind(AbstractAntlrTokenToAttributeIdMapper.class).to(CustomTokenToAttributeIDMapper.class);
    }

}
