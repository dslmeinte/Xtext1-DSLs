package nl.dslmeinte.xtext.sgml.test.simplemarkup.parser;

import nl.dslmeinte.xtext.parser.util.ParsingOverrideUtil;
import nl.dslmeinte.xtext.sgml.test.simplemarkup.parser.antlr.internal.InternalSimpleMarkupParser;
import nl.dslmeinte.xtext.sgml.test.simplemarkup.services.SimpleMarkupGrammarAccess;

import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.IAstFactory;
import org.eclipse.xtext.parsetree.LeafNode;

public class CustomizedInternalSimpleMarkupParser extends InternalSimpleMarkupParser {

	public CustomizedInternalSimpleMarkupParser(TokenStream input) {
		super(input);
	}

    public CustomizedInternalSimpleMarkupParser(TokenStream input, IAstFactory factory, SimpleMarkupGrammarAccess grammarAccess) {
    	super(input, factory, grammarAccess);
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
