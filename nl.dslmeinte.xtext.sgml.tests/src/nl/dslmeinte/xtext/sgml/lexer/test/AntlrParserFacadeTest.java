package nl.dslmeinte.xtext.sgml.lexer.test;

import nl.dslmeinte.xtext.sgml.lexer.AntlrParserFacade;
import nl.dslmeinte.xtext.sgml.lexer.BaseTerminals;
import nl.dslmeinte.xtext.sgml.test.simplemarkup.parser.antlr.internal.InternalSimpleMarkupParser;

import org.junit.Assert;
import org.junit.Test;

public class AntlrParserFacadeTest extends AntlrParserFacade {

	public AntlrParserFacadeTest() {
		super(InternalSimpleMarkupParser.class);
	}

	@Test
	public void test_obtain_keywords() {
//		Assert.assertTrue(tagKeywordsMap.size() > 0);
//		for( Entry<String, Integer> entry : tagKeywordsMap.entrySet() ) {
//			System.out.format( "%s -> %d\n", entry.getKey(), entry.getValue() );
//		}
		for( BaseTerminals baseTerminal : BaseTerminals.values() ) {
			int mapping;
			try {
				mapping = map(baseTerminal);
				System.out.format( "%s -> %d\n", baseTerminal.name(), mapping );
			} catch (NullPointerException e) {
				Assert.fail("no mapping defined for BaseTerminals." + baseTerminal.name());
			}
		}
	}

}

