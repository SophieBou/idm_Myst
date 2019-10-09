/*
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl.ui;

import com.google.inject.Injector;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.xtext.example.Myst.ui.internal.MystActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class MystExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(MystActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		MystActivator activator = MystActivator.getInstance();
		return activator != null ? activator.getInjector(MystActivator.ORG_XTEXT_EXAMPLE_MYDSL_MYST) : null;
	}

}