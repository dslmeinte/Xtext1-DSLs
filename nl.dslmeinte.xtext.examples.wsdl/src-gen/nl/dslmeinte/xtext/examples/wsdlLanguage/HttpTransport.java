/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.examples.wsdlLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Http Transport</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.examples.wsdlLanguage.HttpTransport#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.xtext.examples.wsdlLanguage.WsdlLanguagePackage#getHttpTransport()
 * @model
 * @generated
 */
public interface HttpTransport extends Transport
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link nl.dslmeinte.xtext.examples.wsdlLanguage.HttpType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.HttpType
   * @see #setType(HttpType)
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.WsdlLanguagePackage#getHttpTransport_Type()
   * @model
   * @generated
   */
  HttpType getType();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.HttpTransport#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.HttpType
   * @see #getType()
   * @generated
   */
  void setType(HttpType value);

} // HttpTransport
