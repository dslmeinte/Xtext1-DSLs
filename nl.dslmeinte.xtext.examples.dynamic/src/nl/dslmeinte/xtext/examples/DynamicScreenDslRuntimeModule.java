package nl.dslmeinte.xtext.examples;

import nl.dslmeinte.xtext.examples.naming.DynamicScreenDslNameProvider;

import org.eclipse.xtext.naming.IQualifiedNameProvider;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class DynamicScreenDslRuntimeModule extends nl.dslmeinte.xtext.examples.AbstractDynamicScreenDslRuntimeModule {

	public Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider() {
		return DynamicScreenDslNameProvider.class;
	}

}
