package com.hps.mes.ws.service.m2mdz0100m2041;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.3.5
 * 2020-03-30T09:55:23.108+09:00
 * Generated source version: 3.3.5
 *
 */
@WebServiceClient(name = "M2MDZ0100M2041Service",
                  wsdlLocation = "classpath:wsdl/*.wsdl",
                  targetNamespace = "http://M2MDZ0100M2041.service.ws.mes.hps.com/")
public class M2MDZ0100M2041Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://M2MDZ0100M2041.service.ws.mes.hps.com/", "M2MDZ0100M2041Service");
    public final static QName M2MDZ0100M2041Port = new QName("http://M2MDZ0100M2041.service.ws.mes.hps.com/", "M2MDZ0100M2041Port");
    static {
        URL url = M2MDZ0100M2041Service.class.getClassLoader().getResource("wsdl/*.wsdl");
        if (url == null) {
            java.util.logging.Logger.getLogger(M2MDZ0100M2041Service.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "classpath:wsdl/*.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public M2MDZ0100M2041Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public M2MDZ0100M2041Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public M2MDZ0100M2041Service() {
        super(WSDL_LOCATION, SERVICE);
    }

    public M2MDZ0100M2041Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public M2MDZ0100M2041Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public M2MDZ0100M2041Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns M2MDZ0100M2041
     */
    @WebEndpoint(name = "M2MDZ0100M2041Port")
    public M2MDZ0100M2041 getM2MDZ0100M2041Port() {
        return super.getPort(M2MDZ0100M2041Port, M2MDZ0100M2041.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns M2MDZ0100M2041
     */
    @WebEndpoint(name = "M2MDZ0100M2041Port")
    public M2MDZ0100M2041 getM2MDZ0100M2041Port(WebServiceFeature... features) {
        return super.getPort(M2MDZ0100M2041Port, M2MDZ0100M2041.class, features);
    }

}
