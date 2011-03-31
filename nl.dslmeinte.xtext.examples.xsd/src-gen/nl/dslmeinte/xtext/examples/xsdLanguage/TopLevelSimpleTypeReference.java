/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.examples.xsdLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Top Level Simple Type Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.examples.xsdLanguage.TopLevelSimpleTypeReference#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.xtext.examples.xsdLanguage.XsdLanguagePackage#getTopLevelSimpleTypeReference()
 * @model
 * @generated
 */
public interface TopLevelSimpleTypeReference extends NonComplexTypeReference
{
  /**
   * Returns the value of the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' reference.
   * @see #setRef(TopLevelSimpleType)
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.XsdLanguagePackage#getTopLevelSimpleTypeReference_Ref()
   * @model
   * @generated
   */
  TopLevelSimpleType getRef();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.TopLevelSimpleTypeReference#getRef <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' reference.
   * @see #getRef()
   * @generated
   */
  void setRef(TopLevelSimpleType value);

} // TopLevelSimpleTypeReference
