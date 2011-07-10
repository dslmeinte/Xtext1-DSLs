package nl.dslmeinte.xtext.sgml.dtd.test.support;

import nl.dslmeinte.xtext.sgml.lexer.SgmlLexerForParsing;
import nl.dslmeinte.xtext.sgml.lexer.TokenFacade;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.Lexer;

import com.google.inject.Injector;

/**
 * Support class to test a {@link Lexer} wrapped in a
 * {@link SgmlLexerForParsing} using {@link LexerTestSupport}, with some
 * convenience for Guice.
 * 
 * @author Meinte Boersma
 */
public abstract class SgmlLexerTestSupport extends LexerTestSupport {

	private final Injector injector;

	public SgmlLexerTestSupport(Injector injector) {
		super(injector.getInstance(TokenFacade.class));
		this.injector = injector;
	}
	
	@Override
	protected Lexer createLexer(CharStream input) {
		SgmlLexerForParsing baseLexer = injector.getInstance(SgmlLexerForParsing.class);
		baseLexer.setCharStream(input);
		return baseLexer;
	}

}
