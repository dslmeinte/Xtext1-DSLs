package nl.dslmeinte.xtext.sgml.lexer;

import java.util.List;

import nl.dslmeinte.xtext.util.antlr.trie.CaseInsensitiveTrie;
import nl.dslmeinte.xtext.util.antlr.trie.EnumBasedTrie;
import nl.dslmeinte.xtext.util.antlr.trie.StringBasedTrie;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.MismatchedSetException;
import org.antlr.runtime.MismatchedTokenException;
import org.antlr.runtime.RecognitionException;

/**
 * Lexer to lexe SGML content, using the principle of lexical state and
 * governing that state itself.
 * 
 * @author Meinte Boersma
 */
public class SgmlLexer extends Lexer {

	public SgmlLexer(List<String> keywords) {
		super.setCharStream(input);
		this.tagKeywordsTrie = StringBasedTrie.of(keywords);
	}

	@Override
	public void setCharStream(CharStream input) {
		super.setCharStream(input);
		lexicalState = LexicalState.header;
	}

	private enum LexicalState {
		header, tag, content;
	}

	private LexicalState lexicalState;

	public void signalHeaderEnd() {
		lexicalState = LexicalState.content;
	}

	@Override
	public void mTokens() throws RecognitionException {
		switch( lexicalState ) {
			case header: {
				mTokensHeader();
				return;
			}
			case tag: {
				mTokensTag();
				return;
			}
			case content: {
				mTokensContent();
				return;
			}
		}
	}

	private boolean insideBrackets = false;

	private final CaseInsensitiveTrie<HeaderKeywords> headerKeywordsTrie = EnumBasedTrie.of(HeaderKeywords.class);

	private void mTokensHeader() throws RecognitionException {
		int ch = input.LA(1);
		if( ch == '<' ) {
			input.consume();
			type = TokenType.openTagSymbol.ordinal();
			return;
		}
		if( ch == '>' ) {
			input.consume();
			type = TokenType.closeTagSymbol.ordinal();
			if( !insideBrackets ) {
				lexicalState = LexicalState.content;
			}
			return;
		}
		if( ch == '[' ) {
			input.consume();
			type = TokenType.openBracketSymbol.ordinal();
			insideBrackets = true;
			return;
		}
		if( ch == ']' ) {
			input.consume();
			type = TokenType.closeBracketSymbol.ordinal();
			insideBrackets = false;
			return;
		}
		if( ch == '!' ) {
			input.consume();
			HeaderKeywords keyword = headerKeywordsTrie.match(input);
			if( keyword == HeaderKeywords.doctype ) {
				type = TokenType.doctypeKeyword.ordinal();
				return;
			}
			if( keyword == HeaderKeywords.entity ) {
				type = TokenType.entityKeyword.ordinal();
				return;
			}
			// TODO  provide more useful info than '0'
			MismatchedTokenException mte = new MismatchedTokenException(0, input);
			recover(mte);
			throw mte;
		}
		if( Character.isWhitespace(ch) ) {
			consumeWhitespace();
			return;
		}
		if( ch == '"' || ch == '\'' ) {
			consumeQuotedString(ch);
			return;
		}
		if( isIdentifierPart(ch) ) {
			input.consume();
			type = TokenType.identifier.ordinal();
			while( ( ch = input.LA(1) ) != CharStream.EOF && isIdentifierPart(ch) ) {
				input.consume();
			}
			return;
		}
		if( ch == '-' && input.LA(2) == '-' ) {
			input.consume();
			input.consume();
			while( true ) {
				while( ( ch = input.LA(1) ) != CharStream.EOF && ch != '-' ) {
					input.consume();
				}
				if( ch == '-' && input.LA(2) == '-' ) {
					type = TokenType.headerComments.ordinal();
					input.consume();
					input.consume();
					return;
				}
				if( ch == CharStream.EOF ) {
					// TODO  actually use a sensible BitSet instead of null
					MismatchedSetException mse = new MismatchedSetException(null, input);
					recover(mse);
					throw mse;
				}
			}
		}
		// TODO  actually use a sensible BitSet instead of null
		MismatchedSetException mse = new MismatchedSetException(null, input);
		recover(mse);
		throw mse;
	}

