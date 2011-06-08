package nl.dslmeinte.xtext.util.antlr;


/**
 * Implementation of {@link CaseInsensitiveTrie} which matches the enum's literal's names.
 * 
 * @author Meinte Boersma
 * 
 * @param <T>
 *            The <b>enum</b> to return.
 */
public class EnumBasedTrie<T extends Enum<T>> extends TrieSupport<T> {

	private EnumBasedTrie(T[] enumLiterals) {
		for( T enumLiteral : enumLiterals ) {
			register(enumLiteral, enumLiteral.name());
		}
	}

	/**
	 * Static factory method for a {@link EnumBasedTrie}.
	 * <p>
	 * Usage:
	 * <pre>
	 * MyEnum matchedLiteral = EnumDrivenTrie.of(MyEnum.class).match(..);
	 * </pre>
	 */
	public static <T extends Enum<T>> CaseInsensitiveTrie<T> of(Class<T> enumClass) {
		return new EnumBasedTrie<T>(enumClass.getEnumConstants());
	}

}
