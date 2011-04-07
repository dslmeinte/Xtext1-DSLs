/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.examples.dynamicScreenDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.DynamicScreenDslPackage
 * @generated
 */
public interface DynamicScreenDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DynamicScreenDslFactory eINSTANCE = nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DynamicScreenDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Dynamic Screen</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dynamic Screen</em>'.
   * @generated
   */
  DynamicScreen createDynamicScreen();

  /**
   * Returns a new object of class '<em>Label</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Label</em>'.
   * @generated
   */
  Label createLabel();

  /**
   * Returns a new object of class '<em>Path Tail</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Path Tail</em>'.
   * @generated
   */
  PathTail createPathTail();

  /**
   * Returns a new object of class '<em>Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Declaration</em>'.
   * @generated
   */
  Declaration createDeclaration();

  /**
   * Returns a new object of class '<em>External Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>External Variable</em>'.
   * @generated
   */
  ExternalVariable createExternalVariable();

  /**
   * Returns a new object of class '<em>Enum List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum List</em>'.
   * @generated
   */
  EnumList createEnumList();

  /**
   * Returns a new object of class '<em>Data Store</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Store</em>'.
   * @generated
   */
  DataStore createDataStore();

  /**
   * Returns a new object of class '<em>Group Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Group Element</em>'.
   * @generated
   */
  GroupElement createGroupElement();

  /**
   * Returns a new object of class '<em>Field</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Field</em>'.
   * @generated
   */
  Field createField();

  /**
   * Returns a new object of class '<em>Field Group</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Field Group</em>'.
   * @generated
   */
  FieldGroup createFieldGroup();

  /**
   * Returns a new object of class '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute</em>'.
   * @generated
   */
  Attribute createAttribute();

  /**
   * Returns a new object of class '<em>Enum Field Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum Field Attribute</em>'.
   * @generated
   */
  EnumFieldAttribute createEnumFieldAttribute();

  /**
   * Returns a new object of class '<em>Normal Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Normal Attribute</em>'.
   * @generated
   */
  NormalAttribute createNormalAttribute();

  /**
   * Returns a new object of class '<em>Attribute Class Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute Class Expression</em>'.
   * @generated
   */
  AttributeClassExpression createAttributeClassExpression();

  /**
   * Returns a new object of class '<em>Restriction Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Restriction Attribute</em>'.
   * @generated
   */
  RestrictionAttribute createRestrictionAttribute();

  /**
   * Returns a new object of class '<em>Restriction Group Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Restriction Group Attribute</em>'.
   * @generated
   */
  RestrictionGroupAttribute createRestrictionGroupAttribute();

  /**
   * Returns a new object of class '<em>Restriction Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Restriction Rule</em>'.
   * @generated
   */
  RestrictionRule createRestrictionRule();

  /**
   * Returns a new object of class '<em>Reference Target</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Reference Target</em>'.
   * @generated
   */
  ReferenceTarget createReferenceTarget();

  /**
   * Returns a new object of class '<em>Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Reference</em>'.
   * @generated
   */
  Reference createReference();

  /**
   * Returns a new object of class '<em>Dummy For External Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dummy For External Variable</em>'.
   * @generated
   */
  DummyForExternalVariable createDummyForExternalVariable();

  /**
   * Returns a new object of class '<em>BExpression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BExpression</em>'.
   * @generated
   */
  BExpression createBExpression();

  /**
   * Returns a new object of class '<em>Atomic Referring BExpression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Atomic Referring BExpression</em>'.
   * @generated
   */
  AtomicReferringBExpression createAtomicReferringBExpression();

  /**
   * Returns a new object of class '<em>BComparison</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BComparison</em>'.
   * @generated
   */
  BComparison createBComparison();

  /**
   * Returns a new object of class '<em>Enum Comparison</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum Comparison</em>'.
   * @generated
   */
  EnumComparison createEnumComparison();

  /**
   * Returns a new object of class '<em>Single Enum Comparison</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Single Enum Comparison</em>'.
   * @generated
   */
  SingleEnumComparison createSingleEnumComparison();

  /**
   * Returns a new object of class '<em>Multi Enum Comparison</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Multi Enum Comparison</em>'.
   * @generated
   */
  MultiEnumComparison createMultiEnumComparison();

  /**
   * Returns a new object of class '<em>String Value Comparison</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Value Comparison</em>'.
   * @generated
   */
  StringValueComparison createStringValueComparison();

  /**
   * Returns a new object of class '<em>Presence Check</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Presence Check</em>'.
   * @generated
   */
  PresenceCheck createPresenceCheck();

  /**
   * Returns a new object of class '<em>Enum Literals Collection</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum Literals Collection</em>'.
   * @generated
   */
  EnumLiteralsCollection createEnumLiteralsCollection();

  /**
   * Returns a new object of class '<em>Direct Enum Literals Collection</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Direct Enum Literals Collection</em>'.
   * @generated
   */
  DirectEnumLiteralsCollection createDirectEnumLiteralsCollection();

  /**
   * Returns a new object of class '<em>Enum List Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum List Reference</em>'.
   * @generated
   */
  EnumListReference createEnumListReference();

  /**
   * Returns a new object of class '<em>Or Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Or Operation</em>'.
   * @generated
   */
  OrOperation createOrOperation();

  /**
   * Returns a new object of class '<em>And Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>And Operation</em>'.
   * @generated
   */
  AndOperation createAndOperation();

  /**
   * Returns a new object of class '<em>Negation Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Negation Expression</em>'.
   * @generated
   */
  NegationExpression createNegationExpression();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  DynamicScreenDslPackage getDynamicScreenDslPackage();

} //DynamicScreenDslFactory
