/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.examples.xsdLanguage;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see nl.dslmeinte.xtext.examples.xsdLanguage.XsdLanguagePackage
 * @generated
 */
public interface XsdLanguageFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  XsdLanguageFactory eINSTANCE = nl.dslmeinte.xtext.examples.xsdLanguage.impl.XsdLanguageFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Schema</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Schema</em>'.
   * @generated
   */
  Schema createSchema();

  /**
   * Returns a new object of class '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import</em>'.
   * @generated
   */
  Import createImport();

  /**
   * Returns a new object of class '<em>Top Level Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Top Level Definition</em>'.
   * @generated
   */
  TopLevelDefinition createTopLevelDefinition();

  /**
   * Returns a new object of class '<em>Top Level Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Top Level Type</em>'.
   * @generated
   */
  TopLevelType createTopLevelType();

  /**
   * Returns a new object of class '<em>Top Level Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Top Level Element</em>'.
   * @generated
   */
  TopLevelElement createTopLevelElement();

  /**
   * Returns a new object of class '<em>Top Level Simple Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Top Level Simple Type</em>'.
   * @generated
   */
  TopLevelSimpleType createTopLevelSimpleType();

  /**
   * Returns a new object of class '<em>Restriction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Restriction</em>'.
   * @generated
   */
  Restriction createRestriction();

  /**
   * Returns a new object of class '<em>Facet</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Facet</em>'.
   * @generated
   */
  Facet createFacet();

  /**
   * Returns a new object of class '<em>Enumeration Facet</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enumeration Facet</em>'.
   * @generated
   */
  EnumerationFacet createEnumerationFacet();

  /**
   * Returns a new object of class '<em>Enumeration Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enumeration Literal</em>'.
   * @generated
   */
  EnumerationLiteral createEnumerationLiteral();

  /**
   * Returns a new object of class '<em>Max Length Facet</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Max Length Facet</em>'.
   * @generated
   */
  MaxLengthFacet createMaxLengthFacet();

  /**
   * Returns a new object of class '<em>Pattern Facet</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pattern Facet</em>'.
   * @generated
   */
  PatternFacet createPatternFacet();

  /**
   * Returns a new object of class '<em>Range Facet</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Range Facet</em>'.
   * @generated
   */
  RangeFacet createRangeFacet();

  /**
   * Returns a new object of class '<em>Length Facet</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Length Facet</em>'.
   * @generated
   */
  LengthFacet createLengthFacet();

  /**
   * Returns a new object of class '<em>Documentation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Documentation</em>'.
   * @generated
   */
  Documentation createDocumentation();

  /**
   * Returns a new object of class '<em>Top Level Complex Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Top Level Complex Type</em>'.
   * @generated
   */
  TopLevelComplexType createTopLevelComplexType();

  /**
   * Returns a new object of class '<em>Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Property</em>'.
   * @generated
   */
  Property createProperty();

  /**
   * Returns a new object of class '<em>Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Element</em>'.
   * @generated
   */
  Element createElement();

  /**
   * Returns a new object of class '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute</em>'.
   * @generated
   */
  Attribute createAttribute();

  /**
   * Returns a new object of class '<em>Multiplicity</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Multiplicity</em>'.
   * @generated
   */
  Multiplicity createMultiplicity();

  /**
   * Returns a new object of class '<em>Named Type Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Named Type Reference</em>'.
   * @generated
   */
  NamedTypeReference createNamedTypeReference();

  /**
   * Returns a new object of class '<em>Non Complex Type Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Non Complex Type Reference</em>'.
   * @generated
   */
  NonComplexTypeReference createNonComplexTypeReference();

  /**
   * Returns a new object of class '<em>Builtin Type Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Builtin Type Reference</em>'.
   * @generated
   */
  BuiltinTypeReference createBuiltinTypeReference();

  /**
   * Returns a new object of class '<em>Top Level Type Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Top Level Type Reference</em>'.
   * @generated
   */
  TopLevelTypeReference createTopLevelTypeReference();

  /**
   * Returns a new object of class '<em>Top Level Complex Type Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Top Level Complex Type Reference</em>'.
   * @generated
   */
  TopLevelComplexTypeReference createTopLevelComplexTypeReference();

  /**
   * Returns a new object of class '<em>Top Level Simple Type Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Top Level Simple Type Reference</em>'.
   * @generated
   */
  TopLevelSimpleTypeReference createTopLevelSimpleTypeReference();

  /**
   * Returns a new object of class '<em>Direct Top Level Type Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Direct Top Level Type Reference</em>'.
   * @generated
   */
  DirectTopLevelTypeReference createDirectTopLevelTypeReference();

  /**
   * Returns a new object of class '<em>Direct Top Level Simple Type Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Direct Top Level Simple Type Reference</em>'.
   * @generated
   */
  DirectTopLevelSimpleTypeReference createDirectTopLevelSimpleTypeReference();

  /**
   * Returns a new object of class '<em>Direct Top Level Complex Type Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Direct Top Level Complex Type Reference</em>'.
   * @generated
   */
  DirectTopLevelComplexTypeReference createDirectTopLevelComplexTypeReference();

  /**
   * Returns a new object of class '<em>Imported Top Level Type Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Imported Top Level Type Reference</em>'.
   * @generated
   */
  ImportedTopLevelTypeReference createImportedTopLevelTypeReference();

  /**
   * Returns a new object of class '<em>Imported Top Level Simple Type Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Imported Top Level Simple Type Reference</em>'.
   * @generated
   */
  ImportedTopLevelSimpleTypeReference createImportedTopLevelSimpleTypeReference();

  /**
   * Returns a new object of class '<em>Imported Top Level Complex Type Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Imported Top Level Complex Type Reference</em>'.
   * @generated
   */
  ImportedTopLevelComplexTypeReference createImportedTopLevelComplexTypeReference();

  /**
   * Returns a new object of class '<em>Imported Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Imported Reference</em>'.
   * @generated
   */
  ImportedReference createImportedReference();

  /**
   * Returns a new object of class '<em>Embedded Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Embedded Type</em>'.
   * @generated
   */
  EmbeddedType createEmbeddedType();

  /**
   * Returns a new object of class '<em>Embedded Complex Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Embedded Complex Type</em>'.
   * @generated
   */
  EmbeddedComplexType createEmbeddedComplexType();

  /**
   * Returns a new object of class '<em>Embedded Simple Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Embedded Simple Type</em>'.
   * @generated
   */
  EmbeddedSimpleType createEmbeddedSimpleType();

  /**
   * Returns a new object of class '<em>Complex Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Complex Type</em>'.
   * @generated
   */
  ComplexType createComplexType();

  /**
   * Returns a new object of class '<em>Simple Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Simple Type</em>'.
   * @generated
   */
  SimpleType createSimpleType();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  XsdLanguagePackage getXsdLanguagePackage();

} //XsdLanguageFactory
