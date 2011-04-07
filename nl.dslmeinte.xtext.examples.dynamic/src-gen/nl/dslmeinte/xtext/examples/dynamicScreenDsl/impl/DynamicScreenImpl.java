/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl;

import java.util.Collection;

import nl.dslmeinte.xtext.examples.dataModelDsl.Entity;

import nl.dslmeinte.xtext.examples.dynamicScreenDsl.Declaration;
import nl.dslmeinte.xtext.examples.dynamicScreenDsl.DynamicScreen;
import nl.dslmeinte.xtext.examples.dynamicScreenDsl.DynamicScreenDslPackage;
import nl.dslmeinte.xtext.examples.dynamicScreenDsl.FieldGroup;
import nl.dslmeinte.xtext.examples.dynamicScreenDsl.Label;

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
 * An implementation of the model object '<em><b>Dynamic Screen</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DynamicScreenImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DynamicScreenImpl#getImportURI <em>Import URI</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DynamicScreenImpl#getViewClass <em>View Class</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DynamicScreenImpl#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DynamicScreenImpl#getGroups <em>Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DynamicScreenImpl extends MinimalEObjectImpl.Container implements DynamicScreen
{
  /**
   * The cached value of the '{@link #getLabel() <em>Label</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
  protected Label label;

  /**
   * The default value of the '{@link #getImportURI() <em>Import URI</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportURI()
   * @generated
   * @ordered
   */
  protected static final String IMPORT_URI_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getImportURI() <em>Import URI</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportURI()
   * @generated
   * @ordered
   */
  protected String importURI = IMPORT_URI_EDEFAULT;

  /**
   * The cached value of the '{@link #getViewClass() <em>View Class</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getViewClass()
   * @generated
   * @ordered
   */
  protected Entity viewClass;

  /**
   * The cached value of the '{@link #getDeclarations() <em>Declarations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclarations()
   * @generated
   * @ordered
   */
  protected EList<Declaration> declarations;

  /**
   * The cached value of the '{@link #getGroups() <em>Groups</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroups()
   * @generated
   * @ordered
   */
  protected EList<FieldGroup> groups;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DynamicScreenImpl()
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
    return DynamicScreenDslPackage.Literals.DYNAMIC_SCREEN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Label getLabel()
  {
    return label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLabel(Label newLabel, NotificationChain msgs)
  {
    Label oldLabel = label;
    label = newLabel;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DynamicScreenDslPackage.DYNAMIC_SCREEN__LABEL, oldLabel, newLabel);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLabel(Label newLabel)
  {
    if (newLabel != label)
    {
      NotificationChain msgs = null;
      if (label != null)
        msgs = ((InternalEObject)label).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DynamicScreenDslPackage.DYNAMIC_SCREEN__LABEL, null, msgs);
      if (newLabel != null)
        msgs = ((InternalEObject)newLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DynamicScreenDslPackage.DYNAMIC_SCREEN__LABEL, null, msgs);
      msgs = basicSetLabel(newLabel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DynamicScreenDslPackage.DYNAMIC_SCREEN__LABEL, newLabel, newLabel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getImportURI()
  {
    return importURI;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImportURI(String newImportURI)
  {
    String oldImportURI = importURI;
    importURI = newImportURI;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DynamicScreenDslPackage.DYNAMIC_SCREEN__IMPORT_URI, oldImportURI, importURI));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity getViewClass()
  {
    if (viewClass != null && viewClass.eIsProxy())
    {
      InternalEObject oldViewClass = (InternalEObject)viewClass;
      viewClass = (Entity)eResolveProxy(oldViewClass);
      if (viewClass != oldViewClass)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DynamicScreenDslPackage.DYNAMIC_SCREEN__VIEW_CLASS, oldViewClass, viewClass));
      }
    }
    return viewClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity basicGetViewClass()
  {
    return viewClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setViewClass(Entity newViewClass)
  {
    Entity oldViewClass = viewClass;
    viewClass = newViewClass;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DynamicScreenDslPackage.DYNAMIC_SCREEN__VIEW_CLASS, oldViewClass, viewClass));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Declaration> getDeclarations()
  {
    if (declarations == null)
    {
      declarations = new EObjectContainmentEList<Declaration>(Declaration.class, this, DynamicScreenDslPackage.DYNAMIC_SCREEN__DECLARATIONS);
    }
    return declarations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FieldGroup> getGroups()
  {
    if (groups == null)
    {
      groups = new EObjectContainmentEList<FieldGroup>(FieldGroup.class, this, DynamicScreenDslPackage.DYNAMIC_SCREEN__GROUPS);
    }
    return groups;
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
      case DynamicScreenDslPackage.DYNAMIC_SCREEN__LABEL:
        return basicSetLabel(null, msgs);
      case DynamicScreenDslPackage.DYNAMIC_SCREEN__DECLARATIONS:
        return ((InternalEList<?>)getDeclarations()).basicRemove(otherEnd, msgs);
      case DynamicScreenDslPackage.DYNAMIC_SCREEN__GROUPS:
        return ((InternalEList<?>)getGroups()).basicRemove(otherEnd, msgs);
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
      case DynamicScreenDslPackage.DYNAMIC_SCREEN__LABEL:
        return getLabel();
      case DynamicScreenDslPackage.DYNAMIC_SCREEN__IMPORT_URI:
        return getImportURI();
      case DynamicScreenDslPackage.DYNAMIC_SCREEN__VIEW_CLASS:
        if (resolve) return getViewClass();
        return basicGetViewClass();
      case DynamicScreenDslPackage.DYNAMIC_SCREEN__DECLARATIONS:
        return getDeclarations();
      case DynamicScreenDslPackage.DYNAMIC_SCREEN__GROUPS:
        return getGroups();
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
      case DynamicScreenDslPackage.DYNAMIC_SCREEN__LABEL:
        setLabel((Label)newValue);
        return;
      case DynamicScreenDslPackage.DYNAMIC_SCREEN__IMPORT_URI:
        setImportURI((String)newValue);
        return;
      case DynamicScreenDslPackage.DYNAMIC_SCREEN__VIEW_CLASS:
        setViewClass((Entity)newValue);
        return;
      case DynamicScreenDslPackage.DYNAMIC_SCREEN__DECLARATIONS:
        getDeclarations().clear();
        getDeclarations().addAll((Collection<? extends Declaration>)newValue);
        return;
      case DynamicScreenDslPackage.DYNAMIC_SCREEN__GROUPS:
        getGroups().clear();
        getGroups().addAll((Collection<? extends FieldGroup>)newValue);
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
      case DynamicScreenDslPackage.DYNAMIC_SCREEN__LABEL:
        setLabel((Label)null);
        return;
      case DynamicScreenDslPackage.DYNAMIC_SCREEN__IMPORT_URI:
        setImportURI(IMPORT_URI_EDEFAULT);
        return;
      case DynamicScreenDslPackage.DYNAMIC_SCREEN__VIEW_CLASS:
        setViewClass((Entity)null);
        return;
      case DynamicScreenDslPackage.DYNAMIC_SCREEN__DECLARATIONS:
        getDeclarations().clear();
        return;
      case DynamicScreenDslPackage.DYNAMIC_SCREEN__GROUPS:
        getGroups().clear();
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
      case DynamicScreenDslPackage.DYNAMIC_SCREEN__LABEL:
        return label != null;
      case DynamicScreenDslPackage.DYNAMIC_SCREEN__IMPORT_URI:
        return IMPORT_URI_EDEFAULT == null ? importURI != null : !IMPORT_URI_EDEFAULT.equals(importURI);
      case DynamicScreenDslPackage.DYNAMIC_SCREEN__VIEW_CLASS:
        return viewClass != null;
      case DynamicScreenDslPackage.DYNAMIC_SCREEN__DECLARATIONS:
        return declarations != null && !declarations.isEmpty();
      case DynamicScreenDslPackage.DYNAMIC_SCREEN__GROUPS:
        return groups != null && !groups.isEmpty();
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
    result.append(" (importURI: ");
    result.append(importURI);
    result.append(')');
    return result.toString();
  }

} //DynamicScreenImpl
