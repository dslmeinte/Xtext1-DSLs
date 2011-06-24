package nl.dslmeinte.xtext.sgml.lexer.test;

import static nl.dslmeinte.xtext.sgml.lexer.BaseTerminals.*;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;

import nl.dslmeinte.xtext.sgml.dtd.test.support.SgmlLexerTestSupport;
import nl.dslmeinte.xtext.sgml.lexer.SgmlLexerForParsing;
import nl.dslmeinte.xtext.sgml.lexer.TokenFacade;
import nl.dslmeinte.xtext.util.antlr.HtmlTokenVisualizer;
import nl.dslmeinte.xtext.util.antlr.HtmlTokenVisualizer.TokenToStyleMapper;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.Token;
import org.junit.Assert;
import org.junit.Test;

public class SgmlLexerTest extends SgmlLexerTestSupport {

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

	@Test
	public void test_lexing_of_header() throws IOException {
		lexe(new ANTLRStringStream("<!DOCTYPE SISGML PUBLIC 'simpleMarkup.dtd' [<!ENTITY myEntity SYSTEM '/foo/bar' --bla-die-blah-->]>"));
	}

	@Test
	public void test_lexing_of_simple_markup_file() throws IOException {
		lexe(new ANTLRFileStream("models/simpleMarkup.sm"));
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

	@Test
	public void test_docType_without_entities_but_explicitly_checking_whitespace() {
		initLexer(new ANTLRStringStream("<!DOCTYPE SISGML PUBLIC \"-//Intuit//SISGML DTD//EN\" \"sisgml.dtd\">"));
		assertNextToken(open_tag);
		assertNextToken(doctype);
		assertNextToken(whitespace);
		assertNextToken(identifier, "SISGML");
		assertNextToken(whitespace);
		assertNextToken(public_);
		assertNextToken(whitespace);
		assertNextToken(quoted_string);
		assertNextToken(whitespace);
		assertNextToken(quoted_string);
		assertNextToken(close_tag);
	}

	@Test
	public void test_docType_with_entities() throws FileNotFoundException, IOException {
		initLexer(new ANTLRFileStream("nl/dslmeinte/xtext/sgml/lexer/test/docType_with_entities.test"));
		expectDocumentHeader();
		assertNextNonWhitespaceToken(open_bracket);
		for( int i = 0; i < 16; i++ ) {
			expectEntity(i);
		}
		assertNextNonWhitespaceToken(close_bracket);
		assertNextNonWhitespaceToken(close_tag);
	}

	private void expectDocumentHeader() {
		assertNextNonWhitespaceToken(open_tag);
		assertNextNonWhitespaceToken(doctype);
		assertNextNonWhitespaceToken(identifier, "DOC");
		assertNextNonWhitespaceToken(public_);
		assertNextNonWhitespaceToken(quoted_string);
		assertNextNonWhitespaceToken(quoted_string);
	}

	private void expectEntity(int i) {
		assertNextNonWhitespaceToken(open_tag);
		assertNextNonWhitespaceToken(entity);
		assertNextNonWhitespaceToken(identifier);
		assertNextNonWhitespaceToken(identifier);
		assertNextNonWhitespaceToken(quoted_string);
		assertNextNonWhitespaceToken(header_comments);
		assertNextNonWhitespaceToken(close_tag);
	}

}
