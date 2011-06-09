
package nl.dslmeinte.xtext.dtd;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class DtdLanguageStandaloneSetup extends DtdLanguageStandaloneSetupGenerated{

	public static void doSetup() {
		new DtdLanguageStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

