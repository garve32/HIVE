//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.11 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2020.03.18 시간 09:01:32 PM KST 
//


package com.stw.ep.ws.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.stw.ep.ws.client package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.stw.ep.ws.client
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
     * Create an instance of {@link JAXBElement }{@code <}{@link M2MDZ0100M2041Req }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://M2MDZ0100M2041.service.ws.mes.hps.com/", name = "M2MDZ0100M2041Req")
    public JAXBElement<M2MDZ0100M2041Req> createM2MDZ0100M2041Req(M2MDZ0100M2041Req value) {
        return new JAXBElement<M2MDZ0100M2041Req>(_M2MDZ0100M2041Req_QNAME, M2MDZ0100M2041Req.class, null, value);
    }

}
