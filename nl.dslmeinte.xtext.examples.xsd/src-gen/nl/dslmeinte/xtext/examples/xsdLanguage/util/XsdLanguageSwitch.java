/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.examples.xsdLanguage.util;

import java.util.List;

import nl.dslmeinte.xtext.examples.xsdLanguage.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see nl.dslmeinte.xtext.examples.xsdLanguage.XsdLanguagePackage
 * @generated
 */
public class XsdLanguageSwitch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static XsdLanguagePackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XsdLanguageSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = XsdLanguagePackage.eINSTANCE;
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  public T doSwitch(EObject theEObject)
  {
    return doSwitch(theEObject.eClass(), theEObject);
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected T doSwitch(EClass theEClass, EObject theEObject)
  {
    if (theEClass.eContainer() == modelPackage)
    {
      return doSwitch(theEClass.getClassifierID(), theEObject);
    }
    else
    {
      List<EClass> eSuperTypes = theEClass.getESuperTypes();
      return
        eSuperTypes.isEmpty() ?
          defaultCase(theEObject) :
          doSwitch(eSuperTypes.get(0), theEObject);
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case XsdLanguagePackage.SCHEMA:
      {
        Schema schema = (Schema)theEObject;
        T result = caseSchema(schema);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XsdLanguagePackage.IMPORT:
      {
        Import import_ = (Import)theEObject;
        T result = caseImport(import_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XsdLanguagePackage.TOP_LEVEL_DEFINITION:
      {
        TopLevelDefinition topLevelDefinition = (TopLevelDefinition)theEObject;
        T result = caseTopLevelDefinition(topLevelDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XsdLanguagePackage.TOP_LEVEL_TYPE:
      {
        TopLevelType topLevelType = (TopLevelType)theEObject;
        T result = caseTopLevelType(topLevelType);
        if (result == null) result = caseTopLevelDefinition(topLevelType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XsdLanguagePackage.TOP_LEVEL_ELEMENT:
      {
        TopLevelElement topLevelElement = (TopLevelElement)theEObject;
        T result = caseTopLevelElement(topLevelElement);
        if (result == null) result = caseTopLevelDefinition(topLevelElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XsdLanguagePackage.TOP_LEVEL_SIMPLE_TYPE:
      {
        TopLevelSimpleType topLevelSimpleType = (TopLevelSimpleType)theEObject;
        T result = caseTopLevelSimpleType(topLevelSimpleType);
        if (result == null) result = caseTopLevelType(topLevelSimpleType);
        if (result == null) result = caseSimpleType(topLevelSimpleType);
        if (result == null) result = caseTopLevelDefinition(topLevelSimpleType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XsdLanguagePackage.RESTRICTION:
      {
        Restriction restriction = (Restriction)theEObject;
        T result = caseRestriction(restriction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XsdLanguagePackage.FACET:
      {
        Facet facet = (Facet)theEObject;
        T result = caseFacet(facet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XsdLanguagePackage.ENUMERATION_FACET:
      {
        EnumerationFacet enumerationFacet = (EnumerationFacet)theEObject;
        T result = caseEnumerationFacet(enumerationFacet);
        if (result == null) result = caseFacet(enumerationFacet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XsdLanguagePackage.ENUMERATION_LITERAL:
      {
        EnumerationLiteral enumerationLiteral = (EnumerationLiteral)theEObject;
        T result = caseEnumerationLiteral(enumerationLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XsdLanguagePackage.MAX_LENGTH_FACET:
      {
        MaxLengthFacet maxLengthFacet = (MaxLengthFacet)theEObject;
        T result = caseMaxLengthFacet(maxLengthFacet);
        if (result == null) result = caseFacet(maxLengthFacet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XsdLanguagePackage.PATTERN_FACET:
      {
        PatternFacet patternFacet = (PatternFacet)theEObject;
        T result = casePatternFacet(patternFacet);
        if (result == null) result = caseFacet(patternFacet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XsdLanguagePackage.RANGE_FACET:
      {
        RangeFacet rangeFacet = (RangeFacet)theEObject;
        T result = caseRangeFacet(rangeFacet);
        if (result == null) result = caseFacet(rangeFacet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XsdLanguagePackage.LENGTH_FACET:
      {
        LengthFacet lengthFacet = (LengthFacet)theEObject;
        T result = caseLengthFacet(lengthFacet);
        if (result == null) result = caseFacet(lengthFacet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XsdLanguagePackage.DOCUMENTATION:
      {
        Documentation documentation = (Documentation)theEObject;
        T result = caseDocumentation(documentation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XsdLanguagePackage.TOP_LEVEL_COMPLEX_TYPE:
      {
        TopLevelComplexType topLevelComplexType = (TopLevelComplexType)theEObject;
        T result = caseTopLevelComplexType(topLevelComplexType);
        if (result == null) result = caseTopLevelType(topLevelComplexType);
        if (result == null) result = caseComplexType(topLevelComplexType);
        if (result == null) result = caseTopLevelDefinition(topLevelComplexType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XsdLanguagePackage.PROPERTY:
      {
        Property property = (Property)theEObject;
        T result = caseProperty(property);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XsdLanguagePackage.ELEMENT:
      {
        Element element = (Element)theEObject;
        T result = caseElement(element);
        if (result == null) result = caseProperty(element);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XsdLanguagePackage.ATTRIBUTE:
      {
        Attribute attribute = (Attribute)theEObject;
        T result = caseAttribute(attribute);
        if (result == null) result = caseProperty(attribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XsdLanguagePackage.MULTIPLICITY:
      {
        Multiplicity multiplicity = (Multiplicity)theEObject;
        T result = caseMultiplicity(multiplicity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XsdLanguagePackage.NAMED_TYPE_REFERENCE:
      {
        NamedTypeReference namedTypeReference = (NamedTypeReference)theEObject;
        T result = caseNamedTypeReference(namedTypeReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XsdLanguagePackage.NON_COMPLEX_TYPE_REFERENCE:
      {
        NonComplexTypeReference nonComplexTypeReference = (NonComplexTypeReference)theEObject;
        T result = caseNonComplexTypeReference(nonComplexTypeReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XsdLanguagePackage.BUILTIN_TYPE_REFERENCE:
      {
        BuiltinTypeReference builtinTypeReference = (BuiltinTypeReference)theEObject;
        T result = caseBuiltinTypeReference(builtinTypeReference);
        if (result == null) result = caseNamedTypeReference(builtinTypeReference);
        if (result == null) result = caseNonComplexTypeReference(builtinTypeReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XsdLanguagePackage.TOP_LEVEL_TYPE_REFERENCE:
      {
        TopLevelTypeReference topLevelTypeReference = (TopLevelTypeReference)theEObject;
        T result = caseTopLevelTypeReference(topLevelTypeReference);
        if (result == null) result = caseNamedTypeReference(topLevelTypeReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XsdLanguagePackage.TOP_LEVEL_COMPLEX_TYPE_REFERENCE:
      {
        TopLevelComplexTypeReference topLevelComplexTypeReference = (TopLevelComplexTypeReference)theEObject;
        T result = caseTopLevelComplexTypeReference(topLevelComplexTypeReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XsdLanguagePackage.TOP_LEVEL_SIMPLE_TYPE_REFERENCE:
      {
        TopLevelSimpleTypeReference topLevelSimpleTypeReference = (TopLevelSimpleTypeReference)theEObject;
        T result = caseTopLevelSimpleTypeReference(topLevelSimpleTypeReference);
        if (result == null) result = caseNonComplexTypeReference(topLevelSimpleTypeReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XsdLanguagePackage.DIRECT_TOP_LEVEL_TYPE_REFERENCE:
      {
        DirectTopLevelTypeReference directTopLevelTypeReference = (DirectTopLevelTypeReference)theEObject;
        T result = caseDirectTopLevelTypeReference(directTopLevelTypeReference);
        if (result == null) result = caseTopLevelTypeReference(directTopLevelTypeReference);
        if (result == null) result = caseNamedTypeReference(directTopLevelTypeReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XsdLanguagePackage.DIRECT_TOP_LEVEL_SIMPLE_TYPE_REFERENCE:
      {
        DirectTopLevelSimpleTypeReference directTopLevelSimpleTypeReference = (DirectTopLevelSimpleTypeReference)theEObject;
        T result = caseDirectTopLevelSimpleTypeReference(directTopLevelSimpleTypeReference);
        if (result == null) result = caseTopLevelSimpleTypeReference(directTopLevelSimpleTypeReference);
        if (result == null) result = caseNonComplexTypeReference(directTopLevelSimpleTypeReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XsdLanguagePackage.DIRECT_TOP_LEVEL_COMPLEX_TYPE_REFERENCE:
      {
        DirectTopLevelComplexTypeReference directTopLevelComplexTypeReference = (DirectTopLevelComplexTypeReference)theEObject;
        T result = caseDirectTopLevelComplexTypeReference(directTopLevelComplexTypeReference);
        if (result == null) result = caseTopLevelComplexTypeReference(directTopLevelComplexTypeReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XsdLanguagePackage.IMPORTED_TOP_LEVEL_TYPE_REFERENCE:
      {
        ImportedTopLevelTypeReference importedTopLevelTypeReference = (ImportedTopLevelTypeReference)theEObject;
        T result = caseImportedTopLevelTypeReference(importedTopLevelTypeReference);
        if (result == null) result = caseTopLevelTypeReference(importedTopLevelTypeReference);
        if (result == null) result = caseImportedReference(importedTopLevelTypeReference);
        if (result == null) result = caseNamedTypeReference(importedTopLevelTypeReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XsdLanguagePackage.IMPORTED_TOP_LEVEL_SIMPLE_TYPE_REFERENCE:
      {
        ImportedTopLevelSimpleTypeReference importedTopLevelSimpleTypeReference = (ImportedTopLevelSimpleTypeReference)theEObject;
        T result = caseImportedTopLevelSimpleTypeReference(importedTopLevelSimpleTypeReference);
        if (result == null) result = caseTopLevelSimpleTypeReference(importedTopLevelSimpleTypeReference);
        if (result == null) result = caseImportedReference(importedTopLevelSimpleTypeReference);
        if (result == null) result = caseNonComplexTypeReference(importedTopLevelSimpleTypeReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XsdLanguagePackage.IMPORTED_TOP_LEVEL_COMPLEX_TYPE_REFERENCE:
      {
        ImportedTopLevelComplexTypeReference importedTopLevelComplexTypeReference = (ImportedTopLevelComplexTypeReference)theEObject;
        T result = caseImportedTopLevelComplexTypeReference(importedTopLevelComplexTypeReference);
        if (result == null) result = caseTopLevelComplexTypeReference(importedTopLevelComplexTypeReference);
        if (result == null) result = caseImportedReference(importedTopLevelComplexTypeReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XsdLanguagePackage.IMPORTED_REFERENCE:
      {
        ImportedReference importedReference = (ImportedReference)theEObject;
        T result = caseImportedReference(importedReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XsdLanguagePackage.EMBEDDED_TYPE:
      {
        EmbeddedType embeddedType = (EmbeddedType)theEObject;
        T result = caseEmbeddedType(embeddedType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XsdLanguagePackage.EMBEDDED_COMPLEX_TYPE:
      {
        EmbeddedComplexType embeddedComplexType = (EmbeddedComplexType)theEObject;
        T result = caseEmbeddedComplexType(embeddedComplexType);
        if (result == null) result = caseEmbeddedType(embeddedComplexType);
        if (result == null) result = caseComplexType(embeddedComplexType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XsdLanguagePackage.EMBEDDED_SIMPLE_TYPE:
      {
        EmbeddedSimpleType embeddedSimpleType = (EmbeddedSimpleType)theEObject;
        T result = caseEmbeddedSimpleType(embeddedSimpleType);
        if (result == null) result = caseEmbeddedType(embeddedSimpleType);
        if (result == null) result = caseSimpleType(embeddedSimpleType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XsdLanguagePackage.COMPLEX_TYPE:
      {
        ComplexType complexType = (ComplexType)theEObject;
        T result = caseComplexType(complexType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XsdLanguagePackage.SIMPLE_TYPE:
      {
        SimpleType simpleType = (SimpleType)theEObject;
        T result = caseSimpleType(simpleType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Schema</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Schema</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSchema(Schema object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImport(Import object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Top Level Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Top Level Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTopLevelDefinition(TopLevelDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Top Level Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Top Level Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTopLevelType(TopLevelType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Top Level Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Top Level Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTopLevelElement(TopLevelElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Top Level Simple Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Top Level Simple Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTopLevelSimpleType(TopLevelSimpleType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Restriction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Restriction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRestriction(Restriction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Facet</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Facet</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFacet(Facet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enumeration Facet</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enumeration Facet</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumerationFacet(EnumerationFacet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enumeration Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enumeration Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumerationLiteral(EnumerationLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Max Length Facet</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Max Length Facet</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMaxLengthFacet(MaxLengthFacet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pattern Facet</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pattern Facet</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePatternFacet(PatternFacet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Range Facet</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Range Facet</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRangeFacet(RangeFacet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Length Facet</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Length Facet</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLengthFacet(LengthFacet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Documentation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Documentation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDocumentation(Documentation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Top Level Complex Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Top Level Complex Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTopLevelComplexType(TopLevelComplexType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProperty(Property object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElement(Element object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttribute(Attribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Multiplicity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Multiplicity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMultiplicity(Multiplicity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Named Type Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Named Type Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamedTypeReference(NamedTypeReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Non Complex Type Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Non Complex Type Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNonComplexTypeReference(NonComplexTypeReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Builtin Type Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Builtin Type Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBuiltinTypeReference(BuiltinTypeReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Top Level Type Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Top Level Type Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTopLevelTypeReference(TopLevelTypeReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Top Level Complex Type Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Top Level Complex Type Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTopLevelComplexTypeReference(TopLevelComplexTypeReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Top Level Simple Type Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Top Level Simple Type Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTopLevelSimpleTypeReference(TopLevelSimpleTypeReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Direct Top Level Type Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Direct Top Level Type Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDirectTopLevelTypeReference(DirectTopLevelTypeReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Direct Top Level Simple Type Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Direct Top Level Simple Type Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDirectTopLevelSimpleTypeReference(DirectTopLevelSimpleTypeReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Direct Top Level Complex Type Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Direct Top Level Complex Type Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDirectTopLevelComplexTypeReference(DirectTopLevelComplexTypeReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Imported Top Level Type Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Imported Top Level Type Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImportedTopLevelTypeReference(ImportedTopLevelTypeReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Imported Top Level Simple Type Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Imported Top Level Simple Type Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImportedTopLevelSimpleTypeReference(ImportedTopLevelSimpleTypeReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Imported Top Level Complex Type Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Imported Top Level Complex Type Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImportedTopLevelComplexTypeReference(ImportedTopLevelComplexTypeReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Imported Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Imported Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImportedReference(ImportedReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Embedded Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Embedded Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEmbeddedType(EmbeddedType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Embedded Complex Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Embedded Complex Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEmbeddedComplexType(EmbeddedComplexType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Embedded Simple Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Embedded Simple Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEmbeddedSimpleType(EmbeddedSimpleType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Complex Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Complex Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComplexType(ComplexType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Simple Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Simple Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSimpleType(SimpleType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  public T defaultCase(EObject object)
  {
    return null;
  }

} //XsdLanguageSwitch
