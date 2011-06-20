package nl.dslmeinte.xtext.sgml.dtd.test.support;

import junit.framework.Assert;
import nl.dslmeinte.xtext.sgml.lexer.BaseTerminals;
import nl.dslmeinte.xtext.sgml.lexer.Lexer;

import org.antlr.runtime.Token;

abstract public class LexerTestSupport<T extends Lexer> {

	private LexerTestSupport() {}

	protected T lexer;

	public LexerTestSupport(T lexer) {
		this();
		this.lexer = lexer;
	}

	protected void assertNextToken(BaseTerminals type) {
		Token token = lexer.nextToken();
//		System.out.format( "|%s| [actual=%s, expected=%s]\n", token.getText(), TokenType.values()[token.getType()], type );
		assertTokenType(type, token);
	}

	protected void assertTokenType(BaseTerminals type, Token token) {
		Assert.assertEquals(lexer.getAntlrParserFacade().baseTerminalsMap().get(type).intValue(), token.getType());
	}

	protected Token nextNonWhitespaceToken() {
		Token token = lexer.nextToken();
		while( ( token != null ) && ( token.getType() == lexer.getAntlrParserFacade().map(BaseTerminals.whitespace) ) ) {
			token = lexer.nextToken();
		}
		return token;
	}

	protected void assertNextNonWhitespaceToken(BaseTerminals baseTerminal) {
		assertTokenType(baseTerminal, nextNonWhitespaceToken());
	}

}
