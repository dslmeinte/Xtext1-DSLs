/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl;

import nl.dslmeinte.xtext.examples.dynamicScreenDsl.DynamicScreenDslPackage;
import nl.dslmeinte.xtext.examples.dynamicScreenDsl.EnumLiteralsCollection;
import nl.dslmeinte.xtext.examples.dynamicScreenDsl.EnumMembership;
import nl.dslmeinte.xtext.examples.dynamicScreenDsl.MultiEnumComparison;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multi Enum Comparison</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.MultiEnumComparisonImpl#getMembership <em>Membership</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.MultiEnumComparisonImpl#getELiterals <em>ELiterals</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MultiEnumComparisonImpl extends EnumComparisonImpl implements MultiEnumComparison
{
  /**
   * The default value of the '{@link #getMembership() <em>Membership</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMembership()
   * @generated
   * @ordered
   */
  protected static final EnumMembership MEMBERSHIP_EDEFAULT = EnumMembership.IS_IN;

  /**
   * The cached value of the '{@link #getMembership() <em>Membership</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMembership()
   * @generated
   * @ordered
   */
  protected EnumMembership membership = MEMBERSHIP_EDEFAULT;

  /**
   * The cached value of the '{@link #getELiterals() <em>ELiterals</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getELiterals()
   * @generated
   * @ordered
   */
  protected EnumLiteralsCollection eLiterals;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MultiEnumComparisonImpl()
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
    return DynamicScreenDslPackage.Literals.MULTI_ENUM_COMPARISON;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumMembership getMembership()
  {
    return membership;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMembership(EnumMembership newMembership)
  {
    EnumMembership oldMembership = membership;
    membership = newMembership == null ? MEMBERSHIP_EDEFAULT : newMembership;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DynamicScreenDslPackage.MULTI_ENUM_COMPARISON__MEMBERSHIP, oldMembership, membership));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumLiteralsCollection getELiterals()
  {
    return eLiterals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetELiterals(EnumLiteralsCollection newELiterals, NotificationChain msgs)
  {
    EnumLiteralsCollection oldELiterals = eLiterals;
    eLiterals = newELiterals;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DynamicScreenDslPackage.MULTI_ENUM_COMPARISON__ELITERALS, oldELiterals, newELiterals);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setELiterals(EnumLiteralsCollection newELiterals)
  {
    if (newELiterals != eLiterals)
    {
      NotificationChain msgs = null;
      if (eLiterals != null)
        msgs = ((InternalEObject)eLiterals).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DynamicScreenDslPackage.MULTI_ENUM_COMPARISON__ELITERALS, null, msgs);
      if (newELiterals != null)
        msgs = ((InternalEObject)newELiterals).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DynamicScreenDslPackage.MULTI_ENUM_COMPARISON__ELITERALS, null, msgs);
      msgs = basicSetELiterals(newELiterals, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DynamicScreenDslPackage.MULTI_ENUM_COMPARISON__ELITERALS, newELiterals, newELiterals));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DynamicScreenDslPackage.MULTI_ENUM_COMPARISON__ELITERALS:
        return basicSetELiterals(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case DynamicScreenDslPackage.MULTI_ENUM_COMPARISON__MEMBERSHIP:
        return getMembership();
      case DynamicScreenDslPackage.MULTI_ENUM_COMPARISON__ELITERALS:
        return getELiterals();
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
      case DynamicScreenDslPackage.MULTI_ENUM_COMPARISON__MEMBERSHIP:
        setMembership((EnumMembership)newValue);
        return;
      case DynamicScreenDslPackage.MULTI_ENUM_COMPARISON__ELITERALS:
        setELiterals((EnumLiteralsCollection)newValue);
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
      case DynamicScreenDslPackage.MULTI_ENUM_COMPARISON__MEMBERSHIP:
        setMembership(MEMBERSHIP_EDEFAULT);
        return;
      case DynamicScreenDslPackage.MULTI_ENUM_COMPARISON__ELITERALS:
        setELiterals((EnumLiteralsCollection)null);
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
      case DynamicScreenDslPackage.MULTI_ENUM_COMPARISON__MEMBERSHIP:
        return membership != MEMBERSHIP_EDEFAULT;
      case DynamicScreenDslPackage.MULTI_ENUM_COMPARISON__ELITERALS:
        return eLiterals != null;
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
    result.append(" (membership: ");
    result.append(membership);
    result.append(')');
    return result.toString();
  }

} //MultiEnumComparisonImpl
