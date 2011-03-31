/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.examples.wsdlLanguage.impl;

import nl.dslmeinte.xtext.examples.wsdlLanguage.Message;
import nl.dslmeinte.xtext.examples.wsdlLanguage.NotificationOperation;
import nl.dslmeinte.xtext.examples.wsdlLanguage.WsdlLanguagePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Notification Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.examples.wsdlLanguage.impl.NotificationOperationImpl#getOutput <em>Output</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NotificationOperationImpl extends OperationImpl implements NotificationOperation
{
  /**
   * The cached value of the '{@link #getOutput() <em>Output</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutput()
   * @generated
   * @ordered
   */
  protected Message output;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NotificationOperationImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return WsdlLanguagePackage.Literals.NOTIFICATION_OPERATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Message getOutput()
  {
    if (output != null && output.eIsProxy())
    {
      InternalEObject oldOutput = (InternalEObject)output;
      output = (Message)eResolveProxy(oldOutput);
      if (output != oldOutput)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, WsdlLanguagePackage.NOTIFICATION_OPERATION__OUTPUT, oldOutput, output));
      }
    }
    return output;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Message basicGetOutput()
  {
    return output;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOutput(Message newOutput)
  {
    Message oldOutput = output;
    output = newOutput;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WsdlLanguagePackage.NOTIFICATION_OPERATION__OUTPUT, oldOutput, output));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case WsdlLanguagePackage.NOTIFICATION_OPERATION__OUTPUT:
        if (resolve) return getOutput();
        return basicGetOutput();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case WsdlLanguagePackage.NOTIFICATION_OPERATION__OUTPUT:
        setOutput((Message)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case WsdlLanguagePackage.NOTIFICATION_OPERATION__OUTPUT:
        setOutput((Message)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case WsdlLanguagePackage.NOTIFICATION_OPERATION__OUTPUT:
        return output != null;
    }
    return super.eIsSet(featureID);
  }

} //NotificationOperationImpl
