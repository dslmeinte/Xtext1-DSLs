/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl;

import nl.dslmeinte.xtext.examples.dynamicScreenDsl.BExpression;
import nl.dslmeinte.xtext.examples.dynamicScreenDsl.DynamicScreenDslPackage;
import nl.dslmeinte.xtext.examples.dynamicScreenDsl.EnumLiteralsCollection;
import nl.dslmeinte.xtext.examples.dynamicScreenDsl.RestrictionAttribute;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Restriction Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.RestrictionAttributeImpl#getLiterals <em>Literals</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.RestrictionAttributeImpl#getClause <em>Clause</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RestrictionAttributeImpl extends EnumFieldAttributeImpl implements RestrictionAttribute
{
  /**
   * The cached value of the '{@link #getLiterals() <em>Literals</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLiterals()
   * @generated
   * @ordered
   */
  protected EnumLiteralsCollection literals;

  /**
   * The cached value of the '{@link #getClause() <em>Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClause()
   * @generated
   * @ordered
   */
  protected BExpression clause;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RestrictionAttributeImpl()
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
    return DynamicScreenDslPackage.Literals.RESTRICTION_ATTRIBUTE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumLiteralsCollection getLiterals()
  {
    return literals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLiterals(EnumLiteralsCollection newLiterals, NotificationChain msgs)
  {
    EnumLiteralsCollection oldLiterals = literals;
    literals = newLiterals;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DynamicScreenDslPackage.RESTRICTION_ATTRIBUTE__LITERALS, oldLiterals, newLiterals);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLiterals(EnumLiteralsCollection newLiterals)
  {
    if (newLiterals != literals)
    {
      NotificationChain msgs = null;
      if (literals != null)
        msgs = ((InternalEObject)literals).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DynamicScreenDslPackage.RESTRICTION_ATTRIBUTE__LITERALS, null, msgs);
      if (newLiterals != null)
        msgs = ((InternalEObject)newLiterals).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DynamicScreenDslPackage.RESTRICTION_ATTRIBUTE__LITERALS, null, msgs);
      msgs = basicSetLiterals(newLiterals, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DynamicScreenDslPackage.RESTRICTION_ATTRIBUTE__LITERALS, newLiterals, newLiterals));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BExpression getClause()
  {
    return clause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetClause(BExpression newClause, NotificationChain msgs)
  {
    BExpression oldClause = clause;
    clause = newClause;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DynamicScreenDslPackage.RESTRICTION_ATTRIBUTE__CLAUSE, oldClause, newClause);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClause(BExpression newClause)
  {
    if (newClause != clause)
    {
      NotificationChain msgs = null;
      if (clause != null)
        msgs = ((InternalEObject)clause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DynamicScreenDslPackage.RESTRICTION_ATTRIBUTE__CLAUSE, null, msgs);
      if (newClause != null)
        msgs = ((InternalEObject)newClause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DynamicScreenDslPackage.RESTRICTION_ATTRIBUTE__CLAUSE, null, msgs);
      msgs = basicSetClause(newClause, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DynamicScreenDslPackage.RESTRICTION_ATTRIBUTE__CLAUSE, newClause, newClause));
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
      case DynamicScreenDslPackage.RESTRICTION_ATTRIBUTE__LITERALS:
        return basicSetLiterals(null, msgs);
      case DynamicScreenDslPackage.RESTRICTION_ATTRIBUTE__CLAUSE:
        return basicSetClause(null, msgs);
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
      case DynamicScreenDslPackage.RESTRICTION_ATTRIBUTE__LITERALS:
        return getLiterals();
      case DynamicScreenDslPackage.RESTRICTION_ATTRIBUTE__CLAUSE:
        return getClause();
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
      case DynamicScreenDslPackage.RESTRICTION_ATTRIBUTE__LITERALS:
        setLiterals((EnumLiteralsCollection)newValue);
        return;
      case DynamicScreenDslPackage.RESTRICTION_ATTRIBUTE__CLAUSE:
        setClause((BExpression)newValue);
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
      case DynamicScreenDslPackage.RESTRICTION_ATTRIBUTE__LITERALS:
        setLiterals((EnumLiteralsCollection)null);
        return;
      case DynamicScreenDslPackage.RESTRICTION_ATTRIBUTE__CLAUSE:
        setClause((BExpression)null);
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
      case DynamicScreenDslPackage.RESTRICTION_ATTRIBUTE__LITERALS:
        return literals != null;
      case DynamicScreenDslPackage.RESTRICTION_ATTRIBUTE__CLAUSE:
        return clause != null;
    }
    return super.eIsSet(featureID);
  }

} //RestrictionAttributeImpl
