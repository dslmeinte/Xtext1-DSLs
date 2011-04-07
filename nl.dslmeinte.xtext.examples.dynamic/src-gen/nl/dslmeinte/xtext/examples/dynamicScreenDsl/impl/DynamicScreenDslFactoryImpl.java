/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl;

import nl.dslmeinte.xtext.examples.dynamicScreenDsl.*;

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
public class DynamicScreenDslFactoryImpl extends EFactoryImpl implements DynamicScreenDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DynamicScreenDslFactory init()
  {
    try
    {
      DynamicScreenDslFactory theDynamicScreenDslFactory = (DynamicScreenDslFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.dslmeinte.nl/xtext/examples/DynamicScreenDsl"); 
      if (theDynamicScreenDslFactory != null)
      {
        return theDynamicScreenDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new DynamicScreenDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DynamicScreenDslFactoryImpl()
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
      case DynamicScreenDslPackage.DYNAMIC_SCREEN: return createDynamicScreen();
      case DynamicScreenDslPackage.LABEL: return createLabel();
      case DynamicScreenDslPackage.PATH_TAIL: return createPathTail();
      case DynamicScreenDslPackage.DECLARATION: return createDeclaration();
      case DynamicScreenDslPackage.EXTERNAL_VARIABLE: return createExternalVariable();
      case DynamicScreenDslPackage.ENUM_LIST: return createEnumList();
      case DynamicScreenDslPackage.DATA_STORE: return createDataStore();
      case DynamicScreenDslPackage.GROUP_ELEMENT: return createGroupElement();
      case DynamicScreenDslPackage.FIELD: return createField();
      case DynamicScreenDslPackage.FIELD_GROUP: return createFieldGroup();
      case DynamicScreenDslPackage.ATTRIBUTE: return createAttribute();
      case DynamicScreenDslPackage.ENUM_FIELD_ATTRIBUTE: return createEnumFieldAttribute();
      case DynamicScreenDslPackage.NORMAL_ATTRIBUTE: return createNormalAttribute();
      case DynamicScreenDslPackage.ATTRIBUTE_CLASS_EXPRESSION: return createAttributeClassExpression();
      case DynamicScreenDslPackage.RESTRICTION_ATTRIBUTE: return createRestrictionAttribute();
      case DynamicScreenDslPackage.RESTRICTION_GROUP_ATTRIBUTE: return createRestrictionGroupAttribute();
      case DynamicScreenDslPackage.RESTRICTION_RULE: return createRestrictionRule();
      case DynamicScreenDslPackage.REFERENCE_TARGET: return createReferenceTarget();
      case DynamicScreenDslPackage.REFERENCE: return createReference();
      case DynamicScreenDslPackage.DUMMY_FOR_EXTERNAL_VARIABLE: return createDummyForExternalVariable();
      case DynamicScreenDslPackage.BEXPRESSION: return createBExpression();
      case DynamicScreenDslPackage.ATOMIC_REFERRING_BEXPRESSION: return createAtomicReferringBExpression();
      case DynamicScreenDslPackage.BCOMPARISON: return createBComparison();
      case DynamicScreenDslPackage.ENUM_COMPARISON: return createEnumComparison();
      case DynamicScreenDslPackage.SINGLE_ENUM_COMPARISON: return createSingleEnumComparison();
      case DynamicScreenDslPackage.MULTI_ENUM_COMPARISON: return createMultiEnumComparison();
      case DynamicScreenDslPackage.STRING_VALUE_COMPARISON: return createStringValueComparison();
      case DynamicScreenDslPackage.PRESENCE_CHECK: return createPresenceCheck();
      case DynamicScreenDslPackage.ENUM_LITERALS_COLLECTION: return createEnumLiteralsCollection();
      case DynamicScreenDslPackage.DIRECT_ENUM_LITERALS_COLLECTION: return createDirectEnumLiteralsCollection();
      case DynamicScreenDslPackage.ENUM_LIST_REFERENCE: return createEnumListReference();
      case DynamicScreenDslPackage.OR_OPERATION: return createOrOperation();
      case DynamicScreenDslPackage.AND_OPERATION: return createAndOperation();
      case DynamicScreenDslPackage.NEGATION_EXPRESSION: return createNegationExpression();
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
      case DynamicScreenDslPackage.ATTRIBUTE_CLASS:
        return createAttributeClassFromString(eDataType, initialValue);
      case DynamicScreenDslPackage.BLITERAL:
        return createBLiteralFromString(eDataType, initialValue);
      case DynamicScreenDslPackage.ENUM_MEMBERSHIP:
        return createEnumMembershipFromString(eDataType, initialValue);
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
      case DynamicScreenDslPackage.ATTRIBUTE_CLASS:
        return convertAttributeClassToString(eDataType, instanceValue);
      case DynamicScreenDslPackage.BLITERAL:
        return convertBLiteralToString(eDataType, instanceValue);
      case DynamicScreenDslPackage.ENUM_MEMBERSHIP:
        return convertEnumMembershipToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DynamicScreen createDynamicScreen()
  {
    DynamicScreenImpl dynamicScreen = new DynamicScreenImpl();
    return dynamicScreen;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Label createLabel()
  {
    LabelImpl label = new LabelImpl();
    return label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PathTail createPathTail()
  {
    PathTailImpl pathTail = new PathTailImpl();
    return pathTail;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Declaration createDeclaration()
  {
    DeclarationImpl declaration = new DeclarationImpl();
    return declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExternalVariable createExternalVariable()
  {
    ExternalVariableImpl externalVariable = new ExternalVariableImpl();
    return externalVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumList createEnumList()
  {
    EnumListImpl enumList = new EnumListImpl();
    return enumList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataStore createDataStore()
  {
    DataStoreImpl dataStore = new DataStoreImpl();
    return dataStore;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GroupElement createGroupElement()
  {
    GroupElementImpl groupElement = new GroupElementImpl();
    return groupElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Field createField()
  {
    FieldImpl field = new FieldImpl();
    return field;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FieldGroup createFieldGroup()
  {
    FieldGroupImpl fieldGroup = new FieldGroupImpl();
    return fieldGroup;
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
  public EnumFieldAttribute createEnumFieldAttribute()
  {
    EnumFieldAttributeImpl enumFieldAttribute = new EnumFieldAttributeImpl();
    return enumFieldAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NormalAttribute createNormalAttribute()
  {
    NormalAttributeImpl normalAttribute = new NormalAttributeImpl();
    return normalAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeClassExpression createAttributeClassExpression()
  {
    AttributeClassExpressionImpl attributeClassExpression = new AttributeClassExpressionImpl();
    return attributeClassExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RestrictionAttribute createRestrictionAttribute()
  {
    RestrictionAttributeImpl restrictionAttribute = new RestrictionAttributeImpl();
    return restrictionAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RestrictionGroupAttribute createRestrictionGroupAttribute()
  {
    RestrictionGroupAttributeImpl restrictionGroupAttribute = new RestrictionGroupAttributeImpl();
    return restrictionGroupAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RestrictionRule createRestrictionRule()
  {
    RestrictionRuleImpl restrictionRule = new RestrictionRuleImpl();
    return restrictionRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReferenceTarget createReferenceTarget()
  {
    ReferenceTargetImpl referenceTarget = new ReferenceTargetImpl();
    return referenceTarget;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Reference createReference()
  {
    ReferenceImpl reference = new ReferenceImpl();
    return reference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DummyForExternalVariable createDummyForExternalVariable()
  {
    DummyForExternalVariableImpl dummyForExternalVariable = new DummyForExternalVariableImpl();
    return dummyForExternalVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BExpression createBExpression()
  {
    BExpressionImpl bExpression = new BExpressionImpl();
    return bExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AtomicReferringBExpression createAtomicReferringBExpression()
  {
    AtomicReferringBExpressionImpl atomicReferringBExpression = new AtomicReferringBExpressionImpl();
    return atomicReferringBExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BComparison createBComparison()
  {
    BComparisonImpl bComparison = new BComparisonImpl();
    return bComparison;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumComparison createEnumComparison()
  {
    EnumComparisonImpl enumComparison = new EnumComparisonImpl();
    return enumComparison;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SingleEnumComparison createSingleEnumComparison()
  {
    SingleEnumComparisonImpl singleEnumComparison = new SingleEnumComparisonImpl();
    return singleEnumComparison;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MultiEnumComparison createMultiEnumComparison()
  {
    MultiEnumComparisonImpl multiEnumComparison = new MultiEnumComparisonImpl();
    return multiEnumComparison;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringValueComparison createStringValueComparison()
  {
    StringValueComparisonImpl stringValueComparison = new StringValueComparisonImpl();
    return stringValueComparison;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PresenceCheck createPresenceCheck()
  {
    PresenceCheckImpl presenceCheck = new PresenceCheckImpl();
    return presenceCheck;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumLiteralsCollection createEnumLiteralsCollection()
  {
    EnumLiteralsCollectionImpl enumLiteralsCollection = new EnumLiteralsCollectionImpl();
    return enumLiteralsCollection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DirectEnumLiteralsCollection createDirectEnumLiteralsCollection()
  {
    DirectEnumLiteralsCollectionImpl directEnumLiteralsCollection = new DirectEnumLiteralsCollectionImpl();
    return directEnumLiteralsCollection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumListReference createEnumListReference()
  {
    EnumListReferenceImpl enumListReference = new EnumListReferenceImpl();
    return enumListReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrOperation createOrOperation()
  {
    OrOperationImpl orOperation = new OrOperationImpl();
    return orOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AndOperation createAndOperation()
  {
    AndOperationImpl andOperation = new AndOperationImpl();
    return andOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NegationExpression createNegationExpression()
  {
    NegationExpressionImpl negationExpression = new NegationExpressionImpl();
    return negationExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeClass createAttributeClassFromString(EDataType eDataType, String initialValue)
  {
    AttributeClass result = AttributeClass.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertAttributeClassToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BLiteral createBLiteralFromString(EDataType eDataType, String initialValue)
  {
    BLiteral result = BLiteral.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertBLiteralToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumMembership createEnumMembershipFromString(EDataType eDataType, String initialValue)
  {
    EnumMembership result = EnumMembership.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertEnumMembershipToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DynamicScreenDslPackage getDynamicScreenDslPackage()
  {
    return (DynamicScreenDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static DynamicScreenDslPackage getPackage()
  {
    return DynamicScreenDslPackage.eINSTANCE;
  }

} //DynamicScreenDslFactoryImpl
