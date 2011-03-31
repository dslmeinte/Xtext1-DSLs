/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.examples.wsdlLanguage;

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
 * @see nl.dslmeinte.xtext.examples.wsdlLanguage.WsdlLanguageFactory
 * @model kind="package"
 * @generated
 */
public interface WsdlLanguagePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "wsdlLanguage";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.dslmeinte.nl/xtext/examples/WsdlLanguage";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "wsdlLanguage";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  WsdlLanguagePackage eINSTANCE = nl.dslmeinte.xtext.examples.wsdlLanguage.impl.WsdlLanguagePackageImpl.init();

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.impl.DefinitionsImpl <em>Definitions</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.impl.DefinitionsImpl
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.impl.WsdlLanguagePackageImpl#getDefinitions()
   * @generated
   */
  int DEFINITIONS = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITIONS__NAME = 0;

  /**
   * The feature id for the '<em><b>Ns Uri</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITIONS__NS_URI = 1;

  /**
   * The feature id for the '<em><b>Xsd Import</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITIONS__XSD_IMPORT = 2;

  /**
   * The feature id for the '<em><b>Messages</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITIONS__MESSAGES = 3;

  /**
   * The feature id for the '<em><b>Port Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITIONS__PORT_TYPES = 4;

  /**
   * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITIONS__BINDINGS = 5;

  /**
   * The feature id for the '<em><b>Services</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITIONS__SERVICES = 6;

  /**
   * The number of structural features of the '<em>Definitions</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITIONS_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.impl.XsdImportImpl <em>Xsd Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.impl.XsdImportImpl
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.impl.WsdlLanguagePackageImpl#getXsdImport()
   * @generated
   */
  int XSD_IMPORT = 1;

  /**
   * The feature id for the '<em><b>Import URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XSD_IMPORT__IMPORT_URI = 0;

  /**
   * The feature id for the '<em><b>Ns Prefix</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XSD_IMPORT__NS_PREFIX = 1;

  /**
   * The number of structural features of the '<em>Xsd Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XSD_IMPORT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.impl.MessageImpl <em>Message</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.impl.MessageImpl
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.impl.WsdlLanguagePackageImpl#getMessage()
   * @generated
   */
  int MESSAGE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE__NAME = 0;

  /**
   * The feature id for the '<em><b>Parts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE__PARTS = 1;

  /**
   * The number of structural features of the '<em>Message</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.impl.PartImpl <em>Part</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.impl.PartImpl
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.impl.WsdlLanguagePackageImpl#getPart()
   * @generated
   */
  int PART = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART__NAME = 0;

  /**
   * The feature id for the '<em><b>Def</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART__DEF = 1;

  /**
   * The number of structural features of the '<em>Part</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.impl.PortTypeImpl <em>Port Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.impl.PortTypeImpl
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.impl.WsdlLanguagePackageImpl#getPortType()
   * @generated
   */
  int PORT_TYPE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT_TYPE__NAME = 0;

  /**
   * The feature id for the '<em><b>Operations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT_TYPE__OPERATIONS = 1;

  /**
   * The number of structural features of the '<em>Port Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT_TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.impl.OperationImpl <em>Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.impl.OperationImpl
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.impl.WsdlLanguagePackageImpl#getOperation()
   * @generated
   */
  int OPERATION = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__NAME = 0;

  /**
   * The number of structural features of the '<em>Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.impl.OneWayOperationImpl <em>One Way Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.impl.OneWayOperationImpl
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.impl.WsdlLanguagePackageImpl#getOneWayOperation()
   * @generated
   */
  int ONE_WAY_OPERATION = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_WAY_OPERATION__NAME = OPERATION__NAME;

  /**
   * The feature id for the '<em><b>Input</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_WAY_OPERATION__INPUT = OPERATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>One Way Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_WAY_OPERATION_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.impl.RequestResponseOperationImpl <em>Request Response Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.impl.RequestResponseOperationImpl
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.impl.WsdlLanguagePackageImpl#getRequestResponseOperation()
   * @generated
   */
  int REQUEST_RESPONSE_OPERATION = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUEST_RESPONSE_OPERATION__NAME = OPERATION__NAME;

  /**
   * The feature id for the '<em><b>Input</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUEST_RESPONSE_OPERATION__INPUT = OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Output</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUEST_RESPONSE_OPERATION__OUTPUT = OPERATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Request Response Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUEST_RESPONSE_OPERATION_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.impl.SolicitResponseOperationImpl <em>Solicit Response Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.impl.SolicitResponseOperationImpl
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.impl.WsdlLanguagePackageImpl#getSolicitResponseOperation()
   * @generated
   */
  int SOLICIT_RESPONSE_OPERATION = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOLICIT_RESPONSE_OPERATION__NAME = OPERATION__NAME;

  /**
   * The feature id for the '<em><b>Input</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOLICIT_RESPONSE_OPERATION__INPUT = OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Output</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOLICIT_RESPONSE_OPERATION__OUTPUT = OPERATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Solicit Response Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOLICIT_RESPONSE_OPERATION_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.impl.NotificationOperationImpl <em>Notification Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.impl.NotificationOperationImpl
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.impl.WsdlLanguagePackageImpl#getNotificationOperation()
   * @generated
   */
  int NOTIFICATION_OPERATION = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOTIFICATION_OPERATION__NAME = OPERATION__NAME;

  /**
   * The feature id for the '<em><b>Output</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOTIFICATION_OPERATION__OUTPUT = OPERATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Notification Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOTIFICATION_OPERATION_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.impl.BindingImpl <em>Binding</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.impl.BindingImpl
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.impl.WsdlLanguagePackageImpl#getBinding()
   * @generated
   */
  int BINDING = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING__TYPE = 1;

  /**
   * The feature id for the '<em><b>Transport</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING__TRANSPORT = 2;

  /**
   * The number of structural features of the '<em>Binding</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.impl.TransportImpl <em>Transport</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.impl.TransportImpl
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.impl.WsdlLanguagePackageImpl#getTransport()
   * @generated
   */
  int TRANSPORT = 11;

  /**
   * The number of structural features of the '<em>Transport</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSPORT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.impl.SoapTransportImpl <em>Soap Transport</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.impl.SoapTransportImpl
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.impl.WsdlLanguagePackageImpl#getSoapTransport()
   * @generated
   */
  int SOAP_TRANSPORT = 12;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOAP_TRANSPORT__TYPE = TRANSPORT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Soap Transport</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOAP_TRANSPORT_FEATURE_COUNT = TRANSPORT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.impl.HttpTransportImpl <em>Http Transport</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.impl.HttpTransportImpl
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.impl.WsdlLanguagePackageImpl#getHttpTransport()
   * @generated
   */
  int HTTP_TRANSPORT = 13;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTTP_TRANSPORT__TYPE = TRANSPORT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Http Transport</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTTP_TRANSPORT_FEATURE_COUNT = TRANSPORT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.impl.ServiceImpl <em>Service</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.impl.ServiceImpl
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.impl.WsdlLanguagePackageImpl#getService()
   * @generated
   */
  int SERVICE = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__NAME = 0;

  /**
   * The feature id for the '<em><b>Documentation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__DOCUMENTATION = 1;

  /**
   * The feature id for the '<em><b>Ports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__PORTS = 2;

  /**
   * The number of structural features of the '<em>Service</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.impl.PortImpl <em>Port</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.impl.PortImpl
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.impl.WsdlLanguagePackageImpl#getPort()
   * @generated
   */
  int PORT = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT__NAME = 0;

  /**
   * The feature id for the '<em><b>Binding</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT__BINDING = 1;

  /**
   * The feature id for the '<em><b>Location</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT__LOCATION = 2;

  /**
   * The number of structural features of the '<em>Port</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.SoapType <em>Soap Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.SoapType
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.impl.WsdlLanguagePackageImpl#getSoapType()
   * @generated
   */
  int SOAP_TYPE = 16;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.HttpType <em>Http Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.HttpType
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.impl.WsdlLanguagePackageImpl#getHttpType()
   * @generated
   */
  int HTTP_TYPE = 17;


  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.Definitions <em>Definitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Definitions</em>'.
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.Definitions
   * @generated
   */
  EClass getDefinitions();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.Definitions#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.Definitions#getName()
   * @see #getDefinitions()
   * @generated
   */
  EAttribute getDefinitions_Name();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.Definitions#getNsUri <em>Ns Uri</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ns Uri</em>'.
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.Definitions#getNsUri()
   * @see #getDefinitions()
   * @generated
   */
  EAttribute getDefinitions_NsUri();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.Definitions#getXsdImport <em>Xsd Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Xsd Import</em>'.
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.Definitions#getXsdImport()
   * @see #getDefinitions()
   * @generated
   */
  EReference getDefinitions_XsdImport();

  /**
   * Returns the meta object for the containment reference list '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.Definitions#getMessages <em>Messages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Messages</em>'.
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.Definitions#getMessages()
   * @see #getDefinitions()
   * @generated
   */
  EReference getDefinitions_Messages();

  /**
   * Returns the meta object for the containment reference list '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.Definitions#getPortTypes <em>Port Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Port Types</em>'.
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.Definitions#getPortTypes()
   * @see #getDefinitions()
   * @generated
   */
  EReference getDefinitions_PortTypes();

  /**
   * Returns the meta object for the containment reference list '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.Definitions#getBindings <em>Bindings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Bindings</em>'.
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.Definitions#getBindings()
   * @see #getDefinitions()
   * @generated
   */
  EReference getDefinitions_Bindings();

  /**
   * Returns the meta object for the containment reference list '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.Definitions#getServices <em>Services</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Services</em>'.
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.Definitions#getServices()
   * @see #getDefinitions()
   * @generated
   */
  EReference getDefinitions_Services();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.XsdImport <em>Xsd Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Xsd Import</em>'.
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.XsdImport
   * @generated
   */
  EClass getXsdImport();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.XsdImport#getImportURI <em>Import URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Import URI</em>'.
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.XsdImport#getImportURI()
   * @see #getXsdImport()
   * @generated
   */
  EAttribute getXsdImport_ImportURI();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.XsdImport#getNsPrefix <em>Ns Prefix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ns Prefix</em>'.
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.XsdImport#getNsPrefix()
   * @see #getXsdImport()
   * @generated
   */
  EAttribute getXsdImport_NsPrefix();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.Message <em>Message</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Message</em>'.
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.Message
   * @generated
   */
  EClass getMessage();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.Message#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.Message#getName()
   * @see #getMessage()
   * @generated
   */
  EAttribute getMessage_Name();

  /**
   * Returns the meta object for the containment reference list '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.Message#getParts <em>Parts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parts</em>'.
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.Message#getParts()
   * @see #getMessage()
   * @generated
   */
  EReference getMessage_Parts();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.Part <em>Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Part</em>'.
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.Part
   * @generated
   */
  EClass getPart();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.Part#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.Part#getName()
   * @see #getPart()
   * @generated
   */
  EAttribute getPart_Name();

  /**
   * Returns the meta object for the reference '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.Part#getDef <em>Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Def</em>'.
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.Part#getDef()
   * @see #getPart()
   * @generated
   */
  EReference getPart_Def();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.PortType <em>Port Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Port Type</em>'.
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.PortType
   * @generated
   */
  EClass getPortType();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.PortType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.PortType#getName()
   * @see #getPortType()
   * @generated
   */
  EAttribute getPortType_Name();

  /**
   * Returns the meta object for the containment reference list '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.PortType#getOperations <em>Operations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Operations</em>'.
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.PortType#getOperations()
   * @see #getPortType()
   * @generated
   */
  EReference getPortType_Operations();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.Operation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation</em>'.
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.Operation
   * @generated
   */
  EClass getOperation();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.Operation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.Operation#getName()
   * @see #getOperation()
   * @generated
   */
  EAttribute getOperation_Name();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.OneWayOperation <em>One Way Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>One Way Operation</em>'.
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.OneWayOperation
   * @generated
   */
  EClass getOneWayOperation();

  /**
   * Returns the meta object for the reference '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.OneWayOperation#getInput <em>Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Input</em>'.
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.OneWayOperation#getInput()
   * @see #getOneWayOperation()
   * @generated
   */
  EReference getOneWayOperation_Input();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.RequestResponseOperation <em>Request Response Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Request Response Operation</em>'.
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.RequestResponseOperation
   * @generated
   */
  EClass getRequestResponseOperation();

  /**
   * Returns the meta object for the reference '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.RequestResponseOperation#getInput <em>Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Input</em>'.
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.RequestResponseOperation#getInput()
   * @see #getRequestResponseOperation()
   * @generated
   */
  EReference getRequestResponseOperation_Input();

  /**
   * Returns the meta object for the reference '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.RequestResponseOperation#getOutput <em>Output</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Output</em>'.
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.RequestResponseOperation#getOutput()
   * @see #getRequestResponseOperation()
   * @generated
   */
  EReference getRequestResponseOperation_Output();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.SolicitResponseOperation <em>Solicit Response Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Solicit Response Operation</em>'.
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.SolicitResponseOperation
   * @generated
   */
  EClass getSolicitResponseOperation();

  /**
   * Returns the meta object for the reference '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.SolicitResponseOperation#getInput <em>Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Input</em>'.
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.SolicitResponseOperation#getInput()
   * @see #getSolicitResponseOperation()
   * @generated
   */
  EReference getSolicitResponseOperation_Input();

  /**
   * Returns the meta object for the reference '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.SolicitResponseOperation#getOutput <em>Output</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Output</em>'.
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.SolicitResponseOperation#getOutput()
   * @see #getSolicitResponseOperation()
   * @generated
   */
  EReference getSolicitResponseOperation_Output();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.NotificationOperation <em>Notification Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Notification Operation</em>'.
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.NotificationOperation
   * @generated
   */
  EClass getNotificationOperation();

  /**
   * Returns the meta object for the reference '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.NotificationOperation#getOutput <em>Output</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Output</em>'.
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.NotificationOperation#getOutput()
   * @see #getNotificationOperation()
   * @generated
   */
  EReference getNotificationOperation_Output();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.Binding <em>Binding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Binding</em>'.
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.Binding
   * @generated
   */
  EClass getBinding();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.Binding#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.Binding#getName()
   * @see #getBinding()
   * @generated
   */
  EAttribute getBinding_Name();

  /**
   * Returns the meta object for the reference '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.Binding#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.Binding#getType()
   * @see #getBinding()
   * @generated
   */
  EReference getBinding_Type();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.Binding#getTransport <em>Transport</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Transport</em>'.
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.Binding#getTransport()
   * @see #getBinding()
   * @generated
   */
  EReference getBinding_Transport();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.Transport <em>Transport</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transport</em>'.
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.Transport
   * @generated
   */
  EClass getTransport();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.SoapTransport <em>Soap Transport</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Soap Transport</em>'.
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.SoapTransport
   * @generated
   */
  EClass getSoapTransport();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.SoapTransport#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.SoapTransport#getType()
   * @see #getSoapTransport()
   * @generated
   */
  EAttribute getSoapTransport_Type();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.HttpTransport <em>Http Transport</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Http Transport</em>'.
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.HttpTransport
   * @generated
   */
  EClass getHttpTransport();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.HttpTransport#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.HttpTransport#getType()
   * @see #getHttpTransport()
   * @generated
   */
  EAttribute getHttpTransport_Type();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.Service <em>Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Service</em>'.
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.Service
   * @generated
   */
  EClass getService();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.Service#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.Service#getName()
   * @see #getService()
   * @generated
   */
  EAttribute getService_Name();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.Service#getDocumentation <em>Documentation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Documentation</em>'.
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.Service#getDocumentation()
   * @see #getService()
   * @generated
   */
  EAttribute getService_Documentation();

  /**
   * Returns the meta object for the containment reference list '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.Service#getPorts <em>Ports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ports</em>'.
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.Service#getPorts()
   * @see #getService()
   * @generated
   */
  EReference getService_Ports();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.Port <em>Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Port</em>'.
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.Port
   * @generated
   */
  EClass getPort();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.Port#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.Port#getName()
   * @see #getPort()
   * @generated
   */
  EAttribute getPort_Name();

  /**
   * Returns the meta object for the reference '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.Port#getBinding <em>Binding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Binding</em>'.
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.Port#getBinding()
   * @see #getPort()
   * @generated
   */
  EReference getPort_Binding();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.Port#getLocation <em>Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Location</em>'.
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.Port#getLocation()
   * @see #getPort()
   * @generated
   */
  EAttribute getPort_Location();

  /**
   * Returns the meta object for enum '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.SoapType <em>Soap Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Soap Type</em>'.
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.SoapType
   * @generated
   */
  EEnum getSoapType();

  /**
   * Returns the meta object for enum '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.HttpType <em>Http Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Http Type</em>'.
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.HttpType
   * @generated
   */
  EEnum getHttpType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  WsdlLanguageFactory getWsdlLanguageFactory();

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
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.impl.DefinitionsImpl <em>Definitions</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.wsdlLanguage.impl.DefinitionsImpl
     * @see nl.dslmeinte.xtext.examples.wsdlLanguage.impl.WsdlLanguagePackageImpl#getDefinitions()
     * @generated
     */
    EClass DEFINITIONS = eINSTANCE.getDefinitions();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEFINITIONS__NAME = eINSTANCE.getDefinitions_Name();

    /**
     * The meta object literal for the '<em><b>Ns Uri</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEFINITIONS__NS_URI = eINSTANCE.getDefinitions_NsUri();

    /**
     * The meta object literal for the '<em><b>Xsd Import</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEFINITIONS__XSD_IMPORT = eINSTANCE.getDefinitions_XsdImport();

    /**
     * The meta object literal for the '<em><b>Messages</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEFINITIONS__MESSAGES = eINSTANCE.getDefinitions_Messages();

    /**
     * The meta object literal for the '<em><b>Port Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEFINITIONS__PORT_TYPES = eINSTANCE.getDefinitions_PortTypes();

    /**
     * The meta object literal for the '<em><b>Bindings</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEFINITIONS__BINDINGS = eINSTANCE.getDefinitions_Bindings();

    /**
     * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEFINITIONS__SERVICES = eINSTANCE.getDefinitions_Services();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.impl.XsdImportImpl <em>Xsd Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.wsdlLanguage.impl.XsdImportImpl
     * @see nl.dslmeinte.xtext.examples.wsdlLanguage.impl.WsdlLanguagePackageImpl#getXsdImport()
     * @generated
     */
    EClass XSD_IMPORT = eINSTANCE.getXsdImport();

    /**
     * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XSD_IMPORT__IMPORT_URI = eINSTANCE.getXsdImport_ImportURI();

    /**
     * The meta object literal for the '<em><b>Ns Prefix</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XSD_IMPORT__NS_PREFIX = eINSTANCE.getXsdImport_NsPrefix();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.impl.MessageImpl <em>Message</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.wsdlLanguage.impl.MessageImpl
     * @see nl.dslmeinte.xtext.examples.wsdlLanguage.impl.WsdlLanguagePackageImpl#getMessage()
     * @generated
     */
    EClass MESSAGE = eINSTANCE.getMessage();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MESSAGE__NAME = eINSTANCE.getMessage_Name();

    /**
     * The meta object literal for the '<em><b>Parts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MESSAGE__PARTS = eINSTANCE.getMessage_Parts();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.impl.PartImpl <em>Part</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.wsdlLanguage.impl.PartImpl
     * @see nl.dslmeinte.xtext.examples.wsdlLanguage.impl.WsdlLanguagePackageImpl#getPart()
     * @generated
     */
    EClass PART = eINSTANCE.getPart();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PART__NAME = eINSTANCE.getPart_Name();

    /**
     * The meta object literal for the '<em><b>Def</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PART__DEF = eINSTANCE.getPart_Def();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.impl.PortTypeImpl <em>Port Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.wsdlLanguage.impl.PortTypeImpl
     * @see nl.dslmeinte.xtext.examples.wsdlLanguage.impl.WsdlLanguagePackageImpl#getPortType()
     * @generated
     */
    EClass PORT_TYPE = eINSTANCE.getPortType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PORT_TYPE__NAME = eINSTANCE.getPortType_Name();

    /**
     * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PORT_TYPE__OPERATIONS = eINSTANCE.getPortType_Operations();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.impl.OperationImpl <em>Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.wsdlLanguage.impl.OperationImpl
     * @see nl.dslmeinte.xtext.examples.wsdlLanguage.impl.WsdlLanguagePackageImpl#getOperation()
     * @generated
     */
    EClass OPERATION = eINSTANCE.getOperation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATION__NAME = eINSTANCE.getOperation_Name();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.impl.OneWayOperationImpl <em>One Way Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.wsdlLanguage.impl.OneWayOperationImpl
     * @see nl.dslmeinte.xtext.examples.wsdlLanguage.impl.WsdlLanguagePackageImpl#getOneWayOperation()
     * @generated
     */
    EClass ONE_WAY_OPERATION = eINSTANCE.getOneWayOperation();

    /**
     * The meta object literal for the '<em><b>Input</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ONE_WAY_OPERATION__INPUT = eINSTANCE.getOneWayOperation_Input();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.impl.RequestResponseOperationImpl <em>Request Response Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.wsdlLanguage.impl.RequestResponseOperationImpl
     * @see nl.dslmeinte.xtext.examples.wsdlLanguage.impl.WsdlLanguagePackageImpl#getRequestResponseOperation()
     * @generated
     */
    EClass REQUEST_RESPONSE_OPERATION = eINSTANCE.getRequestResponseOperation();

    /**
     * The meta object literal for the '<em><b>Input</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUEST_RESPONSE_OPERATION__INPUT = eINSTANCE.getRequestResponseOperation_Input();

    /**
     * The meta object literal for the '<em><b>Output</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUEST_RESPONSE_OPERATION__OUTPUT = eINSTANCE.getRequestResponseOperation_Output();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.impl.SolicitResponseOperationImpl <em>Solicit Response Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.wsdlLanguage.impl.SolicitResponseOperationImpl
     * @see nl.dslmeinte.xtext.examples.wsdlLanguage.impl.WsdlLanguagePackageImpl#getSolicitResponseOperation()
     * @generated
     */
    EClass SOLICIT_RESPONSE_OPERATION = eINSTANCE.getSolicitResponseOperation();

    /**
     * The meta object literal for the '<em><b>Input</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SOLICIT_RESPONSE_OPERATION__INPUT = eINSTANCE.getSolicitResponseOperation_Input();

    /**
     * The meta object literal for the '<em><b>Output</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SOLICIT_RESPONSE_OPERATION__OUTPUT = eINSTANCE.getSolicitResponseOperation_Output();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.impl.NotificationOperationImpl <em>Notification Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.wsdlLanguage.impl.NotificationOperationImpl
     * @see nl.dslmeinte.xtext.examples.wsdlLanguage.impl.WsdlLanguagePackageImpl#getNotificationOperation()
     * @generated
     */
    EClass NOTIFICATION_OPERATION = eINSTANCE.getNotificationOperation();

    /**
     * The meta object literal for the '<em><b>Output</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NOTIFICATION_OPERATION__OUTPUT = eINSTANCE.getNotificationOperation_Output();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.impl.BindingImpl <em>Binding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.wsdlLanguage.impl.BindingImpl
     * @see nl.dslmeinte.xtext.examples.wsdlLanguage.impl.WsdlLanguagePackageImpl#getBinding()
     * @generated
     */
    EClass BINDING = eINSTANCE.getBinding();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BINDING__NAME = eINSTANCE.getBinding_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINDING__TYPE = eINSTANCE.getBinding_Type();

    /**
     * The meta object literal for the '<em><b>Transport</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINDING__TRANSPORT = eINSTANCE.getBinding_Transport();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.impl.TransportImpl <em>Transport</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.wsdlLanguage.impl.TransportImpl
     * @see nl.dslmeinte.xtext.examples.wsdlLanguage.impl.WsdlLanguagePackageImpl#getTransport()
     * @generated
     */
    EClass TRANSPORT = eINSTANCE.getTransport();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.impl.SoapTransportImpl <em>Soap Transport</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.wsdlLanguage.impl.SoapTransportImpl
     * @see nl.dslmeinte.xtext.examples.wsdlLanguage.impl.WsdlLanguagePackageImpl#getSoapTransport()
     * @generated
     */
    EClass SOAP_TRANSPORT = eINSTANCE.getSoapTransport();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SOAP_TRANSPORT__TYPE = eINSTANCE.getSoapTransport_Type();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.impl.HttpTransportImpl <em>Http Transport</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.wsdlLanguage.impl.HttpTransportImpl
     * @see nl.dslmeinte.xtext.examples.wsdlLanguage.impl.WsdlLanguagePackageImpl#getHttpTransport()
     * @generated
     */
    EClass HTTP_TRANSPORT = eINSTANCE.getHttpTransport();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HTTP_TRANSPORT__TYPE = eINSTANCE.getHttpTransport_Type();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.impl.ServiceImpl <em>Service</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.wsdlLanguage.impl.ServiceImpl
     * @see nl.dslmeinte.xtext.examples.wsdlLanguage.impl.WsdlLanguagePackageImpl#getService()
     * @generated
     */
    EClass SERVICE = eINSTANCE.getService();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVICE__NAME = eINSTANCE.getService_Name();

    /**
     * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVICE__DOCUMENTATION = eINSTANCE.getService_Documentation();

    /**
     * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE__PORTS = eINSTANCE.getService_Ports();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.impl.PortImpl <em>Port</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.wsdlLanguage.impl.PortImpl
     * @see nl.dslmeinte.xtext.examples.wsdlLanguage.impl.WsdlLanguagePackageImpl#getPort()
     * @generated
     */
    EClass PORT = eINSTANCE.getPort();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PORT__NAME = eINSTANCE.getPort_Name();

    /**
     * The meta object literal for the '<em><b>Binding</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PORT__BINDING = eINSTANCE.getPort_Binding();

    /**
     * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PORT__LOCATION = eINSTANCE.getPort_Location();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.SoapType <em>Soap Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.wsdlLanguage.SoapType
     * @see nl.dslmeinte.xtext.examples.wsdlLanguage.impl.WsdlLanguagePackageImpl#getSoapType()
     * @generated
     */
    EEnum SOAP_TYPE = eINSTANCE.getSoapType();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.HttpType <em>Http Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.examples.wsdlLanguage.HttpType
     * @see nl.dslmeinte.xtext.examples.wsdlLanguage.impl.WsdlLanguagePackageImpl#getHttpType()
     * @generated
     */
    EEnum HTTP_TYPE = eINSTANCE.getHttpType();

  }

} //WsdlLanguagePackage
