package nl.dslmeinte.xtext.examples;

import nl.dslmeinte.xtext.examples.ambiguityDsl.FeatureRefTail;
import nl.dslmeinte.xtext.examples.ambiguityDsl.RefHead;
import nl.dslmeinte.xtext.examples.ambiguityDsl.TailedElement;

public class TypeUtil {

	/**
	 * Returns the last element in the sequence composed through the
	 * {@code tail} feature.
	 * 
	 * @return a {@link LastElementType}: either a {@link RefHead} or a
	 *         {@link FeatureRefTail}
	 */
	public static TailedElement lastElement(RefHead refHead) {
		FeatureRefTail tail = refHead.getTail();
		if( tail == null ) {
			return refHead;
		}
		while( tail.getTail() != null ) {
			tail = tail.getTail();
		}
		return tail;
	}

}
