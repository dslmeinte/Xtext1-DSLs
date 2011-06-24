package nl.dslmeinte.xtext.sgml.lexer;

import static nl.dslmeinte.xtext.sgml.lexer.BaseTerminals.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import nl.dslmeinte.xtext.util.antlr.trie.CaseInsensitiveTrie;
import nl.dslmeinte.xtext.util.antlr.trie.MapBasedTrie;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.MismatchedSetException;
import org.antlr.runtime.MismatchedTokenException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;

import com.google.inject.Inject;


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
	 * +--------+
	 * | Facade |
	 * +--------+
	 */

	private final TokenFacade facade;

	@Inject
	public SgmlLexer(TokenFacade facade) {
		this.facade = facade;
	}

	public TokenFacade getFacade() {
		return facade;
	}


	/*
	 * +---------+
	 * | Weaving |
	 * +---------+
	 */

	private WeavableAntlrLexer baseLexer;

	public void setBaseLexer(WeavableAntlrLexer baseLexer) {
		this.baseLexer = baseLexer;
		init();
	}

	private int LA(int i) {
		return input().LA(i);
	}

	private void consume() {
		input().consume();
	}

	private void setType(BaseTerminals baseTerminal) {
		setType(facade.map(baseTerminal));
	}

	private void setType(int type) {
//	(switch on for debugging...):
//		if( type == 0 ) {
//			throw new IllegalArgumentException("token type can't be 0");
//		}
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

	private void emit() {
		baseLexer.emit();
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

	public void mTokensDelegate() throws RecognitionException {
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

	private final static CaseInsensitiveTrie<BaseTerminals> headerKeywordsTrie;

	static {
		Map<String, BaseTerminals> map = new HashMap<String, BaseTerminals>();
		map.put("DOCTYPE", doctype);
		map.put("ENTITY", entity);
		map.put(public_.getKeyword(), public_);
		map.put(system.getKeyword(), system);
		headerKeywordsTrie = MapBasedTrie.of(map);
	}

	private void mTokensHeader() throws RecognitionException {
		int ch = LA(1);
		if( ch == '<' ) {
			consume();
			setType(open_tag);
			return;
		}
		if( ch == '>' ) {
			consume();
			if( !insideBrackets ) {
				lexicalState = LexicalState.content;
			}
			setType(close_tag);
			return;
		}
		if( ch == '[' ) {
			consume();
			insideBrackets = true;
			setType(open_bracket);
			return;
		}
		if( ch == ']' ) {
			consume();
			insideBrackets = false;
			setType(close_bracket);
			return;
		}
		if( ch == '!' ) {
			consume();
			BaseTerminals keyword = headerKeywordsTrie.match(input());
			if( keyword == doctype ) {
				setType(doctype);
				return;
			}
			if( keyword == entity ) {
				setType(entity);
				return;
			}
			// TODO  provide more useful info than '0'
			MismatchedTokenException mte = new MismatchedTokenException(0, input());
			recover(mte);
			throw mte;
		}
		if( isWhitespace(ch) ) {
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
			setType(header_comments);
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
			setType(keyword);
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
			// comments can't be part of a tag, but must be able to lexe them just before tag open:
			if( LA(2) == '!' && LA(3) == '-' && LA(4) == '-' ) {
				match("<!--");
				while( ( ch = LA(1) ) != CharStream.EOF && !( ch == '-' && LA(2) == '-' && LA(3) == '>' ) ) {
					consume();
				}
				if( ch != CharStream.EOF ) {
					match("-->");
					setType(sgml_comments);
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
			setType(open_tag);
			return;
		}
		if( ch == '>' ) {
			setType(close_tag);
			consume();
			lexicalState = LexicalState.content;
			return;
		}
		if( ch == '=' ) {
			setType(equals);
			consume();
			return;
		}
		if( ch == '/' ) {
			setType(slash);
			consume();
			return;
		}
		if( isWhitespace(ch) ) {
			consumeWhitespace();
			return;
		}
		Integer match = facade.nonBaseKeywordsTrie().match(input());
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
		if( isQueuePopulated() ) {
			dequeue();
			return;
		}

		int ch = LA(1);
		if( ch == '<' ) {
			if( LA(2) == '!' && LA(3) == '-' && LA(4) == '-' ) {
				match("<!--");
				while( ( ch = LA(1) ) != CharStream.EOF && !( ch == '-' && LA(2) == '-' && LA(3) == '>' ) ) {
					consume();
				}
				if( ch != CharStream.EOF ) {
					match("-->");
					setType(sgml_comments);
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
			setType(open_tag);
			lexicalState = LexicalState.tag;
			return;
		}

		if( ch == CharStream.EOF ) {
			return;
		}

		whitespaceOnly = true;
		int charactersToConsume = 0;
		// walk over contents and deal with (potential) entity reference matches:

		while( true ) {
			while( ( ch = LA(charactersToConsume + 1) ) != CharStream.EOF && !( ch == '<' || ch == '&' ) ) {
				whitespaceOnly &= isWhitespace(ch);
				charactersToConsume++;
			}
			if( ch == '<' || ch == CharStream.EOF ) {
				enqueue(getLiteralContentsType(), charactersToConsume);
				dequeue();
				return;
			}
			// LA(1) == '&':
			if( !isIdentifierPart(LA(charactersToConsume + 2)) ) {
				charactersToConsume += 2;
				whitespaceOnly = false;
				continue;
			}
			int i = 2;
			while( ( ch = LA(charactersToConsume + i) ) != CharStream.EOF && isIdentifierPart(ch) ) {
				i++;
			}
			if( charactersToConsume > 0 ) {
				// emit literal_contents token for characters before '&':
				enqueue(getLiteralContentsType(), charactersToConsume);
			}
			// emit ampersand token for '&':
			enqueue(ampersand, 1);
			enqueue(identifier, i - 2);
			if( ch == ';' ) {	// entity reference found!
				// emit semicolon token ';':
				enqueue(semicolon, 1);
			}
			dequeue();
			return;
		}
	}

	private boolean whitespaceOnly;

	private BaseTerminals getLiteralContentsType() {
		return( whitespaceOnly ? whitespace : literal_contents );
	}

	private class QueuedToken {
		private BaseTerminals type;
		private int length;
		public QueuedToken(BaseTerminals type, int length) {
			this.type = type;
			this.length = length;
		}
	}

	private final List<QueuedToken> queue = new ArrayList<QueuedToken>();
	private int queueIndex = 0;

	public boolean isQueuePopulated() {
		return queue.size() > 0;
	}

	public void enqueue(BaseTerminals type, int length) {
		queue.add(new QueuedToken(type, length));
	}

	public void dequeue() {
		QueuedToken queuedToken = queue.get(queueIndex);
		setType(queuedToken.type);
		for( int i = 0; i < queuedToken.length; i++ ) {
			consume();
		}
		emit();
		queueIndex++;
		if( queueIndex >= queue.size() ) {
			queue.clear();
			queueIndex = 0;
		}
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

	private boolean isWhitespace(int ch) {
		return Character.isWhitespace(ch);
	}

	/**
	 * Assertion: only called in case {@code Character.isIdentifierPart( LA(1) )}.
	 */
	private void consumeIdentifier() {
		setType(identifier);
		consume();
		while( isIdentifierPart(LA(1)) ) {
			consume();
		}
	}

	/**
	 * Assertion: only called in case {@code isWhitespace( LA(1) )}.
	 */
	private void consumeWhitespace() {
		setType(whitespace);
		consume();
		while( isWhitespace( LA(1) ) ) {
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
			setType(quoted_string);
			return;
		}

		NoViableAltException nvae = new NoViableAltException();
		recover(nvae);
		throw nvae;
	}

}

