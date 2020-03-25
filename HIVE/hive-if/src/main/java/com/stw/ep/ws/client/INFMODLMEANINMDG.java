//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.11 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2020.03.18 시간 09:01:32 PM KST 
//


package com.stw.ep.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>INF_MODL_MEAN_IN_MDG complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="INF_MODL_MEAN_IN_MDG"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MEINH" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LFNUM" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="EAN11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EANTP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HPEAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "INF_MODL_MEAN_IN_MDG", propOrder = {
    "meinh",
    "lfnum",
    "ean11",
    "eantp",
    "hpean"
})
public class INFMODLMEANINMDG {

    @XmlElement(name = "MEINH", required = true)
    protected String meinh;
    @XmlElement(name = "LFNUM", required = true)
    protected String lfnum;
    @XmlElement(name = "EAN11")
    protected String ean11;
    @XmlElement(name = "EANTP")
    protected String eantp;
    @XmlElement(name = "HPEAN")
    protected String hpean;

    /**
     * meinh 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMEINH() {
        return meinh;
    }

    /**
     * meinh 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMEINH(String value) {
        this.meinh = value;
    }

    /**
     * lfnum 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLFNUM() {
        return lfnum;
    }

    /**
     * lfnum 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLFNUM(String value) {
        this.lfnum = value;
    }

    /**
     * ean11 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEAN11() {
        return ean11;
    }

    /**
     * ean11 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEAN11(String value) {
        this.ean11 = value;
    }

    /**
     * eantp 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEANTP() {
        return eantp;
    }

    /**
     * eantp 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEANTP(String value) {
        this.eantp = value;
    }

    /**
     * hpean 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHPEAN() {
        return hpean;
    }

    /**
     * hpean 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHPEAN(String value) {
        this.hpean = value;
    }

}
