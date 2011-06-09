
package nl.dslmeinte.xtext.dtd;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class DtdLangaugeStandaloneSetup extends DtdLangaugeStandaloneSetupGenerated{

	public static void doSetup() {
		new DtdLangaugeStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

