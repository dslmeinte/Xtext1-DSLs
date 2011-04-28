package nl.dslmeinte.xtext.examples.scoping;

import java.util.List;

import nl.dslmeinte.xtext.examples.AmbiguityTypeUtil;
import nl.dslmeinte.xtext.examples.ambiguityDsl.Class;
import nl.dslmeinte.xtext.examples.ambiguityDsl.Feature;
import nl.dslmeinte.xtext.examples.ambiguityDsl.FeatureSpecTail;
import nl.dslmeinte.xtext.examples.ambiguityDsl.HeadTarget;
import nl.dslmeinte.xtext.examples.ambiguityDsl.SpecHead;
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

	IScope scope_FeatureSpecTail_feature(FeatureSpecTail context, EReference eReference) {
		return Scopes.scopeFor(featuresInScope(context));
	}

	private List<Feature> featuresInScope(FeatureSpecTail context) {
		EObject container = context.eContainer();
		if( container instanceof FeatureSpecTail) {
			return AmbiguityTypeUtil.features( ((FeatureSpecTail) container).getFeature() );
		}
		if( container instanceof SpecHead ) {
			HeadTarget target = ((SpecHead) container).getTarget();
			if( target instanceof Class ) {
				return ((Class) target).getFeatures();
			}
			if( target instanceof Variable ) {
				return AmbiguityTypeUtil.features(AmbiguityTypeUtil.type((Variable) target));
			}
			throw AmbiguityTypeUtil.forUnhandledContainedType(target);
		}
		throw AmbiguityTypeUtil.forUnhandledContainedType(context);
	}

}
