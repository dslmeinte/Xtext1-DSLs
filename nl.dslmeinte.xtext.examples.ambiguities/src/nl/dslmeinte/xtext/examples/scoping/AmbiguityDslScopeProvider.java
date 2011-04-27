package nl.dslmeinte.xtext.examples.scoping;

import java.util.Collections;
import java.util.List;

import nl.dslmeinte.xtext.examples.TypeUtil;
import nl.dslmeinte.xtext.examples.ambiguityDsl.Class;
import nl.dslmeinte.xtext.examples.ambiguityDsl.Feature;
import nl.dslmeinte.xtext.examples.ambiguityDsl.FeatureRefTail;
import nl.dslmeinte.xtext.examples.ambiguityDsl.Field;
import nl.dslmeinte.xtext.examples.ambiguityDsl.HeadTarget;
import nl.dslmeinte.xtext.examples.ambiguityDsl.InnerClass;
import nl.dslmeinte.xtext.examples.ambiguityDsl.LFVariableDeclaration;
import nl.dslmeinte.xtext.examples.ambiguityDsl.RefHead;
import nl.dslmeinte.xtext.examples.ambiguityDsl.Variable;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;

/**
 * This class implements custom scoping.
 */
public class AmbiguityDslScopeProvider extends AbstractDeclarativeScopeProvider {

	IScope scope_FeatureRefTail_feature(FeatureRefTail context, EReference eReference) {
		return Scopes.scopeFor(scope_feature(context));
	}

	private List<Feature> scope_feature(FeatureRefTail context) {
		EObject container = context.eContainer();
		if( container instanceof FeatureRefTail) {
			return features( ((FeatureRefTail) container).getFeature() );
		}
		if( container instanceof RefHead ) {
			HeadTarget head = ((RefHead) container).getTarget();
			if( head instanceof Class ) {
				return ((Class) head).getFeatures();
			}
			if( head instanceof Variable ) {
				return features(type((Variable) head));
			}
			throw forUnhandledContainedType(head);
		}
		throw forUnhandledContainedType(context);
	}

	private List<Feature> features(Feature feature) {
		if( feature instanceof InnerClass ) {
			return ((InnerClass) feature).getFeatures();
		}
		if( feature instanceof Field ) {
			return Collections.emptyList();
		}
		throw forUnhandledContainedType(feature);
	}

	private RefHead type(Variable variable) {
		return ((LFVariableDeclaration) variable.eContainer()).getTypeRef();
	}

	private List<Feature> features(RefHead refHead) {
		EObject lastElt = TypeUtil.lastElement(refHead);
		if( lastElt instanceof RefHead ) {
			HeadTarget head = ((RefHead) lastElt).getTarget();
			// head is Class|Variable:
			if( head instanceof Class ) {
				return ((Class) head).getFeatures();
			}
			if( head instanceof Variable ) {
				return features( type( (Variable) head ) );
			}
			throw forUnhandledContainedType(head);
		} else {
			return features( ((FeatureRefTail) lastElt).getFeature() );
		}
	}

	private RuntimeException forUnhandledContainedType(EObject eObject) {
		return new RuntimeException( "cannot handle " + eObject.eClass().getName() + " instance contained by " + eObject.eContainer().eClass().getName() );
	}

}
