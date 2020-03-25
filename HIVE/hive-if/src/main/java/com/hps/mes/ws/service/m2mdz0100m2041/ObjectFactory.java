
package com.hps.mes.ws.service.m2mdz0100m2041;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.hps.mes.ws.service.m2mdz0100m2041 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _M2MDZ0100M2041Req_QNAME = new QName("http://M2MDZ0100M2041.service.ws.mes.hps.com/", "M2MDZ0100M2041Req");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.hps.mes.ws.service.m2mdz0100m2041
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link M2MDZ0100M2041Req }
     * 
     */
    public M2MDZ0100M2041Req createM2MDZ0100M2041Req() {
        return new M2MDZ0100M2041Req();
    }

    /**
     * Create an instance of {@link INFMODLMATLINMDG }
     * 
     */
    public INFMODLMATLINMDG createINFMODLMATLINMDG() {
        return new INFMODLMATLINMDG();
    }

    /**
     * Create an instance of {@link INFMODLDESCINMDG }
     * 
     */
    public INFMODLDESCINMDG createINFMODLDESCINMDG() {
        return new INFMODLDESCINMDG();
    }

    /**
     * Create an instance of {@link INFMODLCLASSASGNINMDG }
     * 
     */
    public INFMODLCLASSASGNINMDG createINFMODLCLASSASGNINMDG() {
        return new INFMODLCLASSASGNINMDG();
    }

    /**
     * Create an instance of {@link INFMODLCHARASGNINMDG }
     * 
     */
    public INFMODLCHARASGNINMDG createINFMODLCHARASGNINMDG() {
        return new INFMODLCHARASGNINMDG();
    }

    /**
     * Create an instance of {@link INFMODLUNITINMDG }
     * 
     */
    public INFMODLUNITINMDG createINFMODLUNITINMDG() {
        return new INFMODLUNITINMDG();
    }

    /**
     * Create an instance of {@link INFMODLPLNTINMDG }
     * 
     */
    public INFMODLPLNTINMDG createINFMODLPLNTINMDG() {
        return new INFMODLPLNTINMDG();
    }

    /**
     * Create an instance of {@link INFMODLMEANINMDG }
     * 
     */
    public INFMODLMEANINMDG createINFMODLMEANINMDG() {
        return new INFMODLMEANINMDG();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link M2MDZ0100M2041Req }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link M2MDZ0100M2041Req }{@code >}
     */
    @XmlElementDecl(namespace = "http://M2MDZ0100M2041.service.ws.mes.hps.com/", name = "M2MDZ0100M2041Req")
    public JAXBElement<M2MDZ0100M2041Req> createM2MDZ0100M2041Req(M2MDZ0100M2041Req value) {
        return new JAXBElement<M2MDZ0100M2041Req>(_M2MDZ0100M2041Req_QNAME, M2MDZ0100M2041Req.class, null, value);
    }

}
