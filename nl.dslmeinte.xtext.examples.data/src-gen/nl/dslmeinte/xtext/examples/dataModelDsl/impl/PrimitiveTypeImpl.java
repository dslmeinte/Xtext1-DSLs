/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.examples.dataModelDsl.impl;

import nl.dslmeinte.xtext.examples.dataModelDsl.DataModelDslPackage;
import nl.dslmeinte.xtext.examples.dataModelDsl.MetaPrimitiveType;
import nl.dslmeinte.xtext.examples.dataModelDsl.PrimitiveType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primitive Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.examples.dataModelDsl.impl.PrimitiveTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.examples.dataModelDsl.impl.PrimitiveTypeImpl#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.examples.dataModelDsl.impl.PrimitiveTypeImpl#getRealizationType <em>Realization Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrimitiveTypeImpl extends TypeImpl implements PrimitiveType
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getSuperType() <em>Super Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuperType()
   * @generated
   * @ordered
   */
  protected PrimitiveType superType;

  /**
   * The default value of the '{@link #getRealizationType() <em>Realization Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRealizationType()
   * @generated
   * @ordered
   */
  protected static final MetaPrimitiveType REALIZATION_TYPE_EDEFAULT = MetaPrimitiveType.STRING;

  /**
   * The cached value of the '{@link #getRealizationType() <em>Realization Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRealizationType()
   * @generated
   * @ordered
   */
  protected MetaPrimitiveType realizationType = REALIZATION_TYPE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PrimitiveTypeImpl()
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
    return DataModelDslPackage.Literals.PRIMITIVE_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataModelDslPackage.PRIMITIVE_TYPE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimitiveType getSuperType()
  {
    if (superType != null && superType.eIsProxy())
    {
      InternalEObject oldSuperType = (InternalEObject)superType;
      superType = (PrimitiveType)eResolveProxy(oldSuperType);
      if (superType != oldSuperType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataModelDslPackage.PRIMITIVE_TYPE__SUPER_TYPE, oldSuperType, superType));
      }
    }
    return superType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimitiveType basicGetSuperType()
  {
    return superType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSuperType(PrimitiveType newSuperType)
  {
    PrimitiveType oldSuperType = superType;
    superType = newSuperType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataModelDslPackage.PRIMITIVE_TYPE__SUPER_TYPE, oldSuperType, superType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MetaPrimitiveType getRealizationType()
  {
    return realizationType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRealizationType(MetaPrimitiveType newRealizationType)
  {
    MetaPrimitiveType oldRealizationType = realizationType;
    realizationType = newRealizationType == null ? REALIZATION_TYPE_EDEFAULT : newRealizationType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataModelDslPackage.PRIMITIVE_TYPE__REALIZATION_TYPE, oldRealizationType, realizationType));
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
      case DataModelDslPackage.PRIMITIVE_TYPE__NAME:
        return getName();
      case DataModelDslPackage.PRIMITIVE_TYPE__SUPER_TYPE:
        if (resolve) return getSuperType();
        return basicGetSuperType();
      case DataModelDslPackage.PRIMITIVE_TYPE__REALIZATION_TYPE:
        return getRealizationType();
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
      case DataModelDslPackage.PRIMITIVE_TYPE__NAME:
        setName((String)newValue);
        return;
      case DataModelDslPackage.PRIMITIVE_TYPE__SUPER_TYPE:
        setSuperType((PrimitiveType)newValue);
        return;
      case DataModelDslPackage.PRIMITIVE_TYPE__REALIZATION_TYPE:
        setRealizationType((MetaPrimitiveType)newValue);
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
      case DataModelDslPackage.PRIMITIVE_TYPE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DataModelDslPackage.PRIMITIVE_TYPE__SUPER_TYPE:
        setSuperType((PrimitiveType)null);
        return;
      case DataModelDslPackage.PRIMITIVE_TYPE__REALIZATION_TYPE:
        setRealizationType(REALIZATION_TYPE_EDEFAULT);
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
      case DataModelDslPackage.PRIMITIVE_TYPE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DataModelDslPackage.PRIMITIVE_TYPE__SUPER_TYPE:
        return superType != null;
      case DataModelDslPackage.PRIMITIVE_TYPE__REALIZATION_TYPE:
        return realizationType != REALIZATION_TYPE_EDEFAULT;
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
    result.append(" (name: ");
    result.append(name);
    result.append(", realizationType: ");
    result.append(realizationType);
    result.append(')');
    return result.toString();
  }

} //PrimitiveTypeImpl
