/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.examples.dynamicScreenDsl;

import nl.dslmeinte.xtext.examples.dataModelDsl.EnumLiteral;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Enum Comparison</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.SingleEnumComparison#getELiteral <em>ELiteral</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.DynamicScreenDslPackage#getSingleEnumComparison()
 * @model
 * @generated
 */
public interface SingleEnumComparison extends EnumComparison
{
  /**
   * Returns the value of the '<em><b>ELiteral</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>ELiteral</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>ELiteral</em>' reference.
   * @see #setELiteral(EnumLiteral)
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.DynamicScreenDslPackage#getSingleEnumComparison_ELiteral()
   * @model
   * @generated
   */
  EnumLiteral getELiteral();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.SingleEnumComparison#getELiteral <em>ELiteral</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>ELiteral</em>' reference.
   * @see #getELiteral()
   * @generated
   */
  void setELiteral(EnumLiteral value);

} // SingleEnumComparison
