/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.examples.dynamicScreenDsl;

import nl.dslmeinte.xtext.examples.dataModelDsl.Entity;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dynamic Screen</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.DynamicScreen#getLabel <em>Label</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.DynamicScreen#getImportURI <em>Import URI</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.DynamicScreen#getViewClass <em>View Class</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.DynamicScreen#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.DynamicScreen#getGroups <em>Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.DynamicScreenDslPackage#getDynamicScreen()
 * @model
 * @generated
 */
public interface DynamicScreen extends EObject
{
  /**
   * Returns the value of the '<em><b>Label</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Label</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label</em>' containment reference.
   * @see #setLabel(Label)
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.DynamicScreenDslPackage#getDynamicScreen_Label()
   * @model containment="true"
   * @generated
   */
  Label getLabel();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.DynamicScreen#getLabel <em>Label</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label</em>' containment reference.
   * @see #getLabel()
   * @generated
   */
  void setLabel(Label value);

  /**
   * Returns the value of the '<em><b>Import URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Import URI</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Import URI</em>' attribute.
   * @see #setImportURI(String)
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.DynamicScreenDslPackage#getDynamicScreen_ImportURI()
   * @model
   * @generated
   */
  String getImportURI();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.DynamicScreen#getImportURI <em>Import URI</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Import URI</em>' attribute.
   * @see #getImportURI()
   * @generated
   */
  void setImportURI(String value);

  /**
   * Returns the value of the '<em><b>View Class</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>View Class</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>View Class</em>' reference.
   * @see #setViewClass(Entity)
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.DynamicScreenDslPackage#getDynamicScreen_ViewClass()
   * @model
   * @generated
   */
  Entity getViewClass();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.DynamicScreen#getViewClass <em>View Class</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>View Class</em>' reference.
   * @see #getViewClass()
   * @generated
   */
  void setViewClass(Entity value);

  /**
   * Returns the value of the '<em><b>Declarations</b></em>' containment reference list.
   * The list contents are of type {@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.Declaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declarations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declarations</em>' containment reference list.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.DynamicScreenDslPackage#getDynamicScreen_Declarations()
   * @model containment="true"
   * @generated
   */
  EList<Declaration> getDeclarations();

  /**
   * Returns the value of the '<em><b>Groups</b></em>' containment reference list.
   * The list contents are of type {@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.FieldGroup}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Groups</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Groups</em>' containment reference list.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.DynamicScreenDslPackage#getDynamicScreen_Groups()
   * @model containment="true"
   * @generated
   */
  EList<FieldGroup> getGroups();

} // DynamicScreen
