
package br.ufpe.cin.if988;

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
@WebServiceClient(name = "CalcPlusPlusService", targetNamespace = "http://if988.cin.ufpe.br", wsdlLocation = "http://localhost:8080/CalcAvancadaWS/services/CalcPlusPlus?wsdl")
public class CalcPlusPlusService
    extends Service
{

    private final static URL CALCPLUSPLUSSERVICE_WSDL_LOCATION;
    private final static WebServiceException CALCPLUSPLUSSERVICE_EXCEPTION;
    private final static QName CALCPLUSPLUSSERVICE_QNAME = new QName("http://if988.cin.ufpe.br", "CalcPlusPlusService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/CalcAvancadaWS/services/CalcPlusPlus?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CALCPLUSPLUSSERVICE_WSDL_LOCATION = url;
        CALCPLUSPLUSSERVICE_EXCEPTION = e;
    }

    public CalcPlusPlusService() {
        super(__getWsdlLocation(), CALCPLUSPLUSSERVICE_QNAME);
    }

    public CalcPlusPlusService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CALCPLUSPLUSSERVICE_QNAME, features);
    }

    public CalcPlusPlusService(URL wsdlLocation) {
        super(wsdlLocation, CALCPLUSPLUSSERVICE_QNAME);
    }

    public CalcPlusPlusService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CALCPLUSPLUSSERVICE_QNAME, features);
    }

    public CalcPlusPlusService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CalcPlusPlusService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CalcPlusPlus
     */
    @WebEndpoint(name = "CalcPlusPlus")
    public CalcPlusPlus getCalcPlusPlus() {
        return super.getPort(new QName("http://if988.cin.ufpe.br", "CalcPlusPlus"), CalcPlusPlus.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CalcPlusPlus
     */
    @WebEndpoint(name = "CalcPlusPlus")
    public CalcPlusPlus getCalcPlusPlus(WebServiceFeature... features) {
        return super.getPort(new QName("http://if988.cin.ufpe.br", "CalcPlusPlus"), CalcPlusPlus.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CALCPLUSPLUSSERVICE_EXCEPTION!= null) {
            throw CALCPLUSPLUSSERVICE_EXCEPTION;
        }
        return CALCPLUSPLUSSERVICE_WSDL_LOCATION;
    }

}