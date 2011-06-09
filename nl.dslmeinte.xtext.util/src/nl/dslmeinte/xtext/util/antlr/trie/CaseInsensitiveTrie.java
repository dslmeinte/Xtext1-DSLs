package nl.dslmeinte.xtext.util.antlr.trie;

import org.antlr.runtime.CharStream;

/**
 * Interface for a <em>trie</em> which matches a fixed set of {@link String}
 * keys case-insensitively against an ANTLR {@link CharStream} - which is
 * advanced to just after the match. <em>Longest match wins</em> (contract).
 * 
 * @author Meinte Boersma
 * 
 * @param <T>
 *            The run-time representation type corresponding to the keys.
 */
public interface CaseInsensitiveTrie<T> {

	/**
	 * Matches the {@link CharStream} passed from its current position to any of
	 * the registered keys, returning the <em>longest</em> one or {@code null}
	 * if no match is found.
	 */
	public abstract T match(CharStream input);

}
