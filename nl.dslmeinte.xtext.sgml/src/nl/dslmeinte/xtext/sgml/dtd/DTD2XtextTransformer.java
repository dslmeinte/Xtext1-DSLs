package nl.dslmeinte.xtext.sgml.dtd;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;

import nl.dslmeinte.xpand.util.XpandCaller;
import nl.dslmeinte.xtext.dtd.DtdLanguageStandaloneSetup;
import nl.dslmeinte.xtext.dtd.dtdModel.DtdModelPackage;
import nl.dslmeinte.xtext.sgml.lexer.SgmlLexer;

/**
 * Transforms a {@code .dtd} file into an Xtext grammar which is compatible with
 * the {@link SgmlLexer}.
 * 
 * @author Meinte Boersma
 */
public class DTD2XtextTransformer {

	static {
		if( !EPackage.Registry.INSTANCE.containsKey(DtdModelPackage.eNS_URI) ) {
			DtdLanguageStandaloneSetup.doSetup();
		}
	}

	/**
	 * Transforms the {@code DTD} file into a Xtext grammar definition and saves
	 * that to the {@link OutputStream} given.
	 */
	public static void transform(URI dtdUri, String nsURI, OutputStream xtextOutput) {
		String packagePrefix = DTD2XtextTransformer.class.getPackage().getName().replaceAll("\\.", "::");
		XpandCaller.evaluateEmfTemplate(
				xtextOutput,
				packagePrefix + "::DTD2Xtext::main",
				new DTDManager(dtdUri).getDTD(),
				( "\"" + nsURI + "\"" )
			);
	}

	/**
	 * Transforms the {@code DTD} file into a Xtext grammar definition and saves
	 * that to the {@link URI} given.
	 */
	public static void transform(URI dtdUri, String nsURI, URI xtextUri) {
		String path = ".." + ( xtextUri.isPlatformResource() ? xtextUri.toPlatformString(true) : xtextUri.toFileString() );
		try {
			FileOutputStream xtextOutput = new FileOutputStream(path);
			transform(dtdUri, nsURI, xtextOutput);
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}
	}

	// TODO  add a version of transform which allows to add AOP to the Xpand evaluation

}
