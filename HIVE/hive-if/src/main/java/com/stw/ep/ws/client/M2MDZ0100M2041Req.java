//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.11 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2020.03.18 시간 09:01:32 PM KST 
//


package com.stw.ep.ws.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>m2MDZ0100M2041Req complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="m2MDZ0100M2041Req"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="INF_MODL_MATL_IN_MDG" type="{http://M2MDZ0100M2041.service.ws.mes.hps.com/}INF_MODL_MATL_IN_MDG" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "m2MDZ0100M2041Req", propOrder = {
    "infmodlmatlinmdg"
})
public class M2MDZ0100M2041Req {

    @XmlElement(name = "INF_MODL_MATL_IN_MDG")
    protected List<INFMODLMATLINMDG> infmodlmatlinmdg;

    /**
     * Gets the value of the infmodlmatlinmdg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the infmodlmatlinmdg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getINFMODLMATLINMDG().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link INFMODLMATLINMDG }
     * 
     * 
     */
    public List<INFMODLMATLINMDG> getINFMODLMATLINMDG() {
        if (infmodlmatlinmdg == null) {
            infmodlmatlinmdg = new ArrayList<INFMODLMATLINMDG>();
        }
        return this.infmodlmatlinmdg;
    }

}
