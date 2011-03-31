/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.examples.xsdLanguage.impl;

import nl.dslmeinte.xtext.examples.xsdLanguage.Element;
import nl.dslmeinte.xtext.examples.xsdLanguage.EmbeddedType;
import nl.dslmeinte.xtext.examples.xsdLanguage.Multiplicity;
import nl.dslmeinte.xtext.examples.xsdLanguage.NamedTypeReference;
import nl.dslmeinte.xtext.examples.xsdLanguage.XsdLanguagePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.examples.xsdLanguage.impl.ElementImpl#getTypeRef <em>Type Ref</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.examples.xsdLanguage.impl.ElementImpl#getEmbeddedTypeDef <em>Embedded Type Def</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.examples.xsdLanguage.impl.ElementImpl#getMultiplicity <em>Multiplicity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ElementImpl extends PropertyImpl implements Element
{
  /**
   * The cached value of the '{@link #getTypeRef() <em>Type Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeRef()
   * @generated
   * @ordered
   */
  protected NamedTypeReference typeRef;

  /**
   * The cached value of the '{@link #getEmbeddedTypeDef() <em>Embedded Type Def</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEmbeddedTypeDef()
   * @generated
   * @ordered
   */
  protected EmbeddedType embeddedTypeDef;

  /**
   * The cached value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMultiplicity()
   * @generated
   * @ordered
   */
  protected Multiplicity multiplicity;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ElementImpl()
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
    return XsdLanguagePackage.Literals.ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedTypeReference getTypeRef()
  {
    return typeRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTypeRef(NamedTypeReference newTypeRef, NotificationChain msgs)
  {
    NamedTypeReference oldTypeRef = typeRef;
    typeRef = newTypeRef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XsdLanguagePackage.ELEMENT__TYPE_REF, oldTypeRef, newTypeRef);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypeRef(NamedTypeReference newTypeRef)
  {
    if (newTypeRef != typeRef)
    {
      NotificationChain msgs = null;
      if (typeRef != null)
        msgs = ((InternalEObject)typeRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XsdLanguagePackage.ELEMENT__TYPE_REF, null, msgs);
      if (newTypeRef != null)
        msgs = ((InternalEObject)newTypeRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XsdLanguagePackage.ELEMENT__TYPE_REF, null, msgs);
      msgs = basicSetTypeRef(newTypeRef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XsdLanguagePackage.ELEMENT__TYPE_REF, newTypeRef, newTypeRef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EmbeddedType getEmbeddedTypeDef()
  {
    return embeddedTypeDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEmbeddedTypeDef(EmbeddedType newEmbeddedTypeDef, NotificationChain msgs)
  {
    EmbeddedType oldEmbeddedTypeDef = embeddedTypeDef;
    embeddedTypeDef = newEmbeddedTypeDef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XsdLanguagePackage.ELEMENT__EMBEDDED_TYPE_DEF, oldEmbeddedTypeDef, newEmbeddedTypeDef);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEmbeddedTypeDef(EmbeddedType newEmbeddedTypeDef)
  {
    if (newEmbeddedTypeDef != embeddedTypeDef)
    {
      NotificationChain msgs = null;
      if (embeddedTypeDef != null)
        msgs = ((InternalEObject)embeddedTypeDef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XsdLanguagePackage.ELEMENT__EMBEDDED_TYPE_DEF, null, msgs);
      if (newEmbeddedTypeDef != null)
        msgs = ((InternalEObject)newEmbeddedTypeDef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XsdLanguagePackage.ELEMENT__EMBEDDED_TYPE_DEF, null, msgs);
      msgs = basicSetEmbeddedTypeDef(newEmbeddedTypeDef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XsdLanguagePackage.ELEMENT__EMBEDDED_TYPE_DEF, newEmbeddedTypeDef, newEmbeddedTypeDef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Multiplicity getMultiplicity()
  {
    return multiplicity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMultiplicity(Multiplicity newMultiplicity, NotificationChain msgs)
  {
    Multiplicity oldMultiplicity = multiplicity;
    multiplicity = newMultiplicity;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XsdLanguagePackage.ELEMENT__MULTIPLICITY, oldMultiplicity, newMultiplicity);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMultiplicity(Multiplicity newMultiplicity)
  {
    if (newMultiplicity != multiplicity)
    {
      NotificationChain msgs = null;
      if (multiplicity != null)
        msgs = ((InternalEObject)multiplicity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XsdLanguagePackage.ELEMENT__MULTIPLICITY, null, msgs);
      if (newMultiplicity != null)
        msgs = ((InternalEObject)newMultiplicity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XsdLanguagePackage.ELEMENT__MULTIPLICITY, null, msgs);
      msgs = basicSetMultiplicity(newMultiplicity, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XsdLanguagePackage.ELEMENT__MULTIPLICITY, newMultiplicity, newMultiplicity));
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
      case XsdLanguagePackage.ELEMENT__TYPE_REF:
        return basicSetTypeRef(null, msgs);
      case XsdLanguagePackage.ELEMENT__EMBEDDED_TYPE_DEF:
        return basicSetEmbeddedTypeDef(null, msgs);
      case XsdLanguagePackage.ELEMENT__MULTIPLICITY:
        return basicSetMultiplicity(null, msgs);
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
      case XsdLanguagePackage.ELEMENT__TYPE_REF:
        return getTypeRef();
      case XsdLanguagePackage.ELEMENT__EMBEDDED_TYPE_DEF:
        return getEmbeddedTypeDef();
      case XsdLanguagePackage.ELEMENT__MULTIPLICITY:
        return getMultiplicity();
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
      case XsdLanguagePackage.ELEMENT__TYPE_REF:
        setTypeRef((NamedTypeReference)newValue);
        return;
      case XsdLanguagePackage.ELEMENT__EMBEDDED_TYPE_DEF:
        setEmbeddedTypeDef((EmbeddedType)newValue);
        return;
      case XsdLanguagePackage.ELEMENT__MULTIPLICITY:
        setMultiplicity((Multiplicity)newValue);
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
      case XsdLanguagePackage.ELEMENT__TYPE_REF:
        setTypeRef((NamedTypeReference)null);
        return;
      case XsdLanguagePackage.ELEMENT__EMBEDDED_TYPE_DEF:
        setEmbeddedTypeDef((EmbeddedType)null);
        return;
      case XsdLanguagePackage.ELEMENT__MULTIPLICITY:
        setMultiplicity((Multiplicity)null);
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
      case XsdLanguagePackage.ELEMENT__TYPE_REF:
        return typeRef != null;
      case XsdLanguagePackage.ELEMENT__EMBEDDED_TYPE_DEF:
        return embeddedTypeDef != null;
      case XsdLanguagePackage.ELEMENT__MULTIPLICITY:
        return multiplicity != null;
    }
    return super.eIsSet(featureID);
  }

} //ElementImpl
