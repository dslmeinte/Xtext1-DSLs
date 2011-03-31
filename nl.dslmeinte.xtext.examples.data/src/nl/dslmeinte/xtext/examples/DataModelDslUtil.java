package nl.dslmeinte.xtext.examples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import nl.dslmeinte.xtext.examples.dataModelDsl.DataModel;
import nl.dslmeinte.xtext.examples.dataModelDsl.DataType;
import nl.dslmeinte.xtext.examples.dataModelDsl.Entity;
import nl.dslmeinte.xtext.examples.dataModelDsl.Field;
import nl.dslmeinte.xtext.examples.dataModelDsl.PrimitiveType;

import com.google.common.collect.Iterables;

public class DataModelDslUtil {

	private DataModelDslUtil() {
		// (prevents instantiation)
	}

	/**
	 * Determines whether a {@link Field} can be considered to be "simple" (as
	 * opposed to "complex" -{@link DataType}s may only contain "simple"
	 * fields).
	 */
	public static boolean isSimple(Field field) {
		return( field.getType() instanceof PrimitiveType );
	}

	/**
	 * Returns all {@link Entity}s in the model.
	 */
	public static Iterable<Entity> entities(DataModel model) {
		return Iterables.filter( model.getCompoundTypes(), Entity.class );
	}

	/**
	 * Returns all fields of the entity given, directly including all inherited
	 * fields.
	 */
	public static List<Field> allFields(Entity entity)
	{
		List<Field> fields = new ArrayList<Field>();

		Entity entity2 = entity;
		while( entity2 != null ) {
			fields.addAll(entity2.getFields());
			entity2 = entity2.getSuperType();
		}

		return fields;
	}

	/**
	 * Returns all (proper) sub entities of the given {@link Entity}, recursively.
	 */
	public static Set<Entity> allSubEntities(Entity superEntity) {
		Map<Entity, Set<Entity>> subEntitiesMap = new HashMap<Entity, Set<Entity>>();

		for( Entity entity : entities( ((DataModel) superEntity.eContainer()) ) ) {
			Entity superType = entity.getSuperType();
			while( superType != null ) {
				Set<Entity> set = subEntitiesMap.get(superType);
				if( set == null ) {
					subEntitiesMap.put(superType, set = new HashSet<Entity>());
				}
				set.add(entity);
				superType = superType.getSuperType();
			}
		}

		return subEntitiesMap.get(superEntity);
	}

}
