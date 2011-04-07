/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.examples.dataModelDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.examples.dataModelDsl.Enumeration#getName <em>Name</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.examples.dataModelDsl.Enumeration#getLiterals <em>Literals</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.xtext.examples.dataModelDsl.DataModelDslPackage#getEnumeration()
 * @model
 * @generated
 */
public interface Enumeration extends CompoundType, SimpleType
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.DataModelDslPackage#getEnumeration_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.examples.dataModelDsl.Enumeration#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Literals</b></em>' containment reference list.
   * The list contents are of type {@link nl.dslmeinte.xtext.examples.dataModelDsl.EnumLiteral}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Literals</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Literals</em>' containment reference list.
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.DataModelDslPackage#getEnumeration_Literals()
   * @model containment="true"
   * @generated
   */
  EList<EnumLiteral> getLiterals();

} // Enumeration
