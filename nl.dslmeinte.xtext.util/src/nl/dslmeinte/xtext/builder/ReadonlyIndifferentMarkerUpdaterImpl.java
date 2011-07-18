package nl.dslmeinte.xtext.builder;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IStorage;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.builder.builderState.MarkerUpdaterImpl;
import org.eclipse.xtext.builder.builderState.Messages;
import org.eclipse.xtext.resource.IResourceDescription.Delta;
import org.eclipse.xtext.ui.MarkerTypes;
import org.eclipse.xtext.ui.resource.IStorage2UriMapper;

import com.google.common.collect.ImmutableList;
import com.google.inject.Inject;

/**
 * Sub implementation of {@link MarkerUpdaterImpl} which promotes parse and
 * validation error to error markers regardless of the files being read-only.
 * <p>
 * The implementation overrides
 * {@link MarkerUpdaterImpl#updateMarker(ResourceSet, ImmutableList, IProgressMonitor)}
 * by copying its source and commenting out the lines with the {@code if}-statement.
 * This class needs to be bound in the Guice configuration for the {@code .ui}
 * project of an Xtext language, e.g. using {@link GuiceConfiguration#bindIMarkerUpdater()}.
 * 
 * @author Meinte Boersma
 */
public class ReadonlyIndifferentMarkerUpdaterImpl extends MarkerUpdaterImpl {

	@Inject
	private IStorage2UriMapper mapper;

	private final static Logger log = Logger.getLogger(ReadonlyIndifferentMarkerUpdaterImpl.class);

	@Override
	public void updateMarker(ResourceSet resourceSet,
			ImmutableList<Delta> resourceDescriptionDeltas,
			IProgressMonitor monitor) {
		SubMonitor subMonitor = SubMonitor.convert(monitor, Messages.MarkerUpdaterImpl_ValidateResources, resourceDescriptionDeltas.size());
		subMonitor.subTask(Messages.MarkerUpdaterImpl_ValidateResources);
		for (Delta delta : resourceDescriptionDeltas) {
			if (subMonitor.isCanceled())
				return;
			if (delta.getNew() != null) {
				Iterable<IStorage> storages = mapper.getStorages(delta.getNew().getURI());
				SubMonitor child = subMonitor.newChild(1);
				child.setWorkRemaining(3);
				for (IStorage storage : storages) {
					child.setWorkRemaining(3);
					if (storage instanceof IFile) {
						IFile file = (IFile) storage;
//						if (!file.isReadOnly()) {
							Resource resource = resourceSet.getResource(delta.getNew().getURI(), true);
							addMarkers(file, resource, child.newChild(2));
//						}
					} else {
						child.worked(1);
					}
				}
			} else {
				Iterable<IStorage> storages = mapper.getStorages(delta.getOld().getURI());
				for (IStorage storage : storages) {
					if (storage instanceof IFile) {
						IFile file = (IFile) storage;
//						if (!file.isReadOnly() && file.isAccessible()) {
							try {
								file.deleteMarkers(MarkerTypes.FAST_VALIDATION, true, IResource.DEPTH_ZERO);
								file.deleteMarkers(MarkerTypes.NORMAL_VALIDATION, true, IResource.DEPTH_ZERO);
							} catch(CoreException ex) {
								log.error(ex.getMessage(), ex);
							}
//						}
					}
				}
				subMonitor.worked(1);
			}
		}
	}

}
