package nl.dslmeinte.xtext.examples.scoping;

import static org.eclipse.xtext.scoping.Scopes.scopeFor;

import java.util.ArrayList;
import java.util.List;

import nl.dslmeinte.xtext.examples.DataModelDslUtil;
import nl.dslmeinte.xtext.examples.DynamicScreenModelUtil;
import nl.dslmeinte.xtext.examples.dataModelDsl.DataType;
import nl.dslmeinte.xtext.examples.dataModelDsl.Entity;
import nl.dslmeinte.xtext.examples.dataModelDsl.Enumeration;
import nl.dslmeinte.xtext.examples.dataModelDsl.Type;
import nl.dslmeinte.xtext.examples.dynamicScreenDsl.AtomicReferringBExpression;
import nl.dslmeinte.xtext.examples.dynamicScreenDsl.DynamicScreen;
import nl.dslmeinte.xtext.examples.dynamicScreenDsl.EnumList;
import nl.dslmeinte.xtext.examples.dynamicScreenDsl.ExternalVariable;
import nl.dslmeinte.xtext.examples.dynamicScreenDsl.Field;
import nl.dslmeinte.xtext.examples.dynamicScreenDsl.FieldGroup;
import nl.dslmeinte.xtext.examples.dynamicScreenDsl.PathTail;
import nl.dslmeinte.xtext.examples.dynamicScreenDsl.ReferenceTarget;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;

/**
 * Custom (local) scope implementation.
 */
public class DynamicScreenDslScopeProvider extends AbstractDeclarativeScopeProvider {

	/*
	 * +------------------------+
	 * | aspect: Infrastructure |
	 * +------------------------+
	 */

	IScope scope_PathTail_field(PathTail context, EReference reference) {
		EObject container = context.eContainer();
		Type type = null;

		/*
		 * A PathTail can be directly contained by either a PathTail(.tail),
		 * an ExternalVariable(.path), a Field(.path) and a FieldGroup(.path).
		 */
		if( container instanceof PathTail ) {
			type = ((PathTail) container).getField().getType();
			Entity asEntity = ((PathTail) container).getAsEntity();
			if( type instanceof Entity && asEntity != null ) {
				type = asEntity;
			}
		} else if( container instanceof ExternalVariable ) {
			type = DynamicScreenModelUtil.root(container).getViewClass();
		} else if( container instanceof Field ) {
			type = typeOfRelativePath((FieldGroup) container.eContainer());
				// (a Field is always contained by a FieldGroup)
		} else if( container instanceof FieldGroup ) {
			type = typeOfRelativePath((FieldGroup) container, true);
		}

		if( type instanceof DataType ) {
			return scopeFor(((DataType) type).getFields());
		} else if( type instanceof Entity ) {
			return scopeFor(DataModelDslUtil.allFields((Entity) type));
		}
		return IScope.NULLSCOPE;
	}

	/**
	 * Determines the relative base type for this {@link FieldGroup}.
	 * <p>
	 * Example:
	 * <pre>
	 * dynamic-screen "Example" view-class = MortgageProductContractData
	 *
	 * group "Group1" with /financialInsurance {
	 *
	 *   group "Group1.1" with /insuranceWithMortgageProduct {
	 *   }
	 * }
	 * </pre>
	 * The effective path of "Group1.1" is
	 * {@code MortgageProductContractData/financialInsurance/insuranceWithMortgageProduct}.
	 * Its type is the type of the referred {@code insuranceWithMortgageProduct} element.
	 *
	 * @param ignoreWith
	 *            Determines whether the <em>with</em> attribute of the group
	 *            will be ignored in determining the relative path.
	 *            This is necessary for the case where we're trying to determine
	 *            the scope of that very same <em>with</em> attribute: the value
	 *            of it is then non-null already, but since its scope is not yet
	 *            determined, {@code
	 *            ModelUtil.lastElement(group.getWith()).getField()} is an
	 *            as-yet unresolved proxy. Resolving the proxy uses determining
	 *            the scope again, leading to an infinite loop...
	 * 
	 * @param group
	 * 			  The field group for which to compute the relative base type.
	 */
	private Type typeOfRelativePath(FieldGroup group, boolean ignoreWith) {
		if( group.getWith() != null && !ignoreWith) {
			return DynamicScreenModelUtil.lastElement(group.getWith()).getField().getType();
		}
		EObject container = group.eContainer();
		// (a FieldGroup is contained either by another FieldGroup or DynamicScreen)
		if( container instanceof FieldGroup ) {
			return typeOfRelativePath((FieldGroup) container);
		} else if( container instanceof DynamicScreen ) {
			return ((DynamicScreen) container).getViewClass();
		}

		throw new IllegalArgumentException(
				"can't handle a field group contained by "
				+ container.getClass().getSimpleName()
			);
	}

