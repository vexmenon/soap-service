package com.ws.stub;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.18
 * 2019-05-07T11:46:52.224+05:30
 * Generated source version: 2.7.18
 * 
 */
@WebServiceClient(name = "ExternalReportWSSService", 
                  wsdlLocation = "https://egzv-test.fs.em2.oraclecloud.com/xmlpserver/services/ExternalReportWSSService?wsdl",
                  targetNamespace = "http://xmlns.oracle.com/oxp/service/PublicReportService") 
public class ExternalReportWSSService_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://xmlns.oracle.com/oxp/service/PublicReportService", "ExternalReportWSSService");
    public final static QName ExternalReportWSSService = new QName("http://xmlns.oracle.com/oxp/service/PublicReportService", "ExternalReportWSSService");
    static {
        URL url = null;
        try {
            url = new URL("https://egzv-test.fs.em2.oraclecloud.com/xmlpserver/services/ExternalReportWSSService?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ExternalReportWSSService_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "https://egzv-test.fs.em2.oraclecloud.com/xmlpserver/services/ExternalReportWSSService?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ExternalReportWSSService_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ExternalReportWSSService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ExternalReportWSSService_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ExternalReportWSSService_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ExternalReportWSSService_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ExternalReportWSSService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns ExternalReportWSSService
     */
    @WebEndpoint(name = "ExternalReportWSSService")
    public ExternalReportWSSService getExternalReportWSSService() {
        return super.getPort(ExternalReportWSSService, ExternalReportWSSService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ExternalReportWSSService
     */
    @WebEndpoint(name = "ExternalReportWSSService")
    public ExternalReportWSSService getExternalReportWSSService(WebServiceFeature... features) {
        return super.getPort(ExternalReportWSSService, ExternalReportWSSService.class, features);
    }

}
