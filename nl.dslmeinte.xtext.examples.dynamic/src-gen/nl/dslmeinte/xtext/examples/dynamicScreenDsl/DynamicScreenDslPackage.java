/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.examples.dynamicScreenDsl;

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
 * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.DynamicScreenDslFactory
 * @model kind="package"
 * @generated
 */
public interface DynamicScreenDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "dynamicScreenDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.dslmeinte.nl/xtext/examples/DynamicScreenDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "dynamicScreenDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DynamicScreenDslPackage eINSTANCE = nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DynamicScreenDslPackageImpl.init();

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DynamicScreenImpl <em>Dynamic Screen</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DynamicScreenImpl
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DynamicScreenDslPackageImpl#getDynamicScreen()
   * @generated
   */
  int DYNAMIC_SCREEN = 0;

  /**
   * The feature id for the '<em><b>Label</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DYNAMIC_SCREEN__LABEL = 0;

  /**
   * The feature id for the '<em><b>Import URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DYNAMIC_SCREEN__IMPORT_URI = 1;

  /**
   * The feature id for the '<em><b>View Class</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DYNAMIC_SCREEN__VIEW_CLASS = 2;

  /**
   * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DYNAMIC_SCREEN__DECLARATIONS = 3;

  /**
   * The feature id for the '<em><b>Groups</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DYNAMIC_SCREEN__GROUPS = 4;

  /**
   * The number of structural features of the '<em>Dynamic Screen</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DYNAMIC_SCREEN_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.LabelImpl <em>Label</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.LabelImpl
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DynamicScreenDslPackageImpl#getLabel()
   * @generated
   */
  int LABEL = 1;

  /**
   * The feature id for the '<em><b>En</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL__EN = 0;

  /**
   * The feature id for the '<em><b>Nl</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL__NL = 1;

  /**
   * The number of structural features of the '<em>Label</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.PathTailImpl <em>Path Tail</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.PathTailImpl
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DynamicScreenDslPackageImpl#getPathTail()
   * @generated
   */
  int PATH_TAIL = 2;

  /**
   * The feature id for the '<em><b>Field</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_TAIL__FIELD = 0;

  /**
   * The feature id for the '<em><b>As Entity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_TAIL__AS_ENTITY = 1;

  /**
   * The feature id for the '<em><b>Tail</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_TAIL__TAIL = 2;

  /**
   * The number of structural features of the '<em>Path Tail</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_TAIL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DummyForExternalVariableImpl <em>Dummy For External Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DummyForExternalVariableImpl
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DynamicScreenDslPackageImpl#getDummyForExternalVariable()
   * @generated
   */
  int DUMMY_FOR_EXTERNAL_VARIABLE = 19;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUMMY_FOR_EXTERNAL_VARIABLE__NAME = 0;

  /**
   * The number of structural features of the '<em>Dummy For External Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUMMY_FOR_EXTERNAL_VARIABLE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DeclarationImpl <em>Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DeclarationImpl
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DynamicScreenDslPackageImpl#getDeclaration()
   * @generated
   */
  int DECLARATION = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__NAME = DUMMY_FOR_EXTERNAL_VARIABLE__NAME;

  /**
   * The number of structural features of the '<em>Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION_FEATURE_COUNT = DUMMY_FOR_EXTERNAL_VARIABLE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.ExternalVariableImpl <em>External Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.ExternalVariableImpl
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DynamicScreenDslPackageImpl#getExternalVariable()
   * @generated
   */
  int EXTERNAL_VARIABLE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_VARIABLE__NAME = DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_VARIABLE__PATH = DECLARATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>External Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_VARIABLE_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.EnumListImpl <em>Enum List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.EnumListImpl
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DynamicScreenDslPackageImpl#getEnumList()
   * @generated
   */
  int ENUM_LIST = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_LIST__NAME = DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Literals</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_LIST__LITERALS = DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Enum</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_LIST__ENUM = DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Enum List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_LIST_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DataStoreImpl <em>Data Store</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DataStoreImpl
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DynamicScreenDslPackageImpl#getDataStore()
   * @generated
   */
  int DATA_STORE = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_STORE__NAME = DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Class</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_STORE__CLASS = DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Multi</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_STORE__MULTI = DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Data Store</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_STORE_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.GroupElementImpl <em>Group Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.GroupElementImpl
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DynamicScreenDslPackageImpl#getGroupElement()
   * @generated
   */
  int GROUP_ELEMENT = 7;

  /**
   * The feature id for the '<em><b>Label</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_ELEMENT__LABEL = 0;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_ELEMENT__ATTRIBUTES = 1;

  /**
   * The number of structural features of the '<em>Group Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_ELEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.FieldImpl <em>Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.FieldImpl
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DynamicScreenDslPackageImpl#getField()
   * @generated
   */
  int FIELD = 8;

  /**
   * The feature id for the '<em><b>Label</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__LABEL = GROUP_ELEMENT__LABEL;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__ATTRIBUTES = GROUP_ELEMENT__ATTRIBUTES;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__NAME = GROUP_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__PATH = GROUP_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_FEATURE_COUNT = GROUP_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.FieldGroupImpl <em>Field Group</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.FieldGroupImpl
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DynamicScreenDslPackageImpl#getFieldGroup()
   * @generated
   */
  int FIELD_GROUP = 9;

  /**
   * The feature id for the '<em><b>Label</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_GROUP__LABEL = GROUP_ELEMENT__LABEL;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_GROUP__ATTRIBUTES = GROUP_ELEMENT__ATTRIBUTES;

  /**
   * The feature id for the '<em><b>With</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_GROUP__WITH = GROUP_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_GROUP__ELEMENTS = GROUP_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Field Group</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_GROUP_FEATURE_COUNT = GROUP_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.AttributeImpl
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DynamicScreenDslPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 10;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.EnumFieldAttributeImpl <em>Enum Field Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.EnumFieldAttributeImpl
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DynamicScreenDslPackageImpl#getEnumFieldAttribute()
   * @generated
   */
  int ENUM_FIELD_ATTRIBUTE = 11;

  /**
   * The number of structural features of the '<em>Enum Field Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_FIELD_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.NormalAttributeImpl <em>Normal Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.NormalAttributeImpl
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DynamicScreenDslPackageImpl#getNormalAttribute()
   * @generated
   */
  int NORMAL_ATTRIBUTE = 12;

  /**
   * The feature id for the '<em><b>Class Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NORMAL_ATTRIBUTE__CLASS_EXPR = ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NORMAL_ATTRIBUTE__CLAUSE = ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Normal Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NORMAL_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.AttributeClassExpressionImpl <em>Attribute Class Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.AttributeClassExpressionImpl
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DynamicScreenDslPackageImpl#getAttributeClassExpression()
   * @generated
   */
  int ATTRIBUTE_CLASS_EXPRESSION = 13;

  /**
   * The feature id for the '<em><b>Classes</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_CLASS_EXPRESSION__CLASSES = 0;

  /**
   * The number of structural features of the '<em>Attribute Class Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_CLASS_EXPRESSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.RestrictionAttributeImpl <em>Restriction Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.RestrictionAttributeImpl
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DynamicScreenDslPackageImpl#getRestrictionAttribute()
   * @generated
   */
  int RESTRICTION_ATTRIBUTE = 14;

  /**
   * The feature id for the '<em><b>Literals</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESTRICTION_ATTRIBUTE__LITERALS = ENUM_FIELD_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESTRICTION_ATTRIBUTE__CLAUSE = ENUM_FIELD_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Restriction Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESTRICTION_ATTRIBUTE_FEATURE_COUNT = ENUM_FIELD_ATTRIBUTE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.RestrictionGroupAttributeImpl <em>Restriction Group Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.RestrictionGroupAttributeImpl
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DynamicScreenDslPackageImpl#getRestrictionGroupAttribute()
   * @generated
   */
  int RESTRICTION_GROUP_ATTRIBUTE = 15;

  /**
   * The feature id for the '<em><b>Rules</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESTRICTION_GROUP_ATTRIBUTE__RULES = ENUM_FIELD_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Restriction Group Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESTRICTION_GROUP_ATTRIBUTE_FEATURE_COUNT = ENUM_FIELD_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.RestrictionRuleImpl <em>Restriction Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.RestrictionRuleImpl
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DynamicScreenDslPackageImpl#getRestrictionRule()
   * @generated
   */
  int RESTRICTION_RULE = 16;

  /**
   * The feature id for the '<em><b>Literals</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESTRICTION_RULE__LITERALS = 0;

  /**
   * The feature id for the '<em><b>Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESTRICTION_RULE__CLAUSE = 1;

  /**
   * The number of structural features of the '<em>Restriction Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESTRICTION_RULE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.ReferenceTargetImpl <em>Reference Target</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.ReferenceTargetImpl
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DynamicScreenDslPackageImpl#getReferenceTarget()
   * @generated
   */
  int REFERENCE_TARGET = 17;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_TARGET__NAME = DUMMY_FOR_EXTERNAL_VARIABLE__NAME;

  /**
   * The feature id for the '<em><b>Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_TARGET__PATH = DUMMY_FOR_EXTERNAL_VARIABLE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Reference Target</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_TARGET_FEATURE_COUNT = DUMMY_FOR_EXTERNAL_VARIABLE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.ReferenceImpl <em>Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.ReferenceImpl
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DynamicScreenDslPackageImpl#getReference()
   * @generated
   */
  int REFERENCE = 18;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__REF = 0;

  /**
   * The number of structural features of the '<em>Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.BExpressionImpl <em>BExpression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.BExpressionImpl
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DynamicScreenDslPackageImpl#getBExpression()
   * @generated
   */
  int BEXPRESSION = 20;

  /**
   * The number of structural features of the '<em>BExpression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.AtomicReferringBExpressionImpl <em>Atomic Referring BExpression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.AtomicReferringBExpressionImpl
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DynamicScreenDslPackageImpl#getAtomicReferringBExpression()
   * @generated
   */
  int ATOMIC_REFERRING_BEXPRESSION = 21;

  /**
   * The feature id for the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC_REFERRING_BEXPRESSION__REF = BEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Atomic Referring BExpression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC_REFERRING_BEXPRESSION_FEATURE_COUNT = BEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.BComparisonImpl <em>BComparison</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.BComparisonImpl
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DynamicScreenDslPackageImpl#getBComparison()
   * @generated
   */
  int BCOMPARISON = 22;

  /**
   * The feature id for the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BCOMPARISON__REF = ATOMIC_REFERRING_BEXPRESSION__REF;

  /**
   * The feature id for the '<em><b>BLiteral</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BCOMPARISON__BLITERAL = ATOMIC_REFERRING_BEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>BComparison</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BCOMPARISON_FEATURE_COUNT = ATOMIC_REFERRING_BEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.EnumComparisonImpl <em>Enum Comparison</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.EnumComparisonImpl
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DynamicScreenDslPackageImpl#getEnumComparison()
   * @generated
   */
  int ENUM_COMPARISON = 23;

  /**
   * The feature id for the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_COMPARISON__REF = ATOMIC_REFERRING_BEXPRESSION__REF;

  /**
   * The number of structural features of the '<em>Enum Comparison</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_COMPARISON_FEATURE_COUNT = ATOMIC_REFERRING_BEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.SingleEnumComparisonImpl <em>Single Enum Comparison</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.SingleEnumComparisonImpl
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DynamicScreenDslPackageImpl#getSingleEnumComparison()
   * @generated
   */
  int SINGLE_ENUM_COMPARISON = 24;

  /**
   * The feature id for the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_ENUM_COMPARISON__REF = ENUM_COMPARISON__REF;

  /**
   * The feature id for the '<em><b>ELiteral</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_ENUM_COMPARISON__ELITERAL = ENUM_COMPARISON_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Single Enum Comparison</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_ENUM_COMPARISON_FEATURE_COUNT = ENUM_COMPARISON_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.MultiEnumComparisonImpl <em>Multi Enum Comparison</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.MultiEnumComparisonImpl
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DynamicScreenDslPackageImpl#getMultiEnumComparison()
   * @generated
   */
  int MULTI_ENUM_COMPARISON = 25;

  /**
   * The feature id for the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_ENUM_COMPARISON__REF = ENUM_COMPARISON__REF;

  /**
   * The feature id for the '<em><b>Membership</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_ENUM_COMPARISON__MEMBERSHIP = ENUM_COMPARISON_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>ELiterals</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_ENUM_COMPARISON__ELITERALS = ENUM_COMPARISON_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Multi Enum Comparison</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_ENUM_COMPARISON_FEATURE_COUNT = ENUM_COMPARISON_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.StringValueComparisonImpl <em>String Value Comparison</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.StringValueComparisonImpl
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DynamicScreenDslPackageImpl#getStringValueComparison()
   * @generated
   */
  int STRING_VALUE_COMPARISON = 26;

  /**
   * The feature id for the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VALUE_COMPARISON__REF = ATOMIC_REFERRING_BEXPRESSION__REF;

  /**
   * The feature id for the '<em><b>Target Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VALUE_COMPARISON__TARGET_VALUE = ATOMIC_REFERRING_BEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Value Comparison</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VALUE_COMPARISON_FEATURE_COUNT = ATOMIC_REFERRING_BEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.PresenceCheckImpl <em>Presence Check</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.PresenceCheckImpl
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DynamicScreenDslPackageImpl#getPresenceCheck()
   * @generated
   */
  int PRESENCE_CHECK = 27;

  /**
   * The feature id for the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRESENCE_CHECK__REF = ATOMIC_REFERRING_BEXPRESSION__REF;

  /**
   * The number of structural features of the '<em>Presence Check</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRESENCE_CHECK_FEATURE_COUNT = ATOMIC_REFERRING_BEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.EnumLiteralsCollectionImpl <em>Enum Literals Collection</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.EnumLiteralsCollectionImpl
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DynamicScreenDslPackageImpl#getEnumLiteralsCollection()
   * @generated
   */
  int ENUM_LITERALS_COLLECTION = 28;

  /**
   * The number of structural features of the '<em>Enum Literals Collection</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_LITERALS_COLLECTION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DirectEnumLiteralsCollectionImpl <em>Direct Enum Literals Collection</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DirectEnumLiteralsCollectionImpl
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DynamicScreenDslPackageImpl#getDirectEnumLiteralsCollection()
   * @generated
   */
  int DIRECT_ENUM_LITERALS_COLLECTION = 29;

  /**
   * The feature id for the '<em><b>Literals</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECT_ENUM_LITERALS_COLLECTION__LITERALS = ENUM_LITERALS_COLLECTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Direct Enum Literals Collection</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECT_ENUM_LITERALS_COLLECTION_FEATURE_COUNT = ENUM_LITERALS_COLLECTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.EnumListReferenceImpl <em>Enum List Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.EnumListReferenceImpl
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DynamicScreenDslPackageImpl#getEnumListReference()
   * @generated
   */
  int ENUM_LIST_REFERENCE = 30;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_LIST_REFERENCE__REF = ENUM_LITERALS_COLLECTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Enum List Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_LIST_REFERENCE_FEATURE_COUNT = ENUM_LITERALS_COLLECTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.OrOperationImpl <em>Or Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.OrOperationImpl
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DynamicScreenDslPackageImpl#getOrOperation()
   * @generated
   */
  int OR_OPERATION = 31;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_OPERATION__LEFT = BEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_OPERATION__RIGHT = BEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Or Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_OPERATION_FEATURE_COUNT = BEXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.AndOperationImpl <em>And Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.AndOperationImpl
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DynamicScreenDslPackageImpl#getAndOperation()
   * @generated
   */
  int AND_OPERATION = 32;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_OPERATION__LEFT = BEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_OPERATION__RIGHT = BEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>And Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_OPERATION_FEATURE_COUNT = BEXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.NegationExpressionImpl <em>Negation Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.NegationExpressionImpl
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DynamicScreenDslPackageImpl#getNegationExpression()
   * @generated
   */
  int NEGATION_EXPRESSION = 33;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEGATION_EXPRESSION__EXPR = BEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Negation Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEGATION_EXPRESSION_FEATURE_COUNT = BEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.AttributeClass <em>Attribute Class</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.AttributeClass
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DynamicScreenDslPackageImpl#getAttributeClass()
   * @generated
   */
  int ATTRIBUTE_CLASS = 34;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.BLiteral <em>BLiteral</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.BLiteral
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DynamicScreenDslPackageImpl#getBLiteral()
   * @generated
   */
  int BLITERAL = 35;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.EnumMembership <em>Enum Membership</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.EnumMembership
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DynamicScreenDslPackageImpl#getEnumMembership()
   * @generated
   */
  int ENUM_MEMBERSHIP = 36;


  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.DynamicScreen <em>Dynamic Screen</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dynamic Screen</em>'.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.DynamicScreen
   * @generated
   */
  EClass getDynamicScreen();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.DynamicScreen#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Label</em>'.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.DynamicScreen#getLabel()
   * @see #getDynamicScreen()
   * @generated
   */
  EReference getDynamicScreen_Label();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.DynamicScreen#getImportURI <em>Import URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Import URI</em>'.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.DynamicScreen#getImportURI()
   * @see #getDynamicScreen()
   * @generated
   */
  EAttribute getDynamicScreen_ImportURI();

  /**
   * Returns the meta object for the reference '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.DynamicScreen#getViewClass <em>View Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>View Class</em>'.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.DynamicScreen#getViewClass()
   * @see #getDynamicScreen()
   * @generated
   */
  EReference getDynamicScreen_ViewClass();

  /**
   * Returns the meta object for the containment reference list '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.DynamicScreen#getDeclarations <em>Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Declarations</em>'.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.DynamicScreen#getDeclarations()
   * @see #getDynamicScreen()
   * @generated
   */
  EReference getDynamicScreen_Declarations();

  /**
   * Returns the meta object for the containment reference list '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.DynamicScreen#getGroups <em>Groups</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Groups</em>'.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.DynamicScreen#getGroups()
   * @see #getDynamicScreen()
   * @generated
   */
  EReference getDynamicScreen_Groups();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.Label <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Label</em>'.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.Label
   * @generated
   */
  EClass getLabel();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.Label#getEn <em>En</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>En</em>'.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.Label#getEn()
   * @see #getLabel()
   * @generated
   */
  EAttribute getLabel_En();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.Label#getNl <em>Nl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nl</em>'.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.Label#getNl()
   * @see #getLabel()
   * @generated
   */
  EAttribute getLabel_Nl();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.PathTail <em>Path Tail</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Path Tail</em>'.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.PathTail
   * @generated
   */
  EClass getPathTail();

  /**
   * Returns the meta object for the reference '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.PathTail#getField <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Field</em>'.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.PathTail#getField()
   * @see #getPathTail()
   * @generated
   */
  EReference getPathTail_Field();

  /**
   * Returns the meta object for the reference '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.PathTail#getAsEntity <em>As Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>As Entity</em>'.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.PathTail#getAsEntity()
   * @see #getPathTail()
   * @generated
   */
  EReference getPathTail_AsEntity();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.PathTail#getTail <em>Tail</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tail</em>'.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.PathTail#getTail()
   * @see #getPathTail()
   * @generated
   */
  EReference getPathTail_Tail();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.Declaration <em>Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Declaration</em>'.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.Declaration
   * @generated
   */
  EClass getDeclaration();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.ExternalVariable <em>External Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>External Variable</em>'.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.ExternalVariable
   * @generated
   */
  EClass getExternalVariable();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.EnumList <em>Enum List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum List</em>'.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.EnumList
   * @generated
   */
  EClass getEnumList();

  /**
   * Returns the meta object for the reference list '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.EnumList#getLiterals <em>Literals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Literals</em>'.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.EnumList#getLiterals()
   * @see #getEnumList()
   * @generated
   */
  EReference getEnumList_Literals();

  /**
   * Returns the meta object for the reference '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.EnumList#getEnum <em>Enum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Enum</em>'.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.EnumList#getEnum()
   * @see #getEnumList()
   * @generated
   */
  EReference getEnumList_Enum();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.DataStore <em>Data Store</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Store</em>'.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.DataStore
   * @generated
   */
  EClass getDataStore();

  /**
   * Returns the meta object for the reference '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.DataStore#getClass_ <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Class</em>'.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.DataStore#getClass_()
   * @see #getDataStore()
   * @generated
   */
  EReference getDataStore_Class();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.DataStore#isMulti <em>Multi</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Multi</em>'.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.DataStore#isMulti()
   * @see #getDataStore()
   * @generated
   */
  EAttribute getDataStore_Multi();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.GroupElement <em>Group Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Group Element</em>'.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.GroupElement
   * @generated
   */
  EClass getGroupElement();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.GroupElement#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Label</em>'.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.GroupElement#getLabel()
   * @see #getGroupElement()
   * @generated
   */
  EReference getGroupElement_Label();

  /**
   * Returns the meta object for the containment reference list '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.GroupElement#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.GroupElement#getAttributes()
   * @see #getGroupElement()
   * @generated
   */
  EReference getGroupElement_Attributes();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.Field <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field</em>'.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.Field
   * @generated
   */
  EClass getField();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.FieldGroup <em>Field Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field Group</em>'.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.FieldGroup
   * @generated
   */
  EClass getFieldGroup();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.FieldGroup#getWith <em>With</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>With</em>'.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.FieldGroup#getWith()
   * @see #getFieldGroup()
   * @generated
   */
  EReference getFieldGroup_With();

  /**
   * Returns the meta object for the containment reference list '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.FieldGroup#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.FieldGroup#getElements()
   * @see #getFieldGroup()
   * @generated
   */
  EReference getFieldGroup_Elements();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.EnumFieldAttribute <em>Enum Field Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Field Attribute</em>'.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.EnumFieldAttribute
   * @generated
   */
  EClass getEnumFieldAttribute();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.NormalAttribute <em>Normal Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Normal Attribute</em>'.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.NormalAttribute
   * @generated
   */
  EClass getNormalAttribute();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.NormalAttribute#getClassExpr <em>Class Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Class Expr</em>'.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.NormalAttribute#getClassExpr()
   * @see #getNormalAttribute()
   * @generated
   */
  EReference getNormalAttribute_ClassExpr();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.NormalAttribute#getClause <em>Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Clause</em>'.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.NormalAttribute#getClause()
   * @see #getNormalAttribute()
   * @generated
   */
  EReference getNormalAttribute_Clause();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.AttributeClassExpression <em>Attribute Class Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute Class Expression</em>'.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.AttributeClassExpression
   * @generated
   */
  EClass getAttributeClassExpression();

  /**
   * Returns the meta object for the attribute list '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.AttributeClassExpression#getClasses <em>Classes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Classes</em>'.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.AttributeClassExpression#getClasses()
   * @see #getAttributeClassExpression()
   * @generated
   */
  EAttribute getAttributeClassExpression_Classes();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.RestrictionAttribute <em>Restriction Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Restriction Attribute</em>'.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.RestrictionAttribute
   * @generated
   */
  EClass getRestrictionAttribute();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.RestrictionAttribute#getLiterals <em>Literals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Literals</em>'.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.RestrictionAttribute#getLiterals()
   * @see #getRestrictionAttribute()
   * @generated
   */
  EReference getRestrictionAttribute_Literals();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.RestrictionAttribute#getClause <em>Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Clause</em>'.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.RestrictionAttribute#getClause()
   * @see #getRestrictionAttribute()
   * @generated
   */
  EReference getRestrictionAttribute_Clause();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.RestrictionGroupAttribute <em>Restriction Group Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Restriction Group Attribute</em>'.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.RestrictionGroupAttribute
   * @generated
   */
  EClass getRestrictionGroupAttribute();

  /**
   * Returns the meta object for the containment reference list '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.RestrictionGroupAttribute#getRules <em>Rules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rules</em>'.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.RestrictionGroupAttribute#getRules()
   * @see #getRestrictionGroupAttribute()
   * @generated
   */
  EReference getRestrictionGroupAttribute_Rules();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.RestrictionRule <em>Restriction Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Restriction Rule</em>'.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.RestrictionRule
   * @generated
   */
  EClass getRestrictionRule();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.RestrictionRule#getLiterals <em>Literals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Literals</em>'.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.RestrictionRule#getLiterals()
   * @see #getRestrictionRule()
   * @generated
   */
  EReference getRestrictionRule_Literals();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.RestrictionRule#getClause <em>Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Clause</em>'.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.RestrictionRule#getClause()
   * @see #getRestrictionRule()
   * @generated
   */
  EReference getRestrictionRule_Clause();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.ReferenceTarget <em>Reference Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reference Target</em>'.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.ReferenceTarget
   * @generated
   */
  EClass getReferenceTarget();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.ReferenceTarget#getPath <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Path</em>'.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.ReferenceTarget#getPath()
   * @see #getReferenceTarget()
   * @generated
   */
  EReference getReferenceTarget_Path();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.Reference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reference</em>'.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.Reference
   * @generated
   */
  EClass getReference();

  /**
   * Returns the meta object for the reference '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.Reference#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.Reference#getRef()
   * @see #getReference()
   * @generated
   */
  EReference getReference_Ref();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.DummyForExternalVariable <em>Dummy For External Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dummy For External Variable</em>'.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.DummyForExternalVariable
   * @generated
   */
  EClass getDummyForExternalVariable();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.DummyForExternalVariable#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.DummyForExternalVariable#getName()
   * @see #getDummyForExternalVariable()
   * @generated
   */
  EAttribute getDummyForExternalVariable_Name();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.BExpression <em>BExpression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BExpression</em>'.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.BExpression
   * @generated
   */
  EClass getBExpression();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.AtomicReferringBExpression <em>Atomic Referring BExpression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Atomic Referring BExpression</em>'.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.AtomicReferringBExpression
   * @generated
   */
  EClass getAtomicReferringBExpression();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.AtomicReferringBExpression#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ref</em>'.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.AtomicReferringBExpression#getRef()
   * @see #getAtomicReferringBExpression()
   * @generated
   */
  EReference getAtomicReferringBExpression_Ref();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.BComparison <em>BComparison</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BComparison</em>'.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.BComparison
   * @generated
   */
  EClass getBComparison();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.BComparison#getBLiteral <em>BLiteral</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>BLiteral</em>'.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.BComparison#getBLiteral()
   * @see #getBComparison()
   * @generated
   */
  EAttribute getBComparison_BLiteral();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.EnumComparison <em>Enum Comparison</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Comparison</em>'.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.EnumComparison
   * @generated
   */
  EClass getEnumComparison();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.SingleEnumComparison <em>Single Enum Comparison</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Single Enum Comparison</em>'.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.SingleEnumComparison
   * @generated
   */
  EClass getSingleEnumComparison();

  /**
   * Returns the meta object for the reference '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.SingleEnumComparison#getELiteral <em>ELiteral</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>ELiteral</em>'.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.SingleEnumComparison#getELiteral()
   * @see #getSingleEnumComparison()
   * @generated
   */
  EReference getSingleEnumComparison_ELiteral();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.MultiEnumComparison <em>Multi Enum Comparison</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multi Enum Comparison</em>'.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.MultiEnumComparison
   * @generated
   */
  EClass getMultiEnumComparison();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.MultiEnumComparison#getMembership <em>Membership</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Membership</em>'.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.MultiEnumComparison#getMembership()
   * @see #getMultiEnumComparison()
   * @generated
   */
  EAttribute getMultiEnumComparison_Membership();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.MultiEnumComparison#getELiterals <em>ELiterals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>ELiterals</em>'.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.MultiEnumComparison#getELiterals()
   * @see #getMultiEnumComparison()
   * @generated
   */
  EReference getMultiEnumComparison_ELiterals();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.StringValueComparison <em>String Value Comparison</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Value Comparison</em>'.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.StringValueComparison
   * @generated
   */
  EClass getStringValueComparison();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.StringValueComparison#getTargetValue <em>Target Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Target Value</em>'.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.StringValueComparison#getTargetValue()
   * @see #getStringValueComparison()
   * @generated
   */
  EAttribute getStringValueComparison_TargetValue();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.PresenceCheck <em>Presence Check</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Presence Check</em>'.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.PresenceCheck
   * @generated
   */
  EClass getPresenceCheck();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.EnumLiteralsCollection <em>Enum Literals Collection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Literals Collection</em>'.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.EnumLiteralsCollection
   * @generated
   */
  EClass getEnumLiteralsCollection();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.DirectEnumLiteralsCollection <em>Direct Enum Literals Collection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Direct Enum Literals Collection</em>'.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.DirectEnumLiteralsCollection
   * @generated
   */
  EClass getDirectEnumLiteralsCollection();

  /**
   * Returns the meta object for the reference list '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.DirectEnumLiteralsCollection#getLiterals <em>Literals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Literals</em>'.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.DirectEnumLiteralsCollection#getLiterals()
   * @see #getDirectEnumLiteralsCollection()
   * @generated
   */
  EReference getDirectEnumLiteralsCollection_Literals();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.EnumListReference <em>Enum List Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum List Reference</em>'.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.EnumListReference
   * @generated
   */
  EClass getEnumListReference();

  /**
   * Returns the meta object for the reference '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.EnumListReference#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.EnumListReference#getRef()
   * @see #getEnumListReference()
   * @generated
   */
  EReference getEnumListReference_Ref();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.OrOperation <em>Or Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Or Operation</em>'.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.OrOperation
   * @generated
   */
  EClass getOrOperation();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.OrOperation#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.OrOperation#getLeft()
   * @see #getOrOperation()
   * @generated
   */
  EReference getOrOperation_Left();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.OrOperation#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.OrOperation#getRight()
   * @see #getOrOperation()
   * @generated
   */
  EReference getOrOperation_Right();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.AndOperation <em>And Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>And Operation</em>'.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.AndOperation
   * @generated
   */
  EClass getAndOperation();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.AndOperation#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.AndOperation#getLeft()
   * @see #getAndOperation()
   * @generated
   */
  EReference getAndOperation_Left();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.AndOperation#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.AndOperation#getRight()
   * @see #getAndOperation()
   * @generated
   */
  EReference getAndOperation_Right();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.NegationExpression <em>Negation Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Negation Expression</em>'.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.NegationExpression
   * @generated
   */
  EClass getNegationExpression();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.NegationExpression#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.NegationExpression#getExpr()
   * @see #getNegationExpression()
   * @generated
   */
  EReference getNegationExpression_Expr();

  /**
   * Returns the meta object for enum '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.AttributeClass <em>Attribute Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Attribute Class</em>'.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.AttributeClass
   * @generated
   */
  EEnum getAttributeClass();

  /**
   * Returns the meta object for enum '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.BLiteral <em>BLiteral</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>BLiteral</em>'.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.BLiteral
   * @generated
   */
  EEnum getBLiteral();

  /**
   * Returns the meta object for enum '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.EnumMembership <em>Enum Membership</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Enum Membership</em>'.
   * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.EnumMembership
   * @generated
   */
  EEnum getEnumMembership();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  DynamicScreenDslFactory getDynamicScreenDslFactory();

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
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DynamicScreenImpl <em>Dynamic Screen</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DynamicScreenImpl
     * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DynamicScreenDslPackageImpl#getDynamicScreen()
     * @generated
     */
    EClass DYNAMIC_SCREEN = eINSTANCE.getDynamicScreen();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DYNAMIC_SCREEN__LABEL = eINSTANCE.getDynamicScreen_Label();

    /**
     * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DYNAMIC_SCREEN__IMPORT_URI = eINSTANCE.getDynamicScreen_ImportURI();

    /**
     * The meta object literal for the '<em><b>View Class</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DYNAMIC_SCREEN__VIEW_CLASS = eINSTANCE.getDynamicScreen_ViewClass();

    /**
     * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DYNAMIC_SCREEN__DECLARATIONS = eINSTANCE.getDynamicScreen_Declarations();

    /**
     * The meta object literal for the '<em><b>Groups</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DYNAMIC_SCREEN__GROUPS = eINSTANCE.getDynamicScreen_Groups();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.LabelImpl <em>Label</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.LabelImpl
     * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DynamicScreenDslPackageImpl#getLabel()
     * @generated
     */
    EClass LABEL = eINSTANCE.getLabel();

    /**
     * The meta object literal for the '<em><b>En</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LABEL__EN = eINSTANCE.getLabel_En();

    /**
     * The meta object literal for the '<em><b>Nl</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LABEL__NL = eINSTANCE.getLabel_Nl();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.PathTailImpl <em>Path Tail</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.PathTailImpl
     * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DynamicScreenDslPackageImpl#getPathTail()
     * @generated
     */
    EClass PATH_TAIL = eINSTANCE.getPathTail();

    /**
     * The meta object literal for the '<em><b>Field</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PATH_TAIL__FIELD = eINSTANCE.getPathTail_Field();

    /**
     * The meta object literal for the '<em><b>As Entity</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PATH_TAIL__AS_ENTITY = eINSTANCE.getPathTail_AsEntity();

    /**
     * The meta object literal for the '<em><b>Tail</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PATH_TAIL__TAIL = eINSTANCE.getPathTail_Tail();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DeclarationImpl <em>Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DeclarationImpl
     * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DynamicScreenDslPackageImpl#getDeclaration()
     * @generated
     */
    EClass DECLARATION = eINSTANCE.getDeclaration();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.ExternalVariableImpl <em>External Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.ExternalVariableImpl
     * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DynamicScreenDslPackageImpl#getExternalVariable()
     * @generated
     */
    EClass EXTERNAL_VARIABLE = eINSTANCE.getExternalVariable();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.EnumListImpl <em>Enum List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.EnumListImpl
     * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DynamicScreenDslPackageImpl#getEnumList()
     * @generated
     */
    EClass ENUM_LIST = eINSTANCE.getEnumList();

    /**
     * The meta object literal for the '<em><b>Literals</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_LIST__LITERALS = eINSTANCE.getEnumList_Literals();

    /**
     * The meta object literal for the '<em><b>Enum</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_LIST__ENUM = eINSTANCE.getEnumList_Enum();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DataStoreImpl <em>Data Store</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DataStoreImpl
     * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DynamicScreenDslPackageImpl#getDataStore()
     * @generated
     */
    EClass DATA_STORE = eINSTANCE.getDataStore();

    /**
     * The meta object literal for the '<em><b>Class</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_STORE__CLASS = eINSTANCE.getDataStore_Class();

    /**
     * The meta object literal for the '<em><b>Multi</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_STORE__MULTI = eINSTANCE.getDataStore_Multi();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.GroupElementImpl <em>Group Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.GroupElementImpl
     * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DynamicScreenDslPackageImpl#getGroupElement()
     * @generated
     */
    EClass GROUP_ELEMENT = eINSTANCE.getGroupElement();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GROUP_ELEMENT__LABEL = eINSTANCE.getGroupElement_Label();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GROUP_ELEMENT__ATTRIBUTES = eINSTANCE.getGroupElement_Attributes();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.FieldImpl <em>Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.FieldImpl
     * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DynamicScreenDslPackageImpl#getField()
     * @generated
     */
    EClass FIELD = eINSTANCE.getField();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.FieldGroupImpl <em>Field Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.FieldGroupImpl
     * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DynamicScreenDslPackageImpl#getFieldGroup()
     * @generated
     */
    EClass FIELD_GROUP = eINSTANCE.getFieldGroup();

    /**
     * The meta object literal for the '<em><b>With</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD_GROUP__WITH = eINSTANCE.getFieldGroup_With();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD_GROUP__ELEMENTS = eINSTANCE.getFieldGroup_Elements();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.AttributeImpl
     * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DynamicScreenDslPackageImpl#getAttribute()
     * @generated
     */
    EClass ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.EnumFieldAttributeImpl <em>Enum Field Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.EnumFieldAttributeImpl
     * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DynamicScreenDslPackageImpl#getEnumFieldAttribute()
     * @generated
     */
    EClass ENUM_FIELD_ATTRIBUTE = eINSTANCE.getEnumFieldAttribute();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.NormalAttributeImpl <em>Normal Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.NormalAttributeImpl
     * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DynamicScreenDslPackageImpl#getNormalAttribute()
     * @generated
     */
    EClass NORMAL_ATTRIBUTE = eINSTANCE.getNormalAttribute();

    /**
     * The meta object literal for the '<em><b>Class Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NORMAL_ATTRIBUTE__CLASS_EXPR = eINSTANCE.getNormalAttribute_ClassExpr();

    /**
     * The meta object literal for the '<em><b>Clause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NORMAL_ATTRIBUTE__CLAUSE = eINSTANCE.getNormalAttribute_Clause();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.AttributeClassExpressionImpl <em>Attribute Class Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.AttributeClassExpressionImpl
     * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DynamicScreenDslPackageImpl#getAttributeClassExpression()
     * @generated
     */
    EClass ATTRIBUTE_CLASS_EXPRESSION = eINSTANCE.getAttributeClassExpression();

    /**
     * The meta object literal for the '<em><b>Classes</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE_CLASS_EXPRESSION__CLASSES = eINSTANCE.getAttributeClassExpression_Classes();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.RestrictionAttributeImpl <em>Restriction Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.RestrictionAttributeImpl
     * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DynamicScreenDslPackageImpl#getRestrictionAttribute()
     * @generated
     */
    EClass RESTRICTION_ATTRIBUTE = eINSTANCE.getRestrictionAttribute();

    /**
     * The meta object literal for the '<em><b>Literals</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESTRICTION_ATTRIBUTE__LITERALS = eINSTANCE.getRestrictionAttribute_Literals();

    /**
     * The meta object literal for the '<em><b>Clause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESTRICTION_ATTRIBUTE__CLAUSE = eINSTANCE.getRestrictionAttribute_Clause();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.RestrictionGroupAttributeImpl <em>Restriction Group Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.RestrictionGroupAttributeImpl
     * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DynamicScreenDslPackageImpl#getRestrictionGroupAttribute()
     * @generated
     */
    EClass RESTRICTION_GROUP_ATTRIBUTE = eINSTANCE.getRestrictionGroupAttribute();

    /**
     * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESTRICTION_GROUP_ATTRIBUTE__RULES = eINSTANCE.getRestrictionGroupAttribute_Rules();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.RestrictionRuleImpl <em>Restriction Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.RestrictionRuleImpl
     * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DynamicScreenDslPackageImpl#getRestrictionRule()
     * @generated
     */
    EClass RESTRICTION_RULE = eINSTANCE.getRestrictionRule();

    /**
     * The meta object literal for the '<em><b>Literals</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESTRICTION_RULE__LITERALS = eINSTANCE.getRestrictionRule_Literals();

    /**
     * The meta object literal for the '<em><b>Clause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESTRICTION_RULE__CLAUSE = eINSTANCE.getRestrictionRule_Clause();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.ReferenceTargetImpl <em>Reference Target</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.ReferenceTargetImpl
     * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DynamicScreenDslPackageImpl#getReferenceTarget()
     * @generated
     */
    EClass REFERENCE_TARGET = eINSTANCE.getReferenceTarget();

    /**
     * The meta object literal for the '<em><b>Path</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFERENCE_TARGET__PATH = eINSTANCE.getReferenceTarget_Path();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.ReferenceImpl <em>Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.ReferenceImpl
     * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DynamicScreenDslPackageImpl#getReference()
     * @generated
     */
    EClass REFERENCE = eINSTANCE.getReference();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFERENCE__REF = eINSTANCE.getReference_Ref();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DummyForExternalVariableImpl <em>Dummy For External Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DummyForExternalVariableImpl
     * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DynamicScreenDslPackageImpl#getDummyForExternalVariable()
     * @generated
     */
    EClass DUMMY_FOR_EXTERNAL_VARIABLE = eINSTANCE.getDummyForExternalVariable();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DUMMY_FOR_EXTERNAL_VARIABLE__NAME = eINSTANCE.getDummyForExternalVariable_Name();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.BExpressionImpl <em>BExpression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.BExpressionImpl
     * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DynamicScreenDslPackageImpl#getBExpression()
     * @generated
     */
    EClass BEXPRESSION = eINSTANCE.getBExpression();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.AtomicReferringBExpressionImpl <em>Atomic Referring BExpression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.AtomicReferringBExpressionImpl
     * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DynamicScreenDslPackageImpl#getAtomicReferringBExpression()
     * @generated
     */
    EClass ATOMIC_REFERRING_BEXPRESSION = eINSTANCE.getAtomicReferringBExpression();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATOMIC_REFERRING_BEXPRESSION__REF = eINSTANCE.getAtomicReferringBExpression_Ref();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.BComparisonImpl <em>BComparison</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.BComparisonImpl
     * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DynamicScreenDslPackageImpl#getBComparison()
     * @generated
     */
    EClass BCOMPARISON = eINSTANCE.getBComparison();

    /**
     * The meta object literal for the '<em><b>BLiteral</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BCOMPARISON__BLITERAL = eINSTANCE.getBComparison_BLiteral();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.EnumComparisonImpl <em>Enum Comparison</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.EnumComparisonImpl
     * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DynamicScreenDslPackageImpl#getEnumComparison()
     * @generated
     */
    EClass ENUM_COMPARISON = eINSTANCE.getEnumComparison();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.SingleEnumComparisonImpl <em>Single Enum Comparison</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.SingleEnumComparisonImpl
     * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DynamicScreenDslPackageImpl#getSingleEnumComparison()
     * @generated
     */
    EClass SINGLE_ENUM_COMPARISON = eINSTANCE.getSingleEnumComparison();

    /**
     * The meta object literal for the '<em><b>ELiteral</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SINGLE_ENUM_COMPARISON__ELITERAL = eINSTANCE.getSingleEnumComparison_ELiteral();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.MultiEnumComparisonImpl <em>Multi Enum Comparison</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.MultiEnumComparisonImpl
     * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DynamicScreenDslPackageImpl#getMultiEnumComparison()
     * @generated
     */
    EClass MULTI_ENUM_COMPARISON = eINSTANCE.getMultiEnumComparison();

    /**
     * The meta object literal for the '<em><b>Membership</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MULTI_ENUM_COMPARISON__MEMBERSHIP = eINSTANCE.getMultiEnumComparison_Membership();

    /**
     * The meta object literal for the '<em><b>ELiterals</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTI_ENUM_COMPARISON__ELITERALS = eINSTANCE.getMultiEnumComparison_ELiterals();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.StringValueComparisonImpl <em>String Value Comparison</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.StringValueComparisonImpl
     * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DynamicScreenDslPackageImpl#getStringValueComparison()
     * @generated
     */
    EClass STRING_VALUE_COMPARISON = eINSTANCE.getStringValueComparison();

    /**
     * The meta object literal for the '<em><b>Target Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_VALUE_COMPARISON__TARGET_VALUE = eINSTANCE.getStringValueComparison_TargetValue();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.PresenceCheckImpl <em>Presence Check</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.PresenceCheckImpl
     * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DynamicScreenDslPackageImpl#getPresenceCheck()
     * @generated
     */
    EClass PRESENCE_CHECK = eINSTANCE.getPresenceCheck();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.EnumLiteralsCollectionImpl <em>Enum Literals Collection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.EnumLiteralsCollectionImpl
     * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DynamicScreenDslPackageImpl#getEnumLiteralsCollection()
     * @generated
     */
    EClass ENUM_LITERALS_COLLECTION = eINSTANCE.getEnumLiteralsCollection();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DirectEnumLiteralsCollectionImpl <em>Direct Enum Literals Collection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DirectEnumLiteralsCollectionImpl
     * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DynamicScreenDslPackageImpl#getDirectEnumLiteralsCollection()
     * @generated
     */
    EClass DIRECT_ENUM_LITERALS_COLLECTION = eINSTANCE.getDirectEnumLiteralsCollection();

    /**
     * The meta object literal for the '<em><b>Literals</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIRECT_ENUM_LITERALS_COLLECTION__LITERALS = eINSTANCE.getDirectEnumLiteralsCollection_Literals();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.EnumListReferenceImpl <em>Enum List Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.EnumListReferenceImpl
     * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DynamicScreenDslPackageImpl#getEnumListReference()
     * @generated
     */
    EClass ENUM_LIST_REFERENCE = eINSTANCE.getEnumListReference();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_LIST_REFERENCE__REF = eINSTANCE.getEnumListReference_Ref();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.OrOperationImpl <em>Or Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.OrOperationImpl
     * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DynamicScreenDslPackageImpl#getOrOperation()
     * @generated
     */
    EClass OR_OPERATION = eINSTANCE.getOrOperation();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR_OPERATION__LEFT = eINSTANCE.getOrOperation_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR_OPERATION__RIGHT = eINSTANCE.getOrOperation_Right();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.AndOperationImpl <em>And Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.AndOperationImpl
     * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DynamicScreenDslPackageImpl#getAndOperation()
     * @generated
     */
    EClass AND_OPERATION = eINSTANCE.getAndOperation();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND_OPERATION__LEFT = eINSTANCE.getAndOperation_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND_OPERATION__RIGHT = eINSTANCE.getAndOperation_Right();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.NegationExpressionImpl <em>Negation Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.NegationExpressionImpl
     * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DynamicScreenDslPackageImpl#getNegationExpression()
     * @generated
     */
    EClass NEGATION_EXPRESSION = eINSTANCE.getNegationExpression();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NEGATION_EXPRESSION__EXPR = eINSTANCE.getNegationExpression_Expr();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.AttributeClass <em>Attribute Class</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.AttributeClass
     * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DynamicScreenDslPackageImpl#getAttributeClass()
     * @generated
     */
    EEnum ATTRIBUTE_CLASS = eINSTANCE.getAttributeClass();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.BLiteral <em>BLiteral</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.BLiteral
     * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DynamicScreenDslPackageImpl#getBLiteral()
     * @generated
     */
    EEnum BLITERAL = eINSTANCE.getBLiteral();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.dynamicScreenDsl.EnumMembership <em>Enum Membership</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.EnumMembership
     * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.impl.DynamicScreenDslPackageImpl#getEnumMembership()
     * @generated
     */
    EEnum ENUM_MEMBERSHIP = eINSTANCE.getEnumMembership();

  }

} //DynamicScreenDslPackage