	private Type typeOfRelativePath(FieldGroup group) {
		return typeOfRelativePath(group, false);
	}

	/**
	 * Provides the scope for the down cast inside a path element, relying on
	 * that element being non-{@literal null} otherwise an {@link Exception}
	 * which is caught and ignored by Xtext's core engine.
	 */
	IScope scope_PathTail_asEntity(PathTail context, EReference reference) {
		Type type = context.getField().getType();
			// might throw {@link NullPointerException}
		if( type instanceof Entity ) {
			return scopeFor(DataModelDslUtil.allSubEntities((Entity) type));
		} else {
			return IScope.NULLSCOPE;
		}
	}


	/*
	 * +----------------------+
	 * | aspect: Declarations |
	 * +----------------------+
	 */

	IScope scope_EnumList_literals(EnumList context, EReference reference) {
		return scopeFor(context.getEnum().getLiterals());
	}


	/*
	 * +--------------------+
	 * | aspect: References |
	 * +--------------------+
	 */

	IScope scope_Reference_ref(DynamicScreen dynamicScreen, EReference reference) {
		List<ReferenceTarget> targets = new ArrayList<ReferenceTarget>();

		targets.addAll(DynamicScreenModelUtil.externalVars(dynamicScreen));
		targets.addAll(DynamicScreenModelUtil.allFields(dynamicScreen));

		return scopeFor(targets);
	}


	/*
	 * +--------------------------+
	 * | aspect: Field attributes |
	 * +--------------------------+
	 */

	IScope scope_DirectEnumLiteralsCollection_literals(Field field, EReference reference) {
		Type type = DynamicScreenModelUtil.resultType(field.getPath());
		return createEnumLiteralsScopeFor(type);
	}

	IScope scope_EnumListReference_ref(Field field, EReference reference) {
		Type type = DynamicScreenModelUtil.resultType(field.getPath());
		return createEnumListsScopeFor(type, field);
	}


	/*
	 * +-----------------------------+
	 * | aspect: Boolean expressions |
	 * +-----------------------------+
	 */

	IScope scope_SingleEnumComparison_eLiteral(AtomicReferringBExpression context, EReference reference) {
		Type type = DynamicScreenModelUtil.resultType(context.getRef().getRef().getPath());
		return createEnumLiteralsScopeFor(type);
	}

	IScope scope_DirectEnumLiteralsCollection_literals(AtomicReferringBExpression context, EReference reference) {
		Type type = DynamicScreenModelUtil.resultType(context.getRef().getRef().getPath());
		return createEnumLiteralsScopeFor(type);
	}

	IScope scope_EnumListReference_ref(AtomicReferringBExpression context, EReference reference) {
		Type type = DynamicScreenModelUtil.resultType(context.getRef().getRef().getPath());
		return createEnumListsScopeFor(type, context);
	}


	/*
	 * +--------------+
	 * | Helper stuff |
	 * +--------------+
	 */

	// enum-related:

	private IScope createEnumLiteralsScopeFor(Type type) {
		return
			( type instanceof Enumeration )
				? scopeFor( ((Enumeration) type).getLiterals() )
				: IScope.NULLSCOPE;
	}

	private IScope createEnumListsScopeFor(final Type type, EObject context) {
		return
			( type instanceof Enumeration )
				? scopeFor( Iterables.filter(
						DynamicScreenModelUtil.enumLists(DynamicScreenModelUtil.root(context)),
						new Predicate<EnumList>() {
							public boolean apply(EnumList enumList) {
								return type.equals(enumList.getEnum());
							}
						}
					) )
				: IScope.NULLSCOPE;
	}

}
