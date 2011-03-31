/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.examples.dynamicScreenDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.ReferenceTarget#getPath <em>Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.DynamicScreenDslPackage#getReferenceTarget()
 * @model
 * @generated
 */
public interface ReferenceTarget extends DummyForExternalVariable
{
  /**
   * Returns the value of the '<em><b>Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Path</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Path</em>' containment reference.
   * @see #setPath(PathTail)
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.DynamicScreenDslPackage#getReferenceTarget_Path()
   * @model containment="true"
   * @generated
   */
  PathTail getPath();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.ReferenceTarget#getPath <em>Path</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Path</em>' containment reference.
   * @see #getPath()
   * @generated
   */
  void setPath(PathTail value);

} // ReferenceTarget
