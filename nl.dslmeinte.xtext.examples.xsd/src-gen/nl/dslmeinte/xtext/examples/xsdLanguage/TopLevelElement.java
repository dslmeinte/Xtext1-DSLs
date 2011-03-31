/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.examples.xsdLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Top Level Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.examples.xsdLanguage.TopLevelElement#getTypeRef <em>Type Ref</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.examples.xsdLanguage.TopLevelElement#getEmbeddedTypeDef <em>Embedded Type Def</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.xtext.examples.xsdLanguage.XsdLanguagePackage#getTopLevelElement()
 * @model
 * @generated
 */
public interface TopLevelElement extends TopLevelDefinition
{
  /**
   * Returns the value of the '<em><b>Type Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Ref</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Ref</em>' containment reference.
   * @see #setTypeRef(NamedTypeReference)
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.XsdLanguagePackage#getTopLevelElement_TypeRef()
   * @model containment="true"
   * @generated
   */
  NamedTypeReference getTypeRef();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.TopLevelElement#getTypeRef <em>Type Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Ref</em>' containment reference.
   * @see #getTypeRef()
   * @generated
   */
  void setTypeRef(NamedTypeReference value);

  /**
   * Returns the value of the '<em><b>Embedded Type Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Embedded Type Def</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Embedded Type Def</em>' containment reference.
   * @see #setEmbeddedTypeDef(EmbeddedType)
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.XsdLanguagePackage#getTopLevelElement_EmbeddedTypeDef()
   * @model containment="true"
   * @generated
   */
  EmbeddedType getEmbeddedTypeDef();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.TopLevelElement#getEmbeddedTypeDef <em>Embedded Type Def</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Embedded Type Def</em>' containment reference.
   * @see #getEmbeddedTypeDef()
   * @generated
   */
  void setEmbeddedTypeDef(EmbeddedType value);

} // TopLevelElement
