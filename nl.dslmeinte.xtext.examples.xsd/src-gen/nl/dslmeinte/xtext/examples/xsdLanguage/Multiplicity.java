/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.examples.xsdLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiplicity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.examples.xsdLanguage.Multiplicity#getLower <em>Lower</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.examples.xsdLanguage.Multiplicity#getUpper <em>Upper</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.examples.xsdLanguage.Multiplicity#isUnbounded <em>Unbounded</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.xtext.examples.xsdLanguage.XsdLanguagePackage#getMultiplicity()
 * @model
 * @generated
 */
public interface Multiplicity extends EObject
{
  /**
   * Returns the value of the '<em><b>Lower</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lower</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lower</em>' attribute.
   * @see #setLower(int)
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.XsdLanguagePackage#getMultiplicity_Lower()
   * @model
   * @generated
   */
  int getLower();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.Multiplicity#getLower <em>Lower</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lower</em>' attribute.
   * @see #getLower()
   * @generated
   */
  void setLower(int value);

  /**
   * Returns the value of the '<em><b>Upper</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Upper</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Upper</em>' attribute.
   * @see #setUpper(int)
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.XsdLanguagePackage#getMultiplicity_Upper()
   * @model
   * @generated
   */
  int getUpper();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.Multiplicity#getUpper <em>Upper</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Upper</em>' attribute.
   * @see #getUpper()
   * @generated
   */
  void setUpper(int value);

  /**
   * Returns the value of the '<em><b>Unbounded</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unbounded</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unbounded</em>' attribute.
   * @see #setUnbounded(boolean)
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.XsdLanguagePackage#getMultiplicity_Unbounded()
   * @model
   * @generated
   */
  boolean isUnbounded();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.Multiplicity#isUnbounded <em>Unbounded</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unbounded</em>' attribute.
   * @see #isUnbounded()
   * @generated
   */
  void setUnbounded(boolean value);

} // Multiplicity
