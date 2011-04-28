package nl.dslmeinte.xtext.examples;

import java.util.Collections;
import java.util.List;

import nl.dslmeinte.xtext.examples.ambiguityDsl.Class;
import nl.dslmeinte.xtext.examples.ambiguityDsl.Feature;
import nl.dslmeinte.xtext.examples.ambiguityDsl.FeatureSpecTail;
import nl.dslmeinte.xtext.examples.ambiguityDsl.Field;
import nl.dslmeinte.xtext.examples.ambiguityDsl.HeadTarget;
import nl.dslmeinte.xtext.examples.ambiguityDsl.InnerClass;
import nl.dslmeinte.xtext.examples.ambiguityDsl.SpecHead;
import nl.dslmeinte.xtext.examples.ambiguityDsl.TailedElement;
import nl.dslmeinte.xtext.examples.ambiguityDsl.Variable;
import nl.dslmeinte.xtext.examples.ambiguityDsl.VariableDeclaration;

import org.eclipse.emf.ecore.EObject;

public class AmbiguityTypeUtil {

	/**
	 * Returns the last element in the sequence composed through the
	 * {@code tail} feature.
	 * 
	 * @return a {@link LastElementType}: either a {@link SpecHead} or a
	 *         {@link FeatureSpecTail}
	 */
	public static TailedElement lastElement(SpecHead specHead) {
		FeatureSpecTail tail = specHead.getTail();
		if( tail == null ) {
			return specHead;
		}
		while( tail.getTail() != null ) {
			tail = tail.getTail();
		}
		return tail;
	}

	/**
	 * Returns the declared type (as a {@link SpecHead}) of a
	 * {@link Variable}.
	 */
	public static SpecHead type(Variable variable) {
		return ((VariableDeclaration) variable.eContainer()).getTypeSpec();
	}

	/**
	 * Returns the list of {@link Feature}s of the given feature.
	 * 
	 * @param feature
	 *            - either a {@link InnerClass} or a {@link Field} (having no
	 *            features)
	 */
	public static List<Feature> features(Feature feature) {
		if( feature instanceof InnerClass ) {
			return ((InnerClass) feature).getFeatures();
		}
		if( feature instanceof Field ) {
			return Collections.emptyList();
		}
		throw AmbiguityTypeUtil.forUnhandledContainedType(feature);
	}

	/**
	 * Returns the list of {@link Feature}s of the "thing" pointed to by the
	 * {@link SpecHead} instance.
	 */
	public static List<Feature> features(SpecHead specHead) {
		EObject lastElt = lastElement(specHead);
		if( lastElt instanceof SpecHead ) {
			HeadTarget target = ((SpecHead) lastElt).getTarget();
			// target is Class|Variable:
			if( target instanceof Class ) {
				return ((Class) target).getFeatures();
			}
			if( target instanceof Variable ) {
				return features( type( (Variable) target ) );
			}
			throw AmbiguityTypeUtil.forUnhandledContainedType(target);
		} else {
			return features( ((FeatureSpecTail) lastElt).getFeature() );
		}
	}

	public static RuntimeException forUnhandledContainedType(EObject eObject) {
		return new RuntimeException( "cannot handle " + eObject.eClass().getName() + " instance contained by " + eObject.eContainer().eClass().getName() );
	}

}
