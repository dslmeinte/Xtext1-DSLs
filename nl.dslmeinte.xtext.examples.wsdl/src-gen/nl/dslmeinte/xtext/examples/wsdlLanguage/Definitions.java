/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.examples.wsdlLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definitions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.examples.wsdlLanguage.Definitions#getName <em>Name</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.examples.wsdlLanguage.Definitions#getNsUri <em>Ns Uri</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.examples.wsdlLanguage.Definitions#getXsdImport <em>Xsd Import</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.examples.wsdlLanguage.Definitions#getMessages <em>Messages</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.examples.wsdlLanguage.Definitions#getPortTypes <em>Port Types</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.examples.wsdlLanguage.Definitions#getBindings <em>Bindings</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.examples.wsdlLanguage.Definitions#getServices <em>Services</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.xtext.examples.wsdlLanguage.WsdlLanguagePackage#getDefinitions()
 * @model
 * @generated
 */
public interface Definitions extends EObject
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
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.WsdlLanguagePackage#getDefinitions_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.Definitions#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Ns Uri</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ns Uri</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ns Uri</em>' attribute.
   * @see #setNsUri(String)
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.WsdlLanguagePackage#getDefinitions_NsUri()
   * @model
   * @generated
   */
  String getNsUri();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.Definitions#getNsUri <em>Ns Uri</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ns Uri</em>' attribute.
   * @see #getNsUri()
   * @generated
   */
  void setNsUri(String value);

  /**
   * Returns the value of the '<em><b>Xsd Import</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Xsd Import</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Xsd Import</em>' containment reference.
   * @see #setXsdImport(XsdImport)
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.WsdlLanguagePackage#getDefinitions_XsdImport()
   * @model containment="true"
   * @generated
   */
  XsdImport getXsdImport();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.Definitions#getXsdImport <em>Xsd Import</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Xsd Import</em>' containment reference.
   * @see #getXsdImport()
   * @generated
   */
  void setXsdImport(XsdImport value);

  /**
   * Returns the value of the '<em><b>Messages</b></em>' containment reference list.
   * The list contents are of type {@link nl.dslmeinte.xtext.examples.wsdlLanguage.Message}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Messages</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Messages</em>' containment reference list.
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.WsdlLanguagePackage#getDefinitions_Messages()
   * @model containment="true"
   * @generated
   */
  EList<Message> getMessages();

  /**
   * Returns the value of the '<em><b>Port Types</b></em>' containment reference list.
   * The list contents are of type {@link nl.dslmeinte.xtext.examples.wsdlLanguage.PortType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Port Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Port Types</em>' containment reference list.
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.WsdlLanguagePackage#getDefinitions_PortTypes()
   * @model containment="true"
   * @generated
   */
  EList<PortType> getPortTypes();

  /**
   * Returns the value of the '<em><b>Bindings</b></em>' containment reference list.
   * The list contents are of type {@link nl.dslmeinte.xtext.examples.wsdlLanguage.Binding}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bindings</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bindings</em>' containment reference list.
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.WsdlLanguagePackage#getDefinitions_Bindings()
   * @model containment="true"
   * @generated
   */
  EList<Binding> getBindings();

  /**
   * Returns the value of the '<em><b>Services</b></em>' containment reference list.
   * The list contents are of type {@link nl.dslmeinte.xtext.examples.wsdlLanguage.Service}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Services</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Services</em>' containment reference list.
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.WsdlLanguagePackage#getDefinitions_Services()
   * @model containment="true"
   * @generated
   */
  EList<Service> getServices();

} // Definitions
