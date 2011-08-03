package nl.dslmeinte.xtext.sgml.contenttype;

import static nl.dslmeinte.xtext.sgml.contenttype.SimpleSgmlRecognizer.Result.*;

import junit.framework.Assert;
import nl.dslmeinte.xtext.sgml.contenttype.SimpleSgmlRecognizer.Result;

import org.antlr.runtime.ANTLRStringStream;
import org.junit.Test;


public class SimpleSgmlRecognizerTest {

	@Test
	public void test1() {
		assertR(emptySgml, "");
		assertR(emptySgml, "\n<!-- foo -->\n");
		assertR(notSgml, "\n<!-- foo -->\nbar");
		assertR(sgmlWithRightDocType, "<!DOCTYPE SGML");
		assertR(sgmlWithWrongDocType, "<!DOCTYPE<!--foo-->SGML");
		assertR(sgmlWithWrongDocType, "<!DOCTYPE SGML2");
		assertR(sgmlWithoutDocType, "<HTML>");
	}

	private final static SimpleSgmlRecognizer recognizer = new SimpleSgmlRecognizer("SGML");

	private Result recognize(String input) {
		return recognizer.recognize(new ANTLRStringStream(input));
	}

	private void assertR(Result result, String input) {
		Assert.assertEquals(result, recognize(input));
	}

}
