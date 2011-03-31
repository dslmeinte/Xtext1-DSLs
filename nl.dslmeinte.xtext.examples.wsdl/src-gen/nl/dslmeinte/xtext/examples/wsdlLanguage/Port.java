/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.examples.wsdlLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.examples.wsdlLanguage.Port#getName <em>Name</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.examples.wsdlLanguage.Port#getBinding <em>Binding</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.examples.wsdlLanguage.Port#getLocation <em>Location</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.xtext.examples.wsdlLanguage.WsdlLanguagePackage#getPort()
 * @model
 * @generated
 */
public interface Port extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.WsdlLanguagePackage#getPort_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.Port#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Binding</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Binding</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Binding</em>' reference.
   * @see #setBinding(Binding)
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.WsdlLanguagePackage#getPort_Binding()
   * @model
   * @generated
   */
  Binding getBinding();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.Port#getBinding <em>Binding</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Binding</em>' reference.
   * @see #getBinding()
   * @generated
   */
  void setBinding(Binding value);

  /**
   * Returns the value of the '<em><b>Location</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Location</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Location</em>' attribute.
   * @see #setLocation(String)
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.WsdlLanguagePackage#getPort_Location()
   * @model
   * @generated
   */
  String getLocation();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.Port#getLocation <em>Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Location</em>' attribute.
   * @see #getLocation()
   * @generated
   */
  void setLocation(String value);

} // Port
