/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.examples.dataModelDsl.impl;

import java.util.Collection;

import nl.dslmeinte.xtext.examples.dataModelDsl.DataModelDslPackage;
import nl.dslmeinte.xtext.examples.dataModelDsl.PrimitiveType;
import nl.dslmeinte.xtext.examples.dataModelDsl.PrimitiveTypes;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primitive Types</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.examples.dataModelDsl.impl.PrimitiveTypesImpl#getPrimitiveTypes <em>Primitive Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrimitiveTypesImpl extends MinimalEObjectImpl.Container implements PrimitiveTypes
{
  /**
   * The cached value of the '{@link #getPrimitiveTypes() <em>Primitive Types</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrimitiveTypes()
   * @generated
   * @ordered
   */
  protected EList<PrimitiveType> primitiveTypes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PrimitiveTypesImpl()
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
    return DataModelDslPackage.Literals.PRIMITIVE_TYPES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PrimitiveType> getPrimitiveTypes()
  {
    if (primitiveTypes == null)
    {
      primitiveTypes = new EObjectContainmentEList<PrimitiveType>(PrimitiveType.class, this, DataModelDslPackage.PRIMITIVE_TYPES__PRIMITIVE_TYPES);
    }
    return primitiveTypes;
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
      case DataModelDslPackage.PRIMITIVE_TYPES__PRIMITIVE_TYPES:
        return ((InternalEList<?>)getPrimitiveTypes()).basicRemove(otherEnd, msgs);
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
      case DataModelDslPackage.PRIMITIVE_TYPES__PRIMITIVE_TYPES:
        return getPrimitiveTypes();
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
      case DataModelDslPackage.PRIMITIVE_TYPES__PRIMITIVE_TYPES:
        getPrimitiveTypes().clear();
        getPrimitiveTypes().addAll((Collection<? extends PrimitiveType>)newValue);
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
      case DataModelDslPackage.PRIMITIVE_TYPES__PRIMITIVE_TYPES:
        getPrimitiveTypes().clear();
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
      case DataModelDslPackage.PRIMITIVE_TYPES__PRIMITIVE_TYPES:
        return primitiveTypes != null && !primitiveTypes.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //PrimitiveTypesImpl
