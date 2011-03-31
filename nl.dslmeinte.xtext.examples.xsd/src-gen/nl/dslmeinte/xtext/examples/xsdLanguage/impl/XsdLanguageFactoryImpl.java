/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.examples.xsdLanguage.impl;

import nl.dslmeinte.xtext.examples.xsdLanguage.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XsdLanguageFactoryImpl extends EFactoryImpl implements XsdLanguageFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static XsdLanguageFactory init()
  {
    try
    {
      XsdLanguageFactory theXsdLanguageFactory = (XsdLanguageFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.dslmeinte.nl/xtext/examples/XsdLanguage"); 
      if (theXsdLanguageFactory != null)
      {
        return theXsdLanguageFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new XsdLanguageFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XsdLanguageFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case XsdLanguagePackage.SCHEMA: return createSchema();
      case XsdLanguagePackage.IMPORT: return createImport();
      case XsdLanguagePackage.TOP_LEVEL_DEFINITION: return createTopLevelDefinition();
      case XsdLanguagePackage.TOP_LEVEL_TYPE: return createTopLevelType();
      case XsdLanguagePackage.TOP_LEVEL_ELEMENT: return createTopLevelElement();
      case XsdLanguagePackage.TOP_LEVEL_SIMPLE_TYPE: return createTopLevelSimpleType();
      case XsdLanguagePackage.RESTRICTION: return createRestriction();
      case XsdLanguagePackage.FACET: return createFacet();
      case XsdLanguagePackage.ENUMERATION_FACET: return createEnumerationFacet();
      case XsdLanguagePackage.ENUMERATION_LITERAL: return createEnumerationLiteral();
      case XsdLanguagePackage.MAX_LENGTH_FACET: return createMaxLengthFacet();
      case XsdLanguagePackage.PATTERN_FACET: return createPatternFacet();
      case XsdLanguagePackage.RANGE_FACET: return createRangeFacet();
      case XsdLanguagePackage.LENGTH_FACET: return createLengthFacet();
      case XsdLanguagePackage.DOCUMENTATION: return createDocumentation();
      case XsdLanguagePackage.TOP_LEVEL_COMPLEX_TYPE: return createTopLevelComplexType();
      case XsdLanguagePackage.PROPERTY: return createProperty();
      case XsdLanguagePackage.ELEMENT: return createElement();
      case XsdLanguagePackage.ATTRIBUTE: return createAttribute();
      case XsdLanguagePackage.MULTIPLICITY: return createMultiplicity();
      case XsdLanguagePackage.NAMED_TYPE_REFERENCE: return createNamedTypeReference();
      case XsdLanguagePackage.NON_COMPLEX_TYPE_REFERENCE: return createNonComplexTypeReference();
      case XsdLanguagePackage.BUILTIN_TYPE_REFERENCE: return createBuiltinTypeReference();
      case XsdLanguagePackage.TOP_LEVEL_TYPE_REFERENCE: return createTopLevelTypeReference();
      case XsdLanguagePackage.TOP_LEVEL_COMPLEX_TYPE_REFERENCE: return createTopLevelComplexTypeReference();
      case XsdLanguagePackage.TOP_LEVEL_SIMPLE_TYPE_REFERENCE: return createTopLevelSimpleTypeReference();
      case XsdLanguagePackage.DIRECT_TOP_LEVEL_TYPE_REFERENCE: return createDirectTopLevelTypeReference();
      case XsdLanguagePackage.DIRECT_TOP_LEVEL_SIMPLE_TYPE_REFERENCE: return createDirectTopLevelSimpleTypeReference();
      case XsdLanguagePackage.DIRECT_TOP_LEVEL_COMPLEX_TYPE_REFERENCE: return createDirectTopLevelComplexTypeReference();
      case XsdLanguagePackage.IMPORTED_TOP_LEVEL_TYPE_REFERENCE: return createImportedTopLevelTypeReference();
      case XsdLanguagePackage.IMPORTED_TOP_LEVEL_SIMPLE_TYPE_REFERENCE: return createImportedTopLevelSimpleTypeReference();
      case XsdLanguagePackage.IMPORTED_TOP_LEVEL_COMPLEX_TYPE_REFERENCE: return createImportedTopLevelComplexTypeReference();
      case XsdLanguagePackage.IMPORTED_REFERENCE: return createImportedReference();
      case XsdLanguagePackage.EMBEDDED_TYPE: return createEmbeddedType();
      case XsdLanguagePackage.EMBEDDED_COMPLEX_TYPE: return createEmbeddedComplexType();
      case XsdLanguagePackage.EMBEDDED_SIMPLE_TYPE: return createEmbeddedSimpleType();
      case XsdLanguagePackage.COMPLEX_TYPE: return createComplexType();
      case XsdLanguagePackage.SIMPLE_TYPE: return createSimpleType();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case XsdLanguagePackage.BUILTIN_TYPE:
        return createBuiltinTypeFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case XsdLanguagePackage.BUILTIN_TYPE:
        return convertBuiltinTypeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Schema createSchema()
  {
    SchemaImpl schema = new SchemaImpl();
    return schema;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TopLevelDefinition createTopLevelDefinition()
  {
    TopLevelDefinitionImpl topLevelDefinition = new TopLevelDefinitionImpl();
    return topLevelDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TopLevelType createTopLevelType()
  {
    TopLevelTypeImpl topLevelType = new TopLevelTypeImpl();
    return topLevelType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TopLevelElement createTopLevelElement()
  {
    TopLevelElementImpl topLevelElement = new TopLevelElementImpl();
    return topLevelElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TopLevelSimpleType createTopLevelSimpleType()
  {
    TopLevelSimpleTypeImpl topLevelSimpleType = new TopLevelSimpleTypeImpl();
    return topLevelSimpleType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Restriction createRestriction()
  {
    RestrictionImpl restriction = new RestrictionImpl();
    return restriction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Facet createFacet()
  {
    FacetImpl facet = new FacetImpl();
    return facet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumerationFacet createEnumerationFacet()
  {
    EnumerationFacetImpl enumerationFacet = new EnumerationFacetImpl();
    return enumerationFacet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumerationLiteral createEnumerationLiteral()
  {
    EnumerationLiteralImpl enumerationLiteral = new EnumerationLiteralImpl();
    return enumerationLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MaxLengthFacet createMaxLengthFacet()
  {
    MaxLengthFacetImpl maxLengthFacet = new MaxLengthFacetImpl();
    return maxLengthFacet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PatternFacet createPatternFacet()
  {
    PatternFacetImpl patternFacet = new PatternFacetImpl();
    return patternFacet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RangeFacet createRangeFacet()
  {
    RangeFacetImpl rangeFacet = new RangeFacetImpl();
    return rangeFacet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LengthFacet createLengthFacet()
  {
    LengthFacetImpl lengthFacet = new LengthFacetImpl();
    return lengthFacet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Documentation createDocumentation()
  {
    DocumentationImpl documentation = new DocumentationImpl();
    return documentation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TopLevelComplexType createTopLevelComplexType()
  {
    TopLevelComplexTypeImpl topLevelComplexType = new TopLevelComplexTypeImpl();
    return topLevelComplexType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Property createProperty()
  {
    PropertyImpl property = new PropertyImpl();
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Element createElement()
  {
    ElementImpl element = new ElementImpl();
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute createAttribute()
  {
    AttributeImpl attribute = new AttributeImpl();
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Multiplicity createMultiplicity()
  {
    MultiplicityImpl multiplicity = new MultiplicityImpl();
    return multiplicity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedTypeReference createNamedTypeReference()
  {
    NamedTypeReferenceImpl namedTypeReference = new NamedTypeReferenceImpl();
    return namedTypeReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NonComplexTypeReference createNonComplexTypeReference()
  {
    NonComplexTypeReferenceImpl nonComplexTypeReference = new NonComplexTypeReferenceImpl();
    return nonComplexTypeReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BuiltinTypeReference createBuiltinTypeReference()
  {
    BuiltinTypeReferenceImpl builtinTypeReference = new BuiltinTypeReferenceImpl();
    return builtinTypeReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TopLevelTypeReference createTopLevelTypeReference()
  {
    TopLevelTypeReferenceImpl topLevelTypeReference = new TopLevelTypeReferenceImpl();
    return topLevelTypeReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TopLevelComplexTypeReference createTopLevelComplexTypeReference()
  {
    TopLevelComplexTypeReferenceImpl topLevelComplexTypeReference = new TopLevelComplexTypeReferenceImpl();
    return topLevelComplexTypeReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TopLevelSimpleTypeReference createTopLevelSimpleTypeReference()
  {
    TopLevelSimpleTypeReferenceImpl topLevelSimpleTypeReference = new TopLevelSimpleTypeReferenceImpl();
    return topLevelSimpleTypeReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DirectTopLevelTypeReference createDirectTopLevelTypeReference()
  {
    DirectTopLevelTypeReferenceImpl directTopLevelTypeReference = new DirectTopLevelTypeReferenceImpl();
    return directTopLevelTypeReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DirectTopLevelSimpleTypeReference createDirectTopLevelSimpleTypeReference()
  {
    DirectTopLevelSimpleTypeReferenceImpl directTopLevelSimpleTypeReference = new DirectTopLevelSimpleTypeReferenceImpl();
    return directTopLevelSimpleTypeReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DirectTopLevelComplexTypeReference createDirectTopLevelComplexTypeReference()
  {
    DirectTopLevelComplexTypeReferenceImpl directTopLevelComplexTypeReference = new DirectTopLevelComplexTypeReferenceImpl();
    return directTopLevelComplexTypeReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImportedTopLevelTypeReference createImportedTopLevelTypeReference()
  {
    ImportedTopLevelTypeReferenceImpl importedTopLevelTypeReference = new ImportedTopLevelTypeReferenceImpl();
    return importedTopLevelTypeReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImportedTopLevelSimpleTypeReference createImportedTopLevelSimpleTypeReference()
  {
    ImportedTopLevelSimpleTypeReferenceImpl importedTopLevelSimpleTypeReference = new ImportedTopLevelSimpleTypeReferenceImpl();
    return importedTopLevelSimpleTypeReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImportedTopLevelComplexTypeReference createImportedTopLevelComplexTypeReference()
  {
    ImportedTopLevelComplexTypeReferenceImpl importedTopLevelComplexTypeReference = new ImportedTopLevelComplexTypeReferenceImpl();
    return importedTopLevelComplexTypeReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImportedReference createImportedReference()
  {
    ImportedReferenceImpl importedReference = new ImportedReferenceImpl();
    return importedReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EmbeddedType createEmbeddedType()
  {
    EmbeddedTypeImpl embeddedType = new EmbeddedTypeImpl();
    return embeddedType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EmbeddedComplexType createEmbeddedComplexType()
  {
    EmbeddedComplexTypeImpl embeddedComplexType = new EmbeddedComplexTypeImpl();
    return embeddedComplexType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EmbeddedSimpleType createEmbeddedSimpleType()
  {
    EmbeddedSimpleTypeImpl embeddedSimpleType = new EmbeddedSimpleTypeImpl();
    return embeddedSimpleType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComplexType createComplexType()
  {
    ComplexTypeImpl complexType = new ComplexTypeImpl();
    return complexType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleType createSimpleType()
  {
    SimpleTypeImpl simpleType = new SimpleTypeImpl();
    return simpleType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BuiltinType createBuiltinTypeFromString(EDataType eDataType, String initialValue)
  {
    BuiltinType result = BuiltinType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertBuiltinTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XsdLanguagePackage getXsdLanguagePackage()
  {
    return (XsdLanguagePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static XsdLanguagePackage getPackage()
  {
    return XsdLanguagePackage.eINSTANCE;
  }

} //XsdLanguageFactoryImpl
