package nl.dslmeinte.xtext.sgml.test.simplemarkup.parser;

import nl.dslmeinte.xtext.sgml.test.simplemarkup.parser.antlr.internal.InternalSimpleMarkupParser;
import nl.dslmeinte.xtext.sgml.test.simplemarkup.services.SimpleMarkupGrammarAccess;
import nl.dslmeinte.xtext.sgml.test.simplemarkup.services.SimpleMarkupGrammarAccess.Reference_attributesElements;

import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.IAstFactory;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;

public class CustomizedInternalSimpleMarkupParser extends InternalSimpleMarkupParser {

	public CustomizedInternalSimpleMarkupParser(TokenStream input) {
		super(input);
	}

    public CustomizedInternalSimpleMarkupParser(TokenStream input, IAstFactory factory, SimpleMarkupGrammarAccess grammarAccess) {
    	super(input, factory, grammarAccess);
    }

    @Override
    public EObject ruleReference_attributes() throws RecognitionException {
        EObject current = null;
        setCurrentLookahead();
        resetLookahead(); 
        HiddenTokens myHiddenTokenState = ((XtextTokenStream) input).setHiddenTokens("RULE_WHITESPACE");
		final Reference_attributesElements metadata = getGrammarAccess().getReference_attributesAccess();
		try {
			// 'to' '=':
			match(input, 20, FOLLOW_20_in_ruleReference_attributes1115);
			createLeafNode(metadata.getToKeyword_0(), null);
			match(input, 21, FOLLOW_21_in_ruleReference_attributes1125);
			createLeafNode(metadata.getEqualsSignKeyword_1(), null);
			// QUOTED_STRING, which will be re-interpreted as '"' to=[Section|IDENTIFIER] '"':
			match(input, RULE_QUOTED_STRING, null);		// TODO  add meaningful BitSet...

//			match(input, 22, FOLLOW_22_in_ruleReference_attributes1135);
//			createLeafNode(metadata.getQuotationMarkKeyword_2(), null);
			current = factory.create(getGrammarAccess().getReference_attributesRule().getType().getClassifier());
			// TODO  install proxy?!
//			Token token = input.LT(-1);
//			String text = token.getText();

//			associateNodeWithAstElement(currentNode, current);
//			match(input, RULE_IDENTIFIER, FOLLOW_RULE_IDENTIFIER_in_ruleReference_attributes1153);
			createLeafNode(metadata.getToSectionCrossReference_3_0(), "to");
//			match(input, 22, FOLLOW_22_in_ruleReference_attributes1163);
//			createLeafNode(metadata.getQuotationMarkKeyword_4(), null);

			resetLookahead();
			lastConsumedNode = currentNode;
		}
		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
			myHiddenTokenState.restore();
		}
		return current;
	}

}
