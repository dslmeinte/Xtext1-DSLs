/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.examples.xsdLanguage.impl;

import java.util.Collection;

import nl.dslmeinte.xtext.examples.xsdLanguage.ComplexType;
import nl.dslmeinte.xtext.examples.xsdLanguage.EmbeddedComplexType;
import nl.dslmeinte.xtext.examples.xsdLanguage.Property;
import nl.dslmeinte.xtext.examples.xsdLanguage.TopLevelComplexTypeReference;
import nl.dslmeinte.xtext.examples.xsdLanguage.XsdLanguagePackage;

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
 * An implementation of the model object '<em><b>Embedded Complex Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.examples.xsdLanguage.impl.EmbeddedComplexTypeImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.examples.xsdLanguage.impl.EmbeddedComplexTypeImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EmbeddedComplexTypeImpl extends EmbeddedTypeImpl implements EmbeddedComplexType
{
  /**
   * The cached value of the '{@link #getExtends() <em>Extends</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtends()
   * @generated
   * @ordered
   */
  protected TopLevelComplexTypeReference extends_;

  /**
   * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperties()
   * @generated
   * @ordered
   */
  protected EList<Property> properties;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EmbeddedComplexTypeImpl()
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
    return XsdLanguagePackage.Literals.EMBEDDED_COMPLEX_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TopLevelComplexTypeReference getExtends()
  {
    return extends_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExtends(TopLevelComplexTypeReference newExtends, NotificationChain msgs)
  {
    TopLevelComplexTypeReference oldExtends = extends_;
    extends_ = newExtends;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XsdLanguagePackage.EMBEDDED_COMPLEX_TYPE__EXTENDS, oldExtends, newExtends);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExtends(TopLevelComplexTypeReference newExtends)
  {
    if (newExtends != extends_)
    {
      NotificationChain msgs = null;
      if (extends_ != null)
        msgs = ((InternalEObject)extends_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XsdLanguagePackage.EMBEDDED_COMPLEX_TYPE__EXTENDS, null, msgs);
      if (newExtends != null)
        msgs = ((InternalEObject)newExtends).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XsdLanguagePackage.EMBEDDED_COMPLEX_TYPE__EXTENDS, null, msgs);
      msgs = basicSetExtends(newExtends, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XsdLanguagePackage.EMBEDDED_COMPLEX_TYPE__EXTENDS, newExtends, newExtends));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Property> getProperties()
  {
    if (properties == null)
    {
      properties = new EObjectContainmentEList<Property>(Property.class, this, XsdLanguagePackage.EMBEDDED_COMPLEX_TYPE__PROPERTIES);
    }
    return properties;
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
      case XsdLanguagePackage.EMBEDDED_COMPLEX_TYPE__EXTENDS:
        return basicSetExtends(null, msgs);
      case XsdLanguagePackage.EMBEDDED_COMPLEX_TYPE__PROPERTIES:
        return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
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
      case XsdLanguagePackage.EMBEDDED_COMPLEX_TYPE__EXTENDS:
        return getExtends();
      case XsdLanguagePackage.EMBEDDED_COMPLEX_TYPE__PROPERTIES:
        return getProperties();
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
      case XsdLanguagePackage.EMBEDDED_COMPLEX_TYPE__EXTENDS:
        setExtends((TopLevelComplexTypeReference)newValue);
        return;
      case XsdLanguagePackage.EMBEDDED_COMPLEX_TYPE__PROPERTIES:
        getProperties().clear();
        getProperties().addAll((Collection<? extends Property>)newValue);
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
      case XsdLanguagePackage.EMBEDDED_COMPLEX_TYPE__EXTENDS:
        setExtends((TopLevelComplexTypeReference)null);
        return;
      case XsdLanguagePackage.EMBEDDED_COMPLEX_TYPE__PROPERTIES:
        getProperties().clear();
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
      case XsdLanguagePackage.EMBEDDED_COMPLEX_TYPE__EXTENDS:
        return extends_ != null;
      case XsdLanguagePackage.EMBEDDED_COMPLEX_TYPE__PROPERTIES:
        return properties != null && !properties.isEmpty();
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
    if (baseClass == ComplexType.class)
    {
      switch (derivedFeatureID)
      {
        case XsdLanguagePackage.EMBEDDED_COMPLEX_TYPE__EXTENDS: return XsdLanguagePackage.COMPLEX_TYPE__EXTENDS;
        case XsdLanguagePackage.EMBEDDED_COMPLEX_TYPE__PROPERTIES: return XsdLanguagePackage.COMPLEX_TYPE__PROPERTIES;
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
    if (baseClass == ComplexType.class)
    {
      switch (baseFeatureID)
      {
        case XsdLanguagePackage.COMPLEX_TYPE__EXTENDS: return XsdLanguagePackage.EMBEDDED_COMPLEX_TYPE__EXTENDS;
        case XsdLanguagePackage.COMPLEX_TYPE__PROPERTIES: return XsdLanguagePackage.EMBEDDED_COMPLEX_TYPE__PROPERTIES;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

} //EmbeddedComplexTypeImpl
