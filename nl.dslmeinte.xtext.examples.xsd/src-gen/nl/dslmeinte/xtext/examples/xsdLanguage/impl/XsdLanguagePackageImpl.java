/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.examples.xsdLanguage.impl;

import nl.dslmeinte.xtext.examples.xsdLanguage.Attribute;
import nl.dslmeinte.xtext.examples.xsdLanguage.BuiltinType;
import nl.dslmeinte.xtext.examples.xsdLanguage.BuiltinTypeReference;
import nl.dslmeinte.xtext.examples.xsdLanguage.ComplexType;
import nl.dslmeinte.xtext.examples.xsdLanguage.DirectTopLevelComplexTypeReference;
import nl.dslmeinte.xtext.examples.xsdLanguage.DirectTopLevelSimpleTypeReference;
import nl.dslmeinte.xtext.examples.xsdLanguage.DirectTopLevelTypeReference;
import nl.dslmeinte.xtext.examples.xsdLanguage.Documentation;
import nl.dslmeinte.xtext.examples.xsdLanguage.Element;
import nl.dslmeinte.xtext.examples.xsdLanguage.EmbeddedComplexType;
import nl.dslmeinte.xtext.examples.xsdLanguage.EmbeddedSimpleType;
import nl.dslmeinte.xtext.examples.xsdLanguage.EmbeddedType;
import nl.dslmeinte.xtext.examples.xsdLanguage.EnumerationFacet;
import nl.dslmeinte.xtext.examples.xsdLanguage.EnumerationLiteral;
import nl.dslmeinte.xtext.examples.xsdLanguage.Facet;
import nl.dslmeinte.xtext.examples.xsdLanguage.Import;
import nl.dslmeinte.xtext.examples.xsdLanguage.ImportedReference;
import nl.dslmeinte.xtext.examples.xsdLanguage.ImportedTopLevelComplexTypeReference;
import nl.dslmeinte.xtext.examples.xsdLanguage.ImportedTopLevelSimpleTypeReference;
import nl.dslmeinte.xtext.examples.xsdLanguage.ImportedTopLevelTypeReference;
import nl.dslmeinte.xtext.examples.xsdLanguage.LengthFacet;
import nl.dslmeinte.xtext.examples.xsdLanguage.MaxLengthFacet;
import nl.dslmeinte.xtext.examples.xsdLanguage.Multiplicity;
import nl.dslmeinte.xtext.examples.xsdLanguage.NamedTypeReference;
import nl.dslmeinte.xtext.examples.xsdLanguage.NonComplexTypeReference;
import nl.dslmeinte.xtext.examples.xsdLanguage.PatternFacet;
import nl.dslmeinte.xtext.examples.xsdLanguage.Property;
import nl.dslmeinte.xtext.examples.xsdLanguage.RangeFacet;
import nl.dslmeinte.xtext.examples.xsdLanguage.Restriction;
import nl.dslmeinte.xtext.examples.xsdLanguage.Schema;
import nl.dslmeinte.xtext.examples.xsdLanguage.SimpleType;
import nl.dslmeinte.xtext.examples.xsdLanguage.TopLevelComplexType;
import nl.dslmeinte.xtext.examples.xsdLanguage.TopLevelComplexTypeReference;
import nl.dslmeinte.xtext.examples.xsdLanguage.TopLevelDefinition;
import nl.dslmeinte.xtext.examples.xsdLanguage.TopLevelElement;
import nl.dslmeinte.xtext.examples.xsdLanguage.TopLevelSimpleType;
import nl.dslmeinte.xtext.examples.xsdLanguage.TopLevelSimpleTypeReference;
import nl.dslmeinte.xtext.examples.xsdLanguage.TopLevelType;
import nl.dslmeinte.xtext.examples.xsdLanguage.TopLevelTypeReference;
import nl.dslmeinte.xtext.examples.xsdLanguage.XsdLanguageFactory;
import nl.dslmeinte.xtext.examples.xsdLanguage.XsdLanguagePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XsdLanguagePackageImpl extends EPackageImpl implements XsdLanguagePackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass schemaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass topLevelDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass topLevelTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass topLevelElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass topLevelSimpleTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass restrictionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass facetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumerationFacetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumerationLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass maxLengthFacetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass patternFacetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rangeFacetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lengthFacetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass documentationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass topLevelComplexTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass multiplicityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass namedTypeReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nonComplexTypeReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass builtinTypeReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass topLevelTypeReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass topLevelComplexTypeReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass topLevelSimpleTypeReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass directTopLevelTypeReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass directTopLevelSimpleTypeReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass directTopLevelComplexTypeReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importedTopLevelTypeReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importedTopLevelSimpleTypeReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importedTopLevelComplexTypeReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importedReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass embeddedTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass embeddedComplexTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass embeddedSimpleTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass complexTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass simpleTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum builtinTypeEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.XsdLanguagePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private XsdLanguagePackageImpl()
  {
    super(eNS_URI, XsdLanguageFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link XsdLanguagePackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static XsdLanguagePackage init()
  {
    if (isInited) return (XsdLanguagePackage)EPackage.Registry.INSTANCE.getEPackage(XsdLanguagePackage.eNS_URI);

    // Obtain or create and register package
    XsdLanguagePackageImpl theXsdLanguagePackage = (XsdLanguagePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof XsdLanguagePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new XsdLanguagePackageImpl());

    isInited = true;

    // Create package meta-data objects
    theXsdLanguagePackage.createPackageContents();

    // Initialize created meta-data
    theXsdLanguagePackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theXsdLanguagePackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(XsdLanguagePackage.eNS_URI, theXsdLanguagePackage);
    return theXsdLanguagePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSchema()
  {
    return schemaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSchema_Name()
  {
    return (EAttribute)schemaEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSchema_NsURI()
  {
    return (EAttribute)schemaEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSchema_Imports()
  {
    return (EReference)schemaEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSchema_Definitions()
  {
    return (EReference)schemaEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImport()
  {
    return importEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImport_ImportURI()
  {
    return (EAttribute)importEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImport_NsPrefix()
  {
    return (EAttribute)importEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTopLevelDefinition()
  {
    return topLevelDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTopLevelDefinition_Name()
  {
    return (EAttribute)topLevelDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTopLevelType()
  {
    return topLevelTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTopLevelElement()
  {
    return topLevelElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTopLevelElement_TypeRef()
  {
    return (EReference)topLevelElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTopLevelElement_EmbeddedTypeDef()
  {
    return (EReference)topLevelElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTopLevelSimpleType()
  {
    return topLevelSimpleTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRestriction()
  {
    return restrictionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRestriction_TypeRef()
  {
    return (EReference)restrictionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRestriction_Facets()
  {
    return (EReference)restrictionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFacet()
  {
    return facetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnumerationFacet()
  {
    return enumerationFacetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnumerationFacet_Literals()
  {
    return (EReference)enumerationFacetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnumerationLiteral()
  {
    return enumerationLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnumerationLiteral_Value()
  {
    return (EAttribute)enumerationLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnumerationLiteral_Annotation()
  {
    return (EAttribute)enumerationLiteralEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMaxLengthFacet()
  {
    return maxLengthFacetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMaxLengthFacet_MaxLength()
  {
    return (EAttribute)maxLengthFacetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPatternFacet()
  {
    return patternFacetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPatternFacet_Pattern()
  {
    return (EAttribute)patternFacetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRangeFacet()
  {
    return rangeFacetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRangeFacet_Lower()
  {
    return (EAttribute)rangeFacetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRangeFacet_Upper()
  {
    return (EAttribute)rangeFacetEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLengthFacet()
  {
    return lengthFacetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLengthFacet_Length()
  {
    return (EAttribute)lengthFacetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDocumentation()
  {
    return documentationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDocumentation_Text()
  {
    return (EAttribute)documentationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTopLevelComplexType()
  {
    return topLevelComplexTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTopLevelComplexType_Abstract()
  {
    return (EAttribute)topLevelComplexTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTopLevelComplexType_Documentation()
  {
    return (EAttribute)topLevelComplexTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProperty()
  {
    return propertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProperty_Name()
  {
    return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getElement()
  {
    return elementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElement_TypeRef()
  {
    return (EReference)elementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElement_EmbeddedTypeDef()
  {
    return (EReference)elementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElement_Multiplicity()
  {
    return (EReference)elementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttribute()
  {
    return attributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttribute_Required()
  {
    return (EAttribute)attributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttribute_TypeRef()
  {
    return (EReference)attributeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMultiplicity()
  {
    return multiplicityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMultiplicity_Lower()
  {
    return (EAttribute)multiplicityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMultiplicity_Upper()
  {
    return (EAttribute)multiplicityEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMultiplicity_Unbounded()
  {
    return (EAttribute)multiplicityEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNamedTypeReference()
  {
    return namedTypeReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNonComplexTypeReference()
  {
    return nonComplexTypeReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBuiltinTypeReference()
  {
    return builtinTypeReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBuiltinTypeReference_Builtin()
  {
    return (EAttribute)builtinTypeReferenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTopLevelTypeReference()
  {
    return topLevelTypeReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTopLevelTypeReference_Ref()
  {
    return (EReference)topLevelTypeReferenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTopLevelComplexTypeReference()
  {
    return topLevelComplexTypeReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTopLevelComplexTypeReference_Ref()
  {
    return (EReference)topLevelComplexTypeReferenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTopLevelSimpleTypeReference()
  {
    return topLevelSimpleTypeReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTopLevelSimpleTypeReference_Ref()
  {
    return (EReference)topLevelSimpleTypeReferenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDirectTopLevelTypeReference()
  {
    return directTopLevelTypeReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDirectTopLevelSimpleTypeReference()
  {
    return directTopLevelSimpleTypeReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDirectTopLevelComplexTypeReference()
  {
    return directTopLevelComplexTypeReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImportedTopLevelTypeReference()
  {
    return importedTopLevelTypeReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImportedTopLevelSimpleTypeReference()
  {
    return importedTopLevelSimpleTypeReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImportedTopLevelComplexTypeReference()
  {
    return importedTopLevelComplexTypeReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImportedReference()
  {
    return importedReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getImportedReference_Import()
  {
    return (EReference)importedReferenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEmbeddedType()
  {
    return embeddedTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEmbeddedComplexType()
  {
    return embeddedComplexTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEmbeddedSimpleType()
  {
    return embeddedSimpleTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComplexType()
  {
    return complexTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComplexType_Extends()
  {
    return (EReference)complexTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComplexType_Properties()
  {
    return (EReference)complexTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSimpleType()
  {
    return simpleTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSimpleType_Restriction()
  {
    return (EReference)simpleTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSimpleType_Documentation()
  {
    return (EReference)simpleTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getBuiltinType()
  {
    return builtinTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XsdLanguageFactory getXsdLanguageFactory()
  {
    return (XsdLanguageFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    schemaEClass = createEClass(SCHEMA);
    createEAttribute(schemaEClass, SCHEMA__NAME);
    createEAttribute(schemaEClass, SCHEMA__NS_URI);
    createEReference(schemaEClass, SCHEMA__IMPORTS);
    createEReference(schemaEClass, SCHEMA__DEFINITIONS);

    importEClass = createEClass(IMPORT);
    createEAttribute(importEClass, IMPORT__IMPORT_URI);
    createEAttribute(importEClass, IMPORT__NS_PREFIX);

    topLevelDefinitionEClass = createEClass(TOP_LEVEL_DEFINITION);
    createEAttribute(topLevelDefinitionEClass, TOP_LEVEL_DEFINITION__NAME);

    topLevelTypeEClass = createEClass(TOP_LEVEL_TYPE);

    topLevelElementEClass = createEClass(TOP_LEVEL_ELEMENT);
    createEReference(topLevelElementEClass, TOP_LEVEL_ELEMENT__TYPE_REF);
    createEReference(topLevelElementEClass, TOP_LEVEL_ELEMENT__EMBEDDED_TYPE_DEF);

    topLevelSimpleTypeEClass = createEClass(TOP_LEVEL_SIMPLE_TYPE);

    restrictionEClass = createEClass(RESTRICTION);
    createEReference(restrictionEClass, RESTRICTION__TYPE_REF);
    createEReference(restrictionEClass, RESTRICTION__FACETS);

    facetEClass = createEClass(FACET);

    enumerationFacetEClass = createEClass(ENUMERATION_FACET);
    createEReference(enumerationFacetEClass, ENUMERATION_FACET__LITERALS);

    enumerationLiteralEClass = createEClass(ENUMERATION_LITERAL);
    createEAttribute(enumerationLiteralEClass, ENUMERATION_LITERAL__VALUE);
    createEAttribute(enumerationLiteralEClass, ENUMERATION_LITERAL__ANNOTATION);

    maxLengthFacetEClass = createEClass(MAX_LENGTH_FACET);
    createEAttribute(maxLengthFacetEClass, MAX_LENGTH_FACET__MAX_LENGTH);

    patternFacetEClass = createEClass(PATTERN_FACET);
    createEAttribute(patternFacetEClass, PATTERN_FACET__PATTERN);

    rangeFacetEClass = createEClass(RANGE_FACET);
    createEAttribute(rangeFacetEClass, RANGE_FACET__LOWER);
    createEAttribute(rangeFacetEClass, RANGE_FACET__UPPER);

    lengthFacetEClass = createEClass(LENGTH_FACET);
    createEAttribute(lengthFacetEClass, LENGTH_FACET__LENGTH);

    documentationEClass = createEClass(DOCUMENTATION);
    createEAttribute(documentationEClass, DOCUMENTATION__TEXT);

    topLevelComplexTypeEClass = createEClass(TOP_LEVEL_COMPLEX_TYPE);
    createEAttribute(topLevelComplexTypeEClass, TOP_LEVEL_COMPLEX_TYPE__ABSTRACT);
    createEAttribute(topLevelComplexTypeEClass, TOP_LEVEL_COMPLEX_TYPE__DOCUMENTATION);

    propertyEClass = createEClass(PROPERTY);
    createEAttribute(propertyEClass, PROPERTY__NAME);

    elementEClass = createEClass(ELEMENT);
    createEReference(elementEClass, ELEMENT__TYPE_REF);
    createEReference(elementEClass, ELEMENT__EMBEDDED_TYPE_DEF);
    createEReference(elementEClass, ELEMENT__MULTIPLICITY);

    attributeEClass = createEClass(ATTRIBUTE);
    createEAttribute(attributeEClass, ATTRIBUTE__REQUIRED);
    createEReference(attributeEClass, ATTRIBUTE__TYPE_REF);

    multiplicityEClass = createEClass(MULTIPLICITY);
    createEAttribute(multiplicityEClass, MULTIPLICITY__LOWER);
    createEAttribute(multiplicityEClass, MULTIPLICITY__UPPER);
    createEAttribute(multiplicityEClass, MULTIPLICITY__UNBOUNDED);

    namedTypeReferenceEClass = createEClass(NAMED_TYPE_REFERENCE);

    nonComplexTypeReferenceEClass = createEClass(NON_COMPLEX_TYPE_REFERENCE);

    builtinTypeReferenceEClass = createEClass(BUILTIN_TYPE_REFERENCE);
    createEAttribute(builtinTypeReferenceEClass, BUILTIN_TYPE_REFERENCE__BUILTIN);

    topLevelTypeReferenceEClass = createEClass(TOP_LEVEL_TYPE_REFERENCE);
    createEReference(topLevelTypeReferenceEClass, TOP_LEVEL_TYPE_REFERENCE__REF);

    topLevelComplexTypeReferenceEClass = createEClass(TOP_LEVEL_COMPLEX_TYPE_REFERENCE);
    createEReference(topLevelComplexTypeReferenceEClass, TOP_LEVEL_COMPLEX_TYPE_REFERENCE__REF);

    topLevelSimpleTypeReferenceEClass = createEClass(TOP_LEVEL_SIMPLE_TYPE_REFERENCE);
    createEReference(topLevelSimpleTypeReferenceEClass, TOP_LEVEL_SIMPLE_TYPE_REFERENCE__REF);

    directTopLevelTypeReferenceEClass = createEClass(DIRECT_TOP_LEVEL_TYPE_REFERENCE);

    directTopLevelSimpleTypeReferenceEClass = createEClass(DIRECT_TOP_LEVEL_SIMPLE_TYPE_REFERENCE);

    directTopLevelComplexTypeReferenceEClass = createEClass(DIRECT_TOP_LEVEL_COMPLEX_TYPE_REFERENCE);

    importedTopLevelTypeReferenceEClass = createEClass(IMPORTED_TOP_LEVEL_TYPE_REFERENCE);

    importedTopLevelSimpleTypeReferenceEClass = createEClass(IMPORTED_TOP_LEVEL_SIMPLE_TYPE_REFERENCE);

    importedTopLevelComplexTypeReferenceEClass = createEClass(IMPORTED_TOP_LEVEL_COMPLEX_TYPE_REFERENCE);

    importedReferenceEClass = createEClass(IMPORTED_REFERENCE);
    createEReference(importedReferenceEClass, IMPORTED_REFERENCE__IMPORT);

    embeddedTypeEClass = createEClass(EMBEDDED_TYPE);

    embeddedComplexTypeEClass = createEClass(EMBEDDED_COMPLEX_TYPE);

    embeddedSimpleTypeEClass = createEClass(EMBEDDED_SIMPLE_TYPE);

    complexTypeEClass = createEClass(COMPLEX_TYPE);
    createEReference(complexTypeEClass, COMPLEX_TYPE__EXTENDS);
    createEReference(complexTypeEClass, COMPLEX_TYPE__PROPERTIES);

    simpleTypeEClass = createEClass(SIMPLE_TYPE);
    createEReference(simpleTypeEClass, SIMPLE_TYPE__RESTRICTION);
    createEReference(simpleTypeEClass, SIMPLE_TYPE__DOCUMENTATION);

    // Create enums
    builtinTypeEEnum = createEEnum(BUILTIN_TYPE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    topLevelTypeEClass.getESuperTypes().add(this.getTopLevelDefinition());
    topLevelElementEClass.getESuperTypes().add(this.getTopLevelDefinition());
    topLevelSimpleTypeEClass.getESuperTypes().add(this.getTopLevelType());
    topLevelSimpleTypeEClass.getESuperTypes().add(this.getSimpleType());
    enumerationFacetEClass.getESuperTypes().add(this.getFacet());
    maxLengthFacetEClass.getESuperTypes().add(this.getFacet());
    patternFacetEClass.getESuperTypes().add(this.getFacet());
    rangeFacetEClass.getESuperTypes().add(this.getFacet());
    lengthFacetEClass.getESuperTypes().add(this.getFacet());
    topLevelComplexTypeEClass.getESuperTypes().add(this.getTopLevelType());
    topLevelComplexTypeEClass.getESuperTypes().add(this.getComplexType());
    elementEClass.getESuperTypes().add(this.getProperty());
    attributeEClass.getESuperTypes().add(this.getProperty());
    builtinTypeReferenceEClass.getESuperTypes().add(this.getNamedTypeReference());
    builtinTypeReferenceEClass.getESuperTypes().add(this.getNonComplexTypeReference());
    topLevelTypeReferenceEClass.getESuperTypes().add(this.getNamedTypeReference());
    topLevelSimpleTypeReferenceEClass.getESuperTypes().add(this.getNonComplexTypeReference());
    directTopLevelTypeReferenceEClass.getESuperTypes().add(this.getTopLevelTypeReference());
    directTopLevelSimpleTypeReferenceEClass.getESuperTypes().add(this.getTopLevelSimpleTypeReference());
    directTopLevelComplexTypeReferenceEClass.getESuperTypes().add(this.getTopLevelComplexTypeReference());
    importedTopLevelTypeReferenceEClass.getESuperTypes().add(this.getTopLevelTypeReference());
    importedTopLevelTypeReferenceEClass.getESuperTypes().add(this.getImportedReference());
    importedTopLevelSimpleTypeReferenceEClass.getESuperTypes().add(this.getTopLevelSimpleTypeReference());
    importedTopLevelSimpleTypeReferenceEClass.getESuperTypes().add(this.getImportedReference());
    importedTopLevelComplexTypeReferenceEClass.getESuperTypes().add(this.getTopLevelComplexTypeReference());
    importedTopLevelComplexTypeReferenceEClass.getESuperTypes().add(this.getImportedReference());
    embeddedComplexTypeEClass.getESuperTypes().add(this.getEmbeddedType());
    embeddedComplexTypeEClass.getESuperTypes().add(this.getComplexType());
    embeddedSimpleTypeEClass.getESuperTypes().add(this.getEmbeddedType());
    embeddedSimpleTypeEClass.getESuperTypes().add(this.getSimpleType());

    // Initialize classes and features; add operations and parameters
    initEClass(schemaEClass, Schema.class, "Schema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSchema_Name(), ecorePackage.getEString(), "name", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSchema_NsURI(), ecorePackage.getEString(), "nsURI", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSchema_Imports(), this.getImport(), null, "imports", null, 0, -1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSchema_Definitions(), this.getTopLevelDefinition(), null, "definitions", null, 0, -1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImport_ImportURI(), ecorePackage.getEString(), "importURI", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getImport_NsPrefix(), ecorePackage.getEString(), "nsPrefix", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(topLevelDefinitionEClass, TopLevelDefinition.class, "TopLevelDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTopLevelDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, TopLevelDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(topLevelTypeEClass, TopLevelType.class, "TopLevelType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(topLevelElementEClass, TopLevelElement.class, "TopLevelElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTopLevelElement_TypeRef(), this.getNamedTypeReference(), null, "typeRef", null, 0, 1, TopLevelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTopLevelElement_EmbeddedTypeDef(), this.getEmbeddedType(), null, "embeddedTypeDef", null, 0, 1, TopLevelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(topLevelSimpleTypeEClass, TopLevelSimpleType.class, "TopLevelSimpleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(restrictionEClass, Restriction.class, "Restriction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRestriction_TypeRef(), this.getNonComplexTypeReference(), null, "typeRef", null, 0, 1, Restriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRestriction_Facets(), this.getFacet(), null, "facets", null, 0, -1, Restriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(facetEClass, Facet.class, "Facet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(enumerationFacetEClass, EnumerationFacet.class, "EnumerationFacet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEnumerationFacet_Literals(), this.getEnumerationLiteral(), null, "literals", null, 0, -1, EnumerationFacet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enumerationLiteralEClass, EnumerationLiteral.class, "EnumerationLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEnumerationLiteral_Value(), ecorePackage.getEString(), "value", null, 0, 1, EnumerationLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEnumerationLiteral_Annotation(), ecorePackage.getEString(), "annotation", null, 0, 1, EnumerationLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(maxLengthFacetEClass, MaxLengthFacet.class, "MaxLengthFacet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMaxLengthFacet_MaxLength(), ecorePackage.getEInt(), "maxLength", null, 0, 1, MaxLengthFacet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(patternFacetEClass, PatternFacet.class, "PatternFacet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPatternFacet_Pattern(), ecorePackage.getEString(), "pattern", null, 0, 1, PatternFacet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rangeFacetEClass, RangeFacet.class, "RangeFacet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRangeFacet_Lower(), ecorePackage.getEInt(), "lower", null, 0, 1, RangeFacet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRangeFacet_Upper(), ecorePackage.getEInt(), "upper", null, 0, 1, RangeFacet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(lengthFacetEClass, LengthFacet.class, "LengthFacet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLengthFacet_Length(), ecorePackage.getEInt(), "length", null, 0, 1, LengthFacet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(documentationEClass, Documentation.class, "Documentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDocumentation_Text(), ecorePackage.getEString(), "text", null, 0, 1, Documentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(topLevelComplexTypeEClass, TopLevelComplexType.class, "TopLevelComplexType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTopLevelComplexType_Abstract(), ecorePackage.getEBoolean(), "abstract", null, 0, 1, TopLevelComplexType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTopLevelComplexType_Documentation(), ecorePackage.getEString(), "documentation", null, 0, 1, TopLevelComplexType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProperty_Name(), ecorePackage.getEString(), "name", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(elementEClass, Element.class, "Element", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getElement_TypeRef(), this.getNamedTypeReference(), null, "typeRef", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getElement_EmbeddedTypeDef(), this.getEmbeddedType(), null, "embeddedTypeDef", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getElement_Multiplicity(), this.getMultiplicity(), null, "multiplicity", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAttribute_Required(), ecorePackage.getEBoolean(), "required", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAttribute_TypeRef(), this.getNonComplexTypeReference(), null, "typeRef", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(multiplicityEClass, Multiplicity.class, "Multiplicity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMultiplicity_Lower(), ecorePackage.getEInt(), "lower", null, 0, 1, Multiplicity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMultiplicity_Upper(), ecorePackage.getEInt(), "upper", null, 0, 1, Multiplicity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMultiplicity_Unbounded(), ecorePackage.getEBoolean(), "unbounded", null, 0, 1, Multiplicity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(namedTypeReferenceEClass, NamedTypeReference.class, "NamedTypeReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(nonComplexTypeReferenceEClass, NonComplexTypeReference.class, "NonComplexTypeReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(builtinTypeReferenceEClass, BuiltinTypeReference.class, "BuiltinTypeReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBuiltinTypeReference_Builtin(), this.getBuiltinType(), "builtin", null, 0, 1, BuiltinTypeReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(topLevelTypeReferenceEClass, TopLevelTypeReference.class, "TopLevelTypeReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTopLevelTypeReference_Ref(), this.getTopLevelType(), null, "ref", null, 0, 1, TopLevelTypeReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(topLevelComplexTypeReferenceEClass, TopLevelComplexTypeReference.class, "TopLevelComplexTypeReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTopLevelComplexTypeReference_Ref(), this.getTopLevelComplexType(), null, "ref", null, 0, 1, TopLevelComplexTypeReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(topLevelSimpleTypeReferenceEClass, TopLevelSimpleTypeReference.class, "TopLevelSimpleTypeReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTopLevelSimpleTypeReference_Ref(), this.getTopLevelSimpleType(), null, "ref", null, 0, 1, TopLevelSimpleTypeReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(directTopLevelTypeReferenceEClass, DirectTopLevelTypeReference.class, "DirectTopLevelTypeReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(directTopLevelSimpleTypeReferenceEClass, DirectTopLevelSimpleTypeReference.class, "DirectTopLevelSimpleTypeReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(directTopLevelComplexTypeReferenceEClass, DirectTopLevelComplexTypeReference.class, "DirectTopLevelComplexTypeReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(importedTopLevelTypeReferenceEClass, ImportedTopLevelTypeReference.class, "ImportedTopLevelTypeReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(importedTopLevelSimpleTypeReferenceEClass, ImportedTopLevelSimpleTypeReference.class, "ImportedTopLevelSimpleTypeReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(importedTopLevelComplexTypeReferenceEClass, ImportedTopLevelComplexTypeReference.class, "ImportedTopLevelComplexTypeReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(importedReferenceEClass, ImportedReference.class, "ImportedReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getImportedReference_Import(), this.getImport(), null, "import", null, 0, 1, ImportedReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(embeddedTypeEClass, EmbeddedType.class, "EmbeddedType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(embeddedComplexTypeEClass, EmbeddedComplexType.class, "EmbeddedComplexType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(embeddedSimpleTypeEClass, EmbeddedSimpleType.class, "EmbeddedSimpleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(complexTypeEClass, ComplexType.class, "ComplexType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getComplexType_Extends(), this.getTopLevelComplexTypeReference(), null, "extends", null, 0, 1, ComplexType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComplexType_Properties(), this.getProperty(), null, "properties", null, 0, -1, ComplexType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(simpleTypeEClass, SimpleType.class, "SimpleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSimpleType_Restriction(), this.getRestriction(), null, "restriction", null, 0, 1, SimpleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSimpleType_Documentation(), this.getDocumentation(), null, "documentation", null, 0, 1, SimpleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(builtinTypeEEnum, BuiltinType.class, "BuiltinType");
    addEEnumLiteral(builtinTypeEEnum, BuiltinType.DURATION);
    addEEnumLiteral(builtinTypeEEnum, BuiltinType.DATE_TIME);
    addEEnumLiteral(builtinTypeEEnum, BuiltinType.TIME);
    addEEnumLiteral(builtinTypeEEnum, BuiltinType.DATE);
    addEEnumLiteral(builtinTypeEEnum, BuiltinType.STRING);
    addEEnumLiteral(builtinTypeEEnum, BuiltinType.DECIMAL);
    addEEnumLiteral(builtinTypeEEnum, BuiltinType.INTEGER);
    addEEnumLiteral(builtinTypeEEnum, BuiltinType.POSITIVE_INTEGER);
    addEEnumLiteral(builtinTypeEEnum, BuiltinType.NON_NEGATIVE_INTEGER);
    addEEnumLiteral(builtinTypeEEnum, BuiltinType.TOKEN);
    addEEnumLiteral(builtinTypeEEnum, BuiltinType.BASE64_BINARY);

    // Create resource
    createResource(eNS_URI);
  }

} //XsdLanguagePackageImpl
