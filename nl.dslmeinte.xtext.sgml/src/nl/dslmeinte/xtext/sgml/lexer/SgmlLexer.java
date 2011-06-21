package nl.dslmeinte.xtext.sgml.lexer;

import nl.dslmeinte.xtext.util.antlr.trie.CaseInsensitiveTrie;
import nl.dslmeinte.xtext.util.antlr.trie.EnumBasedTrie;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.MismatchedSetException;
import org.antlr.runtime.MismatchedTokenException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;

import com.google.inject.Inject;

import static nl.dslmeinte.xtext.sgml.lexer.BaseTerminals.*;


/**
 * Lexer to lexe SGML content, using the principle of lexical state and
 * governing that state itself.
 * <p>
 * The three lexical states are:
 * <dl>
 * 	<dt>{@code header}</dt>
 * 		<dd>For the SGML header, including entities and up to the closing {@code >}.</dd>
 * 	<dt>{@code tag}</dt>
 * 		<dd>For tags, including opening {@code <} and closing {@code >}.</dd>
 * 	<dt>{@code content}</dt>
 * 		<dd>For content outside of the SGML header and tags.</dd>
 * </dl>
 * <p>
 * The following is a table detailing all the {@link BaseTerminals}s, by which
 * states they can be emitted, and when:
 * <dl>
 * 	<dt>{@code whitespace}</dt>
 * 		<dd>{@code header}, {@code tag}, {@code content} if literal contents if pure whitespace (<b>TODO!</b>)</dd>
 * 	<dt>{@code identifier} matching {@code [0-9A-Za-z_]+}</dt>
 * 		<dd>{@code header}</dd>
 * 	<dt>{@code sgml_comments} matching {@code '<!--'} &rarr; {@code '-->'}</dt>
 * 		<dd>{@code content}</dd>
 * 	<dt>{@code quoted_string}</dt>
 * 		<dd>{@code header}, {@code tag}</dd>
 * 	<dt>{@code doctype} ~ {@code !DOCTYPE}, {@code entity} ~ {@code !ENTITY}, {@code open_bracket}, {@code close_bracket}, {@code header_comments} matching {@code '--'} &rarr; {@code '--'}</dt>
 * 		<dd>{@code header}</dd>
 * 	<dt>{@code open_tag}, {@code close_tag}, {@code slash}, {@code equals}</dt>
 * 		<dd>{@code tag}</dd>
 * 	<dt>{@code literal_contents}</dt>
 * 		<dd>{@code content}</dd>
 * </dl>
 * 
 * @author Meinte Boersma
 */
public class SgmlLexer {

	/*
	 * +---------+
	 * | Weaving |
	 * +---------+
	 */

	@Inject
	private WeavableAntlrLexer baseLexer;

	public void setBaseLexer(WeavableAntlrLexer baseLexer) {
		this.baseLexer = baseLexer;
	}

	private int LA(int i) {
		return input().LA(i);
	}

	private void consume() {
		input().consume();
	}

	private void setType(int type) {
		if( type == 0 ) {
			throw new IllegalArgumentException("token type can't be 0");
		}
		baseLexer.setType(type);
	}

	private void match(String string) throws MismatchedTokenException {
		baseLexer.match(string);
	}

	private CharStream input() {
		return baseLexer.input();
	}

	private void recover(RecognitionException re) {
		baseLexer.recover(re);
	}


	/*
	 * +--------+
	 * | Facade |
	 * +--------+
	 */

	private AntlrParserFacade facade;

	public void setFacade(AntlrParserFacade facade) {
		this.facade = facade;
	}

	public AntlrParserFacade getFacade() {
		return facade;
	}


	/*
	 * +-------------------+
	 * | Lexing entry point|
	 * +-------------------+
	 */

	public void init() {
		lexicalState = LexicalState.header;
	}

	// the following 2 features have protected visibility to allow per-state testing:

	protected enum LexicalState {
		header, tag, content;
	}

	protected LexicalState lexicalState;

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


	/*
	 * +----------------+
	 * | Lexing: header |
	 * +----------------+
	 */

