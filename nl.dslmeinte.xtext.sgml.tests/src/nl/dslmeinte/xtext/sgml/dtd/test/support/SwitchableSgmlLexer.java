package nl.dslmeinte.xtext.sgml.dtd.test.support;

import nl.dslmeinte.xtext.sgml.lexer.SgmlLexer;

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

}
