package nl.dslmeinte.xtext.builder;

import org.eclipse.xtext.builder.builderState.IBuilderState;
import org.eclipse.xtext.builder.builderState.IMarkerUpdater;
import org.eclipse.xtext.builder.builderState.IResourceDescriptionsUpdater;
import org.eclipse.xtext.builder.clustering.ClusteringBuilderState;
import org.eclipse.xtext.builder.clustering.ClusteringModule;

import com.google.inject.Binder;
import com.google.inject.Scopes;

/**
 * Similar to {@link ReadonlyIndifferentClusteringModule} but it also binds the
 * {@link CancelableClusteringUpdater}.
 * 
 * @author Meinte Boersma
 */
public class CancelableReadonlyIndifferentClusteringModule extends ClusteringModule {

	@Override
	public void configure(Binder binder) {
        binder.bind(IBuilderState.class).to(ClusteringBuilderState.class).in(Scopes.SINGLETON);
        binder.bind(IResourceDescriptionsUpdater.class).to(CancelableClusteringUpdater.class);
		binder.bind(IMarkerUpdater.class).to(ReadonlyIndifferentMarkerUpdater.class);
	}

}