	private boolean insideBrackets = false;

	private final CaseInsensitiveTrie<BaseTerminals> headerKeywordsTrie = EnumBasedTrie.of(doctype, sisgml, public_, system, entity);

	private void mTokensHeader() throws RecognitionException {
		int ch = LA(1);
		if( ch == '<' ) {
			consume();
			setType(facade.map(open_tag));
			return;
		}
		if( ch == '>' ) {
			consume();
			if( !insideBrackets ) {
				lexicalState = LexicalState.content;
			}
			setType(facade.map(close_tag));
			return;
		}
		if( ch == '[' ) {
			consume();
			insideBrackets = true;
			setType(facade.map(open_bracket));
			return;
		}
		if( ch == ']' ) {
			consume();
			insideBrackets = false;
			setType(facade.map(close_bracket));
			return;
		}
		if( ch == '!' ) {
			consume();
			BaseTerminals keyword = headerKeywordsTrie.match(input());
			if( keyword == doctype ) {
				setType(facade.map(doctype));
				return;
			}
			if( keyword == entity ) {
				setType(facade.map(entity));
				return;
			}
			// TODO  provide more useful info than '0'
			MismatchedTokenException mte = new MismatchedTokenException(0, input());
			recover(mte);
			throw mte;
		}
		if( Character.isWhitespace(ch) ) {
			consumeWhitespace();
			return;
		}
		if( isQuoteChar(ch) ) {
			consumeQuotedString(ch);
			return;
		}
		if( ch == '-' && LA(2) == '-' ) {
			consume();
			consume();
			setType(facade.map(header_comments));
			while( true ) {
				while( ( ch = LA(1) ) != CharStream.EOF && ch != '-' ) {
					consume();
				}
				if( ch == '-' ) {
					consume();
					if( LA(1) == '-' ) {
						consume();
						return;
					} else {
						continue;
					}
				}
				if( ch == CharStream.EOF ) {
					// TODO  actually use a sensible BitSet instead of null
					MismatchedSetException mse = new MismatchedSetException(null, input());
					recover(mse);
					throw mse;
				}
			}
		}
		BaseTerminals keyword = headerKeywordsTrie.match(input());
		if( keyword != null ) {
			setType(facade.map(keyword));
			return;
		}
		if( isIdentifierPart(ch) ) {
			consumeIdentifier();
			return;
		}
		// TODO  actually use a sensible BitSet instead of null
		MismatchedSetException mse = new MismatchedSetException(null, input());
		recover(mse);
		throw mse;
	}


	/*
	 * +--------------+
	 * | Lexing: tags |
	 * +--------------+
	 */

	private void mTokensTag() throws RecognitionException {
		int ch = LA(1);
		if( ch == '<' ) {
			// FIXME  comments can't be part of a tag
			if( LA(2) == '!' && LA(3) == '-' && LA(4) == '-' ) {
				match("<!--");
				while( ( ch = LA(1) ) != CharStream.EOF && !( ch == '-' && LA(2) == '-' && LA(3) == '>' ) ) {
					consume();
				}
				if( ch != CharStream.EOF ) {
					match("-->");
					setType(facade.map(sgml_comments));
					return;
				} else {
					setType(0);
					// TODO  actually use a sensible BitSet instead of null
					MismatchedSetException mse = new MismatchedSetException(null, input());
			        recover(mse);
			        throw mse;
				}
			}
			// no comments, only an open tag symbol:
			consume();
			setType(facade.map(open_tag));
			return;
		}
		if( ch == '>' ) {
			setType(facade.map(close_tag));
			consume();
			lexicalState = LexicalState.content;
			return;
		}
		if( ch == '=' ) {
			setType(facade.map(equals));
			consume();
			return;
		}
		if( ch == '/' ) {
			setType(facade.map(slash));
			consume();
			return;
		}
		if( Character.isWhitespace(ch) ) {
			consumeWhitespace();
			return;
		}
		Integer match = facade.tagKeywordsTrie().match(input());
		if( match != null ) {
			setType(match);
			return;
		}
		if( isQuoteChar(ch) ) {
			consumeQuotedString(ch);
			return;
		}
		if( ch == CharStream.EOF ) {
			return;
		}
		// TODO  actually use a sensible BitSet instead of null
		MismatchedSetException mse = new MismatchedSetException(null, input());
		recover(mse);
		throw mse;
	}


