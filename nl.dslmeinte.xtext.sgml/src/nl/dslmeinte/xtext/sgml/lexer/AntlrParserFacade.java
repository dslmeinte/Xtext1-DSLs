package nl.dslmeinte.xtext.sgml.lexer;

import java.lang.reflect.Field;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

import nl.dslmeinte.xtext.util.antlr.trie.CaseInsensitiveTrie;
import nl.dslmeinte.xtext.util.antlr.trie.MapBasedTrie;

import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;

/**
 * Facade class for an instance of {@link AbstractInternalAntlrParser} with the
 * intent to derive language information from that, specifically to map keywords
 * to keyword identifiers (integers).
 * <p>
 * Essentially, an instance of this class represents the knowledge about the
 * token types (coded as integers) of a certain language.
 * 
 * TODO  replace a lot of the low-level reflection stuff with AntlrTokenDefProvider?
 * 
 * @author Meinte Boersma
 */
public class AntlrParserFacade {

	/**
	 * <em>Note</em> that we're not limiting the generic type of the
	 * {@link Class} to {@link AbstractInternalAntlrParser}: for testing
	 * purposes, any class with a number of {@code public static} ({@code final}
	 * ) {@link int} fields following the naming convention (as yet
	 * undocumented) suffices.
	 */
	public AntlrParserFacade(Class<?> generatedParserClass) {
		for( Field field : generatedParserClass.getFields() ) {
			String fieldName = field.getName();
			if( int.class.isAssignableFrom(field.getType()) && fieldName.startsWith("RULE_") ) {
				populateMapsWith(fieldName.substring("RULE_".length()), intValue(field));
			}
		}
		tagKeywordsTrie = MapBasedTrie.of(tagKeywordsMap);
	}

	private final CaseInsensitiveTrie<Integer> tagKeywordsTrie;

	public CaseInsensitiveTrie<Integer> tagKeywordsTrie() {
		return tagKeywordsTrie;
	}

	protected final Map<String, Integer> tagKeywordsMap = new HashMap<String, Integer>();
	protected final Map<Integer, String> reverseTagKeywordsMap = new HashMap<Integer, String>();

	protected final Map<BaseTerminals, Integer> baseTerminalsMap = new EnumMap<BaseTerminals, Integer>(BaseTerminals.class);
	protected final Map<Integer, BaseTerminals> reverseBaseTerminalsMap = new HashMap<Integer, BaseTerminals>();

	/**
	 * @return a {@link Map} from {@link BaseTerminals} literals to the
	 *         {@code int} identifier in the generated internal ANTLR parser.
	 */
	public Map<BaseTerminals, Integer> baseTerminalsMap() {
		return baseTerminalsMap;
	}

	public int map(BaseTerminals baseTerminal) {
		return baseTerminalsMap.get(baseTerminal).intValue();
	}

	protected void populateMapsWith(String keyword, int value) {
		int index = keyword.lastIndexOf("_BASE_KEYWORD");
		if( index > -1 ) {
			keyword = keyword.substring(0, index);
			BaseTerminals baseTerminal = BaseTerminals.fromName(keyword);
			baseTerminalsMap.put(baseTerminal, value);
			reverseBaseTerminalsMap.put(value, baseTerminal);
			return;
		}
		index = keyword.lastIndexOf("_SYMBOL");
		if( index > -1 ) {
			keyword = keyword.substring(0, index);
			BaseTerminals baseTerminal = BaseTerminals.fromName(keyword);
			baseTerminalsMap.put(baseTerminal, value);
			reverseBaseTerminalsMap.put(value, baseTerminal);
			return;
		}
		index = keyword.lastIndexOf("_KEYWORD");
		if( index > -1 ) {
			keyword = keyword.substring(0, index);
			tagKeywordsMap.put(keyword, value);
			reverseTagKeywordsMap.put(value, keyword);
			return;
		}
		BaseTerminals baseTerminal = BaseTerminals.fromName(keyword);
		if( baseTerminal != null ) {
			baseTerminalsMap.put(baseTerminal, value);
			reverseBaseTerminalsMap.put(value, baseTerminal);
		} else {
			throw new IllegalArgumentException("could not find mapping to BaseTerminals for '" + keyword + "'");
		}
	}

	private int intValue(Field field) {
		try {
			return field.getInt(null);
		} catch (IllegalArgumentException e) {
			throw new RuntimeException("could not access value of field '" + field.getName() + "'", e);
		} catch (IllegalAccessException e) {
			throw new RuntimeException("could not access value of field '" + field.getName() + "'", e);
		}
	}

	public boolean isBase(int type) {
		return reverseBaseTerminalsMap.containsKey(type);
	}

	public BaseTerminals asBase(int type) {
		return reverseBaseTerminalsMap.get(type);
	}

	public boolean isTag(int type) {
		return reverseTagKeywordsMap.containsKey(type);
	}

	public String asTag(int type) {
		return reverseTagKeywordsMap.get(type);
	}

}
