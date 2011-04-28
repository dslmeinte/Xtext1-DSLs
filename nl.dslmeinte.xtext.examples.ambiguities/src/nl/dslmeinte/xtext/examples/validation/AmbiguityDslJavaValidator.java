package nl.dslmeinte.xtext.examples.validation;

import nl.dslmeinte.xtext.examples.AmbiguityTypeUtil;
import nl.dslmeinte.xtext.examples.ambiguityDsl.AmbiguityDslPackage;
import nl.dslmeinte.xtext.examples.ambiguityDsl.Assignment;
import nl.dslmeinte.xtext.examples.ambiguityDsl.Class;
import nl.dslmeinte.xtext.examples.ambiguityDsl.Feature;
import nl.dslmeinte.xtext.examples.ambiguityDsl.FeatureSpecTail;
import nl.dslmeinte.xtext.examples.ambiguityDsl.Field;
import nl.dslmeinte.xtext.examples.ambiguityDsl.TailedElement;
import nl.dslmeinte.xtext.examples.ambiguityDsl.SpecHead;
import nl.dslmeinte.xtext.examples.ambiguityDsl.Variable;
import nl.dslmeinte.xtext.examples.ambiguityDsl.VariableDeclaration;

import org.eclipse.xtext.validation.Check;
 

public class AmbiguityDslJavaValidator extends AbstractAmbiguityDslJavaValidator {

	@Check
	public void check_variable_declaration(VariableDeclaration variableDeclaration) {
		SpecHead typeSpec = variableDeclaration.getTypeSpec();
		if( typeSpec.getTarget() instanceof Variable ) {
			error( "element must be a class, not a variable", typeSpec, AmbiguityDslPackage.SPEC_HEAD__TARGET );
		}
	}

	@Check
	public void check_assignment(Assignment assignment) {
		SpecHead lhs = assignment.getLhs();
		if( lhs.getTarget() instanceof Class ) {
			error( "element must be a variable, not a class", lhs, AmbiguityDslPackage.SPEC_HEAD__TARGET );
		}
		TailedElement lastElement = AmbiguityTypeUtil.lastElement(lhs);
		if( lastElement instanceof FeatureSpecTail ) {
			Feature feature = ((FeatureSpecTail) lastElement).getFeature();
			if( !( feature instanceof Field) ) {
				error( "element must be a field", lastElement, AmbiguityDslPackage.FEATURE_SPEC_TAIL__FEATURE );
			}
		}	// other case: lastElement instanceof SpecHead && target must not be a class <== handled by 1st if-statement
	}

}
