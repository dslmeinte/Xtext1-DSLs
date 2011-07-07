package nl.dslmeinte.xtext.sgml.test.simplemarkup.parser;

import nl.dslmeinte.xtext.parser.util.ParsingOverrideUtil;
import nl.dslmeinte.xtext.sgml.test.simplemarkup.parser.antlr.internal.InternalSimpleMarkupParser;
import nl.dslmeinte.xtext.sgml.test.simplemarkup.services.SimpleMarkupGrammarAccess;
import nl.dslmeinte.xtext.sgml.test.simplemarkup.services.SimpleMarkupGrammarAccess.Section_attributesElements;

import org.antlr.runtime.EarlyExitException;
import org.antlr.runtime.FailedPredicateException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.parser.IAstFactory;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
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

    // $ANTLR start ruleSection_attributes
    public EObject ruleSection_attributes() throws RecognitionException {
        EObject current = null;
        AntlrDatatypeRuleToken lv_styleName_3_0 = null;
        EObject lv_condition_7_0 = null;
        AntlrDatatypeRuleToken lv_name_11_0 = null;
        setCurrentLookahead();
        resetLookahead(); 
        HiddenTokens myHiddenTokenState = ((XtextTokenStream) input).setHiddenTokens("RULE_WHITESPACE");
    	final Section_attributesElements metadata = getGrammarAccess().getSection_attributesAccess();

        try {
    		getUnorderedGroupHelper().enter(metadata.getUnorderedGroup());
			int cnt9 = 0;
			loop9: do {
				int alt9 = 4;
				int LA9_0 = input.LA(1);
				if( LA9_0 == 24 && getUnorderedGroupHelper().canSelect(metadata.getUnorderedGroup(), 0) ) {	// Section / name
					alt9 = 1;
				} else if( LA9_0 == 25 && getUnorderedGroupHelper().canSelect(metadata.getUnorderedGroup(), 1) ) {	// stylename
					alt9 = 2;
				} else if( LA9_0 == 26 && getUnorderedGroupHelper().canSelect(metadata.getUnorderedGroup(), 2) ) {	// condition
					alt9 = 3;
				}

				switch (alt9) {
					case 1 :
            	    {
	            	    if( ! getUnorderedGroupHelper().canSelect(metadata.getUnorderedGroup(), 0) ) {
	            	        throw new FailedPredicateException(input, "ruleSection_attributes", "getUnorderedGroupHelper().canSelect(grammarAccess.getSection_attributesAccess().getUnorderedGroup(), 0)");
	            	    }
            	    	getUnorderedGroupHelper().select(metadata.getUnorderedGroup(), 0);
        	    		match(input,24,FOLLOW_24_in_ruleSection_attributes1717); 
        	    		createLeafNode(metadata.getStyleNameKeyword_0_0(), null); 
        	    		match(input,21,FOLLOW_21_in_ruleSection_attributes1727); 
        	    		createLeafNode(metadata.getEqualsSignKeyword_0_1(), null); 
	    				currentNode = createCompositeNode(metadata.getStyleNameQuotedStringParserRuleCall_0_2_0(), currentNode);
	    				pushFollow(FOLLOW_ruleQuotedString_in_ruleSection_attributes1748);
	    				lv_styleName_3_0 = ruleQuotedString();
	    				_fsp--;
	    				if( current == null ) {
	    					current = factory.create(getGrammarAccess().getSection_attributesRule().getType().getClassifier());
	    					associateNodeWithAstElement(currentNode.getParent(), current);
	    				}
    	    	        try {
    	    	       		set(
        	    	       			current, 
        	    	       			"styleName",
        	    	        		lv_styleName_3_0, 
        	    	        		"QuotedString", 
        	    	        		currentNode
    	    	        		);
    	    	        } catch( ValueConverterException vce ) {
    	    				handleValueConverterException(vce);
    	    	        }
    	    	        currentNode = currentNode.getParent();
            	    	getUnorderedGroupHelper().returnFromSelection(metadata.getUnorderedGroup());
	            	    break;
            	    }
	            	case 2 :
	            	{
            	    	if( ! getUnorderedGroupHelper().canSelect(metadata.getUnorderedGroup(), 1) ) {
            	    		throw new FailedPredicateException(input, "ruleSection_attributes", "getUnorderedGroupHelper().canSelect(grammarAccess.getSection_attributesAccess().getUnorderedGroup(), 1)");
            	    	}
        	    		getUnorderedGroupHelper().select(metadata.getUnorderedGroup(), 1);
    	    			match(input,25,FOLLOW_25_in_ruleSection_attributes1810); 
    	    			createLeafNode(metadata.getConditionKeyword_1_0(), null); 
    	    			match(input,21,FOLLOW_21_in_ruleSection_attributes1820); 
    	    			createLeafNode(metadata.getEqualsSignKeyword_1_1(), null); 
    	    			match(input,22,FOLLOW_22_in_ruleSection_attributes1830); 
    	    			createLeafNode(metadata.getQuotationMarkKeyword_1_2(), null); 
    					currentNode = createCompositeNode(metadata.getConditionConditionalExpressionParserRuleCall_1_3_0(), currentNode);
    					pushFollow(FOLLOW_ruleConditionalExpression_in_ruleSection_attributes1851);
    					lv_condition_7_0 = ruleConditionalExpression();
    					_fsp--;
    					if( current == null ) {
    						current = factory.create(getGrammarAccess().getSection_attributesRule().getType().getClassifier());
    						associateNodeWithAstElement(currentNode.getParent(), current);
    					}
    	    	        try {
    	    	       		set(
        	    	       			current,
        	    	       			"condition",
        	    	        		lv_condition_7_0,
        	    	        		"ConditionalExpression",
        	    	        		currentNode
        	    	        	);
    	    	        } catch( ValueConverterException vce ) {
    	    				handleValueConverterException(vce);
    	    	        }
    	    	        currentNode = currentNode.getParent();
    	    			match(input,22,FOLLOW_22_in_ruleSection_attributes1861); 
    	    			createLeafNode(metadata.getQuotationMarkKeyword_1_4(), null);
        	    		getUnorderedGroupHelper().returnFromSelection(metadata.getUnorderedGroup());
		            	break;
	            	}
	            	case 3 :
	            	{
            			if( ! getUnorderedGroupHelper().canSelect(metadata.getUnorderedGroup(), 2) ) {
            				throw new FailedPredicateException(input, "ruleSection_attributes", "getUnorderedGroupHelper().canSelect(grammarAccess.getSection_attributesAccess().getUnorderedGroup(), 2)");
            			}
        				getUnorderedGroupHelper().select(metadata.getUnorderedGroup(), 2);
    					match(input,26,FOLLOW_26_in_ruleSection_attributes1923); 
    					createLeafNode(metadata.getNameKeyword_2_0(), null); 
    					match(input,21,FOLLOW_21_in_ruleSection_attributes1933); 
    					createLeafNode(metadata.getEqualsSignKeyword_2_1(), null); 
						currentNode = createCompositeNode(metadata.getNameQuotedStringParserRuleCall_2_2_0(), currentNode);
						pushFollow(FOLLOW_ruleQuotedString_in_ruleSection_attributes1954);
						lv_name_11_0 = ruleQuotedString();
						_fsp--;
						if( current == null ) {
							current = factory.create(getGrammarAccess().getSection_attributesRule().getType().getClassifier());
							associateNodeWithAstElement(currentNode.getParent(), current);
						}
    	    	        try {
    	    	       		set(
        	    	       			current, 
        	    	       			"name",
        	    	        		lv_name_11_0, 
        	    	        		"QuotedString", 
        	    	        		currentNode
        	    	        	);
    	    	        } catch (ValueConverterException vce) {
    	    				handleValueConverterException(vce);
    	    	        }
    	    	        currentNode = currentNode.getParent();
        				getUnorderedGroupHelper().returnFromSelection(metadata.getUnorderedGroup());
		            	break;
	            	}
	            	default :
	            	{
	            		if( cnt9 >= 1 ) {
	            			break loop9;
	            		}
	            		throw new EarlyExitException(9, input);
	            	}
				}
				cnt9++;
			} while (true);
			if( ! getUnorderedGroupHelper().canLeave(metadata.getUnorderedGroup()) ) {
				throw new FailedPredicateException(input, "ruleSection_attributes", "getUnorderedGroupHelper().canLeave(grammarAccess.getSection_attributesAccess().getUnorderedGroup())");
			}
			getUnorderedGroupHelper().leave(metadata.getUnorderedGroup());

            resetLookahead(); 
            lastConsumedNode = currentNode;

        } catch( RecognitionException re ) {
            recover(input,re); 
            appendSkippedTokens();
        } finally {
        	myHiddenTokenState.restore();
        }
        return current;
    }
    // $ANTLR end ruleSection_attributes

    /*
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
	*/

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
