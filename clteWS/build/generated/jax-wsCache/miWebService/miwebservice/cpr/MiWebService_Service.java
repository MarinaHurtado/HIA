
package miwebservice.cpr;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "miWebService", targetNamespace = "http://cpr.miwebservice/", wsdlLocation = "http://148.205.133.123:8080/miSitioWeb/miWebService?WSDL")
public class MiWebService_Service
    extends Service
{

    private final static URL MIWEBSERVICE_WSDL_LOCATION;
    private final static WebServiceException MIWEBSERVICE_EXCEPTION;
    private final static QName MIWEBSERVICE_QNAME = new QName("http://cpr.miwebservice/", "miWebService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://148.205.133.123:8080/miSitioWeb/miWebService?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MIWEBSERVICE_WSDL_LOCATION = url;
        MIWEBSERVICE_EXCEPTION = e;
    }

    public MiWebService_Service() {
        super(__getWsdlLocation(), MIWEBSERVICE_QNAME);
    }

    public MiWebService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), MIWEBSERVICE_QNAME, features);
    }

    public MiWebService_Service(URL wsdlLocation) {
        super(wsdlLocation, MIWEBSERVICE_QNAME);
    }

    public MiWebService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MIWEBSERVICE_QNAME, features);
    }

    public MiWebService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MiWebService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns MiWebService
     */
    @WebEndpoint(name = "miWebServicePort")
    public MiWebService getMiWebServicePort() {
        return super.getPort(new QName("http://cpr.miwebservice/", "miWebServicePort"), MiWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MiWebService
     */
    @WebEndpoint(name = "miWebServicePort")
    public MiWebService getMiWebServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://cpr.miwebservice/", "miWebServicePort"), MiWebService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MIWEBSERVICE_EXCEPTION!= null) {
            throw MIWEBSERVICE_EXCEPTION;
        }
        return MIWEBSERVICE_WSDL_LOCATION;
    }

}
