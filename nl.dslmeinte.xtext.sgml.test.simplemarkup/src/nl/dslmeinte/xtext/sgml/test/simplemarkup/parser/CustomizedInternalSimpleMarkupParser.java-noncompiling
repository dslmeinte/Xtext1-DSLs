package nl.dslmeinte.xtext.sgml.test.simplemarkup.parser;

import nl.dslmeinte.xtext.parser.util.ParsingOverrideUtil;
import nl.dslmeinte.xtext.sgml.test.simplemarkup.parser.antlr.internal.InternalSimpleMarkupParser;
import nl.dslmeinte.xtext.sgml.test.simplemarkup.services.SimpleMarkupGrammarAccess;
import nl.dslmeinte.xtext.sgml.test.simplemarkup.services.SimpleMarkupGrammarAccess.Reference_attributesElements;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.MismatchedTokenException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.IAstFactory;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parsetree.LeafNode;

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
			if( input.LA(1) != RULE_QUOTED_STRING ) {
				throw new MismatchedTokenException(RULE_QUOTED_STRING, input);
			}
			input.consume();

			current = factory.create(getGrammarAccess().getReference_attributesRule().getType().getClassifier());
			// remove surrounding quotes from token text:
			CommonToken token = (CommonToken) input.LT(-1);
			String quotedString = token.getText();
			quotedString = quotedString.substring(1, quotedString.length()-1);
			// TODO  really un-escape the quoted string
			Token leftQuoteToken = ParsingOverrideUtil.createReplacementToken(token, 22, "\"", 0);
			createLeafNode(metadata.getQuotationMarkKeyword_2(), null, leftQuoteToken, true);
			Token identifierToken = ParsingOverrideUtil.createReplacementToken(token, RULE_IDENTIFIER, quotedString, 1);
			associateNodeWithAstElement(currentNode, current);
			createLeafNode(metadata.getToSectionCrossReference_3_0(), "to", identifierToken, false);
			Token rightQuoteToken = ParsingOverrideUtil.createReplacementToken(token, 22, "\"", quotedString.length() + 2);
			createLeafNode(metadata.getQuotationMarkKeyword_4(), null, rightQuoteToken, true);

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

    /*
     * {@see AbstractInternalAntlrParser#createLeafNode}: modified copy
     */
	protected Object createLeafNode(EObject grammarElement, String feature, Token token, boolean hiddenReplacement) {
		if (token != null ) {
			/*
			 * Note that we don't perform any checks (and promotes) on hidden
			 * tokens that may be between the last consumed token and the
			 * given token.
			 */
			LeafNode leafNode = ParsingOverrideUtil.createLeafNode(this, token, hiddenReplacement);
			leafNode.setGrammarElement(grammarElement);
			leafNode.setFeature(feature);
			lastConsumedIndex = token.getTokenIndex();
			lastConsumedNode = leafNode;
			ParsingOverrideUtil.tokenConsumed(this, token, leafNode);
			return leafNode;
		}
		return null;
	}

}
