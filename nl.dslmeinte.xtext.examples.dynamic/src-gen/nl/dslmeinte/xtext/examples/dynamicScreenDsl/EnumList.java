/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.examples.dynamicScreenDsl;

import nl.dslmeinte.xtext.examples.dataModelDsl.EnumLiteral;
import nl.dslmeinte.xtext.examples.dataModelDsl.Enumeration;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.EnumList#getLiterals <em>Literals</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.EnumList#getEnum <em>Enum</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.DynamicScreenDslPackage#getEnumList()
 * @model
 * @generated
 */
public interface EnumList extends Declaration
{
  /**
   * Returns the value of the '<em><b>Literals</b></em>' reference list.
   * The list contents are of type {@link nl.dslmeinte.xtext.examples.dataModelDsl.EnumLiteral}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Literals</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Literals</em>' reference list.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.DynamicScreenDslPackage#getEnumList_Literals()
   * @model
   * @generated
   */
  EList<EnumLiteral> getLiterals();

  /**
   * Returns the value of the '<em><b>Enum</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enum</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enum</em>' reference.
   * @see #setEnum(Enumeration)
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.DynamicScreenDslPackage#getEnumList_Enum()
   * @model
   * @generated
   */
  Enumeration getEnum();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.EnumList#getEnum <em>Enum</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Enum</em>' reference.
   * @see #getEnum()
   * @generated
   */
  void setEnum(Enumeration value);

} // EnumList
