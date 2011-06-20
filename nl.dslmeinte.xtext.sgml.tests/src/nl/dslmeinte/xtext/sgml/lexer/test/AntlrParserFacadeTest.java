package nl.dslmeinte.xtext.sgml.lexer.test;

import java.util.Map.Entry;

import junit.framework.Assert;
import nl.dslmeinte.xtext.sgml.dtd.test.parser.antlr.internal.InternalSimpleMarkupParser;
import nl.dslmeinte.xtext.sgml.lexer.AntlrParserFacade;
import nl.dslmeinte.xtext.sgml.lexer.BaseTerminals;

import org.junit.Test;

public class AntlrParserFacadeTest extends AntlrParserFacade {

	public AntlrParserFacadeTest() {
		super(InternalSimpleMarkupParser.class);
	}

	@Test
	public void test_obtain_keywords() {
		Assert.assertTrue(tagKeywordsMap.size() > 0);
		for( Entry<String, Integer> entry : tagKeywordsMap.entrySet() ) {
			System.out.format( "%s -> %d\n", entry.getKey(), entry.getValue() );
		}
		for( Entry<BaseTerminals, Integer> entry : baseTerminalsMap.entrySet() ) {
			System.out.format( "%s -> %d\n", entry.getKey().name(), entry.getValue() );
		}
	}

}

