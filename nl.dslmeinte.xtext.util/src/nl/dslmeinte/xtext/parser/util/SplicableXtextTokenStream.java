package nl.dslmeinte.xtext.parser.util;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Lexer;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenSource;
import org.eclipse.xtext.parser.antlr.ITokenDefProvider;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

/**
 * Sub implementation of {@link XtextTokenStream} which allows {@link Token}s
 * from the stream to be "spliced" into new {@link Token}s in order to be able
 * to change the parser behavior after lexing and before model population.
 * <p>
 * This is useful when using a custom lexer ({@link Lexer} or
 * {@link org.eclipse.xtext.parser.antlr.Lexer}) because it's difficult to get
 * the terminal grammar rules right and workable across the board, e.g. in the
 * case of SGML parsing.
 * <p>
 * The hard part of this is that {@link Token}s have their own index, which
 * should be the same as their index inside the containing list.
 * 
 * @author Meinte Boersma
 */
public class SplicableXtextTokenStream extends XtextTokenStream {

	private final List<Token> lookaheadTokens;
	
	private final Set<Token> lookaheadTokenSet;

	private Map<String, Integer> rulenameToTokenType;
	
	private BitSet hiddenTokens;

	public SplicableXtextTokenStream() {
		tokens = new SplicableTokenList(500);
		lookaheadTokens = createLookAheadTokenList();
		lookaheadTokenSet = createLookAheadTokenSet();
	}

	public SplicableXtextTokenStream(TokenSource tokenSource, int channel) {
		tokens = new SplicableTokenList(500);
		lookaheadTokens = createLookAheadTokenList();
		lookaheadTokenSet = createLookAheadTokenSet();
	}

	public SplicableXtextTokenStream(TokenSource tokenSource, ITokenDefProvider tokenDefProvider) {
		tokens = new SplicableTokenList(500);
		lookaheadTokens = createLookAheadTokenList();
		lookaheadTokenSet = createLookAheadTokenSet();
		rulenameToTokenType = new HashMap<String, Integer>(tokenDefProvider.getTokenDefMap().size());
		for( Map.Entry<Integer, String> entry: tokenDefProvider.getTokenDefMap().entrySet() ) {
			rulenameToTokenType.put(entry.getValue(), entry.getKey());
		}
	}

	/**
	 * Inner class which holds a {@link List} of {@link Token}s.
	 * <p>
	 * This is also the governing body to do the splicing.
	 */
	@SuppressWarnings("serial")
	private final class SplicableTokenList extends ArrayList<Token> {

		private SplicableTokenList(int initialCapacity) {
			super(initialCapacity);
		}

		/**
		 * Returns the token with given {@code index}, taking care to adjust the
		 * tokens channel whenever the token hasn't been consumed yet and its
		 * type is not "internal".
		 */
		@Override
		public Token get(int index) {
			Token token = super.get(index);
			if(
				   hiddenTokens != null
				&& token.getType() >= Token.MIN_TOKEN_TYPE
				&& index >= p	// adjust only tokens in the 'future', as we won't change the channel of previously parsed tokens
			) {
				token.setChannel(
						hiddenTokens.get(token.getType()) ? Token.HIDDEN_CHANNEL : Token.DEFAULT_CHANNEL
					);
			}
			return token;
		}

		/*
		 * (non-Javadoc)
		 * @see java.util.ArrayList#clear()
		 */
		@Override
		public void clear() {
			if( isEmpty() ) {
				return;
			}
			super.clear();
		}

	}

	/**
	 * Encapsulates the splicing of a single {@link CommonToken} in a controlled
	 * fashion.
	 */
	public final class Splice {
		
	}

}
