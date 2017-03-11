
package iac.opdracht1iac;

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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "average.WebService", targetNamespace = "http://iac/Opdracht1IAC", wsdlLocation = "file:/C:/Users/Chris/Desktop/ComponentDemo/Opdracht1IAC/src/main/java/averagecalc.wsdl")
public class AverageWebService
    extends Service
{

    private final static URL AVERAGEWEBSERVICE_WSDL_LOCATION;
    private final static WebServiceException AVERAGEWEBSERVICE_EXCEPTION;
    private final static QName AVERAGEWEBSERVICE_QNAME = new QName("http://iac/Opdracht1IAC", "average.WebService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/Users/Chris/Desktop/ComponentDemo/Opdracht1IAC/src/main/java/averagecalc.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        AVERAGEWEBSERVICE_WSDL_LOCATION = url;
        AVERAGEWEBSERVICE_EXCEPTION = e;
    }

    public AverageWebService() {
        super(__getWsdlLocation(), AVERAGEWEBSERVICE_QNAME);
    }

    public AverageWebService(WebServiceFeature... features) {
        super(__getWsdlLocation(), AVERAGEWEBSERVICE_QNAME, features);
    }

    public AverageWebService(URL wsdlLocation) {
        super(wsdlLocation, AVERAGEWEBSERVICE_QNAME);
    }

    public AverageWebService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, AVERAGEWEBSERVICE_QNAME, features);
    }

    public AverageWebService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AverageWebService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WSInterface
     */
    @WebEndpoint(name = "WS-Port")
    public WSInterface getWSPort() {
        return super.getPort(new QName("http://iac/Opdracht1IAC", "WS-Port"), WSInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WSInterface
     */
    @WebEndpoint(name = "WS-Port")
    public WSInterface getWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://iac/Opdracht1IAC", "WS-Port"), WSInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (AVERAGEWEBSERVICE_EXCEPTION!= null) {
            throw AVERAGEWEBSERVICE_EXCEPTION;
        }
        return AVERAGEWEBSERVICE_WSDL_LOCATION;
    }

}