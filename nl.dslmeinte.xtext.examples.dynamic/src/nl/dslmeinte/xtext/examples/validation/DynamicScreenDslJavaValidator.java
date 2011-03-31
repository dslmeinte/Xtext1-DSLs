package nl.dslmeinte.xtext.examples.validation;

import java.util.EnumSet;
import java.util.Set;

import nl.dslmeinte.xtext.examples.DynamicScreenModelUtil;
import nl.dslmeinte.xtext.examples.dataModelDsl.Entity;
import nl.dslmeinte.xtext.examples.dataModelDsl.Enumeration;
import nl.dslmeinte.xtext.examples.dataModelDsl.Modifier;
import nl.dslmeinte.xtext.examples.dataModelDsl.Type;
import nl.dslmeinte.xtext.examples.dynamicScreenDsl.AttributeClass;
import nl.dslmeinte.xtext.examples.dynamicScreenDsl.AttributeClassExpression;
import nl.dslmeinte.xtext.examples.dynamicScreenDsl.DirectEnumLiteralsCollection;
import nl.dslmeinte.xtext.examples.dynamicScreenDsl.DynamicScreen;
import nl.dslmeinte.xtext.examples.dynamicScreenDsl.DynamicScreenDslPackage;
import nl.dslmeinte.xtext.examples.dynamicScreenDsl.Field;
import nl.dslmeinte.xtext.examples.dynamicScreenDsl.FieldGroup;
import nl.dslmeinte.xtext.examples.dynamicScreenDsl.PathTail;
import nl.dslmeinte.xtext.examples.dynamicScreenDsl.RestrictionAttribute;
import nl.dslmeinte.xtext.examples.dynamicScreenDsl.RestrictionGroupAttribute;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.Check;


public class DynamicScreenDslJavaValidator extends AbstractDynamicScreenDslJavaValidator {

	@Check
	public void pathResultType_is_primitive_or_data_type(PathTail element) {
		if( element.getTail() != null ) {
			return;
		}

		EObject head = element;
		while( head instanceof PathTail ) {
			head = head.eContainer();
		}
		if( !(head instanceof Field) ) {
			return;
		}

		Type type = element.getField().getType();
		if( type instanceof Entity ) {
			error(
					"type of last element of a data path must be a DataType, a PrimitiveType or Enumeration, not an Entity as " + ((Entity) type).getName() + " is",
					DynamicScreenDslPackage.PATH_TAIL__FIELD
				);
		}
	}

	@Check
	public void unique_fieldNames(Field field) {
		for( Field otherField : DynamicScreenModelUtil.allFields(DynamicScreenModelUtil.root(field)) ) {
			String fieldName = field.getName();
			if( ( otherField != field ) && fieldName.equals(otherField.getName()) ) {
				error( "duplicate field name '" + fieldName + "'", DynamicScreenDslPackage.FIELD__NAME );
			}
		}
	}

	@Check
	public void unique_attributeClasses(AttributeClassExpression expr) {
		Set<AttributeClass> set = EnumSet.noneOf(AttributeClass.class);

		boolean unique = true;
		for( AttributeClass attributeClass : expr.getClasses() ) {
			if( !set.add(attributeClass) ) {
				unique = false;
				break;
			}
		}

		if( !unique ) {
			error(
					"left hand side expression contains duplicate attribute classes",
					DynamicScreenDslPackage.ATTRIBUTE_CLASS_EXPRESSION
				);
		}
	}

	@Check
	public void topLevel_fieldGroup_must_have_label(FieldGroup group) {
		if(    ( group.eContainer() instanceof DynamicScreen )
			&& ( group.getLabel() == null ) ) {
			error( "top-level field group must have a label", DynamicScreenDslPackage.FIELD_GROUP );
		}
	}

	@Check
	public void restrictionAttribute_must_apply_to_enum_field(RestrictionAttribute attribute) {
		if( !(attribute.eContainer() instanceof Field) ) {
			error(
					"an enumeration restriction attribute can only be used with a field",
					DynamicScreenDslPackage.RESTRICTION_ATTRIBUTE
				);
		}

		Type type = DynamicScreenModelUtil.resultType( ((Field) attribute.eContainer()).getPath() );
		if( !( type instanceof Enumeration ) ) {
			error(
					"an enumeration restriction attribute can only be used with a field which has an Enumeration as type",
					DynamicScreenDslPackage.RESTRICTION_ATTRIBUTE
				);
		}
	}

	@Check
	public void restrictionAttribute_must_apply_to_enum_field(RestrictionGroupAttribute attribute) {
		if( !(attribute.eContainer() instanceof Field) ) {
			error(
					"an enumeration restriction group attribute can only be used with a field",
					DynamicScreenDslPackage.RESTRICTION_GROUP_ATTRIBUTE
				);
		}

		Type type = DynamicScreenModelUtil.resultType( ((Field) attribute.eContainer()).getPath() );
		if( !( type instanceof Enumeration ) ) {
			error(
					"an enumeration restriction group attribute can only be used with a field which has an Enumeration as type",
					DynamicScreenDslPackage.RESTRICTION_GROUP_ATTRIBUTE
				);
		}
	}

	@Check
	public void warn_for_empty_list_of_Enumeration_literals(DirectEnumLiteralsCollection collection) {
		if( collection.getLiterals().size() == 0 ) {
			warning( "enumeration literals list is empty", DynamicScreenDslPackage.DIRECT_ENUM_LITERALS_COLLECTION );
		}
	}

	/**
	 * This is already checked since the grammar is defined here with a +, but
	 * this message is a lot clearer.
	 */
	@Check
	public void restrictionGroupAttribute_must_have_at_least_one_rule(RestrictionGroupAttribute attribute) {
		if( attribute.getRules().size() == 0 ) {
			error( "enumeration restriction group attribute must have at least 1 rule", DynamicScreenDslPackage.RESTRICTION_GROUP_ATTRIBUTE );
		}
	}

	@Check
	public void warn_for_multiValued_properties_inside_paths(PathTail element) {
		if( element.getField().getModifier() == Modifier.REPEATED ) {
			warning(
					"field is multi-valued ==> the path might need extra selection logic (currently not implemented)",
					DynamicScreenDslPackage.PATH_TAIL__FIELD
				);
		}
	}

	// TODO  add constraints on type of ExternalVariable.path?

}
