package nl.dslmeinte.xtext.sgml.lexer.test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import nl.dslmeinte.xtext.sgml.dtd.test.support.BaseTerminalsMockupMetadata;
import nl.dslmeinte.xtext.sgml.dtd.test.support.LexerTestSupport;
import nl.dslmeinte.xtext.sgml.lexer.AntlrParserFacade;
import nl.dslmeinte.xtext.sgml.lexer.SgmlLexer;
import nl.dslmeinte.xtext.util.antlr.HtmlTokenVisualizer;
import nl.dslmeinte.xtext.util.antlr.HtmlTokenVisualizer.TokenToStyleMapper;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.Token;
import org.junit.Assert;
import org.junit.Test;

public class SgmlLexerTest extends LexerTestSupport<SgmlLexer> {

	public static class SimpleMarkupMockupMetadata extends BaseTerminalsMockupMetadata {

		private static int id = 1;

		public static final int RULE_CONTENT_KEYWORD = id++;
		public static final int RULE_REFERENCE_KEYWORD = id++;
		public static final int RULE_TO_KEYWORD = id++;
		public static final int RULE_SECTION_KEYWORD = id++;
		public static final int RULE_STYLENAME_KEYWORD = id++;
		public static final int RULE_CONDITION_KEYWORD = id++;
		public static final int RULE_PAR_KEYWORD = id++;
		public static final int RULE_EM_KEYWORD = id++;
		public static final int RULE_BF_KEYWORD = id++;

	}

	public SgmlLexerTest() {
		super(new SgmlLexer(new AntlrParserFacade(SimpleMarkupMockupMetadata.class)));
	}

	@Test
	public void test_lexing_of_simple_markup_file() throws IOException {
		CharStream input = new ANTLRFileStream("models/simpleMarkup.sm");
		lexer.setCharStream(input);
		Token token = lexer.nextToken();
		while( token.getType() != CharStream.EOF ) {
			Assert.assertTrue(token.getType() != 0);
			token = lexer.nextToken();
		}
	}

	@Test
	public void visualize_lexing_of_simple_markup_file() throws IOException {
		final AntlrParserFacade facade = lexer.getAntlrParserFacade();
		HtmlTokenVisualizer visualizer = new HtmlTokenVisualizer(lexer, new TokenToStyleMapper() {
			@Override
			public String cssClassName(Token token) {
				int type = token.getType();
				if( facade.isBase(type) ) {
					return facade.asBase(type).name();
				}
				if( facade.isTag(type) ) {
					return "tagKeyword";
				}
				throw new IllegalArgumentException("couldn't map token type id=" + type + " to style");
			}
		}, "SimpleMarkup-lexing-style.css");
		CharStream input = new ANTLRFileStream("models/simpleMarkup.sm");
		OutputStream output = new FileOutputStream("models/simpleMarkup-lexed.html");
		visualizer.visualize(input, output, "simpleMarkup.sm: token visualization");
		output.close();
	}

}
