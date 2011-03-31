/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl;

import nl.dslmeinte.xtext.examples.dynamicScreenDsl.BComparison;
import nl.dslmeinte.xtext.examples.dynamicScreenDsl.BLiteral;
import nl.dslmeinte.xtext.examples.dynamicScreenDsl.DynamicScreenDslPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BComparison</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.BComparisonImpl#getBLiteral <em>BLiteral</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BComparisonImpl extends AtomicReferringBExpressionImpl implements BComparison
{
  /**
   * The default value of the '{@link #getBLiteral() <em>BLiteral</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBLiteral()
   * @generated
   * @ordered
   */
  protected static final BLiteral BLITERAL_EDEFAULT = BLiteral.TRUE;

  /**
   * The cached value of the '{@link #getBLiteral() <em>BLiteral</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBLiteral()
   * @generated
   * @ordered
   */
  protected BLiteral bLiteral = BLITERAL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BComparisonImpl()
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
    return DynamicScreenDslPackage.Literals.BCOMPARISON;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BLiteral getBLiteral()
  {
    return bLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBLiteral(BLiteral newBLiteral)
  {
    BLiteral oldBLiteral = bLiteral;
    bLiteral = newBLiteral == null ? BLITERAL_EDEFAULT : newBLiteral;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DynamicScreenDslPackage.BCOMPARISON__BLITERAL, oldBLiteral, bLiteral));
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
      case DynamicScreenDslPackage.BCOMPARISON__BLITERAL:
        return getBLiteral();
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
      case DynamicScreenDslPackage.BCOMPARISON__BLITERAL:
        setBLiteral((BLiteral)newValue);
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
      case DynamicScreenDslPackage.BCOMPARISON__BLITERAL:
        setBLiteral(BLITERAL_EDEFAULT);
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
      case DynamicScreenDslPackage.BCOMPARISON__BLITERAL:
        return bLiteral != BLITERAL_EDEFAULT;
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
    result.append(" (bLiteral: ");
    result.append(bLiteral);
    result.append(')');
    return result.toString();
  }

} //BComparisonImpl
