/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl;

import nl.dslmeinte.xtext.examples.dynamicScreenDsl.AttributeClassExpression;
import nl.dslmeinte.xtext.examples.dynamicScreenDsl.BExpression;
import nl.dslmeinte.xtext.examples.dynamicScreenDsl.DynamicScreenDslPackage;
import nl.dslmeinte.xtext.examples.dynamicScreenDsl.NormalAttribute;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Normal Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.NormalAttributeImpl#getClassExpr <em>Class Expr</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.NormalAttributeImpl#getClause <em>Clause</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NormalAttributeImpl extends AttributeImpl implements NormalAttribute
{
  /**
   * The cached value of the '{@link #getClassExpr() <em>Class Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassExpr()
   * @generated
   * @ordered
   */
  protected AttributeClassExpression classExpr;

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
  protected NormalAttributeImpl()
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
    return DynamicScreenDslPackage.Literals.NORMAL_ATTRIBUTE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeClassExpression getClassExpr()
  {
    return classExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetClassExpr(AttributeClassExpression newClassExpr, NotificationChain msgs)
  {
    AttributeClassExpression oldClassExpr = classExpr;
    classExpr = newClassExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DynamicScreenDslPackage.NORMAL_ATTRIBUTE__CLASS_EXPR, oldClassExpr, newClassExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClassExpr(AttributeClassExpression newClassExpr)
  {
    if (newClassExpr != classExpr)
    {
      NotificationChain msgs = null;
      if (classExpr != null)
        msgs = ((InternalEObject)classExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DynamicScreenDslPackage.NORMAL_ATTRIBUTE__CLASS_EXPR, null, msgs);
      if (newClassExpr != null)
        msgs = ((InternalEObject)newClassExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DynamicScreenDslPackage.NORMAL_ATTRIBUTE__CLASS_EXPR, null, msgs);
      msgs = basicSetClassExpr(newClassExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DynamicScreenDslPackage.NORMAL_ATTRIBUTE__CLASS_EXPR, newClassExpr, newClassExpr));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DynamicScreenDslPackage.NORMAL_ATTRIBUTE__CLAUSE, oldClause, newClause);
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
        msgs = ((InternalEObject)clause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DynamicScreenDslPackage.NORMAL_ATTRIBUTE__CLAUSE, null, msgs);
      if (newClause != null)
        msgs = ((InternalEObject)newClause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DynamicScreenDslPackage.NORMAL_ATTRIBUTE__CLAUSE, null, msgs);
      msgs = basicSetClause(newClause, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DynamicScreenDslPackage.NORMAL_ATTRIBUTE__CLAUSE, newClause, newClause));
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
      case DynamicScreenDslPackage.NORMAL_ATTRIBUTE__CLASS_EXPR:
        return basicSetClassExpr(null, msgs);
      case DynamicScreenDslPackage.NORMAL_ATTRIBUTE__CLAUSE:
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
      case DynamicScreenDslPackage.NORMAL_ATTRIBUTE__CLASS_EXPR:
        return getClassExpr();
      case DynamicScreenDslPackage.NORMAL_ATTRIBUTE__CLAUSE:
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
      case DynamicScreenDslPackage.NORMAL_ATTRIBUTE__CLASS_EXPR:
        setClassExpr((AttributeClassExpression)newValue);
        return;
      case DynamicScreenDslPackage.NORMAL_ATTRIBUTE__CLAUSE:
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
      case DynamicScreenDslPackage.NORMAL_ATTRIBUTE__CLASS_EXPR:
        setClassExpr((AttributeClassExpression)null);
        return;
      case DynamicScreenDslPackage.NORMAL_ATTRIBUTE__CLAUSE:
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
      case DynamicScreenDslPackage.NORMAL_ATTRIBUTE__CLASS_EXPR:
        return classExpr != null;
      case DynamicScreenDslPackage.NORMAL_ATTRIBUTE__CLAUSE:
        return clause != null;
    }
    return super.eIsSet(featureID);
  }

} //NormalAttributeImpl
