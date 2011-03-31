/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.examples.dataModelDsl.impl;

import java.util.Collection;

import nl.dslmeinte.xtext.examples.dataModelDsl.CompoundType;
import nl.dslmeinte.xtext.examples.dataModelDsl.DataModel;
import nl.dslmeinte.xtext.examples.dataModelDsl.DataModelDslPackage;
import nl.dslmeinte.xtext.examples.dataModelDsl.PrimitiveTypes;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.examples.dataModelDsl.impl.DataModelImpl#getPrimitives <em>Primitives</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.examples.dataModelDsl.impl.DataModelImpl#getCompoundTypes <em>Compound Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataModelImpl extends MinimalEObjectImpl.Container implements DataModel
{
  /**
   * The cached value of the '{@link #getPrimitives() <em>Primitives</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrimitives()
   * @generated
   * @ordered
   */
  protected PrimitiveTypes primitives;

  /**
   * The cached value of the '{@link #getCompoundTypes() <em>Compound Types</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCompoundTypes()
   * @generated
   * @ordered
   */
  protected EList<CompoundType> compoundTypes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DataModelImpl()
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
    return DataModelDslPackage.Literals.DATA_MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimitiveTypes getPrimitives()
  {
    return primitives;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPrimitives(PrimitiveTypes newPrimitives, NotificationChain msgs)
  {
    PrimitiveTypes oldPrimitives = primitives;
    primitives = newPrimitives;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataModelDslPackage.DATA_MODEL__PRIMITIVES, oldPrimitives, newPrimitives);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrimitives(PrimitiveTypes newPrimitives)
  {
    if (newPrimitives != primitives)
    {
      NotificationChain msgs = null;
      if (primitives != null)
        msgs = ((InternalEObject)primitives).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataModelDslPackage.DATA_MODEL__PRIMITIVES, null, msgs);
      if (newPrimitives != null)
        msgs = ((InternalEObject)newPrimitives).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataModelDslPackage.DATA_MODEL__PRIMITIVES, null, msgs);
      msgs = basicSetPrimitives(newPrimitives, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataModelDslPackage.DATA_MODEL__PRIMITIVES, newPrimitives, newPrimitives));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CompoundType> getCompoundTypes()
  {
    if (compoundTypes == null)
    {
      compoundTypes = new EObjectContainmentEList<CompoundType>(CompoundType.class, this, DataModelDslPackage.DATA_MODEL__COMPOUND_TYPES);
    }
    return compoundTypes;
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
      case DataModelDslPackage.DATA_MODEL__PRIMITIVES:
        return basicSetPrimitives(null, msgs);
      case DataModelDslPackage.DATA_MODEL__COMPOUND_TYPES:
        return ((InternalEList<?>)getCompoundTypes()).basicRemove(otherEnd, msgs);
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
      case DataModelDslPackage.DATA_MODEL__PRIMITIVES:
        return getPrimitives();
      case DataModelDslPackage.DATA_MODEL__COMPOUND_TYPES:
        return getCompoundTypes();
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
      case DataModelDslPackage.DATA_MODEL__PRIMITIVES:
        setPrimitives((PrimitiveTypes)newValue);
        return;
      case DataModelDslPackage.DATA_MODEL__COMPOUND_TYPES:
        getCompoundTypes().clear();
        getCompoundTypes().addAll((Collection<? extends CompoundType>)newValue);
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
      case DataModelDslPackage.DATA_MODEL__PRIMITIVES:
        setPrimitives((PrimitiveTypes)null);
        return;
      case DataModelDslPackage.DATA_MODEL__COMPOUND_TYPES:
        getCompoundTypes().clear();
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
      case DataModelDslPackage.DATA_MODEL__PRIMITIVES:
        return primitives != null;
      case DataModelDslPackage.DATA_MODEL__COMPOUND_TYPES:
        return compoundTypes != null && !compoundTypes.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //DataModelImpl
