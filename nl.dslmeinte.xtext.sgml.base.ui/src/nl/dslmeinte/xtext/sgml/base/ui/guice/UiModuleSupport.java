package nl.dslmeinte.xtext.sgml.base.ui.guice;

import nl.dslmeinte.xtext.sgml.base.ui.syntaxcoloring.BaseTokenToAttributeIdMapper;
import nl.dslmeinte.xtext.sgml.lexer.SgmlLexerForParsing;
import nl.dslmeinte.xtext.sgml.lexer.ui.SgmlLexerForContentAssist;

import org.eclipse.xtext.builder.clustering.CurrentDescriptions;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.scoping.impl.AbstractGlobalScopeProvider;
import org.eclipse.xtext.ui.editor.syntaxcoloring.antlr.AbstractAntlrTokenToAttributeIdMapper;

import com.google.inject.Binder;
import com.google.inject.name.Names;

public class UiModuleSupport {

	public static void configureHighlightingLexer(Binder binder) {
		binder
			.bind(org.eclipse.xtext.parser.antlr.Lexer.class)
			.annotatedWith(Names.named(org.eclipse.xtext.ui.LexerUIBindings.HIGHLIGHTING))
			.to(SgmlLexerForParsing.class);
	}

	public static void configureContentAssistLexer(Binder binder) {
		binder
			.bind(org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer.class)
			.annotatedWith(Names.named(org.eclipse.xtext.ui.LexerUIBindings.CONTENT_ASSIST))
			.to(SgmlLexerForContentAssist.class);
	}

	public static Class<? extends AbstractAntlrTokenToAttributeIdMapper> bindAbstractAntlrTokenToAttributeIdMapper() {
		return BaseTokenToAttributeIdMapper.class;
	}

    public static void configureIResourceDescriptionsBuilderScope(Binder binder)
    {  
        binder
        	.bind(IResourceDescriptions.class)
            .annotatedWith(Names.named(AbstractGlobalScopeProvider.NAMED_BUILDER_SCOPE))
            .to(CurrentDescriptions.ResourceSetAware.class);  
    }

}
