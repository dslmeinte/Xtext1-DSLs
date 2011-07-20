package nl.dslmeinte.xtext.builder;

import org.eclipse.xtext.builder.builderState.IMarkerUpdater;
import org.eclipse.xtext.builder.builderState.MarkerUpdaterImpl;
import org.eclipse.xtext.builder.clustering.ClusteringModule;

import com.google.inject.Binder;

/**
 * Customization of {@link ClusteringModule} which also binds the
 * {@link ReadonlyIndifferentMarkerUpdater} instead of
 * {@link MarkerUpdaterImpl}: because the order in which Guice modules are
 * allowed to bind is indeterminate we can't rely on doing the binding in the UI
 * Guice module.
 * <p>
 * Be sure to configure this class in the {@code plugin.xml} file of the
 * {@code .ui} project for your Xtext language, like so:
 * <pre>
 * </pre>
 * 
 * @author Meinte Boersma
 */
public class ReadonlyIndifferentClusteringModule extends ClusteringModule {

	@Override
	public void configure(Binder binder) {
		super.configure(binder);
		binder.bind(IMarkerUpdater.class).to(ReadonlyIndifferentMarkerUpdater.class);
	}

}
