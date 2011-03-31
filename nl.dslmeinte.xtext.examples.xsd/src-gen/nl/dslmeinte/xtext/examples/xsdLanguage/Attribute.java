/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.examples.xsdLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.examples.xsdLanguage.Attribute#isRequired <em>Required</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.examples.xsdLanguage.Attribute#getTypeRef <em>Type Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.xtext.examples.xsdLanguage.XsdLanguagePackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends Property
{
  /**
   * Returns the value of the '<em><b>Required</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Required</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Required</em>' attribute.
   * @see #setRequired(boolean)
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.XsdLanguagePackage#getAttribute_Required()
   * @model
   * @generated
   */
  boolean isRequired();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.Attribute#isRequired <em>Required</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Required</em>' attribute.
   * @see #isRequired()
   * @generated
   */
  void setRequired(boolean value);

  /**
   * Returns the value of the '<em><b>Type Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Ref</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Ref</em>' containment reference.
   * @see #setTypeRef(NonComplexTypeReference)
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.XsdLanguagePackage#getAttribute_TypeRef()
   * @model containment="true"
   * @generated
   */
  NonComplexTypeReference getTypeRef();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.Attribute#getTypeRef <em>Type Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Ref</em>' containment reference.
   * @see #getTypeRef()
   * @generated
   */
  void setTypeRef(NonComplexTypeReference value);

} // Attribute
