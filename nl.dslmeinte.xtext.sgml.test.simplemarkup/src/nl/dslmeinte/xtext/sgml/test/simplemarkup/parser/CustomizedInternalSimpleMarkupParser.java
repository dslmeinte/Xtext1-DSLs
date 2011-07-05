package nl.dslmeinte.xtext.sgml.test.simplemarkup.parser;

import nl.dslmeinte.xtext.sgml.test.simplemarkup.parser.antlr.internal.InternalSimpleMarkupParser;
import nl.dslmeinte.xtext.sgml.test.simplemarkup.services.SimpleMarkupGrammarAccess;
import nl.dslmeinte.xtext.sgml.test.simplemarkup.services.SimpleMarkupGrammarAccess.Reference_attributesElements;

import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
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
			match(input, RULE_QUOTED_STRING, null);

//			match(input, 22, FOLLOW_22_in_ruleReference_attributes1135);
//			createLeafNode(metadata.getQuotationMarkKeyword_2(), null);
			current = factory.create(getGrammarAccess().getReference_attributesRule().getType().getClassifier());
			// remove surrounding quotes from token text:
			Token token = input.LT(-1);
			String quotedString = token.getText();
			token.setText(quotedString.substring(1, quotedString.length()-1));
			// TODO  really un-escape the quoted string
			

			associateNodeWithAstElement(currentNode, current);
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

//	protected Object createLeafNode(EObject grammarElement, String feature) {
////		Token token = new CommonT
//		Token token = input.LT(-1);
//		if (token != null && token.getTokenIndex() > lastConsumedIndex) {
//			int indexOfTokenBefore = lastConsumedIndex;
//			if (indexOfTokenBefore + 1 < token.getTokenIndex()) {
//				for (int x = indexOfTokenBefore + 1; x < token.getTokenIndex(); x++) {
//					Token hidden = input.get(x);
//					LeafNode leafNode = createLeafNode(hidden, hidden.getChannel() == HIDDEN);
//					setLexerRule(leafNode, hidden);
//				}
//			}
//			LeafNode leafNode = createLeafNode(token, false);
//			leafNode.setGrammarElement(grammarElement);
//			leafNode.setFeature(feature);
//			lastConsumedIndex = token.getTokenIndex();
//			lastConsumedNode = leafNode;
//			tokenConsumed(token, leafNode);
//			return leafNode;
//		}
//		return null;
//	}

}
