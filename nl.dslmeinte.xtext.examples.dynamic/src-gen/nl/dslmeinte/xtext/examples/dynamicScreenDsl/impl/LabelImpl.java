/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl;

import nl.dslmeinte.xtext.examples.dynamicScreenDsl.DynamicScreenDslPackage;
import nl.dslmeinte.xtext.examples.dynamicScreenDsl.Label;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Label</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.LabelImpl#getEn <em>En</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.LabelImpl#getNl <em>Nl</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LabelImpl extends MinimalEObjectImpl.Container implements Label
{
  /**
   * The default value of the '{@link #getEn() <em>En</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEn()
   * @generated
   * @ordered
   */
  protected static final String EN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEn() <em>En</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEn()
   * @generated
   * @ordered
   */
  protected String en = EN_EDEFAULT;

  /**
   * The default value of the '{@link #getNl() <em>Nl</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNl()
   * @generated
   * @ordered
   */
  protected static final String NL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNl() <em>Nl</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNl()
   * @generated
   * @ordered
   */
  protected String nl = NL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LabelImpl()
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
    return DynamicScreenDslPackage.Literals.LABEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEn()
  {
    return en;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEn(String newEn)
  {
    String oldEn = en;
    en = newEn;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DynamicScreenDslPackage.LABEL__EN, oldEn, en));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNl()
  {
    return nl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNl(String newNl)
  {
    String oldNl = nl;
    nl = newNl;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DynamicScreenDslPackage.LABEL__NL, oldNl, nl));
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
      case DynamicScreenDslPackage.LABEL__EN:
        return getEn();
      case DynamicScreenDslPackage.LABEL__NL:
        return getNl();
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
      case DynamicScreenDslPackage.LABEL__EN:
        setEn((String)newValue);
        return;
      case DynamicScreenDslPackage.LABEL__NL:
        setNl((String)newValue);
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
      case DynamicScreenDslPackage.LABEL__EN:
        setEn(EN_EDEFAULT);
        return;
      case DynamicScreenDslPackage.LABEL__NL:
        setNl(NL_EDEFAULT);
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
      case DynamicScreenDslPackage.LABEL__EN:
        return EN_EDEFAULT == null ? en != null : !EN_EDEFAULT.equals(en);
      case DynamicScreenDslPackage.LABEL__NL:
        return NL_EDEFAULT == null ? nl != null : !NL_EDEFAULT.equals(nl);
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
    result.append(" (en: ");
    result.append(en);
    result.append(", nl: ");
    result.append(nl);
    result.append(')');
    return result.toString();
  }

} //LabelImpl
