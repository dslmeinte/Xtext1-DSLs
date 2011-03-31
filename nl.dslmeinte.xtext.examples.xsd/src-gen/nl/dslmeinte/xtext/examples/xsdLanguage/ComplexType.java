/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.examples.xsdLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.examples.xsdLanguage.ComplexType#getExtends <em>Extends</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.examples.xsdLanguage.ComplexType#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.xtext.examples.xsdLanguage.XsdLanguagePackage#getComplexType()
 * @model
 * @generated
 */
public interface ComplexType extends EObject
{
  /**
   * Returns the value of the '<em><b>Extends</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Extends</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extends</em>' containment reference.
   * @see #setExtends(TopLevelComplexTypeReference)
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.XsdLanguagePackage#getComplexType_Extends()
   * @model containment="true"
   * @generated
   */
  TopLevelComplexTypeReference getExtends();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.ComplexType#getExtends <em>Extends</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Extends</em>' containment reference.
   * @see #getExtends()
   * @generated
   */
  void setExtends(TopLevelComplexTypeReference value);

  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link nl.dslmeinte.xtext.examples.xsdLanguage.Property}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.XsdLanguagePackage#getComplexType_Properties()
   * @model containment="true"
   * @generated
   */
  EList<Property> getProperties();

} // ComplexType
