/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.examples.dynamicScreenDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Enum Comparison</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.MultiEnumComparison#getMembership <em>Membership</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.MultiEnumComparison#getELiterals <em>ELiterals</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.DynamicScreenDslPackage#getMultiEnumComparison()
 * @model
 * @generated
 */
public interface MultiEnumComparison extends EnumComparison
{
  /**
   * Returns the value of the '<em><b>Membership</b></em>' attribute.
   * The literals are from the enumeration {@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.EnumMembership}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Membership</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Membership</em>' attribute.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.EnumMembership
   * @see #setMembership(EnumMembership)
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.DynamicScreenDslPackage#getMultiEnumComparison_Membership()
   * @model
   * @generated
   */
  EnumMembership getMembership();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.MultiEnumComparison#getMembership <em>Membership</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Membership</em>' attribute.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.EnumMembership
   * @see #getMembership()
   * @generated
   */
  void setMembership(EnumMembership value);

  /**
   * Returns the value of the '<em><b>ELiterals</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>ELiterals</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>ELiterals</em>' containment reference.
   * @see #setELiterals(EnumLiteralsCollection)
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.DynamicScreenDslPackage#getMultiEnumComparison_ELiterals()
   * @model containment="true"
   * @generated
   */
  EnumLiteralsCollection getELiterals();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.MultiEnumComparison#getELiterals <em>ELiterals</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>ELiterals</em>' containment reference.
   * @see #getELiterals()
   * @generated
   */
  void setELiterals(EnumLiteralsCollection value);

} // MultiEnumComparison
