/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.examples.xsdLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Range Facet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.examples.xsdLanguage.RangeFacet#getLower <em>Lower</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.examples.xsdLanguage.RangeFacet#getUpper <em>Upper</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.xtext.examples.xsdLanguage.XsdLanguagePackage#getRangeFacet()
 * @model
 * @generated
 */
public interface RangeFacet extends Facet
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
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.XsdLanguagePackage#getRangeFacet_Lower()
   * @model
   * @generated
   */
  int getLower();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.RangeFacet#getLower <em>Lower</em>}' attribute.
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
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.XsdLanguagePackage#getRangeFacet_Upper()
   * @model
   * @generated
   */
  int getUpper();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.RangeFacet#getUpper <em>Upper</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Upper</em>' attribute.
   * @see #getUpper()
   * @generated
   */
  void setUpper(int value);

} // RangeFacet
