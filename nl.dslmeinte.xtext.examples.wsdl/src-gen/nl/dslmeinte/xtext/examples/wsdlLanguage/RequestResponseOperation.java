/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.examples.wsdlLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Request Response Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.examples.wsdlLanguage.RequestResponseOperation#getInput <em>Input</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.examples.wsdlLanguage.RequestResponseOperation#getOutput <em>Output</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.xtext.examples.wsdlLanguage.WsdlLanguagePackage#getRequestResponseOperation()
 * @model
 * @generated
 */
public interface RequestResponseOperation extends Operation
{
  /**
   * Returns the value of the '<em><b>Input</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Input</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input</em>' reference.
   * @see #setInput(Message)
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.WsdlLanguagePackage#getRequestResponseOperation_Input()
   * @model
   * @generated
   */
  Message getInput();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.RequestResponseOperation#getInput <em>Input</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Input</em>' reference.
   * @see #getInput()
   * @generated
   */
  void setInput(Message value);

  /**
   * Returns the value of the '<em><b>Output</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Output</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Output</em>' reference.
   * @see #setOutput(Message)
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.WsdlLanguagePackage#getRequestResponseOperation_Output()
   * @model
   * @generated
   */
  Message getOutput();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.RequestResponseOperation#getOutput <em>Output</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Output</em>' reference.
   * @see #getOutput()
   * @generated
   */
  void setOutput(Message value);

} // RequestResponseOperation
