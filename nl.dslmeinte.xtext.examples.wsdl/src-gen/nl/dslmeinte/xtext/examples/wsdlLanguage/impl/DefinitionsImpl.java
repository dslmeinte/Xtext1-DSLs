/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.examples.wsdlLanguage.impl;

import java.util.Collection;

import nl.dslmeinte.xtext.examples.wsdlLanguage.Binding;
import nl.dslmeinte.xtext.examples.wsdlLanguage.Definitions;
import nl.dslmeinte.xtext.examples.wsdlLanguage.Message;
import nl.dslmeinte.xtext.examples.wsdlLanguage.PortType;
import nl.dslmeinte.xtext.examples.wsdlLanguage.Service;
import nl.dslmeinte.xtext.examples.wsdlLanguage.WsdlLanguagePackage;
import nl.dslmeinte.xtext.examples.wsdlLanguage.XsdImport;

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
 * An implementation of the model object '<em><b>Definitions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.examples.wsdlLanguage.impl.DefinitionsImpl#getName <em>Name</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.examples.wsdlLanguage.impl.DefinitionsImpl#getNsUri <em>Ns Uri</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.examples.wsdlLanguage.impl.DefinitionsImpl#getXsdImport <em>Xsd Import</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.examples.wsdlLanguage.impl.DefinitionsImpl#getMessages <em>Messages</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.examples.wsdlLanguage.impl.DefinitionsImpl#getPortTypes <em>Port Types</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.examples.wsdlLanguage.impl.DefinitionsImpl#getBindings <em>Bindings</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.examples.wsdlLanguage.impl.DefinitionsImpl#getServices <em>Services</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DefinitionsImpl extends MinimalEObjectImpl.Container implements Definitions
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
   * The default value of the '{@link #getNsUri() <em>Ns Uri</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNsUri()
   * @generated
   * @ordered
   */
  protected static final String NS_URI_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNsUri() <em>Ns Uri</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNsUri()
   * @generated
   * @ordered
   */
  protected String nsUri = NS_URI_EDEFAULT;

  /**
   * The cached value of the '{@link #getXsdImport() <em>Xsd Import</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXsdImport()
   * @generated
   * @ordered
   */
  protected XsdImport xsdImport;

  /**
   * The cached value of the '{@link #getMessages() <em>Messages</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMessages()
   * @generated
   * @ordered
   */
  protected EList<Message> messages;

  /**
   * The cached value of the '{@link #getPortTypes() <em>Port Types</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPortTypes()
   * @generated
   * @ordered
   */
  protected EList<PortType> portTypes;

  /**
   * The cached value of the '{@link #getBindings() <em>Bindings</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBindings()
   * @generated
   * @ordered
   */
  protected EList<Binding> bindings;

  /**
   * The cached value of the '{@link #getServices() <em>Services</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServices()
   * @generated
   * @ordered
   */
  protected EList<Service> services;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DefinitionsImpl()
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
    return WsdlLanguagePackage.Literals.DEFINITIONS;
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
      eNotify(new ENotificationImpl(this, Notification.SET, WsdlLanguagePackage.DEFINITIONS__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNsUri()
  {
    return nsUri;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNsUri(String newNsUri)
  {
    String oldNsUri = nsUri;
    nsUri = newNsUri;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WsdlLanguagePackage.DEFINITIONS__NS_URI, oldNsUri, nsUri));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XsdImport getXsdImport()
  {
    return xsdImport;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetXsdImport(XsdImport newXsdImport, NotificationChain msgs)
  {
    XsdImport oldXsdImport = xsdImport;
    xsdImport = newXsdImport;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WsdlLanguagePackage.DEFINITIONS__XSD_IMPORT, oldXsdImport, newXsdImport);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setXsdImport(XsdImport newXsdImport)
  {
    if (newXsdImport != xsdImport)
    {
      NotificationChain msgs = null;
      if (xsdImport != null)
        msgs = ((InternalEObject)xsdImport).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WsdlLanguagePackage.DEFINITIONS__XSD_IMPORT, null, msgs);
      if (newXsdImport != null)
        msgs = ((InternalEObject)newXsdImport).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WsdlLanguagePackage.DEFINITIONS__XSD_IMPORT, null, msgs);
      msgs = basicSetXsdImport(newXsdImport, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WsdlLanguagePackage.DEFINITIONS__XSD_IMPORT, newXsdImport, newXsdImport));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Message> getMessages()
  {
    if (messages == null)
    {
      messages = new EObjectContainmentEList<Message>(Message.class, this, WsdlLanguagePackage.DEFINITIONS__MESSAGES);
    }
    return messages;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PortType> getPortTypes()
  {
    if (portTypes == null)
    {
      portTypes = new EObjectContainmentEList<PortType>(PortType.class, this, WsdlLanguagePackage.DEFINITIONS__PORT_TYPES);
    }
    return portTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Binding> getBindings()
  {
    if (bindings == null)
    {
      bindings = new EObjectContainmentEList<Binding>(Binding.class, this, WsdlLanguagePackage.DEFINITIONS__BINDINGS);
    }
    return bindings;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Service> getServices()
  {
    if (services == null)
    {
      services = new EObjectContainmentEList<Service>(Service.class, this, WsdlLanguagePackage.DEFINITIONS__SERVICES);
    }
    return services;
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
      case WsdlLanguagePackage.DEFINITIONS__XSD_IMPORT:
        return basicSetXsdImport(null, msgs);
      case WsdlLanguagePackage.DEFINITIONS__MESSAGES:
        return ((InternalEList<?>)getMessages()).basicRemove(otherEnd, msgs);
      case WsdlLanguagePackage.DEFINITIONS__PORT_TYPES:
        return ((InternalEList<?>)getPortTypes()).basicRemove(otherEnd, msgs);
      case WsdlLanguagePackage.DEFINITIONS__BINDINGS:
        return ((InternalEList<?>)getBindings()).basicRemove(otherEnd, msgs);
      case WsdlLanguagePackage.DEFINITIONS__SERVICES:
        return ((InternalEList<?>)getServices()).basicRemove(otherEnd, msgs);
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
      case WsdlLanguagePackage.DEFINITIONS__NAME:
        return getName();
      case WsdlLanguagePackage.DEFINITIONS__NS_URI:
        return getNsUri();
      case WsdlLanguagePackage.DEFINITIONS__XSD_IMPORT:
        return getXsdImport();
      case WsdlLanguagePackage.DEFINITIONS__MESSAGES:
        return getMessages();
      case WsdlLanguagePackage.DEFINITIONS__PORT_TYPES:
        return getPortTypes();
      case WsdlLanguagePackage.DEFINITIONS__BINDINGS:
        return getBindings();
      case WsdlLanguagePackage.DEFINITIONS__SERVICES:
        return getServices();
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
      case WsdlLanguagePackage.DEFINITIONS__NAME:
        setName((String)newValue);
        return;
      case WsdlLanguagePackage.DEFINITIONS__NS_URI:
        setNsUri((String)newValue);
        return;
      case WsdlLanguagePackage.DEFINITIONS__XSD_IMPORT:
        setXsdImport((XsdImport)newValue);
        return;
      case WsdlLanguagePackage.DEFINITIONS__MESSAGES:
        getMessages().clear();
        getMessages().addAll((Collection<? extends Message>)newValue);
        return;
      case WsdlLanguagePackage.DEFINITIONS__PORT_TYPES:
        getPortTypes().clear();
        getPortTypes().addAll((Collection<? extends PortType>)newValue);
        return;
      case WsdlLanguagePackage.DEFINITIONS__BINDINGS:
        getBindings().clear();
        getBindings().addAll((Collection<? extends Binding>)newValue);
        return;
      case WsdlLanguagePackage.DEFINITIONS__SERVICES:
        getServices().clear();
        getServices().addAll((Collection<? extends Service>)newValue);
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
      case WsdlLanguagePackage.DEFINITIONS__NAME:
        setName(NAME_EDEFAULT);
        return;
      case WsdlLanguagePackage.DEFINITIONS__NS_URI:
        setNsUri(NS_URI_EDEFAULT);
        return;
      case WsdlLanguagePackage.DEFINITIONS__XSD_IMPORT:
        setXsdImport((XsdImport)null);
        return;
      case WsdlLanguagePackage.DEFINITIONS__MESSAGES:
        getMessages().clear();
        return;
      case WsdlLanguagePackage.DEFINITIONS__PORT_TYPES:
        getPortTypes().clear();
        return;
      case WsdlLanguagePackage.DEFINITIONS__BINDINGS:
        getBindings().clear();
        return;
      case WsdlLanguagePackage.DEFINITIONS__SERVICES:
        getServices().clear();
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
      case WsdlLanguagePackage.DEFINITIONS__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case WsdlLanguagePackage.DEFINITIONS__NS_URI:
        return NS_URI_EDEFAULT == null ? nsUri != null : !NS_URI_EDEFAULT.equals(nsUri);
      case WsdlLanguagePackage.DEFINITIONS__XSD_IMPORT:
        return xsdImport != null;
      case WsdlLanguagePackage.DEFINITIONS__MESSAGES:
        return messages != null && !messages.isEmpty();
      case WsdlLanguagePackage.DEFINITIONS__PORT_TYPES:
        return portTypes != null && !portTypes.isEmpty();
      case WsdlLanguagePackage.DEFINITIONS__BINDINGS:
        return bindings != null && !bindings.isEmpty();
      case WsdlLanguagePackage.DEFINITIONS__SERVICES:
        return services != null && !services.isEmpty();
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
    result.append(", nsUri: ");
    result.append(nsUri);
    result.append(')');
    return result.toString();
  }

} //DefinitionsImpl
