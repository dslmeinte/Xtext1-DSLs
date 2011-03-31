package nl.dslmeinte.xtext.examples.validation;

import nl.dslmeinte.xtext.examples.XsdModelUtil;
import nl.dslmeinte.xtext.examples.xsdLanguage.MaxLengthFacet;
import nl.dslmeinte.xtext.examples.xsdLanguage.XsdLanguagePackage;

import org.eclipse.xtext.validation.Check;
 

public class XsdLanguageJavaValidator extends AbstractXsdLanguageJavaValidator {

	@Check
	public void check_maxLength_restriction(MaxLengthFacet facet) {
		if( ! XsdModelUtil.isBaseTypeString(facet) ) {
			error(
					"maxLength facet can only be applied to string-based types",
					XsdLanguagePackage.MAX_LENGTH_FACET
				);
		}
	}

	// TODO  warn-validation on enumeration values having more string length greater than maxLength (if present)

}
