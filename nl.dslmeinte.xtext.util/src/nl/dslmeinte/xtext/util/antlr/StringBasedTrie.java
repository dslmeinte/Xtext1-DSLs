package nl.dslmeinte.xtext.util.antlr;

import java.util.List;

/**
 * Implementation of {@link CaseInsensitiveTrie} which matches the given list of
 * {@link String}s, returning the matched {@link String} verbatim in case of a
 * match.
 * 
 * @author Meinte Boersma
 */
public class StringBasedTrie extends TrieSupport<String> {

	private StringBasedTrie(Iterable<String> keys) {
		for( String key : keys ) {
			register(key, key);
		}
	}

	/**
	 * Creates a {@link CaseInsensitiveTrie} from the given {@link List} of
	 * {@link String} keys.
	 */
	public static StringBasedTrie of(List<String> keys) {
		return new StringBasedTrie(keys);
	}

}
