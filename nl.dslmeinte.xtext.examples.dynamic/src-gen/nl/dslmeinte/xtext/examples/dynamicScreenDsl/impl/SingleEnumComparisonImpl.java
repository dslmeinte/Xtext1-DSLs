/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl;

import nl.dslmeinte.xtext.examples.dataModelDsl.EnumLiteral;

import nl.dslmeinte.xtext.examples.dynamicScreenDsl.DynamicScreenDslPackage;
import nl.dslmeinte.xtext.examples.dynamicScreenDsl.SingleEnumComparison;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Single Enum Comparison</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.SingleEnumComparisonImpl#getELiteral <em>ELiteral</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SingleEnumComparisonImpl extends EnumComparisonImpl implements SingleEnumComparison
{
  /**
   * The cached value of the '{@link #getELiteral() <em>ELiteral</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getELiteral()
   * @generated
   * @ordered
   */
  protected EnumLiteral eLiteral;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SingleEnumComparisonImpl()
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
    return DynamicScreenDslPackage.Literals.SINGLE_ENUM_COMPARISON;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumLiteral getELiteral()
  {
    if (eLiteral != null && eLiteral.eIsProxy())
    {
      InternalEObject oldELiteral = (InternalEObject)eLiteral;
      eLiteral = (EnumLiteral)eResolveProxy(oldELiteral);
      if (eLiteral != oldELiteral)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DynamicScreenDslPackage.SINGLE_ENUM_COMPARISON__ELITERAL, oldELiteral, eLiteral));
      }
    }
    return eLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumLiteral basicGetELiteral()
  {
    return eLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setELiteral(EnumLiteral newELiteral)
  {
    EnumLiteral oldELiteral = eLiteral;
    eLiteral = newELiteral;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DynamicScreenDslPackage.SINGLE_ENUM_COMPARISON__ELITERAL, oldELiteral, eLiteral));
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
      case DynamicScreenDslPackage.SINGLE_ENUM_COMPARISON__ELITERAL:
        if (resolve) return getELiteral();
        return basicGetELiteral();
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
      case DynamicScreenDslPackage.SINGLE_ENUM_COMPARISON__ELITERAL:
        setELiteral((EnumLiteral)newValue);
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
      case DynamicScreenDslPackage.SINGLE_ENUM_COMPARISON__ELITERAL:
        setELiteral((EnumLiteral)null);
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
      case DynamicScreenDslPackage.SINGLE_ENUM_COMPARISON__ELITERAL:
        return eLiteral != null;
    }
    return super.eIsSet(featureID);
  }

} //SingleEnumComparisonImpl
