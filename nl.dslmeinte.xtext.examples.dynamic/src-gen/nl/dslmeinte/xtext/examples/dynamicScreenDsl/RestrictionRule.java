/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.examples.dynamicScreenDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Restriction Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.RestrictionRule#getLiterals <em>Literals</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.RestrictionRule#getClause <em>Clause</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.DynamicScreenDslPackage#getRestrictionRule()
 * @model
 * @generated
 */
public interface RestrictionRule extends EObject
{
  /**
   * Returns the value of the '<em><b>Literals</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Literals</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Literals</em>' containment reference.
   * @see #setLiterals(EnumLiteralsCollection)
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.DynamicScreenDslPackage#getRestrictionRule_Literals()
   * @model containment="true"
   * @generated
   */
  EnumLiteralsCollection getLiterals();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.RestrictionRule#getLiterals <em>Literals</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Literals</em>' containment reference.
   * @see #getLiterals()
   * @generated
   */
  void setLiterals(EnumLiteralsCollection value);

  /**
   * Returns the value of the '<em><b>Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Clause</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Clause</em>' containment reference.
   * @see #setClause(BExpression)
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.DynamicScreenDslPackage#getRestrictionRule_Clause()
   * @model containment="true"
   * @generated
   */
  BExpression getClause();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.RestrictionRule#getClause <em>Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Clause</em>' containment reference.
   * @see #getClause()
   * @generated
   */
  void setClause(BExpression value);

} // RestrictionRule
