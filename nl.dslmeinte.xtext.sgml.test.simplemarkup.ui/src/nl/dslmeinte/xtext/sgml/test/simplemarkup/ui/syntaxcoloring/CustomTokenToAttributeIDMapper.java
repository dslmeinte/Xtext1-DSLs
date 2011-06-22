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
		if( tokenName.startsWith("'") && tokenName.endsWith("'") && tokenName.length() > 3 ) {
			return DefaultHighlightingConfiguration.KEYWORD_ID;
		}
		if( tokenName.equals("RULE_SGML_COMMENTS") || tokenName.equals("RULE_HEADER_COMMENTS") ) {
			return DefaultHighlightingConfiguration.COMMENT_ID;
		}
		if( tokenName.equals("RULE_QUOTED_STRING") ) {
			return DefaultHighlightingConfiguration.STRING_ID;
		}
		return DefaultHighlightingConfiguration.DEFAULT_ID;
	}

}
