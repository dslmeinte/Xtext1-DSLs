/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl;

import nl.dslmeinte.xtext.examples.dataModelDsl.DataModelDslPackage;

import nl.dslmeinte.xtext.examples.dynamicScreenDsl.AndOperation;
import nl.dslmeinte.xtext.examples.dynamicScreenDsl.AtomicReferringBExpression;
import nl.dslmeinte.xtext.examples.dynamicScreenDsl.Attribute;
import nl.dslmeinte.xtext.examples.dynamicScreenDsl.AttributeClass;
import nl.dslmeinte.xtext.examples.dynamicScreenDsl.AttributeClassExpression;
import nl.dslmeinte.xtext.examples.dynamicScreenDsl.BComparison;
import nl.dslmeinte.xtext.examples.dynamicScreenDsl.BExpression;
import nl.dslmeinte.xtext.examples.dynamicScreenDsl.BLiteral;
import nl.dslmeinte.xtext.examples.dynamicScreenDsl.DataImport;
import nl.dslmeinte.xtext.examples.dynamicScreenDsl.DataStore;
import nl.dslmeinte.xtext.examples.dynamicScreenDsl.Declaration;
import nl.dslmeinte.xtext.examples.dynamicScreenDsl.DirectEnumLiteralsCollection;
import nl.dslmeinte.xtext.examples.dynamicScreenDsl.DummyForExternalVariable;
import nl.dslmeinte.xtext.examples.dynamicScreenDsl.DynamicScreen;
import nl.dslmeinte.xtext.examples.dynamicScreenDsl.DynamicScreenDslFactory;
import nl.dslmeinte.xtext.examples.dynamicScreenDsl.DynamicScreenDslPackage;
import nl.dslmeinte.xtext.examples.dynamicScreenDsl.EnumComparison;
import nl.dslmeinte.xtext.examples.dynamicScreenDsl.EnumFieldAttribute;
import nl.dslmeinte.xtext.examples.dynamicScreenDsl.EnumList;
import nl.dslmeinte.xtext.examples.dynamicScreenDsl.EnumListReference;
import nl.dslmeinte.xtext.examples.dynamicScreenDsl.EnumLiteralsCollection;
import nl.dslmeinte.xtext.examples.dynamicScreenDsl.EnumMembership;
import nl.dslmeinte.xtext.examples.dynamicScreenDsl.ExternalVariable;
import nl.dslmeinte.xtext.examples.dynamicScreenDsl.Field;
import nl.dslmeinte.xtext.examples.dynamicScreenDsl.FieldGroup;
import nl.dslmeinte.xtext.examples.dynamicScreenDsl.GroupElement;
import nl.dslmeinte.xtext.examples.dynamicScreenDsl.Label;
import nl.dslmeinte.xtext.examples.dynamicScreenDsl.MultiEnumComparison;
import nl.dslmeinte.xtext.examples.dynamicScreenDsl.NegationExpression;
import nl.dslmeinte.xtext.examples.dynamicScreenDsl.NormalAttribute;
import nl.dslmeinte.xtext.examples.dynamicScreenDsl.OrOperation;
import nl.dslmeinte.xtext.examples.dynamicScreenDsl.PathTail;
import nl.dslmeinte.xtext.examples.dynamicScreenDsl.PresenceCheck;
import nl.dslmeinte.xtext.examples.dynamicScreenDsl.Reference;
import nl.dslmeinte.xtext.examples.dynamicScreenDsl.ReferenceTarget;
import nl.dslmeinte.xtext.examples.dynamicScreenDsl.RestrictionAttribute;
import nl.dslmeinte.xtext.examples.dynamicScreenDsl.RestrictionGroupAttribute;
import nl.dslmeinte.xtext.examples.dynamicScreenDsl.RestrictionRule;
import nl.dslmeinte.xtext.examples.dynamicScreenDsl.SingleEnumComparison;
import nl.dslmeinte.xtext.examples.dynamicScreenDsl.StringValueComparison;

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
public class DynamicScreenDslPackageImpl extends EPackageImpl implements DynamicScreenDslPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dynamicScreenEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataImportEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass labelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pathTailEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass declarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass externalVariableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataStoreEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass groupElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fieldEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fieldGroupEClass = null;

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
  private EClass enumFieldAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass normalAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeClassExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass restrictionAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass restrictionGroupAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass restrictionRuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass referenceTargetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass referenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dummyForExternalVariableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass negationExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass atomicReferringBExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bComparisonEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumComparisonEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass singleEnumComparisonEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass multiEnumComparisonEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringValueComparisonEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass presenceCheckEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumLiteralsCollectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass directEnumLiteralsCollectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumListReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass orOperationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass andOperationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum attributeClassEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum bLiteralEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum enumMembershipEEnum = null;

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
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.DynamicScreenDslPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private DynamicScreenDslPackageImpl()
  {
    super(eNS_URI, DynamicScreenDslFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link DynamicScreenDslPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static DynamicScreenDslPackage init()
  {
    if (isInited) return (DynamicScreenDslPackage)EPackage.Registry.INSTANCE.getEPackage(DynamicScreenDslPackage.eNS_URI);

    // Obtain or create and register package
    DynamicScreenDslPackageImpl theDynamicScreenDslPackage = (DynamicScreenDslPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DynamicScreenDslPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DynamicScreenDslPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    DataModelDslPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theDynamicScreenDslPackage.createPackageContents();

    // Initialize created meta-data
    theDynamicScreenDslPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theDynamicScreenDslPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(DynamicScreenDslPackage.eNS_URI, theDynamicScreenDslPackage);
    return theDynamicScreenDslPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDynamicScreen()
  {
    return dynamicScreenEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDynamicScreen_Label()
  {
    return (EReference)dynamicScreenEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDynamicScreen_DataImport()
  {
    return (EReference)dynamicScreenEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDynamicScreen_ViewClass()
  {
    return (EReference)dynamicScreenEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDynamicScreen_Declarations()
  {
    return (EReference)dynamicScreenEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDynamicScreen_Groups()
  {
    return (EReference)dynamicScreenEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataImport()
  {
    return dataImportEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDataImport_ImportURI()
  {
    return (EAttribute)dataImportEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLabel()
  {
    return labelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLabel_En()
  {
    return (EAttribute)labelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLabel_Nl()
  {
    return (EAttribute)labelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPathTail()
  {
    return pathTailEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPathTail_Field()
  {
    return (EReference)pathTailEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPathTail_AsEntity()
  {
    return (EReference)pathTailEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPathTail_Tail()
  {
    return (EReference)pathTailEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeclaration()
  {
    return declarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExternalVariable()
  {
    return externalVariableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnumList()
  {
    return enumListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnumList_Literals()
  {
    return (EReference)enumListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnumList_Enum()
  {
    return (EReference)enumListEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataStore()
  {
    return dataStoreEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataStore_Class()
  {
    return (EReference)dataStoreEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDataStore_Multi()
  {
    return (EAttribute)dataStoreEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGroupElement()
  {
    return groupElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGroupElement_Label()
  {
    return (EReference)groupElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGroupElement_Attributes()
  {
    return (EReference)groupElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getField()
  {
    return fieldEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFieldGroup()
  {
    return fieldGroupEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFieldGroup_With()
  {
    return (EReference)fieldGroupEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFieldGroup_Elements()
  {
    return (EReference)fieldGroupEClass.getEStructuralFeatures().get(1);
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
  public EClass getEnumFieldAttribute()
  {
    return enumFieldAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNormalAttribute()
  {
    return normalAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNormalAttribute_ClassExpr()
  {
    return (EReference)normalAttributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNormalAttribute_Clause()
  {
    return (EReference)normalAttributeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttributeClassExpression()
  {
    return attributeClassExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttributeClassExpression_Classes()
  {
    return (EAttribute)attributeClassExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRestrictionAttribute()
  {
    return restrictionAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRestrictionAttribute_Literals()
  {
    return (EReference)restrictionAttributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRestrictionAttribute_Clause()
  {
    return (EReference)restrictionAttributeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRestrictionGroupAttribute()
  {
    return restrictionGroupAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRestrictionGroupAttribute_Rules()
  {
    return (EReference)restrictionGroupAttributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRestrictionRule()
  {
    return restrictionRuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRestrictionRule_Literals()
  {
    return (EReference)restrictionRuleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRestrictionRule_Clause()
  {
    return (EReference)restrictionRuleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReferenceTarget()
  {
    return referenceTargetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReferenceTarget_Path()
  {
    return (EReference)referenceTargetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReference()
  {
    return referenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReference_Ref()
  {
    return (EReference)referenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDummyForExternalVariable()
  {
    return dummyForExternalVariableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDummyForExternalVariable_Name()
  {
    return (EAttribute)dummyForExternalVariableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBExpression()
  {
    return bExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNegationExpression()
  {
    return negationExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNegationExpression_Expr()
  {
    return (EReference)negationExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAtomicReferringBExpression()
  {
    return atomicReferringBExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAtomicReferringBExpression_Ref()
  {
    return (EReference)atomicReferringBExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBComparison()
  {
    return bComparisonEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBComparison_BLiteral()
  {
    return (EAttribute)bComparisonEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnumComparison()
  {
    return enumComparisonEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSingleEnumComparison()
  {
    return singleEnumComparisonEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSingleEnumComparison_ELiteral()
  {
    return (EReference)singleEnumComparisonEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMultiEnumComparison()
  {
    return multiEnumComparisonEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMultiEnumComparison_Membership()
  {
    return (EAttribute)multiEnumComparisonEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMultiEnumComparison_ELiterals()
  {
    return (EReference)multiEnumComparisonEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringValueComparison()
  {
    return stringValueComparisonEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStringValueComparison_TargetValue()
  {
    return (EAttribute)stringValueComparisonEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPresenceCheck()
  {
    return presenceCheckEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnumLiteralsCollection()
  {
    return enumLiteralsCollectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDirectEnumLiteralsCollection()
  {
    return directEnumLiteralsCollectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDirectEnumLiteralsCollection_Literals()
  {
    return (EReference)directEnumLiteralsCollectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnumListReference()
  {
    return enumListReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnumListReference_Ref()
  {
    return (EReference)enumListReferenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOrOperation()
  {
    return orOperationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOrOperation_Left()
  {
    return (EReference)orOperationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOrOperation_Right()
  {
    return (EReference)orOperationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAndOperation()
  {
    return andOperationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAndOperation_Left()
  {
    return (EReference)andOperationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAndOperation_Right()
  {
    return (EReference)andOperationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getAttributeClass()
  {
    return attributeClassEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getBLiteral()
  {
    return bLiteralEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getEnumMembership()
  {
    return enumMembershipEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DynamicScreenDslFactory getDynamicScreenDslFactory()
  {
    return (DynamicScreenDslFactory)getEFactoryInstance();
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
    dynamicScreenEClass = createEClass(DYNAMIC_SCREEN);
    createEReference(dynamicScreenEClass, DYNAMIC_SCREEN__LABEL);
    createEReference(dynamicScreenEClass, DYNAMIC_SCREEN__DATA_IMPORT);
    createEReference(dynamicScreenEClass, DYNAMIC_SCREEN__VIEW_CLASS);
    createEReference(dynamicScreenEClass, DYNAMIC_SCREEN__DECLARATIONS);
    createEReference(dynamicScreenEClass, DYNAMIC_SCREEN__GROUPS);

    dataImportEClass = createEClass(DATA_IMPORT);
    createEAttribute(dataImportEClass, DATA_IMPORT__IMPORT_URI);

    labelEClass = createEClass(LABEL);
    createEAttribute(labelEClass, LABEL__EN);
    createEAttribute(labelEClass, LABEL__NL);

    pathTailEClass = createEClass(PATH_TAIL);
    createEReference(pathTailEClass, PATH_TAIL__FIELD);
    createEReference(pathTailEClass, PATH_TAIL__AS_ENTITY);
    createEReference(pathTailEClass, PATH_TAIL__TAIL);

    declarationEClass = createEClass(DECLARATION);

    externalVariableEClass = createEClass(EXTERNAL_VARIABLE);

    enumListEClass = createEClass(ENUM_LIST);
    createEReference(enumListEClass, ENUM_LIST__LITERALS);
    createEReference(enumListEClass, ENUM_LIST__ENUM);

    dataStoreEClass = createEClass(DATA_STORE);
    createEReference(dataStoreEClass, DATA_STORE__CLASS);
    createEAttribute(dataStoreEClass, DATA_STORE__MULTI);

    groupElementEClass = createEClass(GROUP_ELEMENT);
    createEReference(groupElementEClass, GROUP_ELEMENT__LABEL);
    createEReference(groupElementEClass, GROUP_ELEMENT__ATTRIBUTES);

    fieldEClass = createEClass(FIELD);

    fieldGroupEClass = createEClass(FIELD_GROUP);
    createEReference(fieldGroupEClass, FIELD_GROUP__WITH);
    createEReference(fieldGroupEClass, FIELD_GROUP__ELEMENTS);

    attributeEClass = createEClass(ATTRIBUTE);

    enumFieldAttributeEClass = createEClass(ENUM_FIELD_ATTRIBUTE);

    normalAttributeEClass = createEClass(NORMAL_ATTRIBUTE);
    createEReference(normalAttributeEClass, NORMAL_ATTRIBUTE__CLASS_EXPR);
    createEReference(normalAttributeEClass, NORMAL_ATTRIBUTE__CLAUSE);

    attributeClassExpressionEClass = createEClass(ATTRIBUTE_CLASS_EXPRESSION);
    createEAttribute(attributeClassExpressionEClass, ATTRIBUTE_CLASS_EXPRESSION__CLASSES);

    restrictionAttributeEClass = createEClass(RESTRICTION_ATTRIBUTE);
    createEReference(restrictionAttributeEClass, RESTRICTION_ATTRIBUTE__LITERALS);
    createEReference(restrictionAttributeEClass, RESTRICTION_ATTRIBUTE__CLAUSE);

    restrictionGroupAttributeEClass = createEClass(RESTRICTION_GROUP_ATTRIBUTE);
    createEReference(restrictionGroupAttributeEClass, RESTRICTION_GROUP_ATTRIBUTE__RULES);

    restrictionRuleEClass = createEClass(RESTRICTION_RULE);
    createEReference(restrictionRuleEClass, RESTRICTION_RULE__LITERALS);
    createEReference(restrictionRuleEClass, RESTRICTION_RULE__CLAUSE);

    referenceTargetEClass = createEClass(REFERENCE_TARGET);
    createEReference(referenceTargetEClass, REFERENCE_TARGET__PATH);

    referenceEClass = createEClass(REFERENCE);
    createEReference(referenceEClass, REFERENCE__REF);

    dummyForExternalVariableEClass = createEClass(DUMMY_FOR_EXTERNAL_VARIABLE);
    createEAttribute(dummyForExternalVariableEClass, DUMMY_FOR_EXTERNAL_VARIABLE__NAME);

    bExpressionEClass = createEClass(BEXPRESSION);

    negationExpressionEClass = createEClass(NEGATION_EXPRESSION);
    createEReference(negationExpressionEClass, NEGATION_EXPRESSION__EXPR);

    atomicReferringBExpressionEClass = createEClass(ATOMIC_REFERRING_BEXPRESSION);
    createEReference(atomicReferringBExpressionEClass, ATOMIC_REFERRING_BEXPRESSION__REF);

    bComparisonEClass = createEClass(BCOMPARISON);
    createEAttribute(bComparisonEClass, BCOMPARISON__BLITERAL);

    enumComparisonEClass = createEClass(ENUM_COMPARISON);

    singleEnumComparisonEClass = createEClass(SINGLE_ENUM_COMPARISON);
    createEReference(singleEnumComparisonEClass, SINGLE_ENUM_COMPARISON__ELITERAL);

    multiEnumComparisonEClass = createEClass(MULTI_ENUM_COMPARISON);
    createEAttribute(multiEnumComparisonEClass, MULTI_ENUM_COMPARISON__MEMBERSHIP);
    createEReference(multiEnumComparisonEClass, MULTI_ENUM_COMPARISON__ELITERALS);

    stringValueComparisonEClass = createEClass(STRING_VALUE_COMPARISON);
    createEAttribute(stringValueComparisonEClass, STRING_VALUE_COMPARISON__TARGET_VALUE);

    presenceCheckEClass = createEClass(PRESENCE_CHECK);

    enumLiteralsCollectionEClass = createEClass(ENUM_LITERALS_COLLECTION);

    directEnumLiteralsCollectionEClass = createEClass(DIRECT_ENUM_LITERALS_COLLECTION);
    createEReference(directEnumLiteralsCollectionEClass, DIRECT_ENUM_LITERALS_COLLECTION__LITERALS);

    enumListReferenceEClass = createEClass(ENUM_LIST_REFERENCE);
    createEReference(enumListReferenceEClass, ENUM_LIST_REFERENCE__REF);

    orOperationEClass = createEClass(OR_OPERATION);
    createEReference(orOperationEClass, OR_OPERATION__LEFT);
    createEReference(orOperationEClass, OR_OPERATION__RIGHT);

    andOperationEClass = createEClass(AND_OPERATION);
    createEReference(andOperationEClass, AND_OPERATION__LEFT);
    createEReference(andOperationEClass, AND_OPERATION__RIGHT);

    // Create enums
    attributeClassEEnum = createEEnum(ATTRIBUTE_CLASS);
    bLiteralEEnum = createEEnum(BLITERAL);
    enumMembershipEEnum = createEEnum(ENUM_MEMBERSHIP);
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

    // Obtain other dependent packages
    DataModelDslPackage theDataModelDslPackage = (DataModelDslPackage)EPackage.Registry.INSTANCE.getEPackage(DataModelDslPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    declarationEClass.getESuperTypes().add(this.getDummyForExternalVariable());
    externalVariableEClass.getESuperTypes().add(this.getDeclaration());
    externalVariableEClass.getESuperTypes().add(this.getReferenceTarget());
    enumListEClass.getESuperTypes().add(this.getDeclaration());
    dataStoreEClass.getESuperTypes().add(this.getDeclaration());
    fieldEClass.getESuperTypes().add(this.getGroupElement());
    fieldEClass.getESuperTypes().add(this.getReferenceTarget());
    fieldGroupEClass.getESuperTypes().add(this.getGroupElement());
    enumFieldAttributeEClass.getESuperTypes().add(this.getAttribute());
    normalAttributeEClass.getESuperTypes().add(this.getAttribute());
    restrictionAttributeEClass.getESuperTypes().add(this.getEnumFieldAttribute());
    restrictionGroupAttributeEClass.getESuperTypes().add(this.getEnumFieldAttribute());
    referenceTargetEClass.getESuperTypes().add(this.getDummyForExternalVariable());
    negationExpressionEClass.getESuperTypes().add(this.getBExpression());
    atomicReferringBExpressionEClass.getESuperTypes().add(this.getBExpression());
    bComparisonEClass.getESuperTypes().add(this.getAtomicReferringBExpression());
    enumComparisonEClass.getESuperTypes().add(this.getAtomicReferringBExpression());
    singleEnumComparisonEClass.getESuperTypes().add(this.getEnumComparison());
    multiEnumComparisonEClass.getESuperTypes().add(this.getEnumComparison());
    stringValueComparisonEClass.getESuperTypes().add(this.getAtomicReferringBExpression());
    presenceCheckEClass.getESuperTypes().add(this.getAtomicReferringBExpression());
    directEnumLiteralsCollectionEClass.getESuperTypes().add(this.getEnumLiteralsCollection());
    enumListReferenceEClass.getESuperTypes().add(this.getEnumLiteralsCollection());
    orOperationEClass.getESuperTypes().add(this.getBExpression());
    andOperationEClass.getESuperTypes().add(this.getBExpression());

    // Initialize classes and features; add operations and parameters
    initEClass(dynamicScreenEClass, DynamicScreen.class, "DynamicScreen", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDynamicScreen_Label(), this.getLabel(), null, "label", null, 0, 1, DynamicScreen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDynamicScreen_DataImport(), this.getDataImport(), null, "dataImport", null, 0, 1, DynamicScreen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDynamicScreen_ViewClass(), theDataModelDslPackage.getEntity(), null, "viewClass", null, 0, 1, DynamicScreen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDynamicScreen_Declarations(), this.getDeclaration(), null, "declarations", null, 0, -1, DynamicScreen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDynamicScreen_Groups(), this.getFieldGroup(), null, "groups", null, 0, -1, DynamicScreen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataImportEClass, DataImport.class, "DataImport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDataImport_ImportURI(), ecorePackage.getEString(), "importURI", null, 0, 1, DataImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(labelEClass, Label.class, "Label", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLabel_En(), ecorePackage.getEString(), "en", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLabel_Nl(), ecorePackage.getEString(), "nl", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pathTailEClass, PathTail.class, "PathTail", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPathTail_Field(), theDataModelDslPackage.getField(), null, "field", null, 0, 1, PathTail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPathTail_AsEntity(), theDataModelDslPackage.getEntity(), null, "asEntity", null, 0, 1, PathTail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPathTail_Tail(), this.getPathTail(), null, "tail", null, 0, 1, PathTail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(declarationEClass, Declaration.class, "Declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(externalVariableEClass, ExternalVariable.class, "ExternalVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(enumListEClass, EnumList.class, "EnumList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEnumList_Literals(), theDataModelDslPackage.getEnumLiteral(), null, "literals", null, 0, -1, EnumList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEnumList_Enum(), theDataModelDslPackage.getEnumeration(), null, "enum", null, 0, 1, EnumList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataStoreEClass, DataStore.class, "DataStore", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDataStore_Class(), theDataModelDslPackage.getEntity(), null, "class", null, 0, 1, DataStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDataStore_Multi(), ecorePackage.getEBoolean(), "multi", null, 0, 1, DataStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(groupElementEClass, GroupElement.class, "GroupElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGroupElement_Label(), this.getLabel(), null, "label", null, 0, 1, GroupElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGroupElement_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, GroupElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fieldEClass, Field.class, "Field", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(fieldGroupEClass, FieldGroup.class, "FieldGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFieldGroup_With(), this.getPathTail(), null, "with", null, 0, 1, FieldGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFieldGroup_Elements(), this.getGroupElement(), null, "elements", null, 0, -1, FieldGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(enumFieldAttributeEClass, EnumFieldAttribute.class, "EnumFieldAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(normalAttributeEClass, NormalAttribute.class, "NormalAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNormalAttribute_ClassExpr(), this.getAttributeClassExpression(), null, "classExpr", null, 0, 1, NormalAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNormalAttribute_Clause(), this.getBExpression(), null, "clause", null, 0, 1, NormalAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attributeClassExpressionEClass, AttributeClassExpression.class, "AttributeClassExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAttributeClassExpression_Classes(), this.getAttributeClass(), "classes", null, 0, -1, AttributeClassExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(restrictionAttributeEClass, RestrictionAttribute.class, "RestrictionAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRestrictionAttribute_Literals(), this.getEnumLiteralsCollection(), null, "literals", null, 0, 1, RestrictionAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRestrictionAttribute_Clause(), this.getBExpression(), null, "clause", null, 0, 1, RestrictionAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(restrictionGroupAttributeEClass, RestrictionGroupAttribute.class, "RestrictionGroupAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRestrictionGroupAttribute_Rules(), this.getRestrictionRule(), null, "rules", null, 0, -1, RestrictionGroupAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(restrictionRuleEClass, RestrictionRule.class, "RestrictionRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRestrictionRule_Literals(), this.getEnumLiteralsCollection(), null, "literals", null, 0, 1, RestrictionRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRestrictionRule_Clause(), this.getBExpression(), null, "clause", null, 0, 1, RestrictionRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(referenceTargetEClass, ReferenceTarget.class, "ReferenceTarget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getReferenceTarget_Path(), this.getPathTail(), null, "path", null, 0, 1, ReferenceTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(referenceEClass, Reference.class, "Reference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getReference_Ref(), this.getReferenceTarget(), null, "ref", null, 0, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dummyForExternalVariableEClass, DummyForExternalVariable.class, "DummyForExternalVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDummyForExternalVariable_Name(), ecorePackage.getEString(), "name", null, 0, 1, DummyForExternalVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bExpressionEClass, BExpression.class, "BExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(negationExpressionEClass, NegationExpression.class, "NegationExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNegationExpression_Expr(), this.getBExpression(), null, "expr", null, 0, 1, NegationExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(atomicReferringBExpressionEClass, AtomicReferringBExpression.class, "AtomicReferringBExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAtomicReferringBExpression_Ref(), this.getReference(), null, "ref", null, 0, 1, AtomicReferringBExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bComparisonEClass, BComparison.class, "BComparison", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBComparison_BLiteral(), this.getBLiteral(), "bLiteral", null, 0, 1, BComparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enumComparisonEClass, EnumComparison.class, "EnumComparison", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(singleEnumComparisonEClass, SingleEnumComparison.class, "SingleEnumComparison", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSingleEnumComparison_ELiteral(), theDataModelDslPackage.getEnumLiteral(), null, "eLiteral", null, 0, 1, SingleEnumComparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(multiEnumComparisonEClass, MultiEnumComparison.class, "MultiEnumComparison", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMultiEnumComparison_Membership(), this.getEnumMembership(), "membership", null, 0, 1, MultiEnumComparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMultiEnumComparison_ELiterals(), this.getEnumLiteralsCollection(), null, "eLiterals", null, 0, 1, MultiEnumComparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stringValueComparisonEClass, StringValueComparison.class, "StringValueComparison", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStringValueComparison_TargetValue(), ecorePackage.getEString(), "targetValue", null, 0, 1, StringValueComparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(presenceCheckEClass, PresenceCheck.class, "PresenceCheck", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(enumLiteralsCollectionEClass, EnumLiteralsCollection.class, "EnumLiteralsCollection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(directEnumLiteralsCollectionEClass, DirectEnumLiteralsCollection.class, "DirectEnumLiteralsCollection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDirectEnumLiteralsCollection_Literals(), theDataModelDslPackage.getEnumLiteral(), null, "literals", null, 0, -1, DirectEnumLiteralsCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enumListReferenceEClass, EnumListReference.class, "EnumListReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEnumListReference_Ref(), this.getEnumList(), null, "ref", null, 0, 1, EnumListReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(orOperationEClass, OrOperation.class, "OrOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOrOperation_Left(), this.getBExpression(), null, "left", null, 0, 1, OrOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOrOperation_Right(), this.getBExpression(), null, "right", null, 0, 1, OrOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(andOperationEClass, AndOperation.class, "AndOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAndOperation_Left(), this.getBExpression(), null, "left", null, 0, 1, AndOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAndOperation_Right(), this.getBExpression(), null, "right", null, 0, 1, AndOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(attributeClassEEnum, AttributeClass.class, "AttributeClass");
    addEEnumLiteral(attributeClassEEnum, AttributeClass.DISPLAY);
    addEEnumLiteral(attributeClassEEnum, AttributeClass.REQUIRED);
    addEEnumLiteral(attributeClassEEnum, AttributeClass.READONLY);
    addEEnumLiteral(attributeClassEEnum, AttributeClass.CALCULATED);
    addEEnumLiteral(attributeClassEEnum, AttributeClass.DOUBLE_ASTERISK);

    initEEnum(bLiteralEEnum, BLiteral.class, "BLiteral");
    addEEnumLiteral(bLiteralEEnum, BLiteral.TRUE);
    addEEnumLiteral(bLiteralEEnum, BLiteral.FALSE);

    initEEnum(enumMembershipEEnum, EnumMembership.class, "EnumMembership");
    addEEnumLiteral(enumMembershipEEnum, EnumMembership.IS_IN);
    addEEnumLiteral(enumMembershipEEnum, EnumMembership.IS_NOT_IN);

    // Create resource
    createResource(eNS_URI);
  }

} //DynamicScreenDslPackageImpl
