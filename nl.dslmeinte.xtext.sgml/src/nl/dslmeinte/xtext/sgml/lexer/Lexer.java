package nl.dslmeinte.xtext.sgml.lexer;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;

/**
 * Abstract support class to take care of commonalities among the various lexers
 * (and to serve as a convenient super type).
 * 
 * @author Meinte Boersma
 */
abstract public class Lexer extends org.eclipse.xtext.parser.antlr.Lexer {

	protected final AntlrParserFacade facade;

	protected Lexer(AntlrParserFacade facade) {
		this.facade = facade;
	}

	public AntlrParserFacade getAntlrParserFacade() {
		return facade;
	}

	protected boolean isIdentifierPart(int ch) {
		return( Character.isLetterOrDigit(ch) || ch == '_' );
	}

	protected void consumeWhitespace() {
		type = facade.baseTerminalsMap().get(BaseTerminals.close_tag);
		input.consume();
		while( Character.isWhitespace( input.LA(1) ) ) {
			input.consume();
		}
	}

	protected void consumeQuotedString(int quoteChar) throws RecognitionException {
		input.consume();
		int ch;
		while( ( ch = input.LA(1) ) != quoteChar && ch != CharStream.EOF ) {
			input.consume();
		}
		if( ch != CharStream.EOF ) {
			input.consume();
			type = facade.baseTerminalsMap().get(BaseTerminals.quoted_string);
			return;
		}

		NoViableAltException nvae = new NoViableAltException();
		recover(nvae);
		throw nvae;
	}

}
