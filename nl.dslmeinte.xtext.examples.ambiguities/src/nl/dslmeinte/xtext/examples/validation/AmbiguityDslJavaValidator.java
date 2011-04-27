package nl.dslmeinte.xtext.examples.validation;

import nl.dslmeinte.xtext.examples.TypeUtil;
import nl.dslmeinte.xtext.examples.ambiguityDsl.AmbiguityDslPackage;
import nl.dslmeinte.xtext.examples.ambiguityDsl.Assignment;
import nl.dslmeinte.xtext.examples.ambiguityDsl.Class;
import nl.dslmeinte.xtext.examples.ambiguityDsl.FeatureRefTail;
import nl.dslmeinte.xtext.examples.ambiguityDsl.Field;
import nl.dslmeinte.xtext.examples.ambiguityDsl.RefHead;
import nl.dslmeinte.xtext.examples.ambiguityDsl.TailedElement;
import nl.dslmeinte.xtext.examples.ambiguityDsl.Variable;
import nl.dslmeinte.xtext.examples.ambiguityDsl.VariableDeclaration;

import org.eclipse.xtext.validation.Check;
 

public class AmbiguityDslJavaValidator extends AbstractAmbiguityDslJavaValidator {

	@Check
	public void check_variable_declaration(VariableDeclaration variableDeclaration) {
		RefHead typeRef = variableDeclaration.getTypeRef();
		if( typeRef.getTarget() instanceof Variable ) {
			error( "element must be a class, not a variable", typeRef, AmbiguityDslPackage.REF_HEAD__TARGET );
		}
	}

	@Check
	public void check_assignment(Assignment assignment) {
		RefHead lhs = assignment.getLhs();
		if( lhs.getTarget() instanceof Class ) {
			error( "element must be a variable, not a class", lhs, AmbiguityDslPackage.REF_HEAD__TARGET );
		}
		TailedElement lastElement = TypeUtil.lastElement(lhs);
		if( lastElement instanceof FeatureRefTail && !(((FeatureRefTail) lastElement).getFeature() instanceof Field) ) {
			error( "element must be a field", lastElement, AmbiguityDslPackage.FEATURE_REF_TAIL__FEATURE );
		}	// other case: lastElement instanceof RefHead && target must not be a class <== handled by 1st if-statement
	}

}
