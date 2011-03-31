/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.examples.xsdLanguage.impl;

import nl.dslmeinte.xtext.examples.xsdLanguage.BuiltinType;
import nl.dslmeinte.xtext.examples.xsdLanguage.BuiltinTypeReference;
import nl.dslmeinte.xtext.examples.xsdLanguage.XsdLanguagePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Builtin Type Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.examples.xsdLanguage.impl.BuiltinTypeReferenceImpl#getBuiltin <em>Builtin</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BuiltinTypeReferenceImpl extends NamedTypeReferenceImpl implements BuiltinTypeReference
{
  /**
   * The default value of the '{@link #getBuiltin() <em>Builtin</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBuiltin()
   * @generated
   * @ordered
   */
  protected static final BuiltinType BUILTIN_EDEFAULT = BuiltinType.DURATION;

  /**
   * The cached value of the '{@link #getBuiltin() <em>Builtin</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBuiltin()
   * @generated
   * @ordered
   */
  protected BuiltinType builtin = BUILTIN_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BuiltinTypeReferenceImpl()
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
    return XsdLanguagePackage.Literals.BUILTIN_TYPE_REFERENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BuiltinType getBuiltin()
  {
    return builtin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBuiltin(BuiltinType newBuiltin)
  {
    BuiltinType oldBuiltin = builtin;
    builtin = newBuiltin == null ? BUILTIN_EDEFAULT : newBuiltin;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XsdLanguagePackage.BUILTIN_TYPE_REFERENCE__BUILTIN, oldBuiltin, builtin));
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
      case XsdLanguagePackage.BUILTIN_TYPE_REFERENCE__BUILTIN:
        return getBuiltin();
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
      case XsdLanguagePackage.BUILTIN_TYPE_REFERENCE__BUILTIN:
        setBuiltin((BuiltinType)newValue);
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
      case XsdLanguagePackage.BUILTIN_TYPE_REFERENCE__BUILTIN:
        setBuiltin(BUILTIN_EDEFAULT);
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
      case XsdLanguagePackage.BUILTIN_TYPE_REFERENCE__BUILTIN:
        return builtin != BUILTIN_EDEFAULT;
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
    result.append(" (builtin: ");
    result.append(builtin);
    result.append(')');
    return result.toString();
  }

} //BuiltinTypeReferenceImpl
