package nl.dslmeinte.xtext.sgml.lexer.test;

import java.util.Map;
import java.util.Map.Entry;

import junit.framework.Assert;
import nl.dslmeinte.xtext.sgml.dtd.test.parser.antlr.internal.InternalSimpleMarkupParser;
import nl.dslmeinte.xtext.sgml.lexer.BaseTerminals;
import nl.dslmeinte.xtext.sgml.lexer.GeneratedInternalAntlrParserFacade;

import org.junit.Test;

public class GeneratedInternalAntlrLexerFacadeTest {

	@Test
	public void test_obtain_keywords() {
		GeneratedInternalAntlrParserFacade facade = new GeneratedInternalAntlrParserFacade(InternalSimpleMarkupParser.class);
		Map<String, Integer> keywordsMap = facade.keywordsMap();
		Assert.assertTrue(keywordsMap.size() > 0);
		for( Entry<String, Integer> entry : keywordsMap.entrySet() ) {
			System.out.format( "%s -> %d\n", entry.getKey(), entry.getValue() );
		}
		for( Entry<BaseTerminals, Integer> entry : facade.baseTerminalsMap().entrySet() ) {
			System.out.format( "%s -> %d\n", entry.getKey().name(), entry.getValue() );
		}
	}

}

