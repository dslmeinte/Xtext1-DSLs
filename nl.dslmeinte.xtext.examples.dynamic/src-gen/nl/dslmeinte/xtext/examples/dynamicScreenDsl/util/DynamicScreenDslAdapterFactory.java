/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.examples.dynamicScreenDsl.util;

import nl.dslmeinte.xtext.examples.dynamicScreenDsl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.DynamicScreenDslPackage
 * @generated
 */
public class DynamicScreenDslAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DynamicScreenDslPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DynamicScreenDslAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = DynamicScreenDslPackage.eINSTANCE;
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
  protected DynamicScreenDslSwitch<Adapter> modelSwitch =
    new DynamicScreenDslSwitch<Adapter>()
    {
      @Override
      public Adapter caseDynamicScreen(DynamicScreen object)
      {
        return createDynamicScreenAdapter();
      }
      @Override
      public Adapter caseLabel(Label object)
      {
        return createLabelAdapter();
      }
      @Override
      public Adapter casePathTail(PathTail object)
      {
        return createPathTailAdapter();
      }
      @Override
      public Adapter caseDeclaration(Declaration object)
      {
        return createDeclarationAdapter();
      }
      @Override
      public Adapter caseExternalVariable(ExternalVariable object)
      {
        return createExternalVariableAdapter();
      }
      @Override
      public Adapter caseEnumList(EnumList object)
      {
        return createEnumListAdapter();
      }
      @Override
      public Adapter caseDataStore(DataStore object)
      {
        return createDataStoreAdapter();
      }
      @Override
      public Adapter caseGroupElement(GroupElement object)
      {
        return createGroupElementAdapter();
      }
      @Override
      public Adapter caseField(Field object)
      {
        return createFieldAdapter();
      }
      @Override
      public Adapter caseFieldGroup(FieldGroup object)
      {
        return createFieldGroupAdapter();
      }
      @Override
      public Adapter caseAttribute(Attribute object)
      {
        return createAttributeAdapter();
      }
      @Override
      public Adapter caseEnumFieldAttribute(EnumFieldAttribute object)
      {
        return createEnumFieldAttributeAdapter();
      }
      @Override
      public Adapter caseNormalAttribute(NormalAttribute object)
      {
        return createNormalAttributeAdapter();
      }
      @Override
      public Adapter caseAttributeClassExpression(AttributeClassExpression object)
      {
        return createAttributeClassExpressionAdapter();
      }
      @Override
      public Adapter caseRestrictionAttribute(RestrictionAttribute object)
      {
        return createRestrictionAttributeAdapter();
      }
      @Override
      public Adapter caseRestrictionGroupAttribute(RestrictionGroupAttribute object)
      {
        return createRestrictionGroupAttributeAdapter();
      }
      @Override
      public Adapter caseRestrictionRule(RestrictionRule object)
      {
        return createRestrictionRuleAdapter();
      }
      @Override
      public Adapter caseReferenceTarget(ReferenceTarget object)
      {
        return createReferenceTargetAdapter();
      }
      @Override
      public Adapter caseReference(Reference object)
      {
        return createReferenceAdapter();
      }
      @Override
      public Adapter caseDummyForExternalVariable(DummyForExternalVariable object)
      {
        return createDummyForExternalVariableAdapter();
      }
      @Override
      public Adapter caseBExpression(BExpression object)
      {
        return createBExpressionAdapter();
      }
      @Override
      public Adapter caseAtomicReferringBExpression(AtomicReferringBExpression object)
      {
        return createAtomicReferringBExpressionAdapter();
      }
      @Override
      public Adapter caseBComparison(BComparison object)
      {
        return createBComparisonAdapter();
      }
      @Override
      public Adapter caseEnumComparison(EnumComparison object)
      {
        return createEnumComparisonAdapter();
      }
      @Override
      public Adapter caseSingleEnumComparison(SingleEnumComparison object)
      {
        return createSingleEnumComparisonAdapter();
      }
      @Override
      public Adapter caseMultiEnumComparison(MultiEnumComparison object)
      {
        return createMultiEnumComparisonAdapter();
      }
      @Override
      public Adapter caseStringValueComparison(StringValueComparison object)
      {
        return createStringValueComparisonAdapter();
      }
      @Override
      public Adapter casePresenceCheck(PresenceCheck object)
      {
        return createPresenceCheckAdapter();
      }
      @Override
      public Adapter caseEnumLiteralsCollection(EnumLiteralsCollection object)
      {
        return createEnumLiteralsCollectionAdapter();
      }
      @Override
      public Adapter caseDirectEnumLiteralsCollection(DirectEnumLiteralsCollection object)
      {
        return createDirectEnumLiteralsCollectionAdapter();
      }
      @Override
      public Adapter caseEnumListReference(EnumListReference object)
      {
        return createEnumListReferenceAdapter();
      }
      @Override
      public Adapter caseOrOperation(OrOperation object)
      {
        return createOrOperationAdapter();
      }
      @Override
      public Adapter caseAndOperation(AndOperation object)
      {
        return createAndOperationAdapter();
      }
      @Override
      public Adapter caseNegationExpression(NegationExpression object)
      {
        return createNegationExpressionAdapter();
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
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.DynamicScreen <em>Dynamic Screen</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.DynamicScreen
   * @generated
   */
  public Adapter createDynamicScreenAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.Label <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.Label
   * @generated
   */
  public Adapter createLabelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.PathTail <em>Path Tail</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.PathTail
   * @generated
   */
  public Adapter createPathTailAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.Declaration <em>Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.Declaration
   * @generated
   */
  public Adapter createDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.ExternalVariable <em>External Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.ExternalVariable
   * @generated
   */
  public Adapter createExternalVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.EnumList <em>Enum List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.EnumList
   * @generated
   */
  public Adapter createEnumListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.DataStore <em>Data Store</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.DataStore
   * @generated
   */
  public Adapter createDataStoreAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.GroupElement <em>Group Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.GroupElement
   * @generated
   */
  public Adapter createGroupElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.Field <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.Field
   * @generated
   */
  public Adapter createFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.FieldGroup <em>Field Group</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.FieldGroup
   * @generated
   */
  public Adapter createFieldGroupAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.Attribute
   * @generated
   */
  public Adapter createAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.EnumFieldAttribute <em>Enum Field Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.EnumFieldAttribute
   * @generated
   */
  public Adapter createEnumFieldAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.NormalAttribute <em>Normal Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.NormalAttribute
   * @generated
   */
  public Adapter createNormalAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.AttributeClassExpression <em>Attribute Class Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.AttributeClassExpression
   * @generated
   */
  public Adapter createAttributeClassExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.RestrictionAttribute <em>Restriction Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.RestrictionAttribute
   * @generated
   */
  public Adapter createRestrictionAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.RestrictionGroupAttribute <em>Restriction Group Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.RestrictionGroupAttribute
   * @generated
   */
  public Adapter createRestrictionGroupAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.RestrictionRule <em>Restriction Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.RestrictionRule
   * @generated
   */
  public Adapter createRestrictionRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.ReferenceTarget <em>Reference Target</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.ReferenceTarget
   * @generated
   */
  public Adapter createReferenceTargetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.Reference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.Reference
   * @generated
   */
  public Adapter createReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.DummyForExternalVariable <em>Dummy For External Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.DummyForExternalVariable
   * @generated
   */
  public Adapter createDummyForExternalVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.BExpression <em>BExpression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.BExpression
   * @generated
   */
  public Adapter createBExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.AtomicReferringBExpression <em>Atomic Referring BExpression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.AtomicReferringBExpression
   * @generated
   */
  public Adapter createAtomicReferringBExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.BComparison <em>BComparison</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.BComparison
   * @generated
   */
  public Adapter createBComparisonAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.EnumComparison <em>Enum Comparison</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.EnumComparison
   * @generated
   */
  public Adapter createEnumComparisonAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.SingleEnumComparison <em>Single Enum Comparison</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.SingleEnumComparison
   * @generated
   */
  public Adapter createSingleEnumComparisonAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.MultiEnumComparison <em>Multi Enum Comparison</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.MultiEnumComparison
   * @generated
   */
  public Adapter createMultiEnumComparisonAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.StringValueComparison <em>String Value Comparison</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.StringValueComparison
   * @generated
   */
  public Adapter createStringValueComparisonAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.PresenceCheck <em>Presence Check</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.PresenceCheck
   * @generated
   */
  public Adapter createPresenceCheckAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.EnumLiteralsCollection <em>Enum Literals Collection</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.EnumLiteralsCollection
   * @generated
   */
  public Adapter createEnumLiteralsCollectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.DirectEnumLiteralsCollection <em>Direct Enum Literals Collection</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.DirectEnumLiteralsCollection
   * @generated
   */
  public Adapter createDirectEnumLiteralsCollectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.EnumListReference <em>Enum List Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.EnumListReference
   * @generated
   */
  public Adapter createEnumListReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.OrOperation <em>Or Operation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.OrOperation
   * @generated
   */
  public Adapter createOrOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.AndOperation <em>And Operation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.AndOperation
   * @generated
   */
  public Adapter createAndOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.NegationExpression <em>Negation Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.NegationExpression
   * @generated
   */
  public Adapter createNegationExpressionAdapter()
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

} //DynamicScreenDslAdapterFactory