	/*
	 * +-----------------+
	 * | Lexing: content |
	 * +-----------------+
	 */

	/**
	 * Lexes the input/content <em>inside</em> tags until the first opening tag
	 * {@code <} (which is not part of SGML comments).
	 */
	private void mTokensContent() throws RecognitionException {
		int ch = LA(1);
		if( ch == '<' ) {
			if( LA(2) == '!' && LA(3) == '-' && LA(4) == '-' ) {
				match("<!--");
				while( ( ch = LA(1) ) != CharStream.EOF && !( ch == '-' && LA(2) == '-' && LA(3) == '>' ) ) {
					consume();
				}
				if( ch != CharStream.EOF ) {
					match("-->");
					setType(facade.map(sgml_comments));
					return;
				} else {
					setType(0);
					// TODO  actually use a sensible BitSet instead of null
					MismatchedSetException mse = new MismatchedSetException(null, input());
			        recover(mse);
			        throw mse;
				}
			}
			// no comments, only an open tag symbol:
			consume();
			setType(facade.map(open_tag));
			lexicalState = LexicalState.tag;
			return;
		}
		if( Character.isWhitespace(ch) ) {
			consumeWhitespace();
			return;
		}
		// TODO  make this more sophisticated by continue scanning in "might-be-a-entity reference"-mode
			// (it works right now and fixing this would only require fixing some unit tests)
//		boolean probableEntityReference = ( ch == '&' );
		if( ch == '&' ) {
			consume();
			// scan ahead to see if it's an entity reference:
			while( ( ch = LA(1) ) != CharStream.EOF && isIdentifierPart(ch) ) {
				consume();
			}
			if( ch == ';' ) {
				consume();
				// FIXME  emit 3 tokens: & - identifier - ;
				setType(facade.map(entity_reference));
				return;
			}
			setType(facade.map(literal_contents));
		}
		setType(facade.map(literal_contents));
		// scan forward until first (unquoted?) '<' (either next tag or comments) or '&' (either regular content or entity reference)
		while( ( ch = LA(1) ) != CharStream.EOF && !( ch == '<' || ch == '&' ) ) {
			consume();
		}
		return;
	}


	/*
	 * +---------------------+
	 * | Convenience methods |
	 * +---------------------+
	 */

	private boolean isIdentifierPart(int ch) {
		return( Character.isLetterOrDigit(ch) || ch == '_' );
	}

	private boolean isQuoteChar(int ch) {
		return( ch == '"' || ch == '\'' );
	}

	/**
	 * Assertion: only called in case {@code Character.isIdentifierPart( LA(1) )}.
	 */
	private void consumeIdentifier() {
		setType(facade.map(identifier));
		consume();
		while( isIdentifierPart(LA(1)) ) {
			consume();
		}
	}

	/**
	 * Assertion: only called in case {@code Character.isWhitespace( LA(1) )}.
	 */
	private void consumeWhitespace() {
		setType(facade.map(whitespace));
		consume();
		while( Character.isWhitespace( LA(1) ) ) {
			consume();
		}
	}

	/**
	 * Assertion: only called in case {@code Character.isQuoteChar( LA(1) )}.
	 * 
	 * @param quoteChar
	 *            the value of {@code LA(1)}
	 */
	private void consumeQuotedString(int quoteChar) throws RecognitionException {
		consume();
		int ch;
		while( ( ch = LA(1) ) != quoteChar && ch != CharStream.EOF ) {
			consume();
		}

		if( ch != CharStream.EOF ) {
			consume();
			setType(facade.map(quoted_string));
			return;
		}

		NoViableAltException nvae = new NoViableAltException();
		recover(nvae);
		throw nvae;
	}

}

