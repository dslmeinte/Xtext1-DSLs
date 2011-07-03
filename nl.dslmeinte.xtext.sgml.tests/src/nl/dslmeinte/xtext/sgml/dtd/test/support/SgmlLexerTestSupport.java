package nl.dslmeinte.xtext.sgml.dtd.test.support;

import java.io.IOException;

import nl.dslmeinte.xtext.sgml.lexer.BaseTerminals;
import nl.dslmeinte.xtext.sgml.lexer.SgmlLexer;
import nl.dslmeinte.xtext.sgml.lexer.SgmlLexerForParsing;
import nl.dslmeinte.xtext.sgml.lexer.TokenFacade;
import nl.dslmeinte.xtext.sgml.test.simplemarkup.SimpleMarkupStandaloneSetup;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.Token;
import org.eclipse.xtext.parser.antlr.Lexer;
import org.junit.Assert;

import com.google.inject.Injector;

public abstract class SgmlLexerTestSupport {

	protected final Injector injector = new SimpleMarkupStandaloneSetup().createInjector();
	protected final SgmlLexer sgmlLexer = injector.getInstance(SgmlLexer.class);

	protected Lexer lexer;

	/**
	 * Initializes the {@link #sgmlLexer} field with the given {@link CharStream}.
	 */
	protected void initLexer(CharStream input) {
		SgmlLexerForParsing baseLexer = injector.getInstance(SgmlLexerForParsing.class);
		baseLexer.setCharStream(input);
		this.lexer = baseLexer;
	}

	protected void assertNextToken(BaseTerminals type) {
		Token token = lexer.nextToken();
//		System.out.format( "|%s| [actual=%s, expected=%s]\n", token.getText(), TokenType.values()[token.getType()], type );
		assertTokenType(type, token);
	}

	protected void assertNextToken(BaseTerminals type, String text) {
		Token token = lexer.nextToken();
//		System.out.format( "|%s| [actual=%s, expected=%s]\n", token.getText(), TokenType.values()[token.getType()], type );
		assertTokenType(type, token);
		Assert.assertEquals(text, token.getText());
	}

	protected void assertEOF() {
		Assert.assertTrue(lexer.nextToken().getType() == CharStream.EOF);
	}

	protected void assertTokenType(BaseTerminals type, Token token) {
		TokenFacade facade = sgmlLexer.getFacade();
		int actualType = token.getType();
		if( facade.map(type) != actualType ) {
			Assert.fail(
					"expected " + type.name() + " but was: " +
					( facade.isBase(actualType) ? facade.asBase(actualType) : ( "<" + actualType + ">" ) )
				);
		}
		Assert.assertEquals(facade.map(type), actualType);
	}

	private Token nextNonWhitespaceToken() {
		Token token = lexer.nextToken();
		while( ( token != null ) && ( token.getType() == sgmlLexer.getFacade().map(BaseTerminals.whitespace) ) ) {
			token = lexer.nextToken();
		}
		return token;
	}

	protected void assertNextNonWhitespaceToken(BaseTerminals baseTerminal) {
		assertTokenType(baseTerminal, nextNonWhitespaceToken());
	}

	protected void assertNextNonWhitespaceToken(BaseTerminals baseTerminal, String text) {
		Token token = nextNonWhitespaceToken();
		assertTokenType(baseTerminal, token);
		Assert.assertEquals(text, token.getText());
	}

	protected void lexe(CharStream input) throws IOException {
		initLexer(input);
		Token token = lexer.nextToken();
		while( token.getType() != CharStream.EOF ) {
			if( token.getType() == 0 ) {
				System.err.println( "encountered token of type 0 @L" + token.getLine() + ":" + token.getCharPositionInLine() );
			}
			token = lexer.nextToken();
		}
	}

}
