package nl.dslmeinte.xtext.sgml.test.simplemarkup.ui.syntaxcoloring;

import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.antlr.AbstractAntlrTokenToAttributeIdMapper;

import com.google.inject.Singleton;

/**
 * Maps token names to constants in {@link DefaultHighlightingConfiguration} to
 * do lexical highlighting of the input.
 * <p>
 * It uses the naming convention underlying {@code Base.xtext} and
 * {@code DTD2Xtext.xpt}.
 * 
 * @author Meinte Boersma
 */
@Singleton
public class CustomTokenToAttributeIDMapper extends AbstractAntlrTokenToAttributeIdMapper {

	@Override
	protected String calculateId(String tokenName, int tokenType) {
		if( tokenName.endsWith("_KEYWORD") ) {
			return DefaultHighlightingConfiguration.KEYWORD_ID;
		}
		if( tokenName.endsWith("_SYMBOL") ) {
			return DefaultHighlightingConfiguration.PUNCTUATION_ID;		// is actually the same as DEFAULT_ID...
		}
		if( tokenName.endsWith("_COMMENTS") ) {
			return DefaultHighlightingConfiguration.COMMENT_ID;
		}
		if( tokenName.equals("RULE_QUOTED_STRING") ) {
			return DefaultHighlightingConfiguration.STRING_ID;
		}
		return DefaultHighlightingConfiguration.DEFAULT_ID;
	}

}
