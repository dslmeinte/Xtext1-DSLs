package nl.dslmeinte.xtext.util.antlr;

import java.io.OutputStream;
import java.io.PrintWriter;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.Lexer;
import org.antlr.runtime.Token;

/**
 * Simple class to visualization the tokenization of a file by a {@link Lexer}.
 * 
 * @author Meinte Boersma
 */
public class TokenVisualizer {

	public interface TokenToStyleMapper {

		/**
		 * Returns the CSS class name for the {@link Token} passed.
		 * (Typically involves only {@link Token#getType()}).
		 */
		String styleName(Token token);

	}

	private final Lexer lexer;
	private final TokenToStyleMapper mapper;

	public TokenVisualizer(Lexer lexer, TokenToStyleMapper mapper) {
		this.lexer = lexer;
		this.mapper = mapper;
	}

	public void visualize(CharStream input, OutputStream outputStream) {
		PrintWriter output = new PrintWriter(outputStream);

		output.println("<div class=\"tokenVisualization\">");

		lexer.setCharStream(input);
		Token token = lexer.nextToken();
		while( token.getType() != CharStream.EOF ) {
			output.printf("<span class='%s'>%s</span>", mapper.styleName(token), escapeHtml(token.getText()));
			token = lexer.nextToken();
		}

		output.println("</div>");

		output.flush();
	}

	private String escapeHtml(String text) {
		text = text.replaceAll("&", "&amp;");
		text = text.replaceAll("<", "&lt;");
		text = text.replaceAll(">", "&gt;");
		text = text.replaceAll("\\n", "&para;<br/>\n");
		int previousSize = text.length();
		text = text.replaceAll("\\n(\\s+)", "\n&nbsp;$1");
		while( text.length() != previousSize ) {
			previousSize = text.length();
		}
		return text;
	}

	public void htmlHeader(String title, String cssFileName, OutputStream outputStream) {
		PrintWriter output = new PrintWriter(outputStream);

		output.println("<html>");
		output.println("\t<head>");
		output.print("\t\t<link href=\"");
		output.print(cssFileName);
		output.println("\" rel=\"stylesheet\" type=\"text/css\" />");
		output.println("\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">");
		output.print("\t\t<title>");
		output.print(title);
		output.println("</title>");
		output.println("\t</head>");
		output.println("<body>");
		output.println();
		output.println("<p>");

		output.flush();
	}

	public void htmlFooter(OutputStream outputStream) {
		PrintWriter output = new PrintWriter(outputStream);

		output.println();
		output.println("</body>");
		output.println("</html>");

		output.flush();
	}

}
