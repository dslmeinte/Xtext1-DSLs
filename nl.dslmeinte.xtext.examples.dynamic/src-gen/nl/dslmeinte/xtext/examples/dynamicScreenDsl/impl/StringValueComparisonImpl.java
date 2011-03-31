/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl;

import nl.dslmeinte.xtext.examples.dynamicScreenDsl.DynamicScreenDslPackage;
import nl.dslmeinte.xtext.examples.dynamicScreenDsl.StringValueComparison;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Value Comparison</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.StringValueComparisonImpl#getTargetValue <em>Target Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StringValueComparisonImpl extends AtomicReferringBExpressionImpl implements StringValueComparison
{
  /**
   * The default value of the '{@link #getTargetValue() <em>Target Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetValue()
   * @generated
   * @ordered
   */
  protected static final String TARGET_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTargetValue() <em>Target Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetValue()
   * @generated
   * @ordered
   */
  protected String targetValue = TARGET_VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StringValueComparisonImpl()
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
    return DynamicScreenDslPackage.Literals.STRING_VALUE_COMPARISON;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTargetValue()
  {
    return targetValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTargetValue(String newTargetValue)
  {
    String oldTargetValue = targetValue;
    targetValue = newTargetValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DynamicScreenDslPackage.STRING_VALUE_COMPARISON__TARGET_VALUE, oldTargetValue, targetValue));
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
      case DynamicScreenDslPackage.STRING_VALUE_COMPARISON__TARGET_VALUE:
        return getTargetValue();
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
      case DynamicScreenDslPackage.STRING_VALUE_COMPARISON__TARGET_VALUE:
        setTargetValue((String)newValue);
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
      case DynamicScreenDslPackage.STRING_VALUE_COMPARISON__TARGET_VALUE:
        setTargetValue(TARGET_VALUE_EDEFAULT);
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
      case DynamicScreenDslPackage.STRING_VALUE_COMPARISON__TARGET_VALUE:
        return TARGET_VALUE_EDEFAULT == null ? targetValue != null : !TARGET_VALUE_EDEFAULT.equals(targetValue);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (targetValue: ");
    result.append(targetValue);
    result.append(')');
    return result.toString();
  }

} //StringValueComparisonImpl
