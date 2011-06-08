package nl.dslmeinte.xtext.sgml.lexer;

import org.antlr.runtime.Token;
import org.antlr.runtime.TokenSource;

public class SgmlTokenSource implements TokenSource {

	private Lexer lexer;

	public SgmlTokenSource(Lexer lexer) {
		this.lexer = lexer;
	}

	@Override
	public Token nextToken() {
		return lexer.nextToken();
	}

}
