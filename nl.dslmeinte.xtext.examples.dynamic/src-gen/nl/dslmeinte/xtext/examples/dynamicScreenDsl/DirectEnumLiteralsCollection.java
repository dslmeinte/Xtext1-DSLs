/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.examples.dynamicScreenDsl;

import nl.dslmeinte.xtext.examples.dataModelDsl.EnumLiteral;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Direct Enum Literals Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.DirectEnumLiteralsCollection#getLiterals <em>Literals</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.DynamicScreenDslPackage#getDirectEnumLiteralsCollection()
 * @model
 * @generated
 */
public interface DirectEnumLiteralsCollection extends EnumLiteralsCollection
{
  /**
   * Returns the value of the '<em><b>Literals</b></em>' reference list.
   * The list contents are of type {@link nl.dslmeinte.xtext.examples.dataModelDsl.EnumLiteral}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Literals</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Literals</em>' reference list.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.DynamicScreenDslPackage#getDirectEnumLiteralsCollection_Literals()
   * @model
   * @generated
   */
  EList<EnumLiteral> getLiterals();

} // DirectEnumLiteralsCollection
