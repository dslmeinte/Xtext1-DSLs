/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.examples.xsdLanguage.util;

import nl.dslmeinte.xtext.examples.xsdLanguage.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see nl.dslmeinte.xtext.examples.xsdLanguage.XsdLanguagePackage
 * @generated
 */
public class XsdLanguageAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static XsdLanguagePackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XsdLanguageAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = XsdLanguagePackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected XsdLanguageSwitch<Adapter> modelSwitch =
    new XsdLanguageSwitch<Adapter>()
    {
      @Override
      public Adapter caseSchema(Schema object)
      {
        return createSchemaAdapter();
      }
      @Override
      public Adapter caseImport(Import object)
      {
        return createImportAdapter();
      }
      @Override
      public Adapter caseTopLevelDefinition(TopLevelDefinition object)
      {
        return createTopLevelDefinitionAdapter();
      }
      @Override
      public Adapter caseTopLevelType(TopLevelType object)
      {
        return createTopLevelTypeAdapter();
      }
      @Override
      public Adapter caseTopLevelElement(TopLevelElement object)
      {
        return createTopLevelElementAdapter();
      }
      @Override
      public Adapter caseTopLevelSimpleType(TopLevelSimpleType object)
      {
        return createTopLevelSimpleTypeAdapter();
      }
      @Override
      public Adapter caseRestriction(Restriction object)
      {
        return createRestrictionAdapter();
      }
      @Override
      public Adapter caseFacet(Facet object)
      {
        return createFacetAdapter();
      }
      @Override
      public Adapter caseEnumerationFacet(EnumerationFacet object)
      {
        return createEnumerationFacetAdapter();
      }
      @Override
      public Adapter caseEnumerationLiteral(EnumerationLiteral object)
      {
        return createEnumerationLiteralAdapter();
      }
      @Override
      public Adapter caseMaxLengthFacet(MaxLengthFacet object)
      {
        return createMaxLengthFacetAdapter();
      }
      @Override
      public Adapter casePatternFacet(PatternFacet object)
      {
        return createPatternFacetAdapter();
      }
      @Override
      public Adapter caseRangeFacet(RangeFacet object)
      {
        return createRangeFacetAdapter();
      }
      @Override
      public Adapter caseLengthFacet(LengthFacet object)
      {
        return createLengthFacetAdapter();
      }
      @Override
      public Adapter caseDocumentation(Documentation object)
      {
        return createDocumentationAdapter();
      }
      @Override
      public Adapter caseTopLevelComplexType(TopLevelComplexType object)
      {
        return createTopLevelComplexTypeAdapter();
      }
      @Override
      public Adapter caseProperty(Property object)
      {
        return createPropertyAdapter();
      }
      @Override
      public Adapter caseElement(Element object)
      {
        return createElementAdapter();
      }
      @Override
      public Adapter caseAttribute(Attribute object)
      {
        return createAttributeAdapter();
      }
      @Override
      public Adapter caseMultiplicity(Multiplicity object)
      {
        return createMultiplicityAdapter();
      }
      @Override
      public Adapter caseNamedTypeReference(NamedTypeReference object)
      {
        return createNamedTypeReferenceAdapter();
      }
      @Override
      public Adapter caseNonComplexTypeReference(NonComplexTypeReference object)
      {
        return createNonComplexTypeReferenceAdapter();
      }
      @Override
      public Adapter caseBuiltinTypeReference(BuiltinTypeReference object)
      {
        return createBuiltinTypeReferenceAdapter();
      }
      @Override
      public Adapter caseTopLevelTypeReference(TopLevelTypeReference object)
      {
        return createTopLevelTypeReferenceAdapter();
      }
      @Override
      public Adapter caseTopLevelComplexTypeReference(TopLevelComplexTypeReference object)
      {
        return createTopLevelComplexTypeReferenceAdapter();
      }
      @Override
      public Adapter caseTopLevelSimpleTypeReference(TopLevelSimpleTypeReference object)
      {
        return createTopLevelSimpleTypeReferenceAdapter();
      }
      @Override
      public Adapter caseDirectTopLevelTypeReference(DirectTopLevelTypeReference object)
      {
        return createDirectTopLevelTypeReferenceAdapter();
      }
      @Override
      public Adapter caseDirectTopLevelSimpleTypeReference(DirectTopLevelSimpleTypeReference object)
      {
        return createDirectTopLevelSimpleTypeReferenceAdapter();
      }
      @Override
      public Adapter caseDirectTopLevelComplexTypeReference(DirectTopLevelComplexTypeReference object)
      {
        return createDirectTopLevelComplexTypeReferenceAdapter();
      }
      @Override
      public Adapter caseImportedTopLevelTypeReference(ImportedTopLevelTypeReference object)
      {
        return createImportedTopLevelTypeReferenceAdapter();
      }
      @Override
      public Adapter caseImportedTopLevelSimpleTypeReference(ImportedTopLevelSimpleTypeReference object)
      {
        return createImportedTopLevelSimpleTypeReferenceAdapter();
      }
      @Override
      public Adapter caseImportedTopLevelComplexTypeReference(ImportedTopLevelComplexTypeReference object)
      {
        return createImportedTopLevelComplexTypeReferenceAdapter();
      }
      @Override
      public Adapter caseImportedReference(ImportedReference object)
      {
        return createImportedReferenceAdapter();
      }
      @Override
      public Adapter caseEmbeddedType(EmbeddedType object)
      {
        return createEmbeddedTypeAdapter();
      }
      @Override
      public Adapter caseEmbeddedComplexType(EmbeddedComplexType object)
      {
        return createEmbeddedComplexTypeAdapter();
      }
      @Override
      public Adapter caseEmbeddedSimpleType(EmbeddedSimpleType object)
      {
        return createEmbeddedSimpleTypeAdapter();
      }
      @Override
      public Adapter caseComplexType(ComplexType object)
      {
        return createComplexTypeAdapter();
      }
      @Override
      public Adapter caseSimpleType(SimpleType object)
      {
        return createSimpleTypeAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.examples.xsdLanguage.Schema <em>Schema</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.Schema
   * @generated
   */
  public Adapter createSchemaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.examples.xsdLanguage.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.Import
   * @generated
   */
  public Adapter createImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.examples.xsdLanguage.TopLevelDefinition <em>Top Level Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.TopLevelDefinition
   * @generated
   */
  public Adapter createTopLevelDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.examples.xsdLanguage.TopLevelType <em>Top Level Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.TopLevelType
   * @generated
   */
  public Adapter createTopLevelTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.examples.xsdLanguage.TopLevelElement <em>Top Level Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.TopLevelElement
   * @generated
   */
  public Adapter createTopLevelElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.examples.xsdLanguage.TopLevelSimpleType <em>Top Level Simple Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.TopLevelSimpleType
   * @generated
   */
  public Adapter createTopLevelSimpleTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.examples.xsdLanguage.Restriction <em>Restriction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.Restriction
   * @generated
   */
  public Adapter createRestrictionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.examples.xsdLanguage.Facet <em>Facet</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.Facet
   * @generated
   */
  public Adapter createFacetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.examples.xsdLanguage.EnumerationFacet <em>Enumeration Facet</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.EnumerationFacet
   * @generated
   */
  public Adapter createEnumerationFacetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.examples.xsdLanguage.EnumerationLiteral <em>Enumeration Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.EnumerationLiteral
   * @generated
   */
  public Adapter createEnumerationLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.examples.xsdLanguage.MaxLengthFacet <em>Max Length Facet</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.MaxLengthFacet
   * @generated
   */
  public Adapter createMaxLengthFacetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.examples.xsdLanguage.PatternFacet <em>Pattern Facet</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.PatternFacet
   * @generated
   */
  public Adapter createPatternFacetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.examples.xsdLanguage.RangeFacet <em>Range Facet</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.RangeFacet
   * @generated
   */
  public Adapter createRangeFacetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.examples.xsdLanguage.LengthFacet <em>Length Facet</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.LengthFacet
   * @generated
   */
  public Adapter createLengthFacetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.examples.xsdLanguage.Documentation <em>Documentation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.Documentation
   * @generated
   */
  public Adapter createDocumentationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.examples.xsdLanguage.TopLevelComplexType <em>Top Level Complex Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.TopLevelComplexType
   * @generated
   */
  public Adapter createTopLevelComplexTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.examples.xsdLanguage.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.Property
   * @generated
   */
  public Adapter createPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.examples.xsdLanguage.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.Element
   * @generated
   */
  public Adapter createElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.examples.xsdLanguage.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.Attribute
   * @generated
   */
  public Adapter createAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.examples.xsdLanguage.Multiplicity <em>Multiplicity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.Multiplicity
   * @generated
   */
  public Adapter createMultiplicityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.examples.xsdLanguage.NamedTypeReference <em>Named Type Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.NamedTypeReference
   * @generated
   */
  public Adapter createNamedTypeReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.examples.xsdLanguage.NonComplexTypeReference <em>Non Complex Type Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.NonComplexTypeReference
   * @generated
   */
  public Adapter createNonComplexTypeReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.examples.xsdLanguage.BuiltinTypeReference <em>Builtin Type Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.BuiltinTypeReference
   * @generated
   */
  public Adapter createBuiltinTypeReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.examples.xsdLanguage.TopLevelTypeReference <em>Top Level Type Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.TopLevelTypeReference
   * @generated
   */
  public Adapter createTopLevelTypeReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.examples.xsdLanguage.TopLevelComplexTypeReference <em>Top Level Complex Type Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.TopLevelComplexTypeReference
   * @generated
   */
  public Adapter createTopLevelComplexTypeReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.examples.xsdLanguage.TopLevelSimpleTypeReference <em>Top Level Simple Type Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.TopLevelSimpleTypeReference
   * @generated
   */
  public Adapter createTopLevelSimpleTypeReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.examples.xsdLanguage.DirectTopLevelTypeReference <em>Direct Top Level Type Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.DirectTopLevelTypeReference
   * @generated
   */
  public Adapter createDirectTopLevelTypeReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.examples.xsdLanguage.DirectTopLevelSimpleTypeReference <em>Direct Top Level Simple Type Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.DirectTopLevelSimpleTypeReference
   * @generated
   */
  public Adapter createDirectTopLevelSimpleTypeReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.examples.xsdLanguage.DirectTopLevelComplexTypeReference <em>Direct Top Level Complex Type Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.DirectTopLevelComplexTypeReference
   * @generated
   */
  public Adapter createDirectTopLevelComplexTypeReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.examples.xsdLanguage.ImportedTopLevelTypeReference <em>Imported Top Level Type Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.ImportedTopLevelTypeReference
   * @generated
   */
  public Adapter createImportedTopLevelTypeReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.examples.xsdLanguage.ImportedTopLevelSimpleTypeReference <em>Imported Top Level Simple Type Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.ImportedTopLevelSimpleTypeReference
   * @generated
   */
  public Adapter createImportedTopLevelSimpleTypeReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.examples.xsdLanguage.ImportedTopLevelComplexTypeReference <em>Imported Top Level Complex Type Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.ImportedTopLevelComplexTypeReference
   * @generated
   */
  public Adapter createImportedTopLevelComplexTypeReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.examples.xsdLanguage.ImportedReference <em>Imported Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.ImportedReference
   * @generated
   */
  public Adapter createImportedReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.examples.xsdLanguage.EmbeddedType <em>Embedded Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.EmbeddedType
   * @generated
   */
  public Adapter createEmbeddedTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.examples.xsdLanguage.EmbeddedComplexType <em>Embedded Complex Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.EmbeddedComplexType
   * @generated
   */
  public Adapter createEmbeddedComplexTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.examples.xsdLanguage.EmbeddedSimpleType <em>Embedded Simple Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.EmbeddedSimpleType
   * @generated
   */
  public Adapter createEmbeddedSimpleTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.examples.xsdLanguage.ComplexType <em>Complex Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.ComplexType
   * @generated
   */
  public Adapter createComplexTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.examples.xsdLanguage.SimpleType <em>Simple Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.examples.xsdLanguage.SimpleType
   * @generated
   */
  public Adapter createSimpleTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //XsdLanguageAdapterFactory
