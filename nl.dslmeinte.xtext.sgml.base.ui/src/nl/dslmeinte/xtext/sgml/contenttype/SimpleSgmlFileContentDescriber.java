package nl.dslmeinte.xtext.sgml.contenttype;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.EnumSet;

import nl.dslmeinte.xtext.sgml.contenttype.SimpleSgmlRecognizer;
import nl.dslmeinte.xtext.sgml.contenttype.SimpleSgmlRecognizer.Result;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CharStream;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.core.runtime.content.IContentDescription;
import org.eclipse.core.runtime.content.ITextContentDescriber;

/**
 * Implementation of {@link ITextContentDescriber} to recognize SGML-like
 * documents using the {@link SimpleSgmlRecognizer}.
 * 
 * @author Meinte Boersma
 */
public abstract class SimpleSgmlFileContentDescriber implements ITextContentDescriber {

	private String rootIdentifier;

	public SimpleSgmlFileContentDescriber(String rootIdentifier) {
		this.rootIdentifier = rootIdentifier;
	}

	@Override
	public int describe(InputStream contents, IContentDescription description)
			throws IOException {
		return internalDescribe(new ANTLRInputStream(contents), description);
	}

	@Override
	public int describe(Reader contents, IContentDescription description)
			throws IOException {
		return internalDescribe(new ANTLRReaderStream(contents), description);
	}

	private final static QualifiedName[] SUPPORTED_OPTIONS = {};

	@Override
	public QualifiedName[] getSupportedOptions() {
		return SUPPORTED_OPTIONS;
	}

	private final SimpleSgmlRecognizer recognizer = new SimpleSgmlRecognizer(rootIdentifier);

	private int internalDescribe(CharStream input,
			IContentDescription description) throws IOException {
		return( validResults.contains(recognizer.recognize(input)) ? VALID : INVALID );
	}

	private final static EnumSet<Result> validResults = EnumSet.of(
			Result.sgmlWithRightDocType,
			Result.sgmlWithoutDocType,
			Result.emptySgml	// to enable creation and opening of (near-)empty/new files
		);

}
