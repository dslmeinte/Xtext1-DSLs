package nl.dslmeinte.xtext.sgml.parser;

import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.Lexer;
import org.antlr.runtime.Token;
import org.apache.log4j.Logger;

import com.google.common.base.Function;

public class TokenStream {

	private List<Integer> marks = new ArrayList<Integer>();

	private int nextMarkIndex = 0;

	/**
	 * All the tokens read so far.
	 */
	private List<Token> tokens = new ArrayList<Token>();

	public List<Token> getTokens() {
		return tokens;
	}

	/**
	 * The index of the next token to return.
	 */
	private int nextTokenIndex = 0;

	private Lexer lexer;

	public TokenStream(Lexer lexer) {
		this.lexer = lexer;
	}

	public void setHiddenTokenCriterion(Function<Token, Boolean> criterionFunction) {
		this.hiddenTokenCriterion = criterionFunction;
	}

	private Function<Token, Boolean> hiddenTokenCriterion;

	private Token internalNextToken() {
		if( nextTokenIndex >= tokens.size() ) {
			tokens.add(lexer.nextToken());
		}
		return tokens.get(nextTokenIndex++);

	}

	public Token nextToken() {
		Token token = internalNextToken();
		while( token.getType() != -1 && ( hiddenTokenCriterion != null && hiddenTokenCriterion.apply(token) ) ) {
			token = internalNextToken();
		}
		return token;
	}

	public Token peek() {
		Token token = nextToken();
		if( token.getType() == CharStream.EOF ) {
//			logger.debug( "peeking EOF" );
		} else {
//			logger.debug(
//				"peeking token: text=|" + token.getText()
//				+ "|, type=" + TokenType.fromOrdinal(token.getType())
//				+ ", index=" + (nextTokenIndex-1)
//				+ ", state=" + lexicalState.name()
//			);
		}
		nextTokenIndex--;
		return token;
	}

	public void consume() {
		/* Token token = */nextToken();
//		logger.debug( "consumed token: |" + token.getText() + "|, index=" + (nextTokenIndex-1) );
	}

	/**
	 * Marks the current position (~in between tokens) to rewind to later.
	 */
	public void mark() {
		if( nextMarkIndex >= marks.size() ) {
			marks.add(nextTokenIndex);
		} else {
			marks.set(nextMarkIndex, nextTokenIndex);
		}
		nextMarkIndex++;
	}

	private Logger logger = Logger.getLogger(getClass());

	/**
	 * Rewinds to the last mark, without popping that.
	 */
	public void rewind() {
		if( nextMarkIndex > 0 ) {
			nextTokenIndex = marks.get(nextMarkIndex-1);
		} else {
			logger.error( "trying to rewind to non-existing mark" );
		}
	}

	/**
	 * Pops the last mark.
	 */
	public void unmark() {
		if( nextMarkIndex > 0 ) {
			nextMarkIndex--;
		} else {
			logger.error( "trying to unmark non-existing mark" );
		}
	}

}