	private CaseInsensitiveTrie<String> tagKeywordsTrie;

	private void mTokensTag() throws RecognitionException {
		int ch = input.LA(1);
		if( ch == '<' ) {
			if( input.LA(2) == '!' && input.LA(3) == '-' && input.LA(4) == '-' ) {
				match("<!--");
				while( ( ch = input.LA(1) ) != CharStream.EOF && !( ch == '-' && input.LA(2) == '-' && input.LA(3) == '>' ) ) {
					input.consume();
				}
				if( ch != CharStream.EOF ) {
					match("-->");
					type = TokenType.comments.ordinal();
					return;
				} else {
					type = 0;
					// TODO  actually use a sensible BitSet instead of null
					MismatchedSetException mse = new MismatchedSetException(null, input);
			        recover(mse);
			        throw mse;
				}
			}
			// no comments, only an open tag symbol:
			input.consume();
			type = TokenType.openTagSymbol.ordinal();
			return;
		}
		if( ch == '>' ) {
			type = TokenType.closeTagSymbol.ordinal();
			input.consume();
			lexicalState = LexicalState.content;
			return;
		}
		if( ch == '=' ) {
			type = TokenType.equalsSymbol.ordinal();
			input.consume();
			return;
		}
		if( ch == '/' ) {
			type = TokenType.tagSlash.ordinal();
			input.consume();
			return;
		}
		if( Character.isWhitespace(ch) ) {
			consumeWhitespace();
			return;
		}
		String match = tagKeywordsTrie.match(input);
		if( match != null ) {
			type = TokenType.keyword.ordinal();
			// TODO  emit precise keyword
			return;
		}
		if( ch == '"' || ch == '\'' ) {
			consumeQuotedString(ch);
			return;
		}
		if( ch == CharStream.EOF ) {
			return;
		}
	}

	private void mTokensContent() throws RecognitionException {
		int ch = input.LA(1);
		if( ch == '<' ) {
			if( input.LA(2) == '!' && input.LA(3) == '-' && input.LA(4) == '-' ) {
				match("<!--");
				while( ( ch = input.LA(1) ) != CharStream.EOF && !( ch == '-' && input.LA(2) == '-' && input.LA(3) == '>' ) ) {
					input.consume();
				}
				if( ch != CharStream.EOF ) {
					match("-->");
					type = TokenType.comments.ordinal();
					return;
				} else {
					type = 0;
					// TODO  actually use a sensible BitSet instead of null
					MismatchedSetException mse = new MismatchedSetException(null, input);
			        recover(mse);
			        throw mse;
				}
			}
			// no comments, only an open tag symbol:
			input.consume();
			type = TokenType.openTagSymbol.ordinal();
			lexicalState = LexicalState.tag;
			return;
		}
		// TODO  make this more sophisticated by continue scanning in "might-be-a-entity reference"-mode
			// (it works right now and fixing this would only require fixing some unit tests)
//		boolean probableEntityReference = ( ch == '&' );
		if( ch == '&' ) {
			input.consume();
			// scan ahead to see if it's an entity reference:
			while( ( ch = input.LA(1) ) != CharStream.EOF && ( ch == '_' || Character.isLetterOrDigit(ch) ) ) {
				input.consume();
			}
			if( ch == ';' ) {
				input.consume();
				type = TokenType.entityReference.ordinal();
				return;
			}
			type = TokenType.literalContents.ordinal();
		}
		// TODO  check whether the literal contents consists solely of whitespace characters, in which case => whitespace
		this.type = TokenType.literalContents.ordinal();
		// scan forward until first (unquoted?) '<' (either next tag or comments) or '&' (either regular content or entity reference)
		while( ( ch = this.input.LA(1) ) != CharStream.EOF && !( ch == '<' || ch == '&' ) ) {
			input.consume();
		}
		return;
	}

	public enum HeaderKeywords {
		doctype, entity;
		// TODO  consider adding keywords 'sisgml', 'public' and 'system' as well
	}

}

