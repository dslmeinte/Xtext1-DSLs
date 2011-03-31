/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.examples.wsdlLanguage.impl;

import nl.dslmeinte.xtext.examples.wsdlLanguage.*;

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
public class WsdlLanguageFactoryImpl extends EFactoryImpl implements WsdlLanguageFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static WsdlLanguageFactory init()
  {
    try
    {
      WsdlLanguageFactory theWsdlLanguageFactory = (WsdlLanguageFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.dslmeinte.nl/xtext/examples/WsdlLanguage"); 
      if (theWsdlLanguageFactory != null)
      {
        return theWsdlLanguageFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new WsdlLanguageFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WsdlLanguageFactoryImpl()
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
      case WsdlLanguagePackage.DEFINITIONS: return createDefinitions();
      case WsdlLanguagePackage.XSD_IMPORT: return createXsdImport();
      case WsdlLanguagePackage.MESSAGE: return createMessage();
      case WsdlLanguagePackage.PART: return createPart();
      case WsdlLanguagePackage.PORT_TYPE: return createPortType();
      case WsdlLanguagePackage.OPERATION: return createOperation();
      case WsdlLanguagePackage.ONE_WAY_OPERATION: return createOneWayOperation();
      case WsdlLanguagePackage.REQUEST_RESPONSE_OPERATION: return createRequestResponseOperation();
      case WsdlLanguagePackage.SOLICIT_RESPONSE_OPERATION: return createSolicitResponseOperation();
      case WsdlLanguagePackage.NOTIFICATION_OPERATION: return createNotificationOperation();
      case WsdlLanguagePackage.BINDING: return createBinding();
      case WsdlLanguagePackage.TRANSPORT: return createTransport();
      case WsdlLanguagePackage.SOAP_TRANSPORT: return createSoapTransport();
      case WsdlLanguagePackage.HTTP_TRANSPORT: return createHttpTransport();
      case WsdlLanguagePackage.SERVICE: return createService();
      case WsdlLanguagePackage.PORT: return createPort();
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
      case WsdlLanguagePackage.SOAP_TYPE:
        return createSoapTypeFromString(eDataType, initialValue);
      case WsdlLanguagePackage.HTTP_TYPE:
        return createHttpTypeFromString(eDataType, initialValue);
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
      case WsdlLanguagePackage.SOAP_TYPE:
        return convertSoapTypeToString(eDataType, instanceValue);
      case WsdlLanguagePackage.HTTP_TYPE:
        return convertHttpTypeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Definitions createDefinitions()
  {
    DefinitionsImpl definitions = new DefinitionsImpl();
    return definitions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XsdImport createXsdImport()
  {
    XsdImportImpl xsdImport = new XsdImportImpl();
    return xsdImport;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Message createMessage()
  {
    MessageImpl message = new MessageImpl();
    return message;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Part createPart()
  {
    PartImpl part = new PartImpl();
    return part;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PortType createPortType()
  {
    PortTypeImpl portType = new PortTypeImpl();
    return portType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operation createOperation()
  {
    OperationImpl operation = new OperationImpl();
    return operation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OneWayOperation createOneWayOperation()
  {
    OneWayOperationImpl oneWayOperation = new OneWayOperationImpl();
    return oneWayOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RequestResponseOperation createRequestResponseOperation()
  {
    RequestResponseOperationImpl requestResponseOperation = new RequestResponseOperationImpl();
    return requestResponseOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SolicitResponseOperation createSolicitResponseOperation()
  {
    SolicitResponseOperationImpl solicitResponseOperation = new SolicitResponseOperationImpl();
    return solicitResponseOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationOperation createNotificationOperation()
  {
    NotificationOperationImpl notificationOperation = new NotificationOperationImpl();
    return notificationOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Binding createBinding()
  {
    BindingImpl binding = new BindingImpl();
    return binding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Transport createTransport()
  {
    TransportImpl transport = new TransportImpl();
    return transport;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SoapTransport createSoapTransport()
  {
    SoapTransportImpl soapTransport = new SoapTransportImpl();
    return soapTransport;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HttpTransport createHttpTransport()
  {
    HttpTransportImpl httpTransport = new HttpTransportImpl();
    return httpTransport;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Service createService()
  {
    ServiceImpl service = new ServiceImpl();
    return service;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Port createPort()
  {
    PortImpl port = new PortImpl();
    return port;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SoapType createSoapTypeFromString(EDataType eDataType, String initialValue)
  {
    SoapType result = SoapType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertSoapTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HttpType createHttpTypeFromString(EDataType eDataType, String initialValue)
  {
    HttpType result = HttpType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertHttpTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WsdlLanguagePackage getWsdlLanguagePackage()
  {
    return (WsdlLanguagePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static WsdlLanguagePackage getPackage()
  {
    return WsdlLanguagePackage.eINSTANCE;
  }

} //WsdlLanguageFactoryImpl
