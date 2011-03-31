/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.examples.xsdLanguage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see nl.dslmeinte.xtext.examples.xsdLanguage.XsdLanguageFactory
 * @model kind="package"
 * @generated
 */
public interface XsdLanguagePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "xsdLanguage";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.dslmeinte.nl/xtext/examples/XsdLanguage";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "xsdLanguage";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  XsdLanguagePackage eINSTANCE = nl.dslmeinte.xtext.examples.xsdLanguage.impl.XsdLanguagePackageImpl.init();

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.impl.SchemaImpl <em>Schema</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.SchemaImpl
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.XsdLanguagePackageImpl#getSchema()
   * @generated
   */
  int SCHEMA = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEMA__NAME = 0;

  /**
   * The feature id for the '<em><b>Ns URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEMA__NS_URI = 1;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEMA__IMPORTS = 2;

  /**
   * The feature id for the '<em><b>Definitions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEMA__DEFINITIONS = 3;

  /**
   * The number of structural features of the '<em>Schema</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEMA_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.ImportImpl
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.XsdLanguagePackageImpl#getImport()
   * @generated
   */
  int IMPORT = 1;

  /**
   * The feature id for the '<em><b>Import URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORT_URI = 0;

  /**
   * The feature id for the '<em><b>Ns Prefix</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__NS_PREFIX = 1;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.impl.TopLevelDefinitionImpl <em>Top Level Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.TopLevelDefinitionImpl
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.XsdLanguagePackageImpl#getTopLevelDefinition()
   * @generated
   */
  int TOP_LEVEL_DEFINITION = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOP_LEVEL_DEFINITION__NAME = 0;

  /**
   * The number of structural features of the '<em>Top Level Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOP_LEVEL_DEFINITION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.impl.TopLevelTypeImpl <em>Top Level Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.TopLevelTypeImpl
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.XsdLanguagePackageImpl#getTopLevelType()
   * @generated
   */
  int TOP_LEVEL_TYPE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOP_LEVEL_TYPE__NAME = TOP_LEVEL_DEFINITION__NAME;

  /**
   * The number of structural features of the '<em>Top Level Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOP_LEVEL_TYPE_FEATURE_COUNT = TOP_LEVEL_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.impl.TopLevelElementImpl <em>Top Level Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.TopLevelElementImpl
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.XsdLanguagePackageImpl#getTopLevelElement()
   * @generated
   */
  int TOP_LEVEL_ELEMENT = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOP_LEVEL_ELEMENT__NAME = TOP_LEVEL_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Type Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOP_LEVEL_ELEMENT__TYPE_REF = TOP_LEVEL_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Embedded Type Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOP_LEVEL_ELEMENT__EMBEDDED_TYPE_DEF = TOP_LEVEL_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Top Level Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOP_LEVEL_ELEMENT_FEATURE_COUNT = TOP_LEVEL_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.impl.TopLevelSimpleTypeImpl <em>Top Level Simple Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.TopLevelSimpleTypeImpl
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.XsdLanguagePackageImpl#getTopLevelSimpleType()
   * @generated
   */
  int TOP_LEVEL_SIMPLE_TYPE = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOP_LEVEL_SIMPLE_TYPE__NAME = TOP_LEVEL_TYPE__NAME;

  /**
   * The feature id for the '<em><b>Restriction</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOP_LEVEL_SIMPLE_TYPE__RESTRICTION = TOP_LEVEL_TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Documentation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOP_LEVEL_SIMPLE_TYPE__DOCUMENTATION = TOP_LEVEL_TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Top Level Simple Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOP_LEVEL_SIMPLE_TYPE_FEATURE_COUNT = TOP_LEVEL_TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.impl.RestrictionImpl <em>Restriction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.RestrictionImpl
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.XsdLanguagePackageImpl#getRestriction()
   * @generated
   */
  int RESTRICTION = 6;

  /**
   * The feature id for the '<em><b>Type Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESTRICTION__TYPE_REF = 0;

  /**
   * The feature id for the '<em><b>Facets</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESTRICTION__FACETS = 1;

  /**
   * The number of structural features of the '<em>Restriction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESTRICTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.impl.FacetImpl <em>Facet</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.FacetImpl
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.XsdLanguagePackageImpl#getFacet()
   * @generated
   */
  int FACET = 7;

  /**
   * The number of structural features of the '<em>Facet</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACET_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.impl.EnumerationFacetImpl <em>Enumeration Facet</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.EnumerationFacetImpl
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.XsdLanguagePackageImpl#getEnumerationFacet()
   * @generated
   */
  int ENUMERATION_FACET = 8;

  /**
   * The feature id for the '<em><b>Literals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION_FACET__LITERALS = FACET_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Enumeration Facet</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION_FACET_FEATURE_COUNT = FACET_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.impl.EnumerationLiteralImpl <em>Enumeration Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.EnumerationLiteralImpl
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.XsdLanguagePackageImpl#getEnumerationLiteral()
   * @generated
   */
  int ENUMERATION_LITERAL = 9;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION_LITERAL__VALUE = 0;

  /**
   * The feature id for the '<em><b>Annotation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION_LITERAL__ANNOTATION = 1;

  /**
   * The number of structural features of the '<em>Enumeration Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION_LITERAL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.impl.MaxLengthFacetImpl <em>Max Length Facet</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.MaxLengthFacetImpl
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.XsdLanguagePackageImpl#getMaxLengthFacet()
   * @generated
   */
  int MAX_LENGTH_FACET = 10;

  /**
   * The feature id for the '<em><b>Max Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAX_LENGTH_FACET__MAX_LENGTH = FACET_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Max Length Facet</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAX_LENGTH_FACET_FEATURE_COUNT = FACET_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.impl.PatternFacetImpl <em>Pattern Facet</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.PatternFacetImpl
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.XsdLanguagePackageImpl#getPatternFacet()
   * @generated
   */
  int PATTERN_FACET = 11;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATTERN_FACET__PATTERN = FACET_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Pattern Facet</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATTERN_FACET_FEATURE_COUNT = FACET_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.impl.RangeFacetImpl <em>Range Facet</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.RangeFacetImpl
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.XsdLanguagePackageImpl#getRangeFacet()
   * @generated
   */
  int RANGE_FACET = 12;

  /**
   * The feature id for the '<em><b>Lower</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE_FACET__LOWER = FACET_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Upper</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE_FACET__UPPER = FACET_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Range Facet</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE_FACET_FEATURE_COUNT = FACET_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.impl.LengthFacetImpl <em>Length Facet</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.LengthFacetImpl
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.XsdLanguagePackageImpl#getLengthFacet()
   * @generated
   */
  int LENGTH_FACET = 13;

  /**
   * The feature id for the '<em><b>Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LENGTH_FACET__LENGTH = FACET_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Length Facet</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LENGTH_FACET_FEATURE_COUNT = FACET_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.impl.DocumentationImpl <em>Documentation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.DocumentationImpl
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.XsdLanguagePackageImpl#getDocumentation()
   * @generated
   */
  int DOCUMENTATION = 14;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENTATION__TEXT = 0;

  /**
   * The number of structural features of the '<em>Documentation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENTATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.impl.TopLevelComplexTypeImpl <em>Top Level Complex Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.TopLevelComplexTypeImpl
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.XsdLanguagePackageImpl#getTopLevelComplexType()
   * @generated
   */
  int TOP_LEVEL_COMPLEX_TYPE = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOP_LEVEL_COMPLEX_TYPE__NAME = TOP_LEVEL_TYPE__NAME;

  /**
   * The feature id for the '<em><b>Extends</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOP_LEVEL_COMPLEX_TYPE__EXTENDS = TOP_LEVEL_TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOP_LEVEL_COMPLEX_TYPE__PROPERTIES = TOP_LEVEL_TYPE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOP_LEVEL_COMPLEX_TYPE__ABSTRACT = TOP_LEVEL_TYPE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Documentation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOP_LEVEL_COMPLEX_TYPE__DOCUMENTATION = TOP_LEVEL_TYPE_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Top Level Complex Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOP_LEVEL_COMPLEX_TYPE_FEATURE_COUNT = TOP_LEVEL_TYPE_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.impl.PropertyImpl <em>Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.PropertyImpl
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.XsdLanguagePackageImpl#getProperty()
   * @generated
   */
  int PROPERTY = 16;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__NAME = 0;

  /**
   * The number of structural features of the '<em>Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.impl.ElementImpl <em>Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.ElementImpl
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.XsdLanguagePackageImpl#getElement()
   * @generated
   */
  int ELEMENT = 17;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__NAME = PROPERTY__NAME;

  /**
   * The feature id for the '<em><b>Type Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__TYPE_REF = PROPERTY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Embedded Type Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__EMBEDDED_TYPE_DEF = PROPERTY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__MULTIPLICITY = PROPERTY_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.AttributeImpl
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.XsdLanguagePackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 18;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__NAME = PROPERTY__NAME;

  /**
   * The feature id for the '<em><b>Required</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__REQUIRED = PROPERTY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__TYPE_REF = PROPERTY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.impl.MultiplicityImpl <em>Multiplicity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.MultiplicityImpl
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.XsdLanguagePackageImpl#getMultiplicity()
   * @generated
   */
  int MULTIPLICITY = 19;

  /**
   * The feature id for the '<em><b>Lower</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICITY__LOWER = 0;

  /**
   * The feature id for the '<em><b>Upper</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICITY__UPPER = 1;

  /**
   * The feature id for the '<em><b>Unbounded</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICITY__UNBOUNDED = 2;

  /**
   * The number of structural features of the '<em>Multiplicity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICITY_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.impl.NamedTypeReferenceImpl <em>Named Type Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.NamedTypeReferenceImpl
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.XsdLanguagePackageImpl#getNamedTypeReference()
   * @generated
   */
  int NAMED_TYPE_REFERENCE = 20;

  /**
   * The number of structural features of the '<em>Named Type Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_TYPE_REFERENCE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.impl.NonComplexTypeReferenceImpl <em>Non Complex Type Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.NonComplexTypeReferenceImpl
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.XsdLanguagePackageImpl#getNonComplexTypeReference()
   * @generated
   */
  int NON_COMPLEX_TYPE_REFERENCE = 21;

  /**
   * The number of structural features of the '<em>Non Complex Type Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_COMPLEX_TYPE_REFERENCE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.impl.BuiltinTypeReferenceImpl <em>Builtin Type Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.BuiltinTypeReferenceImpl
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.XsdLanguagePackageImpl#getBuiltinTypeReference()
   * @generated
   */
  int BUILTIN_TYPE_REFERENCE = 22;

  /**
   * The feature id for the '<em><b>Builtin</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILTIN_TYPE_REFERENCE__BUILTIN = NAMED_TYPE_REFERENCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Builtin Type Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILTIN_TYPE_REFERENCE_FEATURE_COUNT = NAMED_TYPE_REFERENCE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.impl.TopLevelTypeReferenceImpl <em>Top Level Type Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.TopLevelTypeReferenceImpl
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.XsdLanguagePackageImpl#getTopLevelTypeReference()
   * @generated
   */
  int TOP_LEVEL_TYPE_REFERENCE = 23;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOP_LEVEL_TYPE_REFERENCE__REF = NAMED_TYPE_REFERENCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Top Level Type Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOP_LEVEL_TYPE_REFERENCE_FEATURE_COUNT = NAMED_TYPE_REFERENCE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.impl.TopLevelComplexTypeReferenceImpl <em>Top Level Complex Type Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.TopLevelComplexTypeReferenceImpl
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.XsdLanguagePackageImpl#getTopLevelComplexTypeReference()
   * @generated
   */
  int TOP_LEVEL_COMPLEX_TYPE_REFERENCE = 24;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOP_LEVEL_COMPLEX_TYPE_REFERENCE__REF = 0;

  /**
   * The number of structural features of the '<em>Top Level Complex Type Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOP_LEVEL_COMPLEX_TYPE_REFERENCE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.impl.TopLevelSimpleTypeReferenceImpl <em>Top Level Simple Type Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.TopLevelSimpleTypeReferenceImpl
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.XsdLanguagePackageImpl#getTopLevelSimpleTypeReference()
   * @generated
   */
  int TOP_LEVEL_SIMPLE_TYPE_REFERENCE = 25;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOP_LEVEL_SIMPLE_TYPE_REFERENCE__REF = NON_COMPLEX_TYPE_REFERENCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Top Level Simple Type Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOP_LEVEL_SIMPLE_TYPE_REFERENCE_FEATURE_COUNT = NON_COMPLEX_TYPE_REFERENCE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.impl.DirectTopLevelTypeReferenceImpl <em>Direct Top Level Type Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.DirectTopLevelTypeReferenceImpl
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.XsdLanguagePackageImpl#getDirectTopLevelTypeReference()
   * @generated
   */
  int DIRECT_TOP_LEVEL_TYPE_REFERENCE = 26;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECT_TOP_LEVEL_TYPE_REFERENCE__REF = TOP_LEVEL_TYPE_REFERENCE__REF;

  /**
   * The number of structural features of the '<em>Direct Top Level Type Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECT_TOP_LEVEL_TYPE_REFERENCE_FEATURE_COUNT = TOP_LEVEL_TYPE_REFERENCE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.impl.DirectTopLevelSimpleTypeReferenceImpl <em>Direct Top Level Simple Type Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.DirectTopLevelSimpleTypeReferenceImpl
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.XsdLanguagePackageImpl#getDirectTopLevelSimpleTypeReference()
   * @generated
   */
  int DIRECT_TOP_LEVEL_SIMPLE_TYPE_REFERENCE = 27;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECT_TOP_LEVEL_SIMPLE_TYPE_REFERENCE__REF = TOP_LEVEL_SIMPLE_TYPE_REFERENCE__REF;

  /**
   * The number of structural features of the '<em>Direct Top Level Simple Type Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECT_TOP_LEVEL_SIMPLE_TYPE_REFERENCE_FEATURE_COUNT = TOP_LEVEL_SIMPLE_TYPE_REFERENCE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.impl.DirectTopLevelComplexTypeReferenceImpl <em>Direct Top Level Complex Type Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.DirectTopLevelComplexTypeReferenceImpl
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.XsdLanguagePackageImpl#getDirectTopLevelComplexTypeReference()
   * @generated
   */
  int DIRECT_TOP_LEVEL_COMPLEX_TYPE_REFERENCE = 28;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECT_TOP_LEVEL_COMPLEX_TYPE_REFERENCE__REF = TOP_LEVEL_COMPLEX_TYPE_REFERENCE__REF;

  /**
   * The number of structural features of the '<em>Direct Top Level Complex Type Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECT_TOP_LEVEL_COMPLEX_TYPE_REFERENCE_FEATURE_COUNT = TOP_LEVEL_COMPLEX_TYPE_REFERENCE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.impl.ImportedTopLevelTypeReferenceImpl <em>Imported Top Level Type Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.ImportedTopLevelTypeReferenceImpl
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.XsdLanguagePackageImpl#getImportedTopLevelTypeReference()
   * @generated
   */
  int IMPORTED_TOP_LEVEL_TYPE_REFERENCE = 29;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORTED_TOP_LEVEL_TYPE_REFERENCE__REF = TOP_LEVEL_TYPE_REFERENCE__REF;

  /**
   * The feature id for the '<em><b>Import</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORTED_TOP_LEVEL_TYPE_REFERENCE__IMPORT = TOP_LEVEL_TYPE_REFERENCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Imported Top Level Type Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORTED_TOP_LEVEL_TYPE_REFERENCE_FEATURE_COUNT = TOP_LEVEL_TYPE_REFERENCE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.impl.ImportedTopLevelSimpleTypeReferenceImpl <em>Imported Top Level Simple Type Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.ImportedTopLevelSimpleTypeReferenceImpl
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.XsdLanguagePackageImpl#getImportedTopLevelSimpleTypeReference()
   * @generated
   */
  int IMPORTED_TOP_LEVEL_SIMPLE_TYPE_REFERENCE = 30;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORTED_TOP_LEVEL_SIMPLE_TYPE_REFERENCE__REF = TOP_LEVEL_SIMPLE_TYPE_REFERENCE__REF;

  /**
   * The feature id for the '<em><b>Import</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORTED_TOP_LEVEL_SIMPLE_TYPE_REFERENCE__IMPORT = TOP_LEVEL_SIMPLE_TYPE_REFERENCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Imported Top Level Simple Type Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORTED_TOP_LEVEL_SIMPLE_TYPE_REFERENCE_FEATURE_COUNT = TOP_LEVEL_SIMPLE_TYPE_REFERENCE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.impl.ImportedTopLevelComplexTypeReferenceImpl <em>Imported Top Level Complex Type Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.ImportedTopLevelComplexTypeReferenceImpl
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.XsdLanguagePackageImpl#getImportedTopLevelComplexTypeReference()
   * @generated
   */
  int IMPORTED_TOP_LEVEL_COMPLEX_TYPE_REFERENCE = 31;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORTED_TOP_LEVEL_COMPLEX_TYPE_REFERENCE__REF = TOP_LEVEL_COMPLEX_TYPE_REFERENCE__REF;

  /**
   * The feature id for the '<em><b>Import</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORTED_TOP_LEVEL_COMPLEX_TYPE_REFERENCE__IMPORT = TOP_LEVEL_COMPLEX_TYPE_REFERENCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Imported Top Level Complex Type Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORTED_TOP_LEVEL_COMPLEX_TYPE_REFERENCE_FEATURE_COUNT = TOP_LEVEL_COMPLEX_TYPE_REFERENCE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.impl.ImportedReferenceImpl <em>Imported Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.ImportedReferenceImpl
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.XsdLanguagePackageImpl#getImportedReference()
   * @generated
   */
  int IMPORTED_REFERENCE = 32;

  /**
   * The feature id for the '<em><b>Import</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORTED_REFERENCE__IMPORT = 0;

  /**
   * The number of structural features of the '<em>Imported Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORTED_REFERENCE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.impl.EmbeddedTypeImpl <em>Embedded Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.EmbeddedTypeImpl
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.XsdLanguagePackageImpl#getEmbeddedType()
   * @generated
   */
  int EMBEDDED_TYPE = 33;

  /**
   * The number of structural features of the '<em>Embedded Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMBEDDED_TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.impl.EmbeddedComplexTypeImpl <em>Embedded Complex Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.EmbeddedComplexTypeImpl
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.XsdLanguagePackageImpl#getEmbeddedComplexType()
   * @generated
   */
  int EMBEDDED_COMPLEX_TYPE = 34;

  /**
   * The feature id for the '<em><b>Extends</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMBEDDED_COMPLEX_TYPE__EXTENDS = EMBEDDED_TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMBEDDED_COMPLEX_TYPE__PROPERTIES = EMBEDDED_TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Embedded Complex Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMBEDDED_COMPLEX_TYPE_FEATURE_COUNT = EMBEDDED_TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.impl.EmbeddedSimpleTypeImpl <em>Embedded Simple Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.EmbeddedSimpleTypeImpl
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.XsdLanguagePackageImpl#getEmbeddedSimpleType()
   * @generated
   */
  int EMBEDDED_SIMPLE_TYPE = 35;

  /**
   * The feature id for the '<em><b>Restriction</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMBEDDED_SIMPLE_TYPE__RESTRICTION = EMBEDDED_TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Documentation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMBEDDED_SIMPLE_TYPE__DOCUMENTATION = EMBEDDED_TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Embedded Simple Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMBEDDED_SIMPLE_TYPE_FEATURE_COUNT = EMBEDDED_TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.impl.ComplexTypeImpl <em>Complex Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.ComplexTypeImpl
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.XsdLanguagePackageImpl#getComplexType()
   * @generated
   */
  int COMPLEX_TYPE = 36;

  /**
   * The feature id for the '<em><b>Extends</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_TYPE__EXTENDS = 0;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_TYPE__PROPERTIES = 1;

  /**
   * The number of structural features of the '<em>Complex Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.impl.SimpleTypeImpl <em>Simple Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.SimpleTypeImpl
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.XsdLanguagePackageImpl#getSimpleType()
   * @generated
   */
  int SIMPLE_TYPE = 37;

  /**
   * The feature id for the '<em><b>Restriction</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_TYPE__RESTRICTION = 0;

  /**
   * The feature id for the '<em><b>Documentation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_TYPE__DOCUMENTATION = 1;

  /**
   * The number of structural features of the '<em>Simple Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.BuiltinType <em>Builtin Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.BuiltinType
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.XsdLanguagePackageImpl#getBuiltinType()
   * @generated
   */
  int BUILTIN_TYPE = 38;


  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.xsdLanguage.Schema <em>Schema</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Schema</em>'.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.Schema
   * @generated
   */
  EClass getSchema();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.examples.xsdLanguage.Schema#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.Schema#getName()
   * @see #getSchema()
   * @generated
   */
  EAttribute getSchema_Name();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.examples.xsdLanguage.Schema#getNsURI <em>Ns URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ns URI</em>'.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.Schema#getNsURI()
   * @see #getSchema()
   * @generated
   */
  EAttribute getSchema_NsURI();

  /**
   * Returns the meta object for the containment reference list '{@link nl.dslmeinte.xtext.examples.xsdLanguage.Schema#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.Schema#getImports()
   * @see #getSchema()
   * @generated
   */
  EReference getSchema_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link nl.dslmeinte.xtext.examples.xsdLanguage.Schema#getDefinitions <em>Definitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Definitions</em>'.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.Schema#getDefinitions()
   * @see #getSchema()
   * @generated
   */
  EReference getSchema_Definitions();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.xsdLanguage.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.examples.xsdLanguage.Import#getImportURI <em>Import URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Import URI</em>'.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.Import#getImportURI()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportURI();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.examples.xsdLanguage.Import#getNsPrefix <em>Ns Prefix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ns Prefix</em>'.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.Import#getNsPrefix()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_NsPrefix();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.xsdLanguage.TopLevelDefinition <em>Top Level Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Top Level Definition</em>'.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.TopLevelDefinition
   * @generated
   */
  EClass getTopLevelDefinition();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.examples.xsdLanguage.TopLevelDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.TopLevelDefinition#getName()
   * @see #getTopLevelDefinition()
   * @generated
   */
  EAttribute getTopLevelDefinition_Name();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.xsdLanguage.TopLevelType <em>Top Level Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Top Level Type</em>'.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.TopLevelType
   * @generated
   */
  EClass getTopLevelType();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.xsdLanguage.TopLevelElement <em>Top Level Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Top Level Element</em>'.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.TopLevelElement
   * @generated
   */
  EClass getTopLevelElement();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.xtext.examples.xsdLanguage.TopLevelElement#getTypeRef <em>Type Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type Ref</em>'.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.TopLevelElement#getTypeRef()
   * @see #getTopLevelElement()
   * @generated
   */
  EReference getTopLevelElement_TypeRef();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.xtext.examples.xsdLanguage.TopLevelElement#getEmbeddedTypeDef <em>Embedded Type Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Embedded Type Def</em>'.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.TopLevelElement#getEmbeddedTypeDef()
   * @see #getTopLevelElement()
   * @generated
   */
  EReference getTopLevelElement_EmbeddedTypeDef();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.xsdLanguage.TopLevelSimpleType <em>Top Level Simple Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Top Level Simple Type</em>'.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.TopLevelSimpleType
   * @generated
   */
  EClass getTopLevelSimpleType();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.xsdLanguage.Restriction <em>Restriction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Restriction</em>'.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.Restriction
   * @generated
   */
  EClass getRestriction();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.xtext.examples.xsdLanguage.Restriction#getTypeRef <em>Type Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type Ref</em>'.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.Restriction#getTypeRef()
   * @see #getRestriction()
   * @generated
   */
  EReference getRestriction_TypeRef();

  /**
   * Returns the meta object for the containment reference list '{@link nl.dslmeinte.xtext.examples.xsdLanguage.Restriction#getFacets <em>Facets</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Facets</em>'.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.Restriction#getFacets()
   * @see #getRestriction()
   * @generated
   */
  EReference getRestriction_Facets();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.xsdLanguage.Facet <em>Facet</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Facet</em>'.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.Facet
   * @generated
   */
  EClass getFacet();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.xsdLanguage.EnumerationFacet <em>Enumeration Facet</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enumeration Facet</em>'.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.EnumerationFacet
   * @generated
   */
  EClass getEnumerationFacet();

  /**
   * Returns the meta object for the containment reference list '{@link nl.dslmeinte.xtext.examples.xsdLanguage.EnumerationFacet#getLiterals <em>Literals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Literals</em>'.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.EnumerationFacet#getLiterals()
   * @see #getEnumerationFacet()
   * @generated
   */
  EReference getEnumerationFacet_Literals();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.xsdLanguage.EnumerationLiteral <em>Enumeration Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enumeration Literal</em>'.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.EnumerationLiteral
   * @generated
   */
  EClass getEnumerationLiteral();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.examples.xsdLanguage.EnumerationLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.EnumerationLiteral#getValue()
   * @see #getEnumerationLiteral()
   * @generated
   */
  EAttribute getEnumerationLiteral_Value();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.examples.xsdLanguage.EnumerationLiteral#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Annotation</em>'.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.EnumerationLiteral#getAnnotation()
   * @see #getEnumerationLiteral()
   * @generated
   */
  EAttribute getEnumerationLiteral_Annotation();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.xsdLanguage.MaxLengthFacet <em>Max Length Facet</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Max Length Facet</em>'.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.MaxLengthFacet
   * @generated
   */
  EClass getMaxLengthFacet();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.examples.xsdLanguage.MaxLengthFacet#getMaxLength <em>Max Length</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Max Length</em>'.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.MaxLengthFacet#getMaxLength()
   * @see #getMaxLengthFacet()
   * @generated
   */
  EAttribute getMaxLengthFacet_MaxLength();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.xsdLanguage.PatternFacet <em>Pattern Facet</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pattern Facet</em>'.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.PatternFacet
   * @generated
   */
  EClass getPatternFacet();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.examples.xsdLanguage.PatternFacet#getPattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pattern</em>'.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.PatternFacet#getPattern()
   * @see #getPatternFacet()
   * @generated
   */
  EAttribute getPatternFacet_Pattern();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.xsdLanguage.RangeFacet <em>Range Facet</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Range Facet</em>'.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.RangeFacet
   * @generated
   */
  EClass getRangeFacet();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.examples.xsdLanguage.RangeFacet#getLower <em>Lower</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lower</em>'.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.RangeFacet#getLower()
   * @see #getRangeFacet()
   * @generated
   */
  EAttribute getRangeFacet_Lower();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.examples.xsdLanguage.RangeFacet#getUpper <em>Upper</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Upper</em>'.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.RangeFacet#getUpper()
   * @see #getRangeFacet()
   * @generated
   */
  EAttribute getRangeFacet_Upper();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.xsdLanguage.LengthFacet <em>Length Facet</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Length Facet</em>'.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.LengthFacet
   * @generated
   */
  EClass getLengthFacet();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.examples.xsdLanguage.LengthFacet#getLength <em>Length</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Length</em>'.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.LengthFacet#getLength()
   * @see #getLengthFacet()
   * @generated
   */
  EAttribute getLengthFacet_Length();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.xsdLanguage.Documentation <em>Documentation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Documentation</em>'.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.Documentation
   * @generated
   */
  EClass getDocumentation();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.examples.xsdLanguage.Documentation#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.Documentation#getText()
   * @see #getDocumentation()
   * @generated
   */
  EAttribute getDocumentation_Text();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.xsdLanguage.TopLevelComplexType <em>Top Level Complex Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Top Level Complex Type</em>'.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.TopLevelComplexType
   * @generated
   */
  EClass getTopLevelComplexType();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.examples.xsdLanguage.TopLevelComplexType#isAbstract <em>Abstract</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Abstract</em>'.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.TopLevelComplexType#isAbstract()
   * @see #getTopLevelComplexType()
   * @generated
   */
  EAttribute getTopLevelComplexType_Abstract();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.examples.xsdLanguage.TopLevelComplexType#getDocumentation <em>Documentation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Documentation</em>'.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.TopLevelComplexType#getDocumentation()
   * @see #getTopLevelComplexType()
   * @generated
   */
  EAttribute getTopLevelComplexType_Documentation();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.xsdLanguage.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property</em>'.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.Property
   * @generated
   */
  EClass getProperty();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.examples.xsdLanguage.Property#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.Property#getName()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_Name();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.xsdLanguage.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element</em>'.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.Element
   * @generated
   */
  EClass getElement();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.xtext.examples.xsdLanguage.Element#getTypeRef <em>Type Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type Ref</em>'.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.Element#getTypeRef()
   * @see #getElement()
   * @generated
   */
  EReference getElement_TypeRef();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.xtext.examples.xsdLanguage.Element#getEmbeddedTypeDef <em>Embedded Type Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Embedded Type Def</em>'.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.Element#getEmbeddedTypeDef()
   * @see #getElement()
   * @generated
   */
  EReference getElement_EmbeddedTypeDef();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.xtext.examples.xsdLanguage.Element#getMultiplicity <em>Multiplicity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Multiplicity</em>'.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.Element#getMultiplicity()
   * @see #getElement()
   * @generated
   */
  EReference getElement_Multiplicity();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.xsdLanguage.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.examples.xsdLanguage.Attribute#isRequired <em>Required</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Required</em>'.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.Attribute#isRequired()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Required();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.xtext.examples.xsdLanguage.Attribute#getTypeRef <em>Type Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type Ref</em>'.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.Attribute#getTypeRef()
   * @see #getAttribute()
   * @generated
   */
  EReference getAttribute_TypeRef();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.xsdLanguage.Multiplicity <em>Multiplicity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multiplicity</em>'.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.Multiplicity
   * @generated
   */
  EClass getMultiplicity();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.examples.xsdLanguage.Multiplicity#getLower <em>Lower</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lower</em>'.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.Multiplicity#getLower()
   * @see #getMultiplicity()
   * @generated
   */
  EAttribute getMultiplicity_Lower();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.examples.xsdLanguage.Multiplicity#getUpper <em>Upper</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Upper</em>'.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.Multiplicity#getUpper()
   * @see #getMultiplicity()
   * @generated
   */
  EAttribute getMultiplicity_Upper();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.examples.xsdLanguage.Multiplicity#isUnbounded <em>Unbounded</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unbounded</em>'.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.Multiplicity#isUnbounded()
   * @see #getMultiplicity()
   * @generated
   */
  EAttribute getMultiplicity_Unbounded();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.xsdLanguage.NamedTypeReference <em>Named Type Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Named Type Reference</em>'.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.NamedTypeReference
   * @generated
   */
  EClass getNamedTypeReference();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.xsdLanguage.NonComplexTypeReference <em>Non Complex Type Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Non Complex Type Reference</em>'.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.NonComplexTypeReference
   * @generated
   */
  EClass getNonComplexTypeReference();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.xsdLanguage.BuiltinTypeReference <em>Builtin Type Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Builtin Type Reference</em>'.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.BuiltinTypeReference
   * @generated
   */
  EClass getBuiltinTypeReference();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.examples.xsdLanguage.BuiltinTypeReference#getBuiltin <em>Builtin</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Builtin</em>'.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.BuiltinTypeReference#getBuiltin()
   * @see #getBuiltinTypeReference()
   * @generated
   */
  EAttribute getBuiltinTypeReference_Builtin();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.xsdLanguage.TopLevelTypeReference <em>Top Level Type Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Top Level Type Reference</em>'.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.TopLevelTypeReference
   * @generated
   */
  EClass getTopLevelTypeReference();

  /**
   * Returns the meta object for the reference '{@link nl.dslmeinte.xtext.examples.xsdLanguage.TopLevelTypeReference#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.TopLevelTypeReference#getRef()
   * @see #getTopLevelTypeReference()
   * @generated
   */
  EReference getTopLevelTypeReference_Ref();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.xsdLanguage.TopLevelComplexTypeReference <em>Top Level Complex Type Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Top Level Complex Type Reference</em>'.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.TopLevelComplexTypeReference
   * @generated
   */
  EClass getTopLevelComplexTypeReference();

  /**
   * Returns the meta object for the reference '{@link nl.dslmeinte.xtext.examples.xsdLanguage.TopLevelComplexTypeReference#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.TopLevelComplexTypeReference#getRef()
   * @see #getTopLevelComplexTypeReference()
   * @generated
   */
  EReference getTopLevelComplexTypeReference_Ref();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.xsdLanguage.TopLevelSimpleTypeReference <em>Top Level Simple Type Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Top Level Simple Type Reference</em>'.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.TopLevelSimpleTypeReference
   * @generated
   */
  EClass getTopLevelSimpleTypeReference();

  /**
   * Returns the meta object for the reference '{@link nl.dslmeinte.xtext.examples.xsdLanguage.TopLevelSimpleTypeReference#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.TopLevelSimpleTypeReference#getRef()
   * @see #getTopLevelSimpleTypeReference()
   * @generated
   */
  EReference getTopLevelSimpleTypeReference_Ref();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.xsdLanguage.DirectTopLevelTypeReference <em>Direct Top Level Type Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Direct Top Level Type Reference</em>'.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.DirectTopLevelTypeReference
   * @generated
   */
  EClass getDirectTopLevelTypeReference();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.xsdLanguage.DirectTopLevelSimpleTypeReference <em>Direct Top Level Simple Type Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Direct Top Level Simple Type Reference</em>'.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.DirectTopLevelSimpleTypeReference
   * @generated
   */
  EClass getDirectTopLevelSimpleTypeReference();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.xsdLanguage.DirectTopLevelComplexTypeReference <em>Direct Top Level Complex Type Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Direct Top Level Complex Type Reference</em>'.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.DirectTopLevelComplexTypeReference
   * @generated
   */
  EClass getDirectTopLevelComplexTypeReference();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.xsdLanguage.ImportedTopLevelTypeReference <em>Imported Top Level Type Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Imported Top Level Type Reference</em>'.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.ImportedTopLevelTypeReference
   * @generated
   */
  EClass getImportedTopLevelTypeReference();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.xsdLanguage.ImportedTopLevelSimpleTypeReference <em>Imported Top Level Simple Type Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Imported Top Level Simple Type Reference</em>'.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.ImportedTopLevelSimpleTypeReference
   * @generated
   */
  EClass getImportedTopLevelSimpleTypeReference();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.xsdLanguage.ImportedTopLevelComplexTypeReference <em>Imported Top Level Complex Type Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Imported Top Level Complex Type Reference</em>'.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.ImportedTopLevelComplexTypeReference
   * @generated
   */
  EClass getImportedTopLevelComplexTypeReference();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.xsdLanguage.ImportedReference <em>Imported Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Imported Reference</em>'.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.ImportedReference
   * @generated
   */
  EClass getImportedReference();

  /**
   * Returns the meta object for the reference '{@link nl.dslmeinte.xtext.examples.xsdLanguage.ImportedReference#getImport <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Import</em>'.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.ImportedReference#getImport()
   * @see #getImportedReference()
   * @generated
   */
  EReference getImportedReference_Import();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.xsdLanguage.EmbeddedType <em>Embedded Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Embedded Type</em>'.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.EmbeddedType
   * @generated
   */
  EClass getEmbeddedType();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.xsdLanguage.EmbeddedComplexType <em>Embedded Complex Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Embedded Complex Type</em>'.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.EmbeddedComplexType
   * @generated
   */
  EClass getEmbeddedComplexType();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.xsdLanguage.EmbeddedSimpleType <em>Embedded Simple Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Embedded Simple Type</em>'.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.EmbeddedSimpleType
   * @generated
   */
  EClass getEmbeddedSimpleType();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.xsdLanguage.ComplexType <em>Complex Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Complex Type</em>'.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.ComplexType
   * @generated
   */
  EClass getComplexType();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.xtext.examples.xsdLanguage.ComplexType#getExtends <em>Extends</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Extends</em>'.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.ComplexType#getExtends()
   * @see #getComplexType()
   * @generated
   */
  EReference getComplexType_Extends();

  /**
   * Returns the meta object for the containment reference list '{@link nl.dslmeinte.xtext.examples.xsdLanguage.ComplexType#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.ComplexType#getProperties()
   * @see #getComplexType()
   * @generated
   */
  EReference getComplexType_Properties();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.xsdLanguage.SimpleType <em>Simple Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Type</em>'.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.SimpleType
   * @generated
   */
  EClass getSimpleType();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.xtext.examples.xsdLanguage.SimpleType#getRestriction <em>Restriction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Restriction</em>'.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.SimpleType#getRestriction()
   * @see #getSimpleType()
   * @generated
   */
  EReference getSimpleType_Restriction();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.xtext.examples.xsdLanguage.SimpleType#getDocumentation <em>Documentation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Documentation</em>'.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.SimpleType#getDocumentation()
   * @see #getSimpleType()
   * @generated
   */
  EReference getSimpleType_Documentation();

  /**
   * Returns the meta object for enum '{@link nl.dslmeinte.xtext.examples.xsdLanguage.BuiltinType <em>Builtin Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Builtin Type</em>'.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.BuiltinType
   * @generated
   */
  EEnum getBuiltinType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  XsdLanguageFactory getXsdLanguageFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.impl.SchemaImpl <em>Schema</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.SchemaImpl
     * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.XsdLanguagePackageImpl#getSchema()
     * @generated
     */
    EClass SCHEMA = eINSTANCE.getSchema();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCHEMA__NAME = eINSTANCE.getSchema_Name();

    /**
     * The meta object literal for the '<em><b>Ns URI</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCHEMA__NS_URI = eINSTANCE.getSchema_NsURI();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCHEMA__IMPORTS = eINSTANCE.getSchema_Imports();

    /**
     * The meta object literal for the '<em><b>Definitions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCHEMA__DEFINITIONS = eINSTANCE.getSchema_Definitions();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.ImportImpl
     * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.XsdLanguagePackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORT_URI = eINSTANCE.getImport_ImportURI();

    /**
     * The meta object literal for the '<em><b>Ns Prefix</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__NS_PREFIX = eINSTANCE.getImport_NsPrefix();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.impl.TopLevelDefinitionImpl <em>Top Level Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.TopLevelDefinitionImpl
     * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.XsdLanguagePackageImpl#getTopLevelDefinition()
     * @generated
     */
    EClass TOP_LEVEL_DEFINITION = eINSTANCE.getTopLevelDefinition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TOP_LEVEL_DEFINITION__NAME = eINSTANCE.getTopLevelDefinition_Name();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.impl.TopLevelTypeImpl <em>Top Level Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.TopLevelTypeImpl
     * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.XsdLanguagePackageImpl#getTopLevelType()
     * @generated
     */
    EClass TOP_LEVEL_TYPE = eINSTANCE.getTopLevelType();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.impl.TopLevelElementImpl <em>Top Level Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.TopLevelElementImpl
     * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.XsdLanguagePackageImpl#getTopLevelElement()
     * @generated
     */
    EClass TOP_LEVEL_ELEMENT = eINSTANCE.getTopLevelElement();

    /**
     * The meta object literal for the '<em><b>Type Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TOP_LEVEL_ELEMENT__TYPE_REF = eINSTANCE.getTopLevelElement_TypeRef();

    /**
     * The meta object literal for the '<em><b>Embedded Type Def</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TOP_LEVEL_ELEMENT__EMBEDDED_TYPE_DEF = eINSTANCE.getTopLevelElement_EmbeddedTypeDef();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.impl.TopLevelSimpleTypeImpl <em>Top Level Simple Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.TopLevelSimpleTypeImpl
     * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.XsdLanguagePackageImpl#getTopLevelSimpleType()
     * @generated
     */
    EClass TOP_LEVEL_SIMPLE_TYPE = eINSTANCE.getTopLevelSimpleType();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.impl.RestrictionImpl <em>Restriction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.RestrictionImpl
     * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.XsdLanguagePackageImpl#getRestriction()
     * @generated
     */
    EClass RESTRICTION = eINSTANCE.getRestriction();

    /**
     * The meta object literal for the '<em><b>Type Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESTRICTION__TYPE_REF = eINSTANCE.getRestriction_TypeRef();

    /**
     * The meta object literal for the '<em><b>Facets</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESTRICTION__FACETS = eINSTANCE.getRestriction_Facets();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.impl.FacetImpl <em>Facet</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.FacetImpl
     * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.XsdLanguagePackageImpl#getFacet()
     * @generated
     */
    EClass FACET = eINSTANCE.getFacet();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.impl.EnumerationFacetImpl <em>Enumeration Facet</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.EnumerationFacetImpl
     * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.XsdLanguagePackageImpl#getEnumerationFacet()
     * @generated
     */
    EClass ENUMERATION_FACET = eINSTANCE.getEnumerationFacet();

    /**
     * The meta object literal for the '<em><b>Literals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUMERATION_FACET__LITERALS = eINSTANCE.getEnumerationFacet_Literals();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.impl.EnumerationLiteralImpl <em>Enumeration Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.EnumerationLiteralImpl
     * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.XsdLanguagePackageImpl#getEnumerationLiteral()
     * @generated
     */
    EClass ENUMERATION_LITERAL = eINSTANCE.getEnumerationLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUMERATION_LITERAL__VALUE = eINSTANCE.getEnumerationLiteral_Value();

    /**
     * The meta object literal for the '<em><b>Annotation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUMERATION_LITERAL__ANNOTATION = eINSTANCE.getEnumerationLiteral_Annotation();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.impl.MaxLengthFacetImpl <em>Max Length Facet</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.MaxLengthFacetImpl
     * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.XsdLanguagePackageImpl#getMaxLengthFacet()
     * @generated
     */
    EClass MAX_LENGTH_FACET = eINSTANCE.getMaxLengthFacet();

    /**
     * The meta object literal for the '<em><b>Max Length</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAX_LENGTH_FACET__MAX_LENGTH = eINSTANCE.getMaxLengthFacet_MaxLength();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.impl.PatternFacetImpl <em>Pattern Facet</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.PatternFacetImpl
     * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.XsdLanguagePackageImpl#getPatternFacet()
     * @generated
     */
    EClass PATTERN_FACET = eINSTANCE.getPatternFacet();

    /**
     * The meta object literal for the '<em><b>Pattern</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PATTERN_FACET__PATTERN = eINSTANCE.getPatternFacet_Pattern();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.impl.RangeFacetImpl <em>Range Facet</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.RangeFacetImpl
     * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.XsdLanguagePackageImpl#getRangeFacet()
     * @generated
     */
    EClass RANGE_FACET = eINSTANCE.getRangeFacet();

    /**
     * The meta object literal for the '<em><b>Lower</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RANGE_FACET__LOWER = eINSTANCE.getRangeFacet_Lower();

    /**
     * The meta object literal for the '<em><b>Upper</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RANGE_FACET__UPPER = eINSTANCE.getRangeFacet_Upper();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.impl.LengthFacetImpl <em>Length Facet</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.LengthFacetImpl
     * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.XsdLanguagePackageImpl#getLengthFacet()
     * @generated
     */
    EClass LENGTH_FACET = eINSTANCE.getLengthFacet();

    /**
     * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LENGTH_FACET__LENGTH = eINSTANCE.getLengthFacet_Length();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.impl.DocumentationImpl <em>Documentation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.DocumentationImpl
     * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.XsdLanguagePackageImpl#getDocumentation()
     * @generated
     */
    EClass DOCUMENTATION = eINSTANCE.getDocumentation();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOCUMENTATION__TEXT = eINSTANCE.getDocumentation_Text();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.impl.TopLevelComplexTypeImpl <em>Top Level Complex Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.TopLevelComplexTypeImpl
     * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.XsdLanguagePackageImpl#getTopLevelComplexType()
     * @generated
     */
    EClass TOP_LEVEL_COMPLEX_TYPE = eINSTANCE.getTopLevelComplexType();

    /**
     * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TOP_LEVEL_COMPLEX_TYPE__ABSTRACT = eINSTANCE.getTopLevelComplexType_Abstract();

    /**
     * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TOP_LEVEL_COMPLEX_TYPE__DOCUMENTATION = eINSTANCE.getTopLevelComplexType_Documentation();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.PropertyImpl
     * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.XsdLanguagePackageImpl#getProperty()
     * @generated
     */
    EClass PROPERTY = eINSTANCE.getProperty();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.impl.ElementImpl <em>Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.ElementImpl
     * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.XsdLanguagePackageImpl#getElement()
     * @generated
     */
    EClass ELEMENT = eINSTANCE.getElement();

    /**
     * The meta object literal for the '<em><b>Type Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT__TYPE_REF = eINSTANCE.getElement_TypeRef();

    /**
     * The meta object literal for the '<em><b>Embedded Type Def</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT__EMBEDDED_TYPE_DEF = eINSTANCE.getElement_EmbeddedTypeDef();

    /**
     * The meta object literal for the '<em><b>Multiplicity</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT__MULTIPLICITY = eINSTANCE.getElement_Multiplicity();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.AttributeImpl
     * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.XsdLanguagePackageImpl#getAttribute()
     * @generated
     */
    EClass ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__REQUIRED = eINSTANCE.getAttribute_Required();

    /**
     * The meta object literal for the '<em><b>Type Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE__TYPE_REF = eINSTANCE.getAttribute_TypeRef();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.impl.MultiplicityImpl <em>Multiplicity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.MultiplicityImpl
     * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.XsdLanguagePackageImpl#getMultiplicity()
     * @generated
     */
    EClass MULTIPLICITY = eINSTANCE.getMultiplicity();

    /**
     * The meta object literal for the '<em><b>Lower</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MULTIPLICITY__LOWER = eINSTANCE.getMultiplicity_Lower();

    /**
     * The meta object literal for the '<em><b>Upper</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MULTIPLICITY__UPPER = eINSTANCE.getMultiplicity_Upper();

    /**
     * The meta object literal for the '<em><b>Unbounded</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MULTIPLICITY__UNBOUNDED = eINSTANCE.getMultiplicity_Unbounded();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.impl.NamedTypeReferenceImpl <em>Named Type Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.NamedTypeReferenceImpl
     * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.XsdLanguagePackageImpl#getNamedTypeReference()
     * @generated
     */
    EClass NAMED_TYPE_REFERENCE = eINSTANCE.getNamedTypeReference();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.impl.NonComplexTypeReferenceImpl <em>Non Complex Type Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.NonComplexTypeReferenceImpl
     * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.XsdLanguagePackageImpl#getNonComplexTypeReference()
     * @generated
     */
    EClass NON_COMPLEX_TYPE_REFERENCE = eINSTANCE.getNonComplexTypeReference();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.impl.BuiltinTypeReferenceImpl <em>Builtin Type Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.BuiltinTypeReferenceImpl
     * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.XsdLanguagePackageImpl#getBuiltinTypeReference()
     * @generated
     */
    EClass BUILTIN_TYPE_REFERENCE = eINSTANCE.getBuiltinTypeReference();

    /**
     * The meta object literal for the '<em><b>Builtin</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUILTIN_TYPE_REFERENCE__BUILTIN = eINSTANCE.getBuiltinTypeReference_Builtin();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.impl.TopLevelTypeReferenceImpl <em>Top Level Type Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.TopLevelTypeReferenceImpl
     * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.XsdLanguagePackageImpl#getTopLevelTypeReference()
     * @generated
     */
    EClass TOP_LEVEL_TYPE_REFERENCE = eINSTANCE.getTopLevelTypeReference();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TOP_LEVEL_TYPE_REFERENCE__REF = eINSTANCE.getTopLevelTypeReference_Ref();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.impl.TopLevelComplexTypeReferenceImpl <em>Top Level Complex Type Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.TopLevelComplexTypeReferenceImpl
     * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.XsdLanguagePackageImpl#getTopLevelComplexTypeReference()
     * @generated
     */
    EClass TOP_LEVEL_COMPLEX_TYPE_REFERENCE = eINSTANCE.getTopLevelComplexTypeReference();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TOP_LEVEL_COMPLEX_TYPE_REFERENCE__REF = eINSTANCE.getTopLevelComplexTypeReference_Ref();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.impl.TopLevelSimpleTypeReferenceImpl <em>Top Level Simple Type Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.TopLevelSimpleTypeReferenceImpl
     * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.XsdLanguagePackageImpl#getTopLevelSimpleTypeReference()
     * @generated
     */
    EClass TOP_LEVEL_SIMPLE_TYPE_REFERENCE = eINSTANCE.getTopLevelSimpleTypeReference();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TOP_LEVEL_SIMPLE_TYPE_REFERENCE__REF = eINSTANCE.getTopLevelSimpleTypeReference_Ref();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.impl.DirectTopLevelTypeReferenceImpl <em>Direct Top Level Type Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.DirectTopLevelTypeReferenceImpl
     * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.XsdLanguagePackageImpl#getDirectTopLevelTypeReference()
     * @generated
     */
    EClass DIRECT_TOP_LEVEL_TYPE_REFERENCE = eINSTANCE.getDirectTopLevelTypeReference();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.impl.DirectTopLevelSimpleTypeReferenceImpl <em>Direct Top Level Simple Type Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.DirectTopLevelSimpleTypeReferenceImpl
     * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.XsdLanguagePackageImpl#getDirectTopLevelSimpleTypeReference()
     * @generated
     */
    EClass DIRECT_TOP_LEVEL_SIMPLE_TYPE_REFERENCE = eINSTANCE.getDirectTopLevelSimpleTypeReference();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.impl.DirectTopLevelComplexTypeReferenceImpl <em>Direct Top Level Complex Type Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.DirectTopLevelComplexTypeReferenceImpl
     * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.XsdLanguagePackageImpl#getDirectTopLevelComplexTypeReference()
     * @generated
     */
    EClass DIRECT_TOP_LEVEL_COMPLEX_TYPE_REFERENCE = eINSTANCE.getDirectTopLevelComplexTypeReference();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.impl.ImportedTopLevelTypeReferenceImpl <em>Imported Top Level Type Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.ImportedTopLevelTypeReferenceImpl
     * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.XsdLanguagePackageImpl#getImportedTopLevelTypeReference()
     * @generated
     */
    EClass IMPORTED_TOP_LEVEL_TYPE_REFERENCE = eINSTANCE.getImportedTopLevelTypeReference();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.impl.ImportedTopLevelSimpleTypeReferenceImpl <em>Imported Top Level Simple Type Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.ImportedTopLevelSimpleTypeReferenceImpl
     * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.XsdLanguagePackageImpl#getImportedTopLevelSimpleTypeReference()
     * @generated
     */
    EClass IMPORTED_TOP_LEVEL_SIMPLE_TYPE_REFERENCE = eINSTANCE.getImportedTopLevelSimpleTypeReference();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.impl.ImportedTopLevelComplexTypeReferenceImpl <em>Imported Top Level Complex Type Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.ImportedTopLevelComplexTypeReferenceImpl
     * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.XsdLanguagePackageImpl#getImportedTopLevelComplexTypeReference()
     * @generated
     */
    EClass IMPORTED_TOP_LEVEL_COMPLEX_TYPE_REFERENCE = eINSTANCE.getImportedTopLevelComplexTypeReference();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.impl.ImportedReferenceImpl <em>Imported Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.ImportedReferenceImpl
     * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.XsdLanguagePackageImpl#getImportedReference()
     * @generated
     */
    EClass IMPORTED_REFERENCE = eINSTANCE.getImportedReference();

    /**
     * The meta object literal for the '<em><b>Import</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMPORTED_REFERENCE__IMPORT = eINSTANCE.getImportedReference_Import();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.impl.EmbeddedTypeImpl <em>Embedded Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.EmbeddedTypeImpl
     * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.XsdLanguagePackageImpl#getEmbeddedType()
     * @generated
     */
    EClass EMBEDDED_TYPE = eINSTANCE.getEmbeddedType();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.impl.EmbeddedComplexTypeImpl <em>Embedded Complex Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.EmbeddedComplexTypeImpl
     * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.XsdLanguagePackageImpl#getEmbeddedComplexType()
     * @generated
     */
    EClass EMBEDDED_COMPLEX_TYPE = eINSTANCE.getEmbeddedComplexType();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.impl.EmbeddedSimpleTypeImpl <em>Embedded Simple Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.EmbeddedSimpleTypeImpl
     * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.XsdLanguagePackageImpl#getEmbeddedSimpleType()
     * @generated
     */
    EClass EMBEDDED_SIMPLE_TYPE = eINSTANCE.getEmbeddedSimpleType();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.impl.ComplexTypeImpl <em>Complex Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.ComplexTypeImpl
     * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.XsdLanguagePackageImpl#getComplexType()
     * @generated
     */
    EClass COMPLEX_TYPE = eINSTANCE.getComplexType();

    /**
     * The meta object literal for the '<em><b>Extends</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPLEX_TYPE__EXTENDS = eINSTANCE.getComplexType_Extends();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPLEX_TYPE__PROPERTIES = eINSTANCE.getComplexType_Properties();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.impl.SimpleTypeImpl <em>Simple Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.SimpleTypeImpl
     * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.XsdLanguagePackageImpl#getSimpleType()
     * @generated
     */
    EClass SIMPLE_TYPE = eINSTANCE.getSimpleType();

    /**
     * The meta object literal for the '<em><b>Restriction</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_TYPE__RESTRICTION = eINSTANCE.getSimpleType_Restriction();

    /**
     * The meta object literal for the '<em><b>Documentation</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_TYPE__DOCUMENTATION = eINSTANCE.getSimpleType_Documentation();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.xsdLanguage.BuiltinType <em>Builtin Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.xsdLanguage.BuiltinType
     * @see nl.dslmeinte.xtext.examples.xsdLanguage.impl.XsdLanguagePackageImpl#getBuiltinType()
     * @generated
     */
    EEnum BUILTIN_TYPE = eINSTANCE.getBuiltinType();

  }

} //XsdLanguagePackage
