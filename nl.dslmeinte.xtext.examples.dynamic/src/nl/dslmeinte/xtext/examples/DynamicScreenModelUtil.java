package nl.dslmeinte.xtext.examples;

import java.util.ArrayList;
import java.util.List;

import nl.dslmeinte.xtext.examples.dataModelDsl.Type;
import nl.dslmeinte.xtext.examples.dynamicScreenDsl.DynamicScreen;
import nl.dslmeinte.xtext.examples.dynamicScreenDsl.EnumList;
import nl.dslmeinte.xtext.examples.dynamicScreenDsl.ExternalVariable;
import nl.dslmeinte.xtext.examples.dynamicScreenDsl.Field;
import nl.dslmeinte.xtext.examples.dynamicScreenDsl.FieldGroup;
import nl.dslmeinte.xtext.examples.dynamicScreenDsl.GroupElement;
import nl.dslmeinte.xtext.examples.dynamicScreenDsl.PathTail;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.EcoreUtil2;

public class DynamicScreenModelUtil {

	/**
	 * Returns all fields defined within all blocks within this
	 * {@link DynamicScreen}.
	 */
	public static List<Field> allFields(DynamicScreen dynamicScreen) {
		List<Field> fields = new ArrayList<Field>();

		for( FieldGroup group : dynamicScreen.getGroups() ) {
			fields.addAll( fields(group) );
		}

		return fields;
	}

	private static List<Field> fields(FieldGroup group) {
		List<Field> fields = new ArrayList<Field>();

		for( GroupElement element : group.getElements() ) {
			if( element instanceof Field ) {
				fields.add((Field) element);
			} else if( element instanceof FieldGroup ) {
				fields.addAll( fields((FieldGroup) element) );
			}
		}

		return fields;
	}

	/**
	 * Returns the type of the field referred to by the leaf element of this
	 * path.
	 */
	public static Type resultType(PathTail element) {
		return lastElement(element).getField().getType();
	}

	/**
	 * Returns the leaf element of this path.
	 */
	public static PathTail lastElement(PathTail element) {
		while( element.getTail() != null ) {
			element = element.getTail();
		}
		return element;
	}

	/**
	 * Returns the root model element for the current .dsd file.
	 */
	public static DynamicScreen root(EObject eObject) {
		return (DynamicScreen) EcoreUtil.getRootContainer(eObject);
	}

	/**
	 * Returns all aliases defined within this {@link DynamicScreen}.
	 */
	public static List<ExternalVariable> externalVars(DynamicScreen dynamicScreen) {
		return EcoreUtil2.typeSelect(dynamicScreen.getDeclarations(), ExternalVariable.class);
	}

	/**
	 * Returns all enumLists defined within this {@link DynamicScreen}.
	 */
	public static List<EnumList> enumLists(DynamicScreen dynamicScreen) {
		return EcoreUtil2.typeSelect(dynamicScreen.getDeclarations(), EnumList.class);
	}

}
