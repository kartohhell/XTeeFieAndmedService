
package eu.x_road.emta_v6;

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
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "webService", targetNamespace = "http://emta-v6.x-road.eu", wsdlLocation = "file:/C:/Users/Rasmus/Documents/xTeeFieAndmed/mavenproject1/src/wsdl/services.wsdl")
public class WebService
    extends Service
{

    private final static URL WEBSERVICE_WSDL_LOCATION;
    private final static WebServiceException WEBSERVICE_EXCEPTION;
    private final static QName WEBSERVICE_QNAME = new QName("http://emta-v6.x-road.eu", "webService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/Users/Rasmus/Documents/xTeeFieAndmed/mavenproject1/src/wsdl/services.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WEBSERVICE_WSDL_LOCATION = url;
        WEBSERVICE_EXCEPTION = e;
    }

    public WebService() {
        super(__getWsdlLocation(), WEBSERVICE_QNAME);
    }

    public WebService(WebServiceFeature... features) {
        super(__getWsdlLocation(), WEBSERVICE_QNAME, features);
    }

    public WebService(URL wsdlLocation) {
        super(wsdlLocation, WEBSERVICE_QNAME);
    }

    public WebService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WEBSERVICE_QNAME, features);
    }

    public WebService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WebService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WebServiceInterface
     */
    @WebEndpoint(name = "port")
    public WebServiceInterface getPort() {
        return super.getPort(new QName("http://emta-v6.x-road.eu", "port"), WebServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WebServiceInterface
     */
    @WebEndpoint(name = "port")
    public WebServiceInterface getPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://emta-v6.x-road.eu", "port"), WebServiceInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WEBSERVICE_EXCEPTION!= null) {
            throw WEBSERVICE_EXCEPTION;
        }
        return WEBSERVICE_WSDL_LOCATION;
    }

}
