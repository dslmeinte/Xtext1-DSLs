package nl.dslmeinte.xtext.sgml.dtd.test.support;

import com.google.inject.Inject;

import nl.dslmeinte.xtext.sgml.lexer.SgmlLexer;
import nl.dslmeinte.xtext.sgml.lexer.TokenFacade;

/**
 * Variant of {@link SgmlLexer} which allows explicit switching of lexical,
 * <em>purely for testing purposes</em>.
 * 
 * @author Meinte Boersma
 */
public class SwitchableSgmlLexer extends SgmlLexer {

	public void setLexicalState(LexicalState lexicalState) {
		super.lexicalState = lexicalState;
	}

	@Inject
	public SwitchableSgmlLexer(TokenFacade tokenFacade) {
		super(tokenFacade);
	}

}
