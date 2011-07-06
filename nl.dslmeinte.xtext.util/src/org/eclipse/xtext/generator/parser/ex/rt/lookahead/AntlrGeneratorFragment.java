package org.eclipse.xtext.generator.parser.ex.rt.lookahead;

import org.eclipse.emf.mwe.core.issues.Issues;

/**
 * Sub implementation of
 * {@link org.eclipse.xtext.generator.parser.antlr.ex.rt.AntlrGeneratorFragment}
 * which allows to set the maximum look-ahead.
 * <p>
 * <em>Note:</em> untested, possibly not working!
 * 
 * @author Meinte Boersma
 */
public class AntlrGeneratorFragment extends org.eclipse.xtext.generator.parser.antlr.ex.rt.AntlrGeneratorFragment {

	private String kAsString;

	public void setK(String kAsString) {
		this.kAsString = kAsString;
	}

	@Override
	public void checkConfiguration(Issues issues) {
		super.checkConfiguration(issues);
		try {
			int k = Integer.parseInt(kAsString);
			if( ( k == 0 ) || ( k < -1 ) ) {
				issues.addWarning("Value " + k + " for look-ahead parameter 'k' is invalid. Setting to -1 (~ infinite look-ahead).");
				k = -1;
			}
			getOptions().setK(k);
		} catch (NumberFormatException e) {
			issues.addError("Value '" + kAsString + "' for look-ahead parameter 'k' is not an integer.");
		}
	}

}
