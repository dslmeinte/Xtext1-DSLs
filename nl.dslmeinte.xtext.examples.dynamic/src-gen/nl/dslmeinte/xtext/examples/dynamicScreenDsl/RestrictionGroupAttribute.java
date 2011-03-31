/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.examples.dynamicScreenDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Restriction Group Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.RestrictionGroupAttribute#getRules <em>Rules</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.DynamicScreenDslPackage#getRestrictionGroupAttribute()
 * @model
 * @generated
 */
public interface RestrictionGroupAttribute extends EnumFieldAttribute
{
  /**
   * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
   * The list contents are of type {@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.RestrictionRule}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rules</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rules</em>' containment reference list.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.DynamicScreenDslPackage#getRestrictionGroupAttribute_Rules()
   * @model containment="true"
   * @generated
   */
  EList<RestrictionRule> getRules();

} // RestrictionGroupAttribute
