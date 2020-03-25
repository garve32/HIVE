
package com.hps.mes.ws.service.m2mdz0100m2041;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>INF_MODL_CHARASGN_IN_MDG complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="INF_MODL_CHARASGN_IN_MDG"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CLASS" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="KLART" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ATNAM" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ATWRT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ATFLV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ATAWE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ATFLB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ATAW1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "INF_MODL_CHARASGN_IN_MDG", propOrder = {
    "_class",
    "klart",
    "atnam",
    "atwrt",
    "atflv",
    "atawe",
    "atflb",
    "ataw1"
})
public class INFMODLCHARASGNINMDG {

    @XmlElement(name = "CLASS", required = true)
    protected String _class;
    @XmlElement(name = "KLART", required = true)
    protected String klart;
    @XmlElement(name = "ATNAM", required = true)
    protected String atnam;
    @XmlElement(name = "ATWRT")
    protected String atwrt;
    @XmlElement(name = "ATFLV")
    protected String atflv;
    @XmlElement(name = "ATAWE")
    protected String atawe;
    @XmlElement(name = "ATFLB")
    protected String atflb;
    @XmlElement(name = "ATAW1")
    protected String ataw1;

    /**
     * class 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLASS() {
        return _class;
    }

    /**
     * class 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLASS(String value) {
        this._class = value;
    }

    /**
     * klart 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKLART() {
        return klart;
    }

    /**
     * klart 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKLART(String value) {
        this.klart = value;
    }

    /**
     * atnam 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATNAM() {
        return atnam;
    }

    /**
     * atnam 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATNAM(String value) {
        this.atnam = value;
    }

    /**
     * atwrt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATWRT() {
        return atwrt;
    }

    /**
     * atwrt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATWRT(String value) {
        this.atwrt = value;
    }

    /**
     * atflv 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATFLV() {
        return atflv;
    }

    /**
     * atflv 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATFLV(String value) {
        this.atflv = value;
    }

    /**
     * atawe 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATAWE() {
        return atawe;
    }

    /**
     * atawe 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATAWE(String value) {
        this.atawe = value;
    }

    /**
     * atflb 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATFLB() {
        return atflb;
    }

    /**
     * atflb 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATFLB(String value) {
        this.atflb = value;
    }

    /**
     * ataw1 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATAW1() {
        return ataw1;
    }

    /**
     * ataw1 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATAW1(String value) {
        this.ataw1 = value;
    }

}
