/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.examples.dynamicScreenDsl.util;

import java.util.List;

import nl.dslmeinte.xtext.examples.dynamicScreenDsl.*;

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
 * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.DynamicScreenDslPackage
 * @generated
 */
public class DynamicScreenDslSwitch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DynamicScreenDslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DynamicScreenDslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = DynamicScreenDslPackage.eINSTANCE;
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
      case DynamicScreenDslPackage.DYNAMIC_SCREEN:
      {
        DynamicScreen dynamicScreen = (DynamicScreen)theEObject;
        T result = caseDynamicScreen(dynamicScreen);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DynamicScreenDslPackage.LABEL:
      {
        Label label = (Label)theEObject;
        T result = caseLabel(label);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DynamicScreenDslPackage.PATH_TAIL:
      {
        PathTail pathTail = (PathTail)theEObject;
        T result = casePathTail(pathTail);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DynamicScreenDslPackage.DECLARATION:
      {
        Declaration declaration = (Declaration)theEObject;
        T result = caseDeclaration(declaration);
        if (result == null) result = caseDummyForExternalVariable(declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DynamicScreenDslPackage.EXTERNAL_VARIABLE:
      {
        ExternalVariable externalVariable = (ExternalVariable)theEObject;
        T result = caseExternalVariable(externalVariable);
        if (result == null) result = caseDeclaration(externalVariable);
        if (result == null) result = caseReferenceTarget(externalVariable);
        if (result == null) result = caseDummyForExternalVariable(externalVariable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DynamicScreenDslPackage.ENUM_LIST:
      {
        EnumList enumList = (EnumList)theEObject;
        T result = caseEnumList(enumList);
        if (result == null) result = caseDeclaration(enumList);
        if (result == null) result = caseDummyForExternalVariable(enumList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DynamicScreenDslPackage.DATA_STORE:
      {
        DataStore dataStore = (DataStore)theEObject;
        T result = caseDataStore(dataStore);
        if (result == null) result = caseDeclaration(dataStore);
        if (result == null) result = caseDummyForExternalVariable(dataStore);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DynamicScreenDslPackage.GROUP_ELEMENT:
      {
        GroupElement groupElement = (GroupElement)theEObject;
        T result = caseGroupElement(groupElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DynamicScreenDslPackage.FIELD:
      {
        Field field = (Field)theEObject;
        T result = caseField(field);
        if (result == null) result = caseGroupElement(field);
        if (result == null) result = caseReferenceTarget(field);
        if (result == null) result = caseDummyForExternalVariable(field);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DynamicScreenDslPackage.FIELD_GROUP:
      {
        FieldGroup fieldGroup = (FieldGroup)theEObject;
        T result = caseFieldGroup(fieldGroup);
        if (result == null) result = caseGroupElement(fieldGroup);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DynamicScreenDslPackage.ATTRIBUTE:
      {
        Attribute attribute = (Attribute)theEObject;
        T result = caseAttribute(attribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DynamicScreenDslPackage.ENUM_FIELD_ATTRIBUTE:
      {
        EnumFieldAttribute enumFieldAttribute = (EnumFieldAttribute)theEObject;
        T result = caseEnumFieldAttribute(enumFieldAttribute);
        if (result == null) result = caseAttribute(enumFieldAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DynamicScreenDslPackage.NORMAL_ATTRIBUTE:
      {
        NormalAttribute normalAttribute = (NormalAttribute)theEObject;
        T result = caseNormalAttribute(normalAttribute);
        if (result == null) result = caseAttribute(normalAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DynamicScreenDslPackage.ATTRIBUTE_CLASS_EXPRESSION:
      {
        AttributeClassExpression attributeClassExpression = (AttributeClassExpression)theEObject;
        T result = caseAttributeClassExpression(attributeClassExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DynamicScreenDslPackage.RESTRICTION_ATTRIBUTE:
      {
        RestrictionAttribute restrictionAttribute = (RestrictionAttribute)theEObject;
        T result = caseRestrictionAttribute(restrictionAttribute);
        if (result == null) result = caseEnumFieldAttribute(restrictionAttribute);
        if (result == null) result = caseAttribute(restrictionAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DynamicScreenDslPackage.RESTRICTION_GROUP_ATTRIBUTE:
      {
        RestrictionGroupAttribute restrictionGroupAttribute = (RestrictionGroupAttribute)theEObject;
        T result = caseRestrictionGroupAttribute(restrictionGroupAttribute);
        if (result == null) result = caseEnumFieldAttribute(restrictionGroupAttribute);
        if (result == null) result = caseAttribute(restrictionGroupAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DynamicScreenDslPackage.RESTRICTION_RULE:
      {
        RestrictionRule restrictionRule = (RestrictionRule)theEObject;
        T result = caseRestrictionRule(restrictionRule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DynamicScreenDslPackage.REFERENCE_TARGET:
      {
        ReferenceTarget referenceTarget = (ReferenceTarget)theEObject;
        T result = caseReferenceTarget(referenceTarget);
        if (result == null) result = caseDummyForExternalVariable(referenceTarget);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DynamicScreenDslPackage.REFERENCE:
      {
        Reference reference = (Reference)theEObject;
        T result = caseReference(reference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DynamicScreenDslPackage.DUMMY_FOR_EXTERNAL_VARIABLE:
      {
        DummyForExternalVariable dummyForExternalVariable = (DummyForExternalVariable)theEObject;
        T result = caseDummyForExternalVariable(dummyForExternalVariable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DynamicScreenDslPackage.BEXPRESSION:
      {
        BExpression bExpression = (BExpression)theEObject;
        T result = caseBExpression(bExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DynamicScreenDslPackage.ATOMIC_REFERRING_BEXPRESSION:
      {
        AtomicReferringBExpression atomicReferringBExpression = (AtomicReferringBExpression)theEObject;
        T result = caseAtomicReferringBExpression(atomicReferringBExpression);
        if (result == null) result = caseBExpression(atomicReferringBExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DynamicScreenDslPackage.BCOMPARISON:
      {
        BComparison bComparison = (BComparison)theEObject;
        T result = caseBComparison(bComparison);
        if (result == null) result = caseAtomicReferringBExpression(bComparison);
        if (result == null) result = caseBExpression(bComparison);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DynamicScreenDslPackage.ENUM_COMPARISON:
      {
        EnumComparison enumComparison = (EnumComparison)theEObject;
        T result = caseEnumComparison(enumComparison);
        if (result == null) result = caseAtomicReferringBExpression(enumComparison);
        if (result == null) result = caseBExpression(enumComparison);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DynamicScreenDslPackage.SINGLE_ENUM_COMPARISON:
      {
        SingleEnumComparison singleEnumComparison = (SingleEnumComparison)theEObject;
        T result = caseSingleEnumComparison(singleEnumComparison);
        if (result == null) result = caseEnumComparison(singleEnumComparison);
        if (result == null) result = caseAtomicReferringBExpression(singleEnumComparison);
        if (result == null) result = caseBExpression(singleEnumComparison);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DynamicScreenDslPackage.MULTI_ENUM_COMPARISON:
      {
        MultiEnumComparison multiEnumComparison = (MultiEnumComparison)theEObject;
        T result = caseMultiEnumComparison(multiEnumComparison);
        if (result == null) result = caseEnumComparison(multiEnumComparison);
        if (result == null) result = caseAtomicReferringBExpression(multiEnumComparison);
        if (result == null) result = caseBExpression(multiEnumComparison);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DynamicScreenDslPackage.STRING_VALUE_COMPARISON:
      {
        StringValueComparison stringValueComparison = (StringValueComparison)theEObject;
        T result = caseStringValueComparison(stringValueComparison);
        if (result == null) result = caseAtomicReferringBExpression(stringValueComparison);
        if (result == null) result = caseBExpression(stringValueComparison);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DynamicScreenDslPackage.PRESENCE_CHECK:
      {
        PresenceCheck presenceCheck = (PresenceCheck)theEObject;
        T result = casePresenceCheck(presenceCheck);
        if (result == null) result = caseAtomicReferringBExpression(presenceCheck);
        if (result == null) result = caseBExpression(presenceCheck);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DynamicScreenDslPackage.ENUM_LITERALS_COLLECTION:
      {
        EnumLiteralsCollection enumLiteralsCollection = (EnumLiteralsCollection)theEObject;
        T result = caseEnumLiteralsCollection(enumLiteralsCollection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DynamicScreenDslPackage.DIRECT_ENUM_LITERALS_COLLECTION:
      {
        DirectEnumLiteralsCollection directEnumLiteralsCollection = (DirectEnumLiteralsCollection)theEObject;
        T result = caseDirectEnumLiteralsCollection(directEnumLiteralsCollection);
        if (result == null) result = caseEnumLiteralsCollection(directEnumLiteralsCollection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DynamicScreenDslPackage.ENUM_LIST_REFERENCE:
      {
        EnumListReference enumListReference = (EnumListReference)theEObject;
        T result = caseEnumListReference(enumListReference);
        if (result == null) result = caseEnumLiteralsCollection(enumListReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DynamicScreenDslPackage.OR_OPERATION:
      {
        OrOperation orOperation = (OrOperation)theEObject;
        T result = caseOrOperation(orOperation);
        if (result == null) result = caseBExpression(orOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DynamicScreenDslPackage.AND_OPERATION:
      {
        AndOperation andOperation = (AndOperation)theEObject;
        T result = caseAndOperation(andOperation);
        if (result == null) result = caseBExpression(andOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DynamicScreenDslPackage.NEGATION_EXPRESSION:
      {
        NegationExpression negationExpression = (NegationExpression)theEObject;
        T result = caseNegationExpression(negationExpression);
        if (result == null) result = caseBExpression(negationExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dynamic Screen</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dynamic Screen</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDynamicScreen(DynamicScreen object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Label</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Label</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLabel(Label object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Path Tail</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Path Tail</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePathTail(PathTail object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeclaration(Declaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>External Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>External Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExternalVariable(ExternalVariable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enum List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enum List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumList(EnumList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Store</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Store</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataStore(DataStore object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Group Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Group Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGroupElement(GroupElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Field</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Field</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseField(Field object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Field Group</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Field Group</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFieldGroup(FieldGroup object)
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
   * Returns the result of interpreting the object as an instance of '<em>Enum Field Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enum Field Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumFieldAttribute(EnumFieldAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Normal Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Normal Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNormalAttribute(NormalAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute Class Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute Class Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttributeClassExpression(AttributeClassExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Restriction Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Restriction Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRestrictionAttribute(RestrictionAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Restriction Group Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Restriction Group Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRestrictionGroupAttribute(RestrictionGroupAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Restriction Rule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Restriction Rule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRestrictionRule(RestrictionRule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Reference Target</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Reference Target</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReferenceTarget(ReferenceTarget object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReference(Reference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dummy For External Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dummy For External Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDummyForExternalVariable(DummyForExternalVariable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BExpression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BExpression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBExpression(BExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Atomic Referring BExpression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Atomic Referring BExpression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAtomicReferringBExpression(AtomicReferringBExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BComparison</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BComparison</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBComparison(BComparison object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enum Comparison</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enum Comparison</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumComparison(EnumComparison object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Single Enum Comparison</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Single Enum Comparison</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSingleEnumComparison(SingleEnumComparison object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Multi Enum Comparison</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Multi Enum Comparison</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMultiEnumComparison(MultiEnumComparison object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Value Comparison</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Value Comparison</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringValueComparison(StringValueComparison object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Presence Check</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Presence Check</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePresenceCheck(PresenceCheck object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enum Literals Collection</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enum Literals Collection</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumLiteralsCollection(EnumLiteralsCollection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Direct Enum Literals Collection</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Direct Enum Literals Collection</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDirectEnumLiteralsCollection(DirectEnumLiteralsCollection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enum List Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enum List Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumListReference(EnumListReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Or Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Or Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOrOperation(OrOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>And Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>And Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAndOperation(AndOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Negation Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Negation Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNegationExpression(NegationExpression object)
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

} //DynamicScreenDslSwitch
