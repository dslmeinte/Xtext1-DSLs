package nl.dslmeinte.xtext.examples.scoping;

import static org.eclipse.xtext.scoping.Scopes.scopeFor;
import nl.dslmeinte.xtext.examples.DataModelDslUtil;
import nl.dslmeinte.xtext.examples.dataModelDsl.DataModel;
import nl.dslmeinte.xtext.examples.dataModelDsl.DataType;
import nl.dslmeinte.xtext.examples.dataModelDsl.Entity;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.util.IResourceScopeCache;

import com.google.inject.Inject;
import com.google.inject.Provider;

/**
 * Custom (local) scoping implementation.
 */
public class DataModelDslScopeProvider extends AbstractDeclarativeScopeProvider {

	@Inject
	private IResourceScopeCache primitiveTypesCache;

	IScope scope_Field_type(DataType dataType, EReference eRef) {
		final DataModel model = (DataModel) dataType.eContainer();
		return primitiveTypesCache.get(model, model.eResource(),
				new Provider<IScope>() {
					public IScope get() {
						return scopeFor(model.getPrimitives().getPrimitiveTypes());
					}
				}
			);
	}

	@Inject
	private IResourceScopeCache allEntityFieldsCache;

	IScope scope_Usage_field (final Entity entity, EReference ref) {
		return allEntityFieldsCache.get(entity, entity.eResource(),
				new Provider<IScope>() {
					public IScope get() {
						return scopeFor(DataModelDslUtil.allFields(entity));
					}
				}
			);
	}

	@Inject
	private IResourceScopeCache dataTypeFieldsCache;

	IScope scope_Usage_field (final DataType dataType, EReference ref) {
		return dataTypeFieldsCache.get(dataType, dataType.eResource(),
				new Provider<IScope>() {
					public IScope get() {
						return scopeFor(dataType.getFields());
					}
				}
			);
	}

}
