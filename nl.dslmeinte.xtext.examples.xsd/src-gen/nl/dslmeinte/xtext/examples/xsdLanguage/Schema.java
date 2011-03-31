/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.examples.xsdLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.examples.xsdLanguage.Schema#getName <em>Name</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.examples.xsdLanguage.Schema#getNsURI <em>Ns URI</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.examples.xsdLanguage.Schema#getImports <em>Imports</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.examples.xsdLanguage.Schema#getDefinitions <em>Definitions</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.xtext.examples.xsdLanguage.XsdLanguagePackage#getSchema()
 * @model
 * @generated
 */
public interface Schema extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.XsdLanguagePackage#getSchema_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.Schema#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Ns URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ns URI</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ns URI</em>' attribute.
   * @see #setNsURI(String)
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.XsdLanguagePackage#getSchema_NsURI()
   * @model
   * @generated
   */
  String getNsURI();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.Schema#getNsURI <em>Ns URI</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ns URI</em>' attribute.
   * @see #getNsURI()
   * @generated
   */
  void setNsURI(String value);

  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link nl.dslmeinte.xtext.examples.xsdLanguage.Import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.XsdLanguagePackage#getSchema_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Import> getImports();

  /**
   * Returns the value of the '<em><b>Definitions</b></em>' containment reference list.
   * The list contents are of type {@link nl.dslmeinte.xtext.examples.xsdLanguage.TopLevelDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Definitions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Definitions</em>' containment reference list.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.XsdLanguagePackage#getSchema_Definitions()
   * @model containment="true"
   * @generated
   */
  EList<TopLevelDefinition> getDefinitions();

} // Schema
