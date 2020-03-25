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
 * <p>INF_MODL_PLNT_IN_MDG complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="INF_MODL_PLNT_IN_MDG"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WERKS" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MMSTA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LVORM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MMSTD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ZZMTARP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ZZPRFLG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ZZREGDT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ZZREGTM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ZZREGUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ZZLAMDT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ZZLAMTM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ZZLAMUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ZZPDRDT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ZZSDRDT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ZZVDRDT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ZZRTSRDT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ZZSRARDT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ZZRTSCDT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ZZSRACDT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ZZACTDT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ZZBKLAS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "INF_MODL_PLNT_IN_MDG", propOrder = {
    "werks",
    "mmsta",
    "lvorm",
    "mmstd",
    "zzmtarp",
    "zzprflg",
    "zzregdt",
    "zzregtm",
    "zzregus",
    "zzlamdt",
    "zzlamtm",
    "zzlamus",
    "zzpdrdt",
    "zzsdrdt",
    "zzvdrdt",
    "zzrtsrdt",
    "zzsrardt",
    "zzrtscdt",
    "zzsracdt",
    "zzactdt",
    "zzbklas"
})
public class INFMODLPLNTINMDG {

    @XmlElement(name = "WERKS", required = true)
    protected String werks;
    @XmlElement(name = "MMSTA")
    protected String mmsta;
    @XmlElement(name = "LVORM")
    protected String lvorm;
    @XmlElement(name = "MMSTD")
    protected String mmstd;
    @XmlElement(name = "ZZMTARP")
    protected String zzmtarp;
    @XmlElement(name = "ZZPRFLG")
    protected String zzprflg;
    @XmlElement(name = "ZZREGDT")
    protected String zzregdt;
    @XmlElement(name = "ZZREGTM")
    protected String zzregtm;
    @XmlElement(name = "ZZREGUS")
    protected String zzregus;
    @XmlElement(name = "ZZLAMDT")
    protected String zzlamdt;
    @XmlElement(name = "ZZLAMTM")
    protected String zzlamtm;
    @XmlElement(name = "ZZLAMUS")
    protected String zzlamus;
    @XmlElement(name = "ZZPDRDT")
    protected String zzpdrdt;
    @XmlElement(name = "ZZSDRDT")
    protected String zzsdrdt;
    @XmlElement(name = "ZZVDRDT")
    protected String zzvdrdt;
    @XmlElement(name = "ZZRTSRDT")
    protected String zzrtsrdt;
    @XmlElement(name = "ZZSRARDT")
    protected String zzsrardt;
    @XmlElement(name = "ZZRTSCDT")
    protected String zzrtscdt;
    @XmlElement(name = "ZZSRACDT")
    protected String zzsracdt;
    @XmlElement(name = "ZZACTDT")
    protected String zzactdt;
    @XmlElement(name = "ZZBKLAS")
    protected String zzbklas;

    /**
     * werks 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWERKS() {
        return werks;
    }

    /**
     * werks 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWERKS(String value) {
        this.werks = value;
    }

    /**
     * mmsta 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMMSTA() {
        return mmsta;
    }

    /**
     * mmsta 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMMSTA(String value) {
        this.mmsta = value;
    }

    /**
     * lvorm 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLVORM() {
        return lvorm;
    }

    /**
     * lvorm 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLVORM(String value) {
        this.lvorm = value;
    }

    /**
     * mmstd 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMMSTD() {
        return mmstd;
    }

    /**
     * mmstd 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMMSTD(String value) {
        this.mmstd = value;
    }

    /**
     * zzmtarp 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZMTARP() {
        return zzmtarp;
    }

    /**
     * zzmtarp 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZMTARP(String value) {
        this.zzmtarp = value;
    }

    /**
     * zzprflg 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZPRFLG() {
        return zzprflg;
    }

    /**
     * zzprflg 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZPRFLG(String value) {
        this.zzprflg = value;
    }

    /**
     * zzregdt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZREGDT() {
        return zzregdt;
    }

    /**
     * zzregdt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZREGDT(String value) {
        this.zzregdt = value;
    }

    /**
     * zzregtm 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZREGTM() {
        return zzregtm;
    }

    /**
     * zzregtm 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZREGTM(String value) {
        this.zzregtm = value;
    }

    /**
     * zzregus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZREGUS() {
        return zzregus;
    }

    /**
     * zzregus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZREGUS(String value) {
        this.zzregus = value;
    }

    /**
     * zzlamdt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZLAMDT() {
        return zzlamdt;
    }

    /**
     * zzlamdt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZLAMDT(String value) {
        this.zzlamdt = value;
    }

    /**
     * zzlamtm 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZLAMTM() {
        return zzlamtm;
    }

    /**
     * zzlamtm 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZLAMTM(String value) {
        this.zzlamtm = value;
    }

    /**
     * zzlamus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZLAMUS() {
        return zzlamus;
    }

    /**
     * zzlamus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZLAMUS(String value) {
        this.zzlamus = value;
    }

    /**
     * zzpdrdt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZPDRDT() {
        return zzpdrdt;
    }

    /**
     * zzpdrdt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZPDRDT(String value) {
        this.zzpdrdt = value;
    }

    /**
     * zzsdrdt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZSDRDT() {
        return zzsdrdt;
    }

    /**
     * zzsdrdt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZSDRDT(String value) {
        this.zzsdrdt = value;
    }

    /**
     * zzvdrdt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZVDRDT() {
        return zzvdrdt;
    }

    /**
     * zzvdrdt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZVDRDT(String value) {
        this.zzvdrdt = value;
    }

    /**
     * zzrtsrdt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZRTSRDT() {
        return zzrtsrdt;
    }

    /**
     * zzrtsrdt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZRTSRDT(String value) {
        this.zzrtsrdt = value;
    }

    /**
     * zzsrardt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZSRARDT() {
        return zzsrardt;
    }

    /**
     * zzsrardt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZSRARDT(String value) {
        this.zzsrardt = value;
    }

    /**
     * zzrtscdt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZRTSCDT() {
        return zzrtscdt;
    }

    /**
     * zzrtscdt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZRTSCDT(String value) {
        this.zzrtscdt = value;
    }

    /**
     * zzsracdt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZSRACDT() {
        return zzsracdt;
    }

    /**
     * zzsracdt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZSRACDT(String value) {
        this.zzsracdt = value;
    }

    /**
     * zzactdt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZACTDT() {
        return zzactdt;
    }

    /**
     * zzactdt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZACTDT(String value) {
        this.zzactdt = value;
    }

    /**
     * zzbklas 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZBKLAS() {
        return zzbklas;
    }

    /**
     * zzbklas 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZBKLAS(String value) {
        this.zzbklas = value;
    }

}
