package nl.dslmeinte.xtext.builder;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.builder.clustering.ClusteringUpdater;
import org.eclipse.xtext.builder.clustering.CurrentDescriptions;
import org.eclipse.xtext.builder.clustering.IUniqueURIQueue;
import org.eclipse.xtext.builder.clustering.Messages;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.IResourceDescription.Delta;
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionDelta;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.inject.Inject;

/**
 * Sub implementation of {@link ClusteringUpdater} which is cancelable, so that
 * the {@link XtextBuilder} can be canceled at (almost) any time.
 * 
 * @author Meinte Boersma
 */
public class CancelableClusteringUpdater extends ClusteringUpdater {

    @Inject
    private IUniqueURIQueue.Factory queueFactory;

	@Override
	public Collection<Delta> transitiveUpdate(IResourceDescriptions oldState,
			ResourceSet rs, Set<URI> toBeUpdated, Set<URI> toBeDeleted,
			IProgressMonitor monitor)
	{
		// also print some old-skool debugging info, to try and pinpoint the root cause:
		System.out.printf( "%s#transitiveUpdate(..) called; stacktrace:\n", super.getClass().getSimpleName() );
		new RuntimeException().printStackTrace(System.out);

		SubMonitor subMonitor = SubMonitor.convert(monitor, Messages.ClusteringUpdater_0, 100);
        subMonitor.subTask(Messages.ClusteringUpdater_0);

        Set<URI> toBeDeletedAsSet = Sets.newHashSet(toBeDeleted);
        if (!toBeDeletedAsSet.isEmpty()) {
	        for(URI updatedURI: toBeUpdated) {
	        	toBeDeletedAsSet.remove(updatedURI);
	        	if (toBeDeletedAsSet.isEmpty())
	        		break;
	        }
        }
        Map<URI, IResourceDescription.Delta> result = Maps.newHashMap();
        // add deleted
        for (final URI toDelete : toBeDeletedAsSet) {
            IResourceDescription resourceDescription = oldState.getResourceDescription(toDelete);
            if (resourceDescription != null) {
                result.put(toDelete, new DefaultResourceDescriptionDelta(resourceDescription, null));
            }
        }

        int startWith = result.size();
        CurrentDescriptions newState = new CurrentDescriptions(rs, oldState, toBeDeletedAsSet);
        IUniqueURIQueue queue = queueFactory.create(toBeUpdated);
        if( monitor.isCanceled() ) {
        	throw new OperationCanceledException();
        }
        queueAffectedResourceDescriptions(oldState, newState, result.values(), queue);            
        while (!queue.isEmpty()) {
        	subMonitor.setWorkRemaining(100);
            Map<URI, Delta> clusterDeltas = loadResourceCluster(oldState, rs, queue, toBeDeletedAsSet,
            		subMonitor.newChild(30), result.size() - startWith + 1);
            result.putAll(clusterDeltas);
            for (final Delta delta : clusterDeltas.values()) {
                newState.register(delta);
            }
            if( monitor.isCanceled() ) {
            	throw new OperationCanceledException();
            }
            queueAffectedResourceDescriptions(oldState, newState, clusterDeltas.values(), queue);
            rs.getResources().clear();
        }
        return result.values();
	}

}
