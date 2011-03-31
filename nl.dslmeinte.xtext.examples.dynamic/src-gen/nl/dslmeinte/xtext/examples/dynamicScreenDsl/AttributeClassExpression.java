/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.examples.dynamicScreenDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Class Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.AttributeClassExpression#getClasses <em>Classes</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.DynamicScreenDslPackage#getAttributeClassExpression()
 * @model
 * @generated
 */
public interface AttributeClassExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Classes</b></em>' attribute list.
   * The list contents are of type {@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.AttributeClass}.
   * The literals are from the enumeration {@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.AttributeClass}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Classes</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Classes</em>' attribute list.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.AttributeClass
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.DynamicScreenDslPackage#getAttributeClassExpression_Classes()
   * @model unique="false"
   * @generated
   */
  EList<AttributeClass> getClasses();

} // AttributeClassExpression
