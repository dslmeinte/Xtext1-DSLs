
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
public class WsdlLanguageExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return nl.dslmeinte.xtext.examples.ui.internal.WsdlLanguageActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return nl.dslmeinte.xtext.examples.ui.internal.WsdlLanguageActivator.getInstance().getInjector("nl.dslmeinte.xtext.examples.WsdlLanguage");
	}
	
}
