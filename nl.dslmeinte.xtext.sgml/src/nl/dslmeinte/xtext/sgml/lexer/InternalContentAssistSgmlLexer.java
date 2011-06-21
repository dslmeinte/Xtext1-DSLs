package nl.dslmeinte.xtext.sgml.lexer;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.RecognitionException;

import com.google.inject.Inject;

public class InternalContentAssistSgmlLexer
	extends org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer
	implements WeavableAntlrLexer
{

	public InternalContentAssistSgmlLexer() {
		super();
	}

	public InternalContentAssistSgmlLexer(CharStream input) {
		super(input);
	}

	@Inject
	private SgmlLexer sgmlLexer;

	@Override
	public void setSgmlLexer(SgmlLexer sgmlLexer) {
		this.sgmlLexer = sgmlLexer;
	}

	@Override
	public void setCharStream(CharStream input) {
		super.setCharStream(input);
		sgmlLexer.init();
	}

	@Override
	public CharStream input() {
		return super.input;
	}

	@Override
	public void setType(int type) {
		super.type = type;
	}

	@Override
	public void mTokens() throws RecognitionException {
		sgmlLexer.mTokens();
	}

}
