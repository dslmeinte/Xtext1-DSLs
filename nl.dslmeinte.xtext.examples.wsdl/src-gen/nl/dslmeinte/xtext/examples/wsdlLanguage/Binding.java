/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.examples.wsdlLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.examples.wsdlLanguage.Binding#getName <em>Name</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.examples.wsdlLanguage.Binding#getType <em>Type</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.examples.wsdlLanguage.Binding#getTransport <em>Transport</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.xtext.examples.wsdlLanguage.WsdlLanguagePackage#getBinding()
 * @model
 * @generated
 */
public interface Binding extends EObject
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
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.WsdlLanguagePackage#getBinding_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.Binding#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(PortType)
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.WsdlLanguagePackage#getBinding_Type()
   * @model
   * @generated
   */
  PortType getType();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.Binding#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(PortType value);

  /**
   * Returns the value of the '<em><b>Transport</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Transport</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transport</em>' containment reference.
   * @see #setTransport(Transport)
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.WsdlLanguagePackage#getBinding_Transport()
   * @model containment="true"
   * @generated
   */
  Transport getTransport();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.Binding#getTransport <em>Transport</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Transport</em>' containment reference.
   * @see #getTransport()
   * @generated
   */
  void setTransport(Transport value);

} // Binding
