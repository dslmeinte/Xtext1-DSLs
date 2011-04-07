/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.examples.dataModelDsl;

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
 * @see nl.dslmeinte.xtext.examples.dataModelDsl.DataModelDslFactory
 * @model kind="package"
 * @generated
 */
public interface DataModelDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "dataModelDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.dslmeinte.nl/xtext/examples/DataModelDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "dataModelDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DataModelDslPackage eINSTANCE = nl.dslmeinte.xtext.examples.dataModelDsl.impl.DataModelDslPackageImpl.init();

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.dataModelDsl.impl.DataModelImpl <em>Data Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.impl.DataModelImpl
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.impl.DataModelDslPackageImpl#getDataModel()
   * @generated
   */
  int DATA_MODEL = 0;

  /**
   * The feature id for the '<em><b>Primitives</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_MODEL__PRIMITIVES = 0;

  /**
   * The feature id for the '<em><b>Compound Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_MODEL__COMPOUND_TYPES = 1;

  /**
   * The number of structural features of the '<em>Data Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.dataModelDsl.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.impl.TypeImpl
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.impl.DataModelDslPackageImpl#getType()
   * @generated
   */
  int TYPE = 1;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.dataModelDsl.impl.CompoundTypeImpl <em>Compound Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.impl.CompoundTypeImpl
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.impl.DataModelDslPackageImpl#getCompoundType()
   * @generated
   */
  int COMPOUND_TYPE = 2;

  /**
   * The number of structural features of the '<em>Compound Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOUND_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.dataModelDsl.impl.PrimitiveTypesImpl <em>Primitive Types</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.impl.PrimitiveTypesImpl
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.impl.DataModelDslPackageImpl#getPrimitiveTypes()
   * @generated
   */
  int PRIMITIVE_TYPES = 3;

  /**
   * The feature id for the '<em><b>Primitive Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_TYPES__PRIMITIVE_TYPES = 0;

  /**
   * The number of structural features of the '<em>Primitive Types</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_TYPES_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.dataModelDsl.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.impl.PrimitiveTypeImpl
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.impl.DataModelDslPackageImpl#getPrimitiveType()
   * @generated
   */
  int PRIMITIVE_TYPE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_TYPE__NAME = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_TYPE__SUPER_TYPE = TYPE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Realization Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_TYPE__REALIZATION_TYPE = TYPE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Primitive Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.dataModelDsl.impl.DataTypeImpl <em>Data Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.impl.DataTypeImpl
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.impl.DataModelDslPackageImpl#getDataType()
   * @generated
   */
  int DATA_TYPE = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE__NAME = COMPOUND_TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE__FIELDS = COMPOUND_TYPE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE__CONSTRAINTS = COMPOUND_TYPE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Functions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE__FUNCTIONS = COMPOUND_TYPE_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Data Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_FEATURE_COUNT = COMPOUND_TYPE_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.dataModelDsl.impl.FeatureImpl <em>Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.impl.FeatureImpl
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.impl.DataModelDslPackageImpl#getFeature()
   * @generated
   */
  int FEATURE = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__NAME = 0;

  /**
   * The number of structural features of the '<em>Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.dataModelDsl.impl.FieldImpl <em>Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.impl.FieldImpl
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.impl.DataModelDslPackageImpl#getField()
   * @generated
   */
  int FIELD = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__NAME = FEATURE__NAME;

  /**
   * The feature id for the '<em><b>Modifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__MODIFIER = FEATURE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__TYPE = FEATURE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.dataModelDsl.impl.EnumerationImpl <em>Enumeration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.impl.EnumerationImpl
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.impl.DataModelDslPackageImpl#getEnumeration()
   * @generated
   */
  int ENUMERATION = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION__NAME = COMPOUND_TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Literals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION__LITERALS = COMPOUND_TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Enumeration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION_FEATURE_COUNT = COMPOUND_TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.dataModelDsl.impl.EnumLiteralImpl <em>Enum Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.impl.EnumLiteralImpl
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.impl.DataModelDslPackageImpl#getEnumLiteral()
   * @generated
   */
  int ENUM_LITERAL = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_LITERAL__NAME = 0;

  /**
   * The number of structural features of the '<em>Enum Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_LITERAL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.dataModelDsl.impl.EntityImpl <em>Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.impl.EntityImpl
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.impl.DataModelDslPackageImpl#getEntity()
   * @generated
   */
  int ENTITY = 9;

  /**
   * The feature id for the '<em><b>Transient</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__TRANSIENT = COMPOUND_TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__ABSTRACT = COMPOUND_TYPE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__NAME = COMPOUND_TYPE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__SUPER_TYPE = COMPOUND_TYPE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__FIELDS = COMPOUND_TYPE_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__CONSTRAINTS = COMPOUND_TYPE_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Functions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__FUNCTIONS = COMPOUND_TYPE_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_FEATURE_COUNT = COMPOUND_TYPE_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.dataModelDsl.impl.ConstraintImpl <em>Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.impl.ConstraintImpl
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.impl.DataModelDslPackageImpl#getConstraint()
   * @generated
   */
  int CONSTRAINT = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT__NAME = 0;

  /**
   * The feature id for the '<em><b>Slots</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT__SLOTS = 1;

  /**
   * The number of structural features of the '<em>Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.dataModelDsl.impl.UsageImpl <em>Usage</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.impl.UsageImpl
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.impl.DataModelDslPackageImpl#getUsage()
   * @generated
   */
  int USAGE = 11;

  /**
   * The feature id for the '<em><b>Field</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USAGE__FIELD = 0;

  /**
   * The number of structural features of the '<em>Usage</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USAGE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.dataModelDsl.impl.FunctionImpl <em>Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.impl.FunctionImpl
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.impl.DataModelDslPackageImpl#getFunction()
   * @generated
   */
  int FUNCTION = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__NAME = FEATURE__NAME;

  /**
   * The feature id for the '<em><b>Return Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__RETURN_TYPE = FEATURE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__ARGUMENTS = FEATURE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.dataModelDsl.impl.ArgumentImpl <em>Argument</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.impl.ArgumentImpl
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.impl.DataModelDslPackageImpl#getArgument()
   * @generated
   */
  int ARGUMENT = 13;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT__NAME = 1;

  /**
   * The number of structural features of the '<em>Argument</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.dataModelDsl.impl.SimpleTypeImpl <em>Simple Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.impl.SimpleTypeImpl
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.impl.DataModelDslPackageImpl#getSimpleType()
   * @generated
   */
  int SIMPLE_TYPE = 14;

  /**
   * The number of structural features of the '<em>Simple Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.dataModelDsl.MetaPrimitiveType <em>Meta Primitive Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.MetaPrimitiveType
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.impl.DataModelDslPackageImpl#getMetaPrimitiveType()
   * @generated
   */
  int META_PRIMITIVE_TYPE = 16;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.dataModelDsl.Modifier <em>Modifier</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.Modifier
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.impl.DataModelDslPackageImpl#getModifier()
   * @generated
   */
  int MODIFIER = 17;


  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.dataModelDsl.DataModel <em>Data Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Model</em>'.
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.DataModel
   * @generated
   */
  EClass getDataModel();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.xtext.examples.dataModelDsl.DataModel#getPrimitives <em>Primitives</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Primitives</em>'.
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.DataModel#getPrimitives()
   * @see #getDataModel()
   * @generated
   */
  EReference getDataModel_Primitives();

  /**
   * Returns the meta object for the containment reference list '{@link nl.dslmeinte.xtext.examples.dataModelDsl.DataModel#getCompoundTypes <em>Compound Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Compound Types</em>'.
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.DataModel#getCompoundTypes()
   * @see #getDataModel()
   * @generated
   */
  EReference getDataModel_CompoundTypes();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.dataModelDsl.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.dataModelDsl.CompoundType <em>Compound Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Compound Type</em>'.
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.CompoundType
   * @generated
   */
  EClass getCompoundType();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.dataModelDsl.PrimitiveTypes <em>Primitive Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primitive Types</em>'.
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.PrimitiveTypes
   * @generated
   */
  EClass getPrimitiveTypes();

  /**
   * Returns the meta object for the containment reference list '{@link nl.dslmeinte.xtext.examples.dataModelDsl.PrimitiveTypes#getPrimitiveTypes <em>Primitive Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Primitive Types</em>'.
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.PrimitiveTypes#getPrimitiveTypes()
   * @see #getPrimitiveTypes()
   * @generated
   */
  EReference getPrimitiveTypes_PrimitiveTypes();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.dataModelDsl.PrimitiveType <em>Primitive Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primitive Type</em>'.
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.PrimitiveType
   * @generated
   */
  EClass getPrimitiveType();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.examples.dataModelDsl.PrimitiveType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.PrimitiveType#getName()
   * @see #getPrimitiveType()
   * @generated
   */
  EAttribute getPrimitiveType_Name();

  /**
   * Returns the meta object for the reference '{@link nl.dslmeinte.xtext.examples.dataModelDsl.PrimitiveType#getSuperType <em>Super Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Super Type</em>'.
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.PrimitiveType#getSuperType()
   * @see #getPrimitiveType()
   * @generated
   */
  EReference getPrimitiveType_SuperType();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.examples.dataModelDsl.PrimitiveType#getRealizationType <em>Realization Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Realization Type</em>'.
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.PrimitiveType#getRealizationType()
   * @see #getPrimitiveType()
   * @generated
   */
  EAttribute getPrimitiveType_RealizationType();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.dataModelDsl.DataType <em>Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Type</em>'.
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.DataType
   * @generated
   */
  EClass getDataType();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.examples.dataModelDsl.DataType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.DataType#getName()
   * @see #getDataType()
   * @generated
   */
  EAttribute getDataType_Name();

  /**
   * Returns the meta object for the containment reference list '{@link nl.dslmeinte.xtext.examples.dataModelDsl.DataType#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fields</em>'.
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.DataType#getFields()
   * @see #getDataType()
   * @generated
   */
  EReference getDataType_Fields();

  /**
   * Returns the meta object for the containment reference list '{@link nl.dslmeinte.xtext.examples.dataModelDsl.DataType#getConstraints <em>Constraints</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Constraints</em>'.
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.DataType#getConstraints()
   * @see #getDataType()
   * @generated
   */
  EReference getDataType_Constraints();

  /**
   * Returns the meta object for the containment reference list '{@link nl.dslmeinte.xtext.examples.dataModelDsl.DataType#getFunctions <em>Functions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Functions</em>'.
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.DataType#getFunctions()
   * @see #getDataType()
   * @generated
   */
  EReference getDataType_Functions();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.dataModelDsl.Field <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field</em>'.
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.Field
   * @generated
   */
  EClass getField();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.examples.dataModelDsl.Field#getModifier <em>Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Modifier</em>'.
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.Field#getModifier()
   * @see #getField()
   * @generated
   */
  EAttribute getField_Modifier();

  /**
   * Returns the meta object for the reference '{@link nl.dslmeinte.xtext.examples.dataModelDsl.Field#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.Field#getType()
   * @see #getField()
   * @generated
   */
  EReference getField_Type();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.dataModelDsl.Enumeration <em>Enumeration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enumeration</em>'.
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.Enumeration
   * @generated
   */
  EClass getEnumeration();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.examples.dataModelDsl.Enumeration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.Enumeration#getName()
   * @see #getEnumeration()
   * @generated
   */
  EAttribute getEnumeration_Name();

  /**
   * Returns the meta object for the containment reference list '{@link nl.dslmeinte.xtext.examples.dataModelDsl.Enumeration#getLiterals <em>Literals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Literals</em>'.
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.Enumeration#getLiterals()
   * @see #getEnumeration()
   * @generated
   */
  EReference getEnumeration_Literals();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.dataModelDsl.EnumLiteral <em>Enum Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Literal</em>'.
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.EnumLiteral
   * @generated
   */
  EClass getEnumLiteral();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.examples.dataModelDsl.EnumLiteral#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.EnumLiteral#getName()
   * @see #getEnumLiteral()
   * @generated
   */
  EAttribute getEnumLiteral_Name();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.dataModelDsl.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity</em>'.
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.Entity
   * @generated
   */
  EClass getEntity();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.examples.dataModelDsl.Entity#isTransient <em>Transient</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Transient</em>'.
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.Entity#isTransient()
   * @see #getEntity()
   * @generated
   */
  EAttribute getEntity_Transient();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.examples.dataModelDsl.Entity#isAbstract <em>Abstract</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Abstract</em>'.
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.Entity#isAbstract()
   * @see #getEntity()
   * @generated
   */
  EAttribute getEntity_Abstract();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.examples.dataModelDsl.Entity#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.Entity#getName()
   * @see #getEntity()
   * @generated
   */
  EAttribute getEntity_Name();

  /**
   * Returns the meta object for the reference '{@link nl.dslmeinte.xtext.examples.dataModelDsl.Entity#getSuperType <em>Super Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Super Type</em>'.
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.Entity#getSuperType()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_SuperType();

  /**
   * Returns the meta object for the containment reference list '{@link nl.dslmeinte.xtext.examples.dataModelDsl.Entity#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fields</em>'.
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.Entity#getFields()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_Fields();

  /**
   * Returns the meta object for the containment reference list '{@link nl.dslmeinte.xtext.examples.dataModelDsl.Entity#getConstraints <em>Constraints</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Constraints</em>'.
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.Entity#getConstraints()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_Constraints();

  /**
   * Returns the meta object for the containment reference list '{@link nl.dslmeinte.xtext.examples.dataModelDsl.Entity#getFunctions <em>Functions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Functions</em>'.
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.Entity#getFunctions()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_Functions();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.dataModelDsl.Constraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constraint</em>'.
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.Constraint
   * @generated
   */
  EClass getConstraint();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.examples.dataModelDsl.Constraint#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.Constraint#getName()
   * @see #getConstraint()
   * @generated
   */
  EAttribute getConstraint_Name();

  /**
   * Returns the meta object for the containment reference list '{@link nl.dslmeinte.xtext.examples.dataModelDsl.Constraint#getSlots <em>Slots</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Slots</em>'.
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.Constraint#getSlots()
   * @see #getConstraint()
   * @generated
   */
  EReference getConstraint_Slots();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.dataModelDsl.Usage <em>Usage</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Usage</em>'.
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.Usage
   * @generated
   */
  EClass getUsage();

  /**
   * Returns the meta object for the reference '{@link nl.dslmeinte.xtext.examples.dataModelDsl.Usage#getField <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Field</em>'.
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.Usage#getField()
   * @see #getUsage()
   * @generated
   */
  EReference getUsage_Field();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.dataModelDsl.Function <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function</em>'.
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.Function
   * @generated
   */
  EClass getFunction();

  /**
   * Returns the meta object for the reference '{@link nl.dslmeinte.xtext.examples.dataModelDsl.Function#getReturnType <em>Return Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Return Type</em>'.
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.Function#getReturnType()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_ReturnType();

  /**
   * Returns the meta object for the containment reference list '{@link nl.dslmeinte.xtext.examples.dataModelDsl.Function#getArguments <em>Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Arguments</em>'.
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.Function#getArguments()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_Arguments();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.dataModelDsl.Argument <em>Argument</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Argument</em>'.
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.Argument
   * @generated
   */
  EClass getArgument();

  /**
   * Returns the meta object for the reference '{@link nl.dslmeinte.xtext.examples.dataModelDsl.Argument#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.Argument#getType()
   * @see #getArgument()
   * @generated
   */
  EReference getArgument_Type();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.examples.dataModelDsl.Argument#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.Argument#getName()
   * @see #getArgument()
   * @generated
   */
  EAttribute getArgument_Name();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.dataModelDsl.SimpleType <em>Simple Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Type</em>'.
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.SimpleType
   * @generated
   */
  EClass getSimpleType();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.dataModelDsl.Feature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature</em>'.
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.Feature
   * @generated
   */
  EClass getFeature();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.examples.dataModelDsl.Feature#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.Feature#getName()
   * @see #getFeature()
   * @generated
   */
  EAttribute getFeature_Name();

  /**
   * Returns the meta object for enum '{@link nl.dslmeinte.xtext.examples.dataModelDsl.MetaPrimitiveType <em>Meta Primitive Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Meta Primitive Type</em>'.
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.MetaPrimitiveType
   * @generated
   */
  EEnum getMetaPrimitiveType();

  /**
   * Returns the meta object for enum '{@link nl.dslmeinte.xtext.examples.dataModelDsl.Modifier <em>Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Modifier</em>'.
   * @see nl.dslmeinte.xtext.examples.dataModelDsl.Modifier
   * @generated
   */
  EEnum getModifier();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  DataModelDslFactory getDataModelDslFactory();

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
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.dataModelDsl.impl.DataModelImpl <em>Data Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.dataModelDsl.impl.DataModelImpl
     * @see nl.dslmeinte.xtext.examples.dataModelDsl.impl.DataModelDslPackageImpl#getDataModel()
     * @generated
     */
    EClass DATA_MODEL = eINSTANCE.getDataModel();

    /**
     * The meta object literal for the '<em><b>Primitives</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_MODEL__PRIMITIVES = eINSTANCE.getDataModel_Primitives();

    /**
     * The meta object literal for the '<em><b>Compound Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_MODEL__COMPOUND_TYPES = eINSTANCE.getDataModel_CompoundTypes();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.dataModelDsl.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.dataModelDsl.impl.TypeImpl
     * @see nl.dslmeinte.xtext.examples.dataModelDsl.impl.DataModelDslPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.dataModelDsl.impl.CompoundTypeImpl <em>Compound Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.dataModelDsl.impl.CompoundTypeImpl
     * @see nl.dslmeinte.xtext.examples.dataModelDsl.impl.DataModelDslPackageImpl#getCompoundType()
     * @generated
     */
    EClass COMPOUND_TYPE = eINSTANCE.getCompoundType();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.dataModelDsl.impl.PrimitiveTypesImpl <em>Primitive Types</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.dataModelDsl.impl.PrimitiveTypesImpl
     * @see nl.dslmeinte.xtext.examples.dataModelDsl.impl.DataModelDslPackageImpl#getPrimitiveTypes()
     * @generated
     */
    EClass PRIMITIVE_TYPES = eINSTANCE.getPrimitiveTypes();

    /**
     * The meta object literal for the '<em><b>Primitive Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRIMITIVE_TYPES__PRIMITIVE_TYPES = eINSTANCE.getPrimitiveTypes_PrimitiveTypes();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.dataModelDsl.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.dataModelDsl.impl.PrimitiveTypeImpl
     * @see nl.dslmeinte.xtext.examples.dataModelDsl.impl.DataModelDslPackageImpl#getPrimitiveType()
     * @generated
     */
    EClass PRIMITIVE_TYPE = eINSTANCE.getPrimitiveType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRIMITIVE_TYPE__NAME = eINSTANCE.getPrimitiveType_Name();

    /**
     * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRIMITIVE_TYPE__SUPER_TYPE = eINSTANCE.getPrimitiveType_SuperType();

    /**
     * The meta object literal for the '<em><b>Realization Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRIMITIVE_TYPE__REALIZATION_TYPE = eINSTANCE.getPrimitiveType_RealizationType();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.dataModelDsl.impl.DataTypeImpl <em>Data Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.dataModelDsl.impl.DataTypeImpl
     * @see nl.dslmeinte.xtext.examples.dataModelDsl.impl.DataModelDslPackageImpl#getDataType()
     * @generated
     */
    EClass DATA_TYPE = eINSTANCE.getDataType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_TYPE__NAME = eINSTANCE.getDataType_Name();

    /**
     * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_TYPE__FIELDS = eINSTANCE.getDataType_Fields();

    /**
     * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_TYPE__CONSTRAINTS = eINSTANCE.getDataType_Constraints();

    /**
     * The meta object literal for the '<em><b>Functions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_TYPE__FUNCTIONS = eINSTANCE.getDataType_Functions();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.dataModelDsl.impl.FieldImpl <em>Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.dataModelDsl.impl.FieldImpl
     * @see nl.dslmeinte.xtext.examples.dataModelDsl.impl.DataModelDslPackageImpl#getField()
     * @generated
     */
    EClass FIELD = eINSTANCE.getField();

    /**
     * The meta object literal for the '<em><b>Modifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD__MODIFIER = eINSTANCE.getField_Modifier();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD__TYPE = eINSTANCE.getField_Type();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.dataModelDsl.impl.EnumerationImpl <em>Enumeration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.dataModelDsl.impl.EnumerationImpl
     * @see nl.dslmeinte.xtext.examples.dataModelDsl.impl.DataModelDslPackageImpl#getEnumeration()
     * @generated
     */
    EClass ENUMERATION = eINSTANCE.getEnumeration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUMERATION__NAME = eINSTANCE.getEnumeration_Name();

    /**
     * The meta object literal for the '<em><b>Literals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUMERATION__LITERALS = eINSTANCE.getEnumeration_Literals();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.dataModelDsl.impl.EnumLiteralImpl <em>Enum Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.dataModelDsl.impl.EnumLiteralImpl
     * @see nl.dslmeinte.xtext.examples.dataModelDsl.impl.DataModelDslPackageImpl#getEnumLiteral()
     * @generated
     */
    EClass ENUM_LITERAL = eINSTANCE.getEnumLiteral();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM_LITERAL__NAME = eINSTANCE.getEnumLiteral_Name();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.dataModelDsl.impl.EntityImpl <em>Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.dataModelDsl.impl.EntityImpl
     * @see nl.dslmeinte.xtext.examples.dataModelDsl.impl.DataModelDslPackageImpl#getEntity()
     * @generated
     */
    EClass ENTITY = eINSTANCE.getEntity();

    /**
     * The meta object literal for the '<em><b>Transient</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTITY__TRANSIENT = eINSTANCE.getEntity_Transient();

    /**
     * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTITY__ABSTRACT = eINSTANCE.getEntity_Abstract();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTITY__NAME = eINSTANCE.getEntity_Name();

    /**
     * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__SUPER_TYPE = eINSTANCE.getEntity_SuperType();

    /**
     * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__FIELDS = eINSTANCE.getEntity_Fields();

    /**
     * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__CONSTRAINTS = eINSTANCE.getEntity_Constraints();

    /**
     * The meta object literal for the '<em><b>Functions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__FUNCTIONS = eINSTANCE.getEntity_Functions();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.dataModelDsl.impl.ConstraintImpl <em>Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.dataModelDsl.impl.ConstraintImpl
     * @see nl.dslmeinte.xtext.examples.dataModelDsl.impl.DataModelDslPackageImpl#getConstraint()
     * @generated
     */
    EClass CONSTRAINT = eINSTANCE.getConstraint();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTRAINT__NAME = eINSTANCE.getConstraint_Name();

    /**
     * The meta object literal for the '<em><b>Slots</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRAINT__SLOTS = eINSTANCE.getConstraint_Slots();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.dataModelDsl.impl.UsageImpl <em>Usage</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.dataModelDsl.impl.UsageImpl
     * @see nl.dslmeinte.xtext.examples.dataModelDsl.impl.DataModelDslPackageImpl#getUsage()
     * @generated
     */
    EClass USAGE = eINSTANCE.getUsage();

    /**
     * The meta object literal for the '<em><b>Field</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USAGE__FIELD = eINSTANCE.getUsage_Field();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.dataModelDsl.impl.FunctionImpl <em>Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.dataModelDsl.impl.FunctionImpl
     * @see nl.dslmeinte.xtext.examples.dataModelDsl.impl.DataModelDslPackageImpl#getFunction()
     * @generated
     */
    EClass FUNCTION = eINSTANCE.getFunction();

    /**
     * The meta object literal for the '<em><b>Return Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__RETURN_TYPE = eINSTANCE.getFunction_ReturnType();

    /**
     * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__ARGUMENTS = eINSTANCE.getFunction_Arguments();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.dataModelDsl.impl.ArgumentImpl <em>Argument</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.dataModelDsl.impl.ArgumentImpl
     * @see nl.dslmeinte.xtext.examples.dataModelDsl.impl.DataModelDslPackageImpl#getArgument()
     * @generated
     */
    EClass ARGUMENT = eINSTANCE.getArgument();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARGUMENT__TYPE = eINSTANCE.getArgument_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARGUMENT__NAME = eINSTANCE.getArgument_Name();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.dataModelDsl.impl.SimpleTypeImpl <em>Simple Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.dataModelDsl.impl.SimpleTypeImpl
     * @see nl.dslmeinte.xtext.examples.dataModelDsl.impl.DataModelDslPackageImpl#getSimpleType()
     * @generated
     */
    EClass SIMPLE_TYPE = eINSTANCE.getSimpleType();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.dataModelDsl.impl.FeatureImpl <em>Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.dataModelDsl.impl.FeatureImpl
     * @see nl.dslmeinte.xtext.examples.dataModelDsl.impl.DataModelDslPackageImpl#getFeature()
     * @generated
     */
    EClass FEATURE = eINSTANCE.getFeature();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE__NAME = eINSTANCE.getFeature_Name();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.dataModelDsl.MetaPrimitiveType <em>Meta Primitive Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.dataModelDsl.MetaPrimitiveType
     * @see nl.dslmeinte.xtext.examples.dataModelDsl.impl.DataModelDslPackageImpl#getMetaPrimitiveType()
     * @generated
     */
    EEnum META_PRIMITIVE_TYPE = eINSTANCE.getMetaPrimitiveType();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.dataModelDsl.Modifier <em>Modifier</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.dataModelDsl.Modifier
     * @see nl.dslmeinte.xtext.examples.dataModelDsl.impl.DataModelDslPackageImpl#getModifier()
     * @generated
     */
    EEnum MODIFIER = eINSTANCE.getModifier();

  }

} //DataModelDslPackage
