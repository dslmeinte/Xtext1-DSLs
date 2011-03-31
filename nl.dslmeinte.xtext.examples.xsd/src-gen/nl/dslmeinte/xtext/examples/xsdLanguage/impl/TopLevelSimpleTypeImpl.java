/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.examples.xsdLanguage.impl;

import nl.dslmeinte.xtext.examples.xsdLanguage.Documentation;
import nl.dslmeinte.xtext.examples.xsdLanguage.Restriction;
import nl.dslmeinte.xtext.examples.xsdLanguage.SimpleType;
import nl.dslmeinte.xtext.examples.xsdLanguage.TopLevelSimpleType;
import nl.dslmeinte.xtext.examples.xsdLanguage.XsdLanguagePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Top Level Simple Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.examples.xsdLanguage.impl.TopLevelSimpleTypeImpl#getRestriction <em>Restriction</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.examples.xsdLanguage.impl.TopLevelSimpleTypeImpl#getDocumentation <em>Documentation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TopLevelSimpleTypeImpl extends TopLevelTypeImpl implements TopLevelSimpleType
{
  /**
   * The cached value of the '{@link #getRestriction() <em>Restriction</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRestriction()
   * @generated
   * @ordered
   */
  protected Restriction restriction;

  /**
   * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDocumentation()
   * @generated
   * @ordered
   */
  protected Documentation documentation;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TopLevelSimpleTypeImpl()
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
    return XsdLanguagePackage.Literals.TOP_LEVEL_SIMPLE_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Restriction getRestriction()
  {
    return restriction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRestriction(Restriction newRestriction, NotificationChain msgs)
  {
    Restriction oldRestriction = restriction;
    restriction = newRestriction;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XsdLanguagePackage.TOP_LEVEL_SIMPLE_TYPE__RESTRICTION, oldRestriction, newRestriction);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRestriction(Restriction newRestriction)
  {
    if (newRestriction != restriction)
    {
      NotificationChain msgs = null;
      if (restriction != null)
        msgs = ((InternalEObject)restriction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XsdLanguagePackage.TOP_LEVEL_SIMPLE_TYPE__RESTRICTION, null, msgs);
      if (newRestriction != null)
        msgs = ((InternalEObject)newRestriction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XsdLanguagePackage.TOP_LEVEL_SIMPLE_TYPE__RESTRICTION, null, msgs);
      msgs = basicSetRestriction(newRestriction, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XsdLanguagePackage.TOP_LEVEL_SIMPLE_TYPE__RESTRICTION, newRestriction, newRestriction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Documentation getDocumentation()
  {
    return documentation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDocumentation(Documentation newDocumentation, NotificationChain msgs)
  {
    Documentation oldDocumentation = documentation;
    documentation = newDocumentation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XsdLanguagePackage.TOP_LEVEL_SIMPLE_TYPE__DOCUMENTATION, oldDocumentation, newDocumentation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDocumentation(Documentation newDocumentation)
  {
    if (newDocumentation != documentation)
    {
      NotificationChain msgs = null;
      if (documentation != null)
        msgs = ((InternalEObject)documentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XsdLanguagePackage.TOP_LEVEL_SIMPLE_TYPE__DOCUMENTATION, null, msgs);
      if (newDocumentation != null)
        msgs = ((InternalEObject)newDocumentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XsdLanguagePackage.TOP_LEVEL_SIMPLE_TYPE__DOCUMENTATION, null, msgs);
      msgs = basicSetDocumentation(newDocumentation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XsdLanguagePackage.TOP_LEVEL_SIMPLE_TYPE__DOCUMENTATION, newDocumentation, newDocumentation));
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
      case XsdLanguagePackage.TOP_LEVEL_SIMPLE_TYPE__RESTRICTION:
        return basicSetRestriction(null, msgs);
      case XsdLanguagePackage.TOP_LEVEL_SIMPLE_TYPE__DOCUMENTATION:
        return basicSetDocumentation(null, msgs);
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
      case XsdLanguagePackage.TOP_LEVEL_SIMPLE_TYPE__RESTRICTION:
        return getRestriction();
      case XsdLanguagePackage.TOP_LEVEL_SIMPLE_TYPE__DOCUMENTATION:
        return getDocumentation();
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
      case XsdLanguagePackage.TOP_LEVEL_SIMPLE_TYPE__RESTRICTION:
        setRestriction((Restriction)newValue);
        return;
      case XsdLanguagePackage.TOP_LEVEL_SIMPLE_TYPE__DOCUMENTATION:
        setDocumentation((Documentation)newValue);
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
      case XsdLanguagePackage.TOP_LEVEL_SIMPLE_TYPE__RESTRICTION:
        setRestriction((Restriction)null);
        return;
      case XsdLanguagePackage.TOP_LEVEL_SIMPLE_TYPE__DOCUMENTATION:
        setDocumentation((Documentation)null);
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
      case XsdLanguagePackage.TOP_LEVEL_SIMPLE_TYPE__RESTRICTION:
        return restriction != null;
      case XsdLanguagePackage.TOP_LEVEL_SIMPLE_TYPE__DOCUMENTATION:
        return documentation != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == SimpleType.class)
    {
      switch (derivedFeatureID)
      {
        case XsdLanguagePackage.TOP_LEVEL_SIMPLE_TYPE__RESTRICTION: return XsdLanguagePackage.SIMPLE_TYPE__RESTRICTION;
        case XsdLanguagePackage.TOP_LEVEL_SIMPLE_TYPE__DOCUMENTATION: return XsdLanguagePackage.SIMPLE_TYPE__DOCUMENTATION;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == SimpleType.class)
    {
      switch (baseFeatureID)
      {
        case XsdLanguagePackage.SIMPLE_TYPE__RESTRICTION: return XsdLanguagePackage.TOP_LEVEL_SIMPLE_TYPE__RESTRICTION;
        case XsdLanguagePackage.SIMPLE_TYPE__DOCUMENTATION: return XsdLanguagePackage.TOP_LEVEL_SIMPLE_TYPE__DOCUMENTATION;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

} //TopLevelSimpleTypeImpl
