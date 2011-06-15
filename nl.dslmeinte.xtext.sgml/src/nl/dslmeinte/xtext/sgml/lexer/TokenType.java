package nl.dslmeinte.xtext.sgml.lexer;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.Token;

public enum TokenType {

	// generic:
	whitespace, identifier, comments, quotedString, EOF,
	// for document header:
	doctypeKeyword, entityKeyword, openBracketSymbol, closeBracketSymbol, headerComments,
	// for tags:
	openTagSymbol, closeTagSymbol, tagSlash, tagKeyword, equalsSymbol, singleQuote, doubleQuote,
	// for #PCDATA content:
    entityReference, literalContents,
    // for conditional expressions:
	leftParenthesis, rightParenthesis, andOperator, orOperator, notOperator
	,;

	public static TokenType fromOrdinal(int ordinal) {
		if( ordinal == CharStream.EOF ) {
			return EOF;
		}
		return TokenType.values()[ordinal];
	}

	public boolean isTypeOf(Token token) {
		return( fromOrdinal(token.getType()) == this );
	}

	public void expectOf(Token token) {
		if( !this.isTypeOf(token) ) {
			throw new RuntimeException(
					String.format( "expected %s token but encountered %s", this.name(), fromOrdinal(token.getType()) )
				);
		}
	}

}
