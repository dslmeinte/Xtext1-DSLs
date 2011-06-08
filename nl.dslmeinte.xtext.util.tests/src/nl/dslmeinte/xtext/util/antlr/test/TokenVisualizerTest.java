package nl.dslmeinte.xtext.util.antlr.test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import junit.framework.Assert;
import nl.dslmeinte.xtext.util.antlr.TokenVisualizer;
import nl.dslmeinte.xtext.util.antlr.TokenVisualizer.TokenToStyleMapper;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.Token;
import org.eclipse.xtext.parser.antlr.internal.InternalXtextLexer;
import org.junit.Test;

public class TokenVisualizerTest {

	@Test
	public void test_regexp_for_newline_with_whitespace_replacement() {
		Assert.assertEquals("line1\n&nbsp;   line2", "line1\n   line2".replaceAll("\\n(\\s+)", "\n&nbsp;$1") );
	}

	@Test
	public void test_lexe_Xtext_grammar_def() throws IOException {
		TokenVisualizer visualizer = new TokenVisualizer(new InternalXtextLexer(), new TokenToStyleMapper() {
			@Override
			public String styleName(Token token) {
				return "tokenType" + token.getType();
			}
		});
		CharStream input = new ANTLRFileStream("src/nl/dslmeinte/xtext/util/antlr/test/Xtext.xtext");
		OutputStream output = new FileOutputStream("gen/Xtext_xtext-lexed.html");
		visualizer.htmlHeader("Xtext.xtext: token visualization", "lexing-style.css", output);
		visualizer.visualize(input, output);
		visualizer.htmlFooter(output);
		output.close();
	}

}
