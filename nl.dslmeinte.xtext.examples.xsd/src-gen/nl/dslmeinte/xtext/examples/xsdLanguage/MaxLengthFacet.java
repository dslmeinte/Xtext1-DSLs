/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.examples.xsdLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Max Length Facet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.examples.xsdLanguage.MaxLengthFacet#getMaxLength <em>Max Length</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.xtext.examples.xsdLanguage.XsdLanguagePackage#getMaxLengthFacet()
 * @model
 * @generated
 */
public interface MaxLengthFacet extends Facet
{
  /**
   * Returns the value of the '<em><b>Max Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Max Length</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Max Length</em>' attribute.
   * @see #setMaxLength(int)
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.XsdLanguagePackage#getMaxLengthFacet_MaxLength()
   * @model
   * @generated
   */
  int getMaxLength();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.MaxLengthFacet#getMaxLength <em>Max Length</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Max Length</em>' attribute.
   * @see #getMaxLength()
   * @generated
   */
  void setMaxLength(int value);

} // MaxLengthFacet
