/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.examples.xsdLanguage.impl;

import nl.dslmeinte.xtext.examples.xsdLanguage.Import;
import nl.dslmeinte.xtext.examples.xsdLanguage.ImportedReference;
import nl.dslmeinte.xtext.examples.xsdLanguage.XsdLanguagePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Imported Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.examples.xsdLanguage.impl.ImportedReferenceImpl#getImport <em>Import</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImportedReferenceImpl extends MinimalEObjectImpl.Container implements ImportedReference
{
  /**
   * The cached value of the '{@link #getImport() <em>Import</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImport()
   * @generated
   * @ordered
   */
  protected Import import_;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ImportedReferenceImpl()
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
    return XsdLanguagePackage.Literals.IMPORTED_REFERENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import getImport()
  {
    if (import_ != null && import_.eIsProxy())
    {
      InternalEObject oldImport = (InternalEObject)import_;
      import_ = (Import)eResolveProxy(oldImport);
      if (import_ != oldImport)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, XsdLanguagePackage.IMPORTED_REFERENCE__IMPORT, oldImport, import_));
      }
    }
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import basicGetImport()
  {
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImport(Import newImport)
  {
    Import oldImport = import_;
    import_ = newImport;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XsdLanguagePackage.IMPORTED_REFERENCE__IMPORT, oldImport, import_));
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
      case XsdLanguagePackage.IMPORTED_REFERENCE__IMPORT:
        if (resolve) return getImport();
        return basicGetImport();
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
      case XsdLanguagePackage.IMPORTED_REFERENCE__IMPORT:
        setImport((Import)newValue);
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
      case XsdLanguagePackage.IMPORTED_REFERENCE__IMPORT:
        setImport((Import)null);
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
      case XsdLanguagePackage.IMPORTED_REFERENCE__IMPORT:
        return import_ != null;
    }
    return super.eIsSet(featureID);
  }

} //ImportedReferenceImpl
