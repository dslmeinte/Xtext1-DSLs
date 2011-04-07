/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.examples.dataModelDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.examples.dataModelDsl.PrimitiveType#getName <em>Name</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.examples.dataModelDsl.PrimitiveType#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.examples.dataModelDsl.PrimitiveType#getRealizationType <em>Realization Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.xtext.examples.dataModelDsl.DataModelDslPackage#getPrimitiveType()
 * @model
 * @generated
 */
public interface PrimitiveType extends Type, SimpleType
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
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.DataModelDslPackage#getPrimitiveType_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.examples.dataModelDsl.PrimitiveType#getName <em>Name</em>}' attribute.
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
   * @see #setSuperType(PrimitiveType)
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.DataModelDslPackage#getPrimitiveType_SuperType()
   * @model
   * @generated
   */
  PrimitiveType getSuperType();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.examples.dataModelDsl.PrimitiveType#getSuperType <em>Super Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Type</em>' reference.
   * @see #getSuperType()
   * @generated
   */
  void setSuperType(PrimitiveType value);

  /**
   * Returns the value of the '<em><b>Realization Type</b></em>' attribute.
   * The literals are from the enumeration {@link nl.dslmeinte.xtext.examples.dataModelDsl.MetaPrimitiveType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Realization Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Realization Type</em>' attribute.
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.MetaPrimitiveType
   * @see #setRealizationType(MetaPrimitiveType)
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.DataModelDslPackage#getPrimitiveType_RealizationType()
   * @model
   * @generated
   */
  MetaPrimitiveType getRealizationType();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.examples.dataModelDsl.PrimitiveType#getRealizationType <em>Realization Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Realization Type</em>' attribute.
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.MetaPrimitiveType
   * @see #getRealizationType()
   * @generated
   */
  void setRealizationType(MetaPrimitiveType value);

} // PrimitiveType
