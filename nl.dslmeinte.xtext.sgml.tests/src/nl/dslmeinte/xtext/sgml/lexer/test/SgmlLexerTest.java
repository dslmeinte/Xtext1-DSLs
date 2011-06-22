package nl.dslmeinte.xtext.sgml.lexer.test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;

import nl.dslmeinte.xtext.sgml.lexer.BaseTerminals;
import nl.dslmeinte.xtext.sgml.lexer.SgmlLexer;
import nl.dslmeinte.xtext.sgml.lexer.SgmlLexerForParsing;
import nl.dslmeinte.xtext.sgml.lexer.TokenFacade;
import nl.dslmeinte.xtext.sgml.test.simplemarkup.SimpleMarkupStandaloneSetup;
import nl.dslmeinte.xtext.util.antlr.HtmlTokenVisualizer;
import nl.dslmeinte.xtext.util.antlr.HtmlTokenVisualizer.TokenToStyleMapper;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.Token;
import org.eclipse.xtext.parser.antlr.Lexer;
import org.junit.Assert;
import org.junit.Test;

import com.google.inject.Injector;

public class SgmlLexerTest {

	private final Injector injector = new SimpleMarkupStandaloneSetup().createInjector();
	private final SgmlLexer sgmlLexer = injector.getInstance(SgmlLexer.class);

	@Test
	public void test_SgmlLexer_provision() {
		Assert.assertNotNull(sgmlLexer);
		Assert.assertNotNull(sgmlLexer.getFacade());
	}

	@Test
	public void test_SgmlLexerForParsing_provision() {
		SgmlLexerForParsing baseLexer = injector.getInstance(SgmlLexerForParsing.class);
		Assert.assertNotNull(baseLexer);
		try {
			Field field = SgmlLexerForParsing.class.getDeclaredField("sgmlLexer");
			field.setAccessible(true);
			Assert.assertNotNull(field.get(baseLexer));
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("could not access (value of) field " + SgmlLexerForParsing.class.getSimpleName() + "#simpleLexer" );
		}
	}

	private Lexer lexer;

	private void initLexer(CharStream input) {
		SgmlLexerForParsing baseLexer = injector.getInstance(SgmlLexerForParsing.class);
		baseLexer.setCharStream(input);
		this.lexer = baseLexer;
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
		initLexer(input);
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
		final TokenFacade facade = sgmlLexer.getFacade();
		initLexer(null);
		HtmlTokenVisualizer visualizer = new HtmlTokenVisualizer(lexer, new TokenToStyleMapper() {
			@Override
			public String cssClassName(Token token) {
				int type = token.getType();
				if( facade.isBase(type) ) {
					return facade.asBase(type).name();
				}
				return "tagKeyword";
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
