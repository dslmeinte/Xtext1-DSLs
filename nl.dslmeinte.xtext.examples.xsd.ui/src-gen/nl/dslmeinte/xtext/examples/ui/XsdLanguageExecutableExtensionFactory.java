
/*
 * generated by Xtext
 */
 
package nl.dslmeinte.xtext.examples.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

/**
 *@generated
 */
public class XsdLanguageExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return nl.dslmeinte.xtext.examples.ui.internal.XsdLanguageActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return nl.dslmeinte.xtext.examples.ui.internal.XsdLanguageActivator.getInstance().getInjector("nl.dslmeinte.xtext.examples.XsdLanguage");
	}
	
}
