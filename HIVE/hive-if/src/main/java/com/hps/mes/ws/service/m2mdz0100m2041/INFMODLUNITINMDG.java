
package com.hps.mes.ws.service.m2mdz0100m2041;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>INF_MODL_UNIT_IN_MDG complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="INF_MODL_UNIT_IN_MDG"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MEINH" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="UMREZ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UMREN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LAENG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BREIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HOEHE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MEABM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VOLUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VOLEH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BRGEW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GEWEI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "INF_MODL_UNIT_IN_MDG", propOrder = {
    "meinh",
    "umrez",
    "umren",
    "laeng",
    "breit",
    "hoehe",
    "meabm",
    "volum",
    "voleh",
    "brgew",
    "gewei"
})
public class INFMODLUNITINMDG {

    @XmlElement(name = "MEINH", required = true)
    protected String meinh;
    @XmlElement(name = "UMREZ")
    protected String umrez;
    @XmlElement(name = "UMREN")
    protected String umren;
    @XmlElement(name = "LAENG")
    protected String laeng;
    @XmlElement(name = "BREIT")
    protected String breit;
    @XmlElement(name = "HOEHE")
    protected String hoehe;
    @XmlElement(name = "MEABM")
    protected String meabm;
    @XmlElement(name = "VOLUM")
    protected String volum;
    @XmlElement(name = "VOLEH")
    protected String voleh;
    @XmlElement(name = "BRGEW")
    protected String brgew;
    @XmlElement(name = "GEWEI")
    protected String gewei;

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
     * umrez 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUMREZ() {
        return umrez;
    }

    /**
     * umrez 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUMREZ(String value) {
        this.umrez = value;
    }

    /**
     * umren 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUMREN() {
        return umren;
    }

    /**
     * umren 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUMREN(String value) {
        this.umren = value;
    }

    /**
     * laeng 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLAENG() {
        return laeng;
    }

    /**
     * laeng 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLAENG(String value) {
        this.laeng = value;
    }

    /**
     * breit 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBREIT() {
        return breit;
    }

    /**
     * breit 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBREIT(String value) {
        this.breit = value;
    }

    /**
     * hoehe 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHOEHE() {
        return hoehe;
    }

    /**
     * hoehe 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHOEHE(String value) {
        this.hoehe = value;
    }

    /**
     * meabm 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMEABM() {
        return meabm;
    }

    /**
     * meabm 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMEABM(String value) {
        this.meabm = value;
    }

    /**
     * volum 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVOLUM() {
        return volum;
    }

    /**
     * volum 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVOLUM(String value) {
        this.volum = value;
    }

    /**
     * voleh 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVOLEH() {
        return voleh;
    }

    /**
     * voleh 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVOLEH(String value) {
        this.voleh = value;
    }

    /**
     * brgew 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBRGEW() {
        return brgew;
    }

    /**
     * brgew 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBRGEW(String value) {
        this.brgew = value;
    }

    /**
     * gewei 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGEWEI() {
        return gewei;
    }

    /**
     * gewei 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGEWEI(String value) {
        this.gewei = value;
    }

}
