/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.examples.dynamicScreenDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BComparison</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.BComparison#getBLiteral <em>BLiteral</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.DynamicScreenDslPackage#getBComparison()
 * @model
 * @generated
 */
public interface BComparison extends AtomicReferringBExpression
{
  /**
   * Returns the value of the '<em><b>BLiteral</b></em>' attribute.
   * The literals are from the enumeration {@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.BLiteral}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>BLiteral</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>BLiteral</em>' attribute.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.BLiteral
   * @see #setBLiteral(BLiteral)
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.DynamicScreenDslPackage#getBComparison_BLiteral()
   * @model
   * @generated
   */
  BLiteral getBLiteral();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.BComparison#getBLiteral <em>BLiteral</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>BLiteral</em>' attribute.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.BLiteral
   * @see #getBLiteral()
   * @generated
   */
  void setBLiteral(BLiteral value);

} // BComparison
