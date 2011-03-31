/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.examples.xsdLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Top Level Complex Type Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.examples.xsdLanguage.TopLevelComplexTypeReference#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.xtext.examples.xsdLanguage.XsdLanguagePackage#getTopLevelComplexTypeReference()
 * @model
 * @generated
 */
public interface TopLevelComplexTypeReference extends EObject
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
   * @see #setRef(TopLevelComplexType)
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.XsdLanguagePackage#getTopLevelComplexTypeReference_Ref()
   * @model
   * @generated
   */
  TopLevelComplexType getRef();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.TopLevelComplexTypeReference#getRef <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' reference.
   * @see #getRef()
   * @generated
   */
  void setRef(TopLevelComplexType value);

} // TopLevelComplexTypeReference
