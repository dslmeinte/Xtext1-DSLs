/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl;

import java.util.Collection;

import nl.dslmeinte.xtext.examples.dataModelDsl.EnumLiteral;
import nl.dslmeinte.xtext.examples.dataModelDsl.Enumeration;

import nl.dslmeinte.xtext.examples.dynamicScreenDsl.DynamicScreenDslPackage;
import nl.dslmeinte.xtext.examples.dynamicScreenDsl.EnumList;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enum List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.EnumListImpl#getLiterals <em>Literals</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.EnumListImpl#getEnum <em>Enum</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnumListImpl extends DeclarationImpl implements EnumList
{
  /**
   * The cached value of the '{@link #getLiterals() <em>Literals</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLiterals()
   * @generated
   * @ordered
   */
  protected EList<EnumLiteral> literals;

  /**
   * The cached value of the '{@link #getEnum() <em>Enum</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnum()
   * @generated
   * @ordered
   */
  protected Enumeration enum_;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EnumListImpl()
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
    return DynamicScreenDslPackage.Literals.ENUM_LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EnumLiteral> getLiterals()
  {
    if (literals == null)
    {
      literals = new EObjectResolvingEList<EnumLiteral>(EnumLiteral.class, this, DynamicScreenDslPackage.ENUM_LIST__LITERALS);
    }
    return literals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Enumeration getEnum()
  {
    if (enum_ != null && enum_.eIsProxy())
    {
      InternalEObject oldEnum = (InternalEObject)enum_;
      enum_ = (Enumeration)eResolveProxy(oldEnum);
      if (enum_ != oldEnum)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DynamicScreenDslPackage.ENUM_LIST__ENUM, oldEnum, enum_));
      }
    }
    return enum_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Enumeration basicGetEnum()
  {
    return enum_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnum(Enumeration newEnum)
  {
    Enumeration oldEnum = enum_;
    enum_ = newEnum;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DynamicScreenDslPackage.ENUM_LIST__ENUM, oldEnum, enum_));
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
      case DynamicScreenDslPackage.ENUM_LIST__LITERALS:
        return getLiterals();
      case DynamicScreenDslPackage.ENUM_LIST__ENUM:
        if (resolve) return getEnum();
        return basicGetEnum();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DynamicScreenDslPackage.ENUM_LIST__LITERALS:
        getLiterals().clear();
        getLiterals().addAll((Collection<? extends EnumLiteral>)newValue);
        return;
      case DynamicScreenDslPackage.ENUM_LIST__ENUM:
        setEnum((Enumeration)newValue);
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
      case DynamicScreenDslPackage.ENUM_LIST__LITERALS:
        getLiterals().clear();
        return;
      case DynamicScreenDslPackage.ENUM_LIST__ENUM:
        setEnum((Enumeration)null);
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
      case DynamicScreenDslPackage.ENUM_LIST__LITERALS:
        return literals != null && !literals.isEmpty();
      case DynamicScreenDslPackage.ENUM_LIST__ENUM:
        return enum_ != null;
    }
    return super.eIsSet(featureID);
  }

} //EnumListImpl
