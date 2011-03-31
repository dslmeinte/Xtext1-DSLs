/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.examples.xsdLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Imported Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.examples.xsdLanguage.ImportedReference#getImport <em>Import</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.xtext.examples.xsdLanguage.XsdLanguagePackage#getImportedReference()
 * @model
 * @generated
 */
public interface ImportedReference extends EObject
{
  /**
   * Returns the value of the '<em><b>Import</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Import</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Import</em>' reference.
   * @see #setImport(Import)
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.XsdLanguagePackage#getImportedReference_Import()
   * @model
   * @generated
   */
  Import getImport();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.ImportedReference#getImport <em>Import</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Import</em>' reference.
   * @see #getImport()
   * @generated
   */
  void setImport(Import value);

} // ImportedReference
