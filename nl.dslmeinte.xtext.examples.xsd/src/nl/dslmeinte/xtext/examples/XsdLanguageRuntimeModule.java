package nl.dslmeinte.xtext.examples;

import org.eclipse.xtext.conversion.IValueConverterService;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class XsdLanguageRuntimeModule extends nl.dslmeinte.xtext.examples.AbstractXsdLanguageRuntimeModule {

	/**
	 * Binds the {@link IValueConverterService} to our custom implementation
	 * {@link CustomLanguageConversions}.
	 */
	@Override
	public Class<? extends IValueConverterService> bindIValueConverterService() {
	  return CustomLanguageConversions.class;
	}

}
