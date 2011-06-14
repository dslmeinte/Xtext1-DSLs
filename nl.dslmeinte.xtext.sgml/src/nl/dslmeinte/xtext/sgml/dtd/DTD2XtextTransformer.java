package nl.dslmeinte.xtext.sgml.dtd;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

import nl.dslmeinte.xpand.util.XpandCallConfiguration;
import nl.dslmeinte.xtext.dtd.DtdLanguageStandaloneSetup;
import nl.dslmeinte.xtext.dtd.dtdModel.DtdModelPackage;
import nl.dslmeinte.xtext.sgml.lexer.SgmlLexer;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;

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
		new XpandCallConfiguration()
			.withEmfRegistry()
			.call(packagePrefix() + "::DTD2Xtext::main")
			.on(new DTDManager(dtdUri).getDTD())
			.with("\"" + nsURI + "\"")
			.to(xtextOutput)
			.evaluate();
	}

	private static String packagePrefix() {
		return DTD2XtextTransformer.class.getPackage().getName().replaceAll("\\.", "::");
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

	public static void transform(URI dtdUri, String nsURI, OutputStream xtextOutput, String commaSeparatedAdvices) {
		XpandCallConfiguration config = new XpandCallConfiguration()
			.withEmfRegistry()
			.call(packagePrefix() + "::DTD2Xtext::main")
			.on(new DTDManager(dtdUri).getDTD())
			.with("\"" + nsURI + "\"")
			.to(xtextOutput);
		String[] advices = commaSeparatedAdvices.split("\\s*,\\s*");
		for( String advice : advices ) {
			config.registerAdvice(advice);
		}
		config.evaluate();
	}

}
