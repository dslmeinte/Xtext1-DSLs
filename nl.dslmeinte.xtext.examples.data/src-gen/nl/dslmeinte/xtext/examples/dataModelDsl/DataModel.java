/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.examples.dataModelDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.examples.dataModelDsl.DataModel#getPrimitives <em>Primitives</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.examples.dataModelDsl.DataModel#getCompoundTypes <em>Compound Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.xtext.examples.dataModelDsl.DataModelDslPackage#getDataModel()
 * @model
 * @generated
 */
public interface DataModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Primitives</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Primitives</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Primitives</em>' containment reference.
   * @see #setPrimitives(PrimitiveTypes)
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.DataModelDslPackage#getDataModel_Primitives()
   * @model containment="true"
   * @generated
   */
  PrimitiveTypes getPrimitives();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.examples.dataModelDsl.DataModel#getPrimitives <em>Primitives</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Primitives</em>' containment reference.
   * @see #getPrimitives()
   * @generated
   */
  void setPrimitives(PrimitiveTypes value);

  /**
   * Returns the value of the '<em><b>Compound Types</b></em>' containment reference list.
   * The list contents are of type {@link nl.dslmeinte.xtext.examples.dataModelDsl.CompoundType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Compound Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Compound Types</em>' containment reference list.
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.DataModelDslPackage#getDataModel_CompoundTypes()
   * @model containment="true"
   * @generated
   */
  EList<CompoundType> getCompoundTypes();

} // DataModel
