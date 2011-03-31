/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl;

import java.util.Collection;

import nl.dslmeinte.xtext.examples.dynamicScreenDsl.DynamicScreenDslPackage;
import nl.dslmeinte.xtext.examples.dynamicScreenDsl.FieldGroup;
import nl.dslmeinte.xtext.examples.dynamicScreenDsl.GroupElement;
import nl.dslmeinte.xtext.examples.dynamicScreenDsl.PathTail;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.FieldGroupImpl#getWith <em>With</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.FieldGroupImpl#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FieldGroupImpl extends GroupElementImpl implements FieldGroup
{
  /**
   * The cached value of the '{@link #getWith() <em>With</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWith()
   * @generated
   * @ordered
   */
  protected PathTail with;

  /**
   * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElements()
   * @generated
   * @ordered
   */
  protected EList<GroupElement> elements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FieldGroupImpl()
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
    return DynamicScreenDslPackage.Literals.FIELD_GROUP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PathTail getWith()
  {
    return with;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWith(PathTail newWith, NotificationChain msgs)
  {
    PathTail oldWith = with;
    with = newWith;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DynamicScreenDslPackage.FIELD_GROUP__WITH, oldWith, newWith);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWith(PathTail newWith)
  {
    if (newWith != with)
    {
      NotificationChain msgs = null;
      if (with != null)
        msgs = ((InternalEObject)with).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DynamicScreenDslPackage.FIELD_GROUP__WITH, null, msgs);
      if (newWith != null)
        msgs = ((InternalEObject)newWith).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DynamicScreenDslPackage.FIELD_GROUP__WITH, null, msgs);
      msgs = basicSetWith(newWith, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DynamicScreenDslPackage.FIELD_GROUP__WITH, newWith, newWith));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<GroupElement> getElements()
  {
    if (elements == null)
    {
      elements = new EObjectContainmentEList<GroupElement>(GroupElement.class, this, DynamicScreenDslPackage.FIELD_GROUP__ELEMENTS);
    }
    return elements;
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
      case DynamicScreenDslPackage.FIELD_GROUP__WITH:
        return basicSetWith(null, msgs);
      case DynamicScreenDslPackage.FIELD_GROUP__ELEMENTS:
        return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
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
      case DynamicScreenDslPackage.FIELD_GROUP__WITH:
        return getWith();
      case DynamicScreenDslPackage.FIELD_GROUP__ELEMENTS:
        return getElements();
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
      case DynamicScreenDslPackage.FIELD_GROUP__WITH:
        setWith((PathTail)newValue);
        return;
      case DynamicScreenDslPackage.FIELD_GROUP__ELEMENTS:
        getElements().clear();
        getElements().addAll((Collection<? extends GroupElement>)newValue);
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
      case DynamicScreenDslPackage.FIELD_GROUP__WITH:
        setWith((PathTail)null);
        return;
      case DynamicScreenDslPackage.FIELD_GROUP__ELEMENTS:
        getElements().clear();
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
      case DynamicScreenDslPackage.FIELD_GROUP__WITH:
        return with != null;
      case DynamicScreenDslPackage.FIELD_GROUP__ELEMENTS:
        return elements != null && !elements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //FieldGroupImpl
