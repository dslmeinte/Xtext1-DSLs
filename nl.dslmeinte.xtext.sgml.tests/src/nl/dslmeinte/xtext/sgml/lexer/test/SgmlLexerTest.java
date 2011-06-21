package nl.dslmeinte.xtext.sgml.lexer.test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import nl.dslmeinte.xtext.sgml.dtd.test.support.BaseTerminalsMockupMetadata;
import nl.dslmeinte.xtext.sgml.lexer.AntlrParserFacade;
import nl.dslmeinte.xtext.sgml.lexer.BaseTerminals;
import nl.dslmeinte.xtext.sgml.lexer.InternalModelPopulatingSgmlLexer;
import nl.dslmeinte.xtext.sgml.lexer.SgmlLexer;
import nl.dslmeinte.xtext.util.antlr.HtmlTokenVisualizer;
import nl.dslmeinte.xtext.util.antlr.HtmlTokenVisualizer.TokenToStyleMapper;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.Token;
import org.eclipse.xtext.parser.antlr.Lexer;
import org.junit.Assert;
import org.junit.Test;

public class SgmlLexerTest {

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

	private Lexer lexer;

	private final SgmlLexer sgmlLexer;

	public SgmlLexerTest() {
		sgmlLexer = new SgmlLexer();
		sgmlLexer.setFacade(new AntlrParserFacade(SimpleMarkupMockupMetadata.class));
	}

	private Lexer provideLexer(CharStream input) {
		InternalModelPopulatingSgmlLexer baseLexer = new InternalModelPopulatingSgmlLexer(null);
		baseLexer.setSgmlLexer(sgmlLexer);
		sgmlLexer.setBaseLexer(baseLexer);
		baseLexer.setCharStream(input);
		return baseLexer;
	}

	@Test
	public void test_lexing_of_header() throws IOException {
		lexe(new ANTLRStringStream("<!DOCTYPE SISGML PUBLIC 'simpleMarkup.dtd' [<!ENTITY myEntity SYSTEM '/foo/bar' --bla-die-blah-->]>"));
	}

	@Test
	public void test_lexing_of_simple_markup_file() throws IOException {
		lexe(new ANTLRFileStream("models/simpleMarkup.sm"));
	}

	private void lexe(CharStream input) throws IOException {
		lexer = provideLexer(input);
		Token token = lexer.nextToken();
		while( token.getType() != CharStream.EOF ) {
			if( token.getType() == 0 ) {
				System.err.println( "encountered token of type 0 @L" + token.getLine() + ":" + token.getCharPositionInLine() );
			}
			token = lexer.nextToken();
		}
	}

	@Test
	public void visualize_lexing_of_simple_markup_file() throws IOException {
		final AntlrParserFacade facade = sgmlLexer.getFacade();
		lexer = provideLexer(null);
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

	protected void assertNextToken(BaseTerminals type) {
		Token token = lexer.nextToken();
//		System.out.format( "|%s| [actual=%s, expected=%s]\n", token.getText(), TokenType.values()[token.getType()], type );
		assertTokenType(type, token);
	}

	protected void assertTokenType(BaseTerminals type, Token token) {
		Assert.assertEquals(sgmlLexer.getFacade().map(type), token.getType());
	}

	protected Token nextNonWhitespaceToken() {
		Token token = lexer.nextToken();
		while( ( token != null ) && ( token.getType() == sgmlLexer.getFacade().map(BaseTerminals.whitespace) ) ) {
			token = lexer.nextToken();
		}
		return token;
	}

	protected void assertNextNonWhitespaceToken(BaseTerminals baseTerminal) {
		assertTokenType(baseTerminal, nextNonWhitespaceToken());
	}

}
