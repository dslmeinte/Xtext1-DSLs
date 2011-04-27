
package nl.dslmeinte.xtext.examples;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class AmbiguityDslStandaloneSetup extends AmbiguityDslStandaloneSetupGenerated{

	public static void doSetup() {
		new AmbiguityDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

