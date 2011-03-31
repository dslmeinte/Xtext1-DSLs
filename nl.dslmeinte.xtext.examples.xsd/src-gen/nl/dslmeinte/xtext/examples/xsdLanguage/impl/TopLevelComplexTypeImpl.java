/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.examples.xsdLanguage.impl;

import java.util.Collection;

import nl.dslmeinte.xtext.examples.xsdLanguage.ComplexType;
import nl.dslmeinte.xtext.examples.xsdLanguage.Property;
import nl.dslmeinte.xtext.examples.xsdLanguage.TopLevelComplexType;
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
 * An implementation of the model object '<em><b>Top Level Complex Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.examples.xsdLanguage.impl.TopLevelComplexTypeImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.examples.xsdLanguage.impl.TopLevelComplexTypeImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.examples.xsdLanguage.impl.TopLevelComplexTypeImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.examples.xsdLanguage.impl.TopLevelComplexTypeImpl#getDocumentation <em>Documentation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TopLevelComplexTypeImpl extends TopLevelTypeImpl implements TopLevelComplexType
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
   * The default value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAbstract()
   * @generated
   * @ordered
   */
  protected static final boolean ABSTRACT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAbstract()
   * @generated
   * @ordered
   */
  protected boolean abstract_ = ABSTRACT_EDEFAULT;

  /**
   * The default value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDocumentation()
   * @generated
   * @ordered
   */
  protected static final String DOCUMENTATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDocumentation()
   * @generated
   * @ordered
   */
  protected String documentation = DOCUMENTATION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TopLevelComplexTypeImpl()
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
    return XsdLanguagePackage.Literals.TOP_LEVEL_COMPLEX_TYPE;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XsdLanguagePackage.TOP_LEVEL_COMPLEX_TYPE__EXTENDS, oldExtends, newExtends);
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
        msgs = ((InternalEObject)extends_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XsdLanguagePackage.TOP_LEVEL_COMPLEX_TYPE__EXTENDS, null, msgs);
      if (newExtends != null)
        msgs = ((InternalEObject)newExtends).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XsdLanguagePackage.TOP_LEVEL_COMPLEX_TYPE__EXTENDS, null, msgs);
      msgs = basicSetExtends(newExtends, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XsdLanguagePackage.TOP_LEVEL_COMPLEX_TYPE__EXTENDS, newExtends, newExtends));
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
      properties = new EObjectContainmentEList<Property>(Property.class, this, XsdLanguagePackage.TOP_LEVEL_COMPLEX_TYPE__PROPERTIES);
    }
    return properties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isAbstract()
  {
    return abstract_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAbstract(boolean newAbstract)
  {
    boolean oldAbstract = abstract_;
    abstract_ = newAbstract;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XsdLanguagePackage.TOP_LEVEL_COMPLEX_TYPE__ABSTRACT, oldAbstract, abstract_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDocumentation()
  {
    return documentation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDocumentation(String newDocumentation)
  {
    String oldDocumentation = documentation;
    documentation = newDocumentation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XsdLanguagePackage.TOP_LEVEL_COMPLEX_TYPE__DOCUMENTATION, oldDocumentation, documentation));
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
      case XsdLanguagePackage.TOP_LEVEL_COMPLEX_TYPE__EXTENDS:
        return basicSetExtends(null, msgs);
      case XsdLanguagePackage.TOP_LEVEL_COMPLEX_TYPE__PROPERTIES:
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
      case XsdLanguagePackage.TOP_LEVEL_COMPLEX_TYPE__EXTENDS:
        return getExtends();
      case XsdLanguagePackage.TOP_LEVEL_COMPLEX_TYPE__PROPERTIES:
        return getProperties();
      case XsdLanguagePackage.TOP_LEVEL_COMPLEX_TYPE__ABSTRACT:
        return isAbstract();
      case XsdLanguagePackage.TOP_LEVEL_COMPLEX_TYPE__DOCUMENTATION:
        return getDocumentation();
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
      case XsdLanguagePackage.TOP_LEVEL_COMPLEX_TYPE__EXTENDS:
        setExtends((TopLevelComplexTypeReference)newValue);
        return;
      case XsdLanguagePackage.TOP_LEVEL_COMPLEX_TYPE__PROPERTIES:
        getProperties().clear();
        getProperties().addAll((Collection<? extends Property>)newValue);
        return;
      case XsdLanguagePackage.TOP_LEVEL_COMPLEX_TYPE__ABSTRACT:
        setAbstract((Boolean)newValue);
        return;
      case XsdLanguagePackage.TOP_LEVEL_COMPLEX_TYPE__DOCUMENTATION:
        setDocumentation((String)newValue);
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
      case XsdLanguagePackage.TOP_LEVEL_COMPLEX_TYPE__EXTENDS:
        setExtends((TopLevelComplexTypeReference)null);
        return;
      case XsdLanguagePackage.TOP_LEVEL_COMPLEX_TYPE__PROPERTIES:
        getProperties().clear();
        return;
      case XsdLanguagePackage.TOP_LEVEL_COMPLEX_TYPE__ABSTRACT:
        setAbstract(ABSTRACT_EDEFAULT);
        return;
      case XsdLanguagePackage.TOP_LEVEL_COMPLEX_TYPE__DOCUMENTATION:
        setDocumentation(DOCUMENTATION_EDEFAULT);
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
      case XsdLanguagePackage.TOP_LEVEL_COMPLEX_TYPE__EXTENDS:
        return extends_ != null;
      case XsdLanguagePackage.TOP_LEVEL_COMPLEX_TYPE__PROPERTIES:
        return properties != null && !properties.isEmpty();
      case XsdLanguagePackage.TOP_LEVEL_COMPLEX_TYPE__ABSTRACT:
        return abstract_ != ABSTRACT_EDEFAULT;
      case XsdLanguagePackage.TOP_LEVEL_COMPLEX_TYPE__DOCUMENTATION:
        return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
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
        case XsdLanguagePackage.TOP_LEVEL_COMPLEX_TYPE__EXTENDS: return XsdLanguagePackage.COMPLEX_TYPE__EXTENDS;
        case XsdLanguagePackage.TOP_LEVEL_COMPLEX_TYPE__PROPERTIES: return XsdLanguagePackage.COMPLEX_TYPE__PROPERTIES;
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
        case XsdLanguagePackage.COMPLEX_TYPE__EXTENDS: return XsdLanguagePackage.TOP_LEVEL_COMPLEX_TYPE__EXTENDS;
        case XsdLanguagePackage.COMPLEX_TYPE__PROPERTIES: return XsdLanguagePackage.TOP_LEVEL_COMPLEX_TYPE__PROPERTIES;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
    result.append(" (abstract: ");
    result.append(abstract_);
    result.append(", documentation: ");
    result.append(documentation);
    result.append(')');
    return result.toString();
  }

} //TopLevelComplexTypeImpl
