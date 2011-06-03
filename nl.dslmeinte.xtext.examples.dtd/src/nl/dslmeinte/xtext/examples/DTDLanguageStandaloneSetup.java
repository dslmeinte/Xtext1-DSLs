
package nl.dslmeinte.xtext.examples;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class DTDLanguageStandaloneSetup extends DTDLanguageStandaloneSetupGenerated{

	public static void doSetup() {
		new DTDLanguageStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

