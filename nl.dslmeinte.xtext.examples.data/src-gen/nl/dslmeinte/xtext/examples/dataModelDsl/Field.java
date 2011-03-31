/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.examples.dataModelDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.examples.dataModelDsl.Field#getModifier <em>Modifier</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.examples.dataModelDsl.Field#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.xtext.examples.dataModelDsl.DataModelDslPackage#getField()
 * @model
 * @generated
 */
public interface Field extends Feature
{
  /**
   * Returns the value of the '<em><b>Modifier</b></em>' attribute.
   * The literals are from the enumeration {@link nl.dslmeinte.xtext.examples.dataModelDsl.Modifier}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modifier</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modifier</em>' attribute.
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.Modifier
   * @see #setModifier(Modifier)
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.DataModelDslPackage#getField_Modifier()
   * @model
   * @generated
   */
  Modifier getModifier();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.examples.dataModelDsl.Field#getModifier <em>Modifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Modifier</em>' attribute.
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.Modifier
   * @see #getModifier()
   * @generated
   */
  void setModifier(Modifier value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(Type)
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.DataModelDslPackage#getField_Type()
   * @model
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.examples.dataModelDsl.Field#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(Type value);

} // Field
