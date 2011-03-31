/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.examples.wsdlLanguage.util;

import nl.dslmeinte.xtext.examples.wsdlLanguage.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see nl.dslmeinte.xtext.examples.wsdlLanguage.WsdlLanguagePackage
 * @generated
 */
public class WsdlLanguageAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static WsdlLanguagePackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WsdlLanguageAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = WsdlLanguagePackage.eINSTANCE;
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
  protected WsdlLanguageSwitch<Adapter> modelSwitch =
    new WsdlLanguageSwitch<Adapter>()
    {
      @Override
      public Adapter caseDefinitions(Definitions object)
      {
        return createDefinitionsAdapter();
      }
      @Override
      public Adapter caseXsdImport(XsdImport object)
      {
        return createXsdImportAdapter();
      }
      @Override
      public Adapter caseMessage(Message object)
      {
        return createMessageAdapter();
      }
      @Override
      public Adapter casePart(Part object)
      {
        return createPartAdapter();
      }
      @Override
      public Adapter casePortType(PortType object)
      {
        return createPortTypeAdapter();
      }
      @Override
      public Adapter caseOperation(Operation object)
      {
        return createOperationAdapter();
      }
      @Override
      public Adapter caseOneWayOperation(OneWayOperation object)
      {
        return createOneWayOperationAdapter();
      }
      @Override
      public Adapter caseRequestResponseOperation(RequestResponseOperation object)
      {
        return createRequestResponseOperationAdapter();
      }
      @Override
      public Adapter caseSolicitResponseOperation(SolicitResponseOperation object)
      {
        return createSolicitResponseOperationAdapter();
      }
      @Override
      public Adapter caseNotificationOperation(NotificationOperation object)
      {
        return createNotificationOperationAdapter();
      }
      @Override
      public Adapter caseBinding(Binding object)
      {
        return createBindingAdapter();
      }
      @Override
      public Adapter caseTransport(Transport object)
      {
        return createTransportAdapter();
      }
      @Override
      public Adapter caseSoapTransport(SoapTransport object)
      {
        return createSoapTransportAdapter();
      }
      @Override
      public Adapter caseHttpTransport(HttpTransport object)
      {
        return createHttpTransportAdapter();
      }
      @Override
      public Adapter caseService(Service object)
      {
        return createServiceAdapter();
      }
      @Override
      public Adapter casePort(Port object)
      {
        return createPortAdapter();
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
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.Definitions <em>Definitions</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.Definitions
   * @generated
   */
  public Adapter createDefinitionsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.XsdImport <em>Xsd Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.XsdImport
   * @generated
   */
  public Adapter createXsdImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.Message <em>Message</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.Message
   * @generated
   */
  public Adapter createMessageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.Part <em>Part</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.Part
   * @generated
   */
  public Adapter createPartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.PortType <em>Port Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.PortType
   * @generated
   */
  public Adapter createPortTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.Operation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.Operation
   * @generated
   */
  public Adapter createOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.OneWayOperation <em>One Way Operation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.OneWayOperation
   * @generated
   */
  public Adapter createOneWayOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.RequestResponseOperation <em>Request Response Operation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.RequestResponseOperation
   * @generated
   */
  public Adapter createRequestResponseOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.SolicitResponseOperation <em>Solicit Response Operation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.SolicitResponseOperation
   * @generated
   */
  public Adapter createSolicitResponseOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.NotificationOperation <em>Notification Operation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.NotificationOperation
   * @generated
   */
  public Adapter createNotificationOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.Binding <em>Binding</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.Binding
   * @generated
   */
  public Adapter createBindingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.Transport <em>Transport</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.Transport
   * @generated
   */
  public Adapter createTransportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.SoapTransport <em>Soap Transport</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.SoapTransport
   * @generated
   */
  public Adapter createSoapTransportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.HttpTransport <em>Http Transport</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.HttpTransport
   * @generated
   */
  public Adapter createHttpTransportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.Service <em>Service</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.Service
   * @generated
   */
  public Adapter createServiceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.examples.wsdlLanguage.Port <em>Port</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.examples.wsdlLanguage.Port
   * @generated
   */
  public Adapter createPortAdapter()
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

} //WsdlLanguageAdapterFactory
