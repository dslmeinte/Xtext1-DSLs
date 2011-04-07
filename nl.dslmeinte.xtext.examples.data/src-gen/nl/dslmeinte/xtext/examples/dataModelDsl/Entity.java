/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.examples.dataModelDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.examples.dataModelDsl.Entity#isTransient <em>Transient</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.examples.dataModelDsl.Entity#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.examples.dataModelDsl.Entity#getName <em>Name</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.examples.dataModelDsl.Entity#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.examples.dataModelDsl.Entity#getFields <em>Fields</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.examples.dataModelDsl.Entity#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.examples.dataModelDsl.Entity#getFunctions <em>Functions</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.xtext.examples.dataModelDsl.DataModelDslPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends CompoundType
{
  /**
   * Returns the value of the '<em><b>Transient</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Transient</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transient</em>' attribute.
   * @see #setTransient(boolean)
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.DataModelDslPackage#getEntity_Transient()
   * @model
   * @generated
   */
  boolean isTransient();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.examples.dataModelDsl.Entity#isTransient <em>Transient</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Transient</em>' attribute.
   * @see #isTransient()
   * @generated
   */
  void setTransient(boolean value);

  /**
   * Returns the value of the '<em><b>Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Abstract</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Abstract</em>' attribute.
   * @see #setAbstract(boolean)
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.DataModelDslPackage#getEntity_Abstract()
   * @model
   * @generated
   */
  boolean isAbstract();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.examples.dataModelDsl.Entity#isAbstract <em>Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Abstract</em>' attribute.
   * @see #isAbstract()
   * @generated
   */
  void setAbstract(boolean value);

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
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.DataModelDslPackage#getEntity_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.examples.dataModelDsl.Entity#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Type</em>' reference.
   * @see #setSuperType(Entity)
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.DataModelDslPackage#getEntity_SuperType()
   * @model
   * @generated
   */
  Entity getSuperType();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.examples.dataModelDsl.Entity#getSuperType <em>Super Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Type</em>' reference.
   * @see #getSuperType()
   * @generated
   */
  void setSuperType(Entity value);

  /**
   * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
   * The list contents are of type {@link nl.dslmeinte.xtext.examples.dataModelDsl.Field}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fields</em>' containment reference list.
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.DataModelDslPackage#getEntity_Fields()
   * @model containment="true"
   * @generated
   */
  EList<Field> getFields();

  /**
   * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
   * The list contents are of type {@link nl.dslmeinte.xtext.examples.dataModelDsl.Constraint}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constraints</em>' containment reference list.
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.DataModelDslPackage#getEntity_Constraints()
   * @model containment="true"
   * @generated
   */
  EList<Constraint> getConstraints();

  /**
   * Returns the value of the '<em><b>Functions</b></em>' containment reference list.
   * The list contents are of type {@link nl.dslmeinte.xtext.examples.dataModelDsl.Function}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Functions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Functions</em>' containment reference list.
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.DataModelDslPackage#getEntity_Functions()
   * @model containment="true"
   * @generated
   */
  EList<Function> getFunctions();

} // Entity
