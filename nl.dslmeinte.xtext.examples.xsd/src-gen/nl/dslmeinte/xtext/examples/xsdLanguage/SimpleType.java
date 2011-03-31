/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.examples.xsdLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.examples.xsdLanguage.SimpleType#getRestriction <em>Restriction</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.examples.xsdLanguage.SimpleType#getDocumentation <em>Documentation</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.xtext.examples.xsdLanguage.XsdLanguagePackage#getSimpleType()
 * @model
 * @generated
 */
public interface SimpleType extends EObject
{
  /**
   * Returns the value of the '<em><b>Restriction</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Restriction</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Restriction</em>' containment reference.
   * @see #setRestriction(Restriction)
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.XsdLanguagePackage#getSimpleType_Restriction()
   * @model containment="true"
   * @generated
   */
  Restriction getRestriction();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.SimpleType#getRestriction <em>Restriction</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Restriction</em>' containment reference.
   * @see #getRestriction()
   * @generated
   */
  void setRestriction(Restriction value);

  /**
   * Returns the value of the '<em><b>Documentation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Documentation</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Documentation</em>' containment reference.
   * @see #setDocumentation(Documentation)
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.XsdLanguagePackage#getSimpleType_Documentation()
   * @model containment="true"
   * @generated
   */
  Documentation getDocumentation();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.SimpleType#getDocumentation <em>Documentation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Documentation</em>' containment reference.
   * @see #getDocumentation()
   * @generated
   */
  void setDocumentation(Documentation value);

} // SimpleType
