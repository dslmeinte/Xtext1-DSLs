/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.examples.xsdLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Builtin Type Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.examples.xsdLanguage.BuiltinTypeReference#getBuiltin <em>Builtin</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.xtext.examples.xsdLanguage.XsdLanguagePackage#getBuiltinTypeReference()
 * @model
 * @generated
 */
public interface BuiltinTypeReference extends NamedTypeReference, NonComplexTypeReference
{
  /**
   * Returns the value of the '<em><b>Builtin</b></em>' attribute.
   * The literals are from the enumeration {@link nl.dslmeinte.xtext.examples.xsdLanguage.BuiltinType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Builtin</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Builtin</em>' attribute.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.BuiltinType
   * @see #setBuiltin(BuiltinType)
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.XsdLanguagePackage#getBuiltinTypeReference_Builtin()
   * @model
   * @generated
   */
  BuiltinType getBuiltin();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.BuiltinTypeReference#getBuiltin <em>Builtin</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Builtin</em>' attribute.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.BuiltinType
   * @see #getBuiltin()
   * @generated
   */
  void setBuiltin(BuiltinType value);

} // BuiltinTypeReference
