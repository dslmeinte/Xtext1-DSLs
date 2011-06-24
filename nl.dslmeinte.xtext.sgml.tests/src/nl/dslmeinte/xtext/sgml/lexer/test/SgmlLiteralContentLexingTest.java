package nl.dslmeinte.xtext.sgml.lexer.test;

import nl.dslmeinte.xtext.sgml.dtd.test.support.SgmlLexerTestSupport;
import nl.dslmeinte.xtext.sgml.lexer.BaseTerminals;

import org.antlr.runtime.ANTLRStringStream;
import org.junit.Test;

import static nl.dslmeinte.xtext.sgml.lexer.BaseTerminals.*;

public class SgmlLiteralContentLexingTest extends SgmlLexerTestSupport {

	@Test
	public void test_contiguous_content () {
		initWithHeader("foo & bar");
		assertNextToken(literal_contents);
		assertEOF();
	}

	@Test
	public void test_whitespace_handling() {
		initWithHeader("	<");
		assertNextToken(whitespace, "\t");
		assertNextToken(open_tag);
	}

	@Test
	public void test_amp_entity_reference() {
		initWithHeader("foo &amp; bar<");
		assertNextToken(literal_contents, "foo ");
		assertNextToken(ampersand);
		assertNextToken(identifier, "amp");
		assertNextToken(semicolon);
		assertNextToken(literal_contents, " bar");
		assertNextToken(open_tag);
		assertEOF();
	}

	@Test
	public void test_incomplete_entity_reference() {
		initWithHeader("&foo");
		assertNextToken(ampersand);
		assertNextToken(identifier, "foo");
		assertEOF();
	}

	private void initWithHeader(String input) {
		initLexer(new ANTLRStringStream(mkHeader() + input));
		assertHeader();
	}

	private String mkHeader() {
		return "<!DOCTYPE SISGML PUBLIC \"snafu.dtd\">";
	}

	private void assertHeader() {
		assertNextNonWhitespaceToken(BaseTerminals.open_tag);
		assertNextNonWhitespaceToken(BaseTerminals.doctype);
		assertNextNonWhitespaceToken(BaseTerminals.identifier, "SISGML");
		assertNextNonWhitespaceToken(BaseTerminals.public_);
		assertNextNonWhitespaceToken(BaseTerminals.quoted_string);
		assertNextNonWhitespaceToken(BaseTerminals.close_tag);
	}

}
