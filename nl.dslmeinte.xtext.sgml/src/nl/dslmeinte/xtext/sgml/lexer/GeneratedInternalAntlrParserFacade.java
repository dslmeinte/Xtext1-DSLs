package nl.dslmeinte.xtext.sgml.lexer;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;

/**
 * Façade class for an instance of {@link AbstractInternalAntlrParser} with the
 * intent to derive language information from that, specifically to map keywords
 * to keyword identifiers (integers).
 * 
 * @author Meinte Boersma
 */
public class GeneratedInternalAntlrParserFacade {

	public GeneratedInternalAntlrParserFacade(Class<? extends AbstractInternalAntlrParser> generatedParserClass) {
		for( Field field : generatedParserClass.getFields() ) {
			String fieldName = field.getName();
			if( int.class.isAssignableFrom(field.getType()) && fieldName.startsWith("RULE_") ) {
				populateMapsWith(fieldName.substring("RULE_".length()), intValue(field));
			}
		}
	}

	private final Map<String, Integer> keywordsMap = new HashMap<String, Integer>();

	public Map<String, Integer> keywordsMap() {
		return keywordsMap;
	}

	private final Map<BaseTerminals, Integer> baseTerminalsMap = new HashMap<BaseTerminals, Integer>();

	public Map<BaseTerminals, Integer> baseTerminalsMap() {
		return baseTerminalsMap;
	}

	private void populateMapsWith(String keyword, int value) {
		int index = keyword.lastIndexOf("_BASE_KEYWORD");
		if( index > -1 ) {
			baseTerminalsMap.put(BaseTerminals.fromName(keyword.substring(0, index)), value);
			return;
		}
		index = keyword.lastIndexOf("_SYMBOL");
		if( index > -1 ) {
			baseTerminalsMap.put(BaseTerminals.fromName(keyword.substring(0, index)), value);
			return;
		}
		index = keyword.lastIndexOf("_KEYWORD");
		if( index > -1 ) {
			keywordsMap.put(keyword.substring(0, index), value);
			return;
		}
		BaseTerminals baseTerminal = BaseTerminals.fromName(keyword);
		if( baseTerminal != null ) {
			baseTerminalsMap.put(baseTerminal, value);
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

}
