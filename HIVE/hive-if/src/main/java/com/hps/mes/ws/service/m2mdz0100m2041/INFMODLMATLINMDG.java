
package com.hps.mes.ws.service.m2mdz0100m2041;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>INF_MODL_MATL_IN_MDG complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="INF_MODL_MATL_IN_MDG"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MATNR" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MBRSH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MTART" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LVORM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MEINS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MATKL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SPART" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PRDHA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MSTAE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MSTDE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BRGEW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GEWEI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NTGEW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VOLUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GROES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EAN11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NUMTP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WRKST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LAENG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BREIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HOEHE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MEABM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ZEINR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="KZKFG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ZZOVLPN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DATAB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ZZPDGRP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ZZPDABB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ZZMDGRP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ZZDPROJ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ZZDMATNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ZZNEWMD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ZZEXTMD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ZZSDRPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ZZMKTSF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ZZPDPSF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ZZRNDSF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ZZNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ZZDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ZZSPEC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ZZREGDT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ZZREGTM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ZZREGUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ZZAPPDT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ZZAPPTM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ZZAPPUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ZZLAMDT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ZZLAMTM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ZZLAMUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ZZPRFLG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ZZMMTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ZZPROJ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ZZSEGMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ZZDOKAR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ZZDOKNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ZZDOKTL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ZZDOKVR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BISMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LABOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VOLEH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MAGRV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VHART" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NORMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MSTDV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FERTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TEMPB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RAUBE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="INF_MODL_DESC_IN_MDG" type="{http://M2MDZ0100M2041.service.ws.mes.hps.com/}INF_MODL_DESC_IN_MDG" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="INF_MODL_CLASSASGN_IN_MDG" type="{http://M2MDZ0100M2041.service.ws.mes.hps.com/}INF_MODL_CLASSASGN_IN_MDG" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="INF_MODL_CHARASGN_IN_MDG" type="{http://M2MDZ0100M2041.service.ws.mes.hps.com/}INF_MODL_CHARASGN_IN_MDG" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="INF_MODL_UNIT_IN_MDG" type="{http://M2MDZ0100M2041.service.ws.mes.hps.com/}INF_MODL_UNIT_IN_MDG" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="INF_MODL_PLNT_IN_MDG" type="{http://M2MDZ0100M2041.service.ws.mes.hps.com/}INF_MODL_PLNT_IN_MDG" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="INF_MODL_MEAN_IN_MDG" type="{http://M2MDZ0100M2041.service.ws.mes.hps.com/}INF_MODL_MEAN_IN_MDG" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ZZSUBBOM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ZZBUYER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EXTWG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MTPOS_MARA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="KZEFF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ZZMSBOOK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ZZENGTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ZZTECENG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ZZQTYENG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ZZSALVTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "INF_MODL_MATL_IN_MDG", propOrder = {
    "matnr",
    "mbrsh",
    "mtart",
    "lvorm",
    "meins",
    "matkl",
    "spart",
    "prdha",
    "mstae",
    "mstde",
    "brgew",
    "gewei",
    "ntgew",
    "volum",
    "groes",
    "ean11",
    "numtp",
    "wrkst",
    "laeng",
    "breit",
    "hoehe",
    "meabm",
    "zeinr",
    "kzkfg",
    "zzovlpn",
    "datab",
    "zzpdgrp",
    "zzpdabb",
    "zzmdgrp",
    "zzdproj",
    "zzdmatnr",
    "zznewmd",
    "zzextmd",
    "zzsdrpe",
    "zzmktsf",
    "zzpdpsf",
    "zzrndsf",
    "zzname",
    "zzdesc",
    "zzspec",
    "zzregdt",
    "zzregtm",
    "zzregus",
    "zzappdt",
    "zzapptm",
    "zzappus",
    "zzlamdt",
    "zzlamtm",
    "zzlamus",
    "zzprflg",
    "zzmmtyp",
    "zzproj",
    "zzsegmt",
    "zzdokar",
    "zzdoknr",
    "zzdoktl",
    "zzdokvr",
    "bismt",
    "labor",
    "voleh",
    "magrv",
    "vhart",
    "normt",
    "mstdv",
    "ferth",
    "tempb",
    "raube",
    "infmodldescinmdg",
    "infmodlclassasgninmdg",
    "infmodlcharasgninmdg",
    "infmodlunitinmdg",
    "infmodlplntinmdg",
    "infmodlmeaninmdg",
    "zzsubbom",
    "zzbuyer",
    "extwg",
    "mtposmara",
    "kzeff",
    "zzmsbook",
    "zzengtyp",
    "zzteceng",
    "zzqtyeng",
    "zzsalvtyp"
})
public class INFMODLMATLINMDG {

    @XmlElement(name = "MATNR", required = true)
    protected String matnr;
    @XmlElement(name = "MBRSH")
    protected String mbrsh;
    @XmlElement(name = "MTART")
    protected String mtart;
    @XmlElement(name = "LVORM")
    protected String lvorm;
    @XmlElement(name = "MEINS")
    protected String meins;
    @XmlElement(name = "MATKL")
    protected String matkl;
    @XmlElement(name = "SPART")
    protected String spart;
    @XmlElement(name = "PRDHA")
    protected String prdha;
    @XmlElement(name = "MSTAE")
    protected String mstae;
    @XmlElement(name = "MSTDE")
    protected String mstde;
    @XmlElement(name = "BRGEW")
    protected String brgew;
    @XmlElement(name = "GEWEI")
    protected String gewei;
    @XmlElement(name = "NTGEW")
    protected String ntgew;
    @XmlElement(name = "VOLUM")
    protected String volum;
    @XmlElement(name = "GROES")
    protected String groes;
    @XmlElement(name = "EAN11")
    protected String ean11;
    @XmlElement(name = "NUMTP")
    protected String numtp;
    @XmlElement(name = "WRKST")
    protected String wrkst;
    @XmlElement(name = "LAENG")
    protected String laeng;
    @XmlElement(name = "BREIT")
    protected String breit;
    @XmlElement(name = "HOEHE")
    protected String hoehe;
    @XmlElement(name = "MEABM")
    protected String meabm;
    @XmlElement(name = "ZEINR")
    protected String zeinr;
    @XmlElement(name = "KZKFG")
    protected String kzkfg;
    @XmlElement(name = "ZZOVLPN")
    protected String zzovlpn;
    @XmlElement(name = "DATAB")
    protected String datab;
    @XmlElement(name = "ZZPDGRP")
    protected String zzpdgrp;
    @XmlElement(name = "ZZPDABB")
    protected String zzpdabb;
    @XmlElement(name = "ZZMDGRP")
    protected String zzmdgrp;
    @XmlElement(name = "ZZDPROJ")
    protected String zzdproj;
    @XmlElement(name = "ZZDMATNR")
    protected String zzdmatnr;
    @XmlElement(name = "ZZNEWMD")
    protected String zznewmd;
    @XmlElement(name = "ZZEXTMD")
    protected String zzextmd;
    @XmlElement(name = "ZZSDRPE")
    protected String zzsdrpe;
    @XmlElement(name = "ZZMKTSF")
    protected String zzmktsf;
    @XmlElement(name = "ZZPDPSF")
    protected String zzpdpsf;
    @XmlElement(name = "ZZRNDSF")
    protected String zzrndsf;
    @XmlElement(name = "ZZNAME")
    protected String zzname;
    @XmlElement(name = "ZZDESC")
    protected String zzdesc;
    @XmlElement(name = "ZZSPEC")
    protected String zzspec;
    @XmlElement(name = "ZZREGDT")
    protected String zzregdt;
    @XmlElement(name = "ZZREGTM")
    protected String zzregtm;
    @XmlElement(name = "ZZREGUS")
    protected String zzregus;
    @XmlElement(name = "ZZAPPDT")
    protected String zzappdt;
    @XmlElement(name = "ZZAPPTM")
    protected String zzapptm;
    @XmlElement(name = "ZZAPPUS")
    protected String zzappus;
    @XmlElement(name = "ZZLAMDT")
    protected String zzlamdt;
    @XmlElement(name = "ZZLAMTM")
    protected String zzlamtm;
    @XmlElement(name = "ZZLAMUS")
    protected String zzlamus;
    @XmlElement(name = "ZZPRFLG")
    protected String zzprflg;
    @XmlElement(name = "ZZMMTYP")
    protected String zzmmtyp;
    @XmlElement(name = "ZZPROJ")
    protected String zzproj;
    @XmlElement(name = "ZZSEGMT")
    protected String zzsegmt;
    @XmlElement(name = "ZZDOKAR")
    protected String zzdokar;
    @XmlElement(name = "ZZDOKNR")
    protected String zzdoknr;
    @XmlElement(name = "ZZDOKTL")
    protected String zzdoktl;
    @XmlElement(name = "ZZDOKVR")
    protected String zzdokvr;
    @XmlElement(name = "BISMT")
    protected String bismt;
    @XmlElement(name = "LABOR")
    protected String labor;
    @XmlElement(name = "VOLEH")
    protected String voleh;
    @XmlElement(name = "MAGRV")
    protected String magrv;
    @XmlElement(name = "VHART")
    protected String vhart;
    @XmlElement(name = "NORMT")
    protected String normt;
    @XmlElement(name = "MSTDV")
    protected String mstdv;
    @XmlElement(name = "FERTH")
    protected String ferth;
    @XmlElement(name = "TEMPB")
    protected String tempb;
    @XmlElement(name = "RAUBE")
    protected String raube;
    @XmlElement(name = "INF_MODL_DESC_IN_MDG")
    protected List<INFMODLDESCINMDG> infmodldescinmdg;
    @XmlElement(name = "INF_MODL_CLASSASGN_IN_MDG")
    protected List<INFMODLCLASSASGNINMDG> infmodlclassasgninmdg;
    @XmlElement(name = "INF_MODL_CHARASGN_IN_MDG")
    protected List<INFMODLCHARASGNINMDG> infmodlcharasgninmdg;
    @XmlElement(name = "INF_MODL_UNIT_IN_MDG")
    protected List<INFMODLUNITINMDG> infmodlunitinmdg;
    @XmlElement(name = "INF_MODL_PLNT_IN_MDG")
    protected List<INFMODLPLNTINMDG> infmodlplntinmdg;
    @XmlElement(name = "INF_MODL_MEAN_IN_MDG")
    protected List<INFMODLMEANINMDG> infmodlmeaninmdg;
    @XmlElement(name = "ZZSUBBOM")
    protected String zzsubbom;
    @XmlElement(name = "ZZBUYER")
    protected String zzbuyer;
    @XmlElement(name = "EXTWG")
    protected String extwg;
    @XmlElement(name = "MTPOS_MARA")
    protected String mtposmara;
    @XmlElement(name = "KZEFF")
    protected String kzeff;
    @XmlElement(name = "ZZMSBOOK")
    protected String zzmsbook;
    @XmlElement(name = "ZZENGTYP")
    protected String zzengtyp;
    @XmlElement(name = "ZZTECENG")
    protected String zzteceng;
    @XmlElement(name = "ZZQTYENG")
    protected String zzqtyeng;
    @XmlElement(name = "ZZSALVTYP")
    protected String zzsalvtyp;

    /**
     * matnr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMATNR() {
        return matnr;
    }

    /**
     * matnr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMATNR(String value) {
        this.matnr = value;
    }

    /**
     * mbrsh 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMBRSH() {
        return mbrsh;
    }

    /**
     * mbrsh 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMBRSH(String value) {
        this.mbrsh = value;
    }

    /**
     * mtart 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMTART() {
        return mtart;
    }

    /**
     * mtart 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMTART(String value) {
        this.mtart = value;
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
     * meins 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMEINS() {
        return meins;
    }

    /**
     * meins 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMEINS(String value) {
        this.meins = value;
    }

    /**
     * matkl 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMATKL() {
        return matkl;
    }

    /**
     * matkl 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMATKL(String value) {
        this.matkl = value;
    }

    /**
     * spart 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPART() {
        return spart;
    }

    /**
     * spart 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPART(String value) {
        this.spart = value;
    }

    /**
     * prdha 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRDHA() {
        return prdha;
    }

    /**
     * prdha 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRDHA(String value) {
        this.prdha = value;
    }

    /**
     * mstae 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSTAE() {
        return mstae;
    }

    /**
     * mstae 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSTAE(String value) {
        this.mstae = value;
    }

    /**
     * mstde 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSTDE() {
        return mstde;
    }

    /**
     * mstde 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSTDE(String value) {
        this.mstde = value;
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

    /**
     * ntgew 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNTGEW() {
        return ntgew;
    }

    /**
     * ntgew 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNTGEW(String value) {
        this.ntgew = value;
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
     * groes 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGROES() {
        return groes;
    }

    /**
     * groes 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGROES(String value) {
        this.groes = value;
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
     * numtp 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMTP() {
        return numtp;
    }

    /**
     * numtp 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMTP(String value) {
        this.numtp = value;
    }

    /**
     * wrkst 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWRKST() {
        return wrkst;
    }

    /**
     * wrkst 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWRKST(String value) {
        this.wrkst = value;
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
     * zeinr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZEINR() {
        return zeinr;
    }

    /**
     * zeinr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZEINR(String value) {
        this.zeinr = value;
    }

    /**
     * kzkfg 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKZKFG() {
        return kzkfg;
    }

    /**
     * kzkfg 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKZKFG(String value) {
        this.kzkfg = value;
    }

    /**
     * zzovlpn 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZOVLPN() {
        return zzovlpn;
    }

    /**
     * zzovlpn 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZOVLPN(String value) {
        this.zzovlpn = value;
    }

    /**
     * datab 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATAB() {
        return datab;
    }

    /**
     * datab 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATAB(String value) {
        this.datab = value;
    }

    /**
     * zzpdgrp 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZPDGRP() {
        return zzpdgrp;
    }

    /**
     * zzpdgrp 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZPDGRP(String value) {
        this.zzpdgrp = value;
    }

    /**
     * zzpdabb 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZPDABB() {
        return zzpdabb;
    }

    /**
     * zzpdabb 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZPDABB(String value) {
        this.zzpdabb = value;
    }

    /**
     * zzmdgrp 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZMDGRP() {
        return zzmdgrp;
    }

    /**
     * zzmdgrp 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZMDGRP(String value) {
        this.zzmdgrp = value;
    }

    /**
     * zzdproj 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZDPROJ() {
        return zzdproj;
    }

    /**
     * zzdproj 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZDPROJ(String value) {
        this.zzdproj = value;
    }

    /**
     * zzdmatnr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZDMATNR() {
        return zzdmatnr;
    }

    /**
     * zzdmatnr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZDMATNR(String value) {
        this.zzdmatnr = value;
    }

    /**
     * zznewmd 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZNEWMD() {
        return zznewmd;
    }

    /**
     * zznewmd 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZNEWMD(String value) {
        this.zznewmd = value;
    }

    /**
     * zzextmd 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZEXTMD() {
        return zzextmd;
    }

    /**
     * zzextmd 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZEXTMD(String value) {
        this.zzextmd = value;
    }

    /**
     * zzsdrpe 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZSDRPE() {
        return zzsdrpe;
    }

    /**
     * zzsdrpe 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZSDRPE(String value) {
        this.zzsdrpe = value;
    }

    /**
     * zzmktsf 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZMKTSF() {
        return zzmktsf;
    }

    /**
     * zzmktsf 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZMKTSF(String value) {
        this.zzmktsf = value;
    }

    /**
     * zzpdpsf 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZPDPSF() {
        return zzpdpsf;
    }

    /**
     * zzpdpsf 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZPDPSF(String value) {
        this.zzpdpsf = value;
    }

    /**
     * zzrndsf 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZRNDSF() {
        return zzrndsf;
    }

    /**
     * zzrndsf 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZRNDSF(String value) {
        this.zzrndsf = value;
    }

    /**
     * zzname 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZNAME() {
        return zzname;
    }

    /**
     * zzname 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZNAME(String value) {
        this.zzname = value;
    }

    /**
     * zzdesc 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZDESC() {
        return zzdesc;
    }

    /**
     * zzdesc 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZDESC(String value) {
        this.zzdesc = value;
    }

    /**
     * zzspec 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZSPEC() {
        return zzspec;
    }

    /**
     * zzspec 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZSPEC(String value) {
        this.zzspec = value;
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
     * zzappdt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZAPPDT() {
        return zzappdt;
    }

    /**
     * zzappdt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZAPPDT(String value) {
        this.zzappdt = value;
    }

    /**
     * zzapptm 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZAPPTM() {
        return zzapptm;
    }

    /**
     * zzapptm 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZAPPTM(String value) {
        this.zzapptm = value;
    }

    /**
     * zzappus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZAPPUS() {
        return zzappus;
    }

    /**
     * zzappus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZAPPUS(String value) {
        this.zzappus = value;
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
     * zzmmtyp 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZMMTYP() {
        return zzmmtyp;
    }

    /**
     * zzmmtyp 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZMMTYP(String value) {
        this.zzmmtyp = value;
    }

    /**
     * zzproj 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZPROJ() {
        return zzproj;
    }

    /**
     * zzproj 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZPROJ(String value) {
        this.zzproj = value;
    }

    /**
     * zzsegmt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZSEGMT() {
        return zzsegmt;
    }

    /**
     * zzsegmt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZSEGMT(String value) {
        this.zzsegmt = value;
    }

    /**
     * zzdokar 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZDOKAR() {
        return zzdokar;
    }

    /**
     * zzdokar 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZDOKAR(String value) {
        this.zzdokar = value;
    }

    /**
     * zzdoknr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZDOKNR() {
        return zzdoknr;
    }

    /**
     * zzdoknr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZDOKNR(String value) {
        this.zzdoknr = value;
    }

    /**
     * zzdoktl 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZDOKTL() {
        return zzdoktl;
    }

    /**
     * zzdoktl 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZDOKTL(String value) {
        this.zzdoktl = value;
    }

    /**
     * zzdokvr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZDOKVR() {
        return zzdokvr;
    }

    /**
     * zzdokvr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZDOKVR(String value) {
        this.zzdokvr = value;
    }

    /**
     * bismt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBISMT() {
        return bismt;
    }

    /**
     * bismt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBISMT(String value) {
        this.bismt = value;
    }

    /**
     * labor 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLABOR() {
        return labor;
    }

    /**
     * labor 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLABOR(String value) {
        this.labor = value;
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
     * magrv 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAGRV() {
        return magrv;
    }

    /**
     * magrv 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAGRV(String value) {
        this.magrv = value;
    }

    /**
     * vhart 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVHART() {
        return vhart;
    }

    /**
     * vhart 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVHART(String value) {
        this.vhart = value;
    }

    /**
     * normt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNORMT() {
        return normt;
    }

    /**
     * normt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNORMT(String value) {
        this.normt = value;
    }

    /**
     * mstdv 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSTDV() {
        return mstdv;
    }

    /**
     * mstdv 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSTDV(String value) {
        this.mstdv = value;
    }

    /**
     * ferth 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFERTH() {
        return ferth;
    }

    /**
     * ferth 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFERTH(String value) {
        this.ferth = value;
    }

    /**
     * tempb 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTEMPB() {
        return tempb;
    }

    /**
     * tempb 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTEMPB(String value) {
        this.tempb = value;
    }

    /**
     * raube 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRAUBE() {
        return raube;
    }

    /**
     * raube 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRAUBE(String value) {
        this.raube = value;
    }

    /**
     * Gets the value of the infmodldescinmdg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the infmodldescinmdg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getINFMODLDESCINMDG().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link INFMODLDESCINMDG }
     * 
     * 
     */
    public List<INFMODLDESCINMDG> getINFMODLDESCINMDG() {
        if (infmodldescinmdg == null) {
            infmodldescinmdg = new ArrayList<INFMODLDESCINMDG>();
        }
        return this.infmodldescinmdg;
    }

    /**
     * Gets the value of the infmodlclassasgninmdg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the infmodlclassasgninmdg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getINFMODLCLASSASGNINMDG().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link INFMODLCLASSASGNINMDG }
     * 
     * 
     */
    public List<INFMODLCLASSASGNINMDG> getINFMODLCLASSASGNINMDG() {
        if (infmodlclassasgninmdg == null) {
            infmodlclassasgninmdg = new ArrayList<INFMODLCLASSASGNINMDG>();
        }
        return this.infmodlclassasgninmdg;
    }

    /**
     * Gets the value of the infmodlcharasgninmdg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the infmodlcharasgninmdg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getINFMODLCHARASGNINMDG().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link INFMODLCHARASGNINMDG }
     * 
     * 
     */
    public List<INFMODLCHARASGNINMDG> getINFMODLCHARASGNINMDG() {
        if (infmodlcharasgninmdg == null) {
            infmodlcharasgninmdg = new ArrayList<INFMODLCHARASGNINMDG>();
        }
        return this.infmodlcharasgninmdg;
    }

    /**
     * Gets the value of the infmodlunitinmdg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the infmodlunitinmdg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getINFMODLUNITINMDG().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link INFMODLUNITINMDG }
     * 
     * 
     */
    public List<INFMODLUNITINMDG> getINFMODLUNITINMDG() {
        if (infmodlunitinmdg == null) {
            infmodlunitinmdg = new ArrayList<INFMODLUNITINMDG>();
        }
        return this.infmodlunitinmdg;
    }

    /**
     * Gets the value of the infmodlplntinmdg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the infmodlplntinmdg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getINFMODLPLNTINMDG().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link INFMODLPLNTINMDG }
     * 
     * 
     */
    public List<INFMODLPLNTINMDG> getINFMODLPLNTINMDG() {
        if (infmodlplntinmdg == null) {
            infmodlplntinmdg = new ArrayList<INFMODLPLNTINMDG>();
        }
        return this.infmodlplntinmdg;
    }

    /**
     * Gets the value of the infmodlmeaninmdg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the infmodlmeaninmdg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getINFMODLMEANINMDG().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link INFMODLMEANINMDG }
     * 
     * 
     */
    public List<INFMODLMEANINMDG> getINFMODLMEANINMDG() {
        if (infmodlmeaninmdg == null) {
            infmodlmeaninmdg = new ArrayList<INFMODLMEANINMDG>();
        }
        return this.infmodlmeaninmdg;
    }

    /**
     * zzsubbom 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZSUBBOM() {
        return zzsubbom;
    }

    /**
     * zzsubbom 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZSUBBOM(String value) {
        this.zzsubbom = value;
    }

    /**
     * zzbuyer 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZBUYER() {
        return zzbuyer;
    }

    /**
     * zzbuyer 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZBUYER(String value) {
        this.zzbuyer = value;
    }

    /**
     * extwg 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXTWG() {
        return extwg;
    }

    /**
     * extwg 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXTWG(String value) {
        this.extwg = value;
    }

    /**
     * mtposmara 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMTPOSMARA() {
        return mtposmara;
    }

    /**
     * mtposmara 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMTPOSMARA(String value) {
        this.mtposmara = value;
    }

    /**
     * kzeff 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKZEFF() {
        return kzeff;
    }

    /**
     * kzeff 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKZEFF(String value) {
        this.kzeff = value;
    }

    /**
     * zzmsbook 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZMSBOOK() {
        return zzmsbook;
    }

    /**
     * zzmsbook 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZMSBOOK(String value) {
        this.zzmsbook = value;
    }

    /**
     * zzengtyp 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZENGTYP() {
        return zzengtyp;
    }

    /**
     * zzengtyp 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZENGTYP(String value) {
        this.zzengtyp = value;
    }

    /**
     * zzteceng 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZTECENG() {
        return zzteceng;
    }

    /**
     * zzteceng 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZTECENG(String value) {
        this.zzteceng = value;
    }

    /**
     * zzqtyeng 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZQTYENG() {
        return zzqtyeng;
    }

    /**
     * zzqtyeng 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZQTYENG(String value) {
        this.zzqtyeng = value;
    }

    /**
     * zzsalvtyp 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZSALVTYP() {
        return zzsalvtyp;
    }

    /**
     * zzsalvtyp 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZSALVTYP(String value) {
        this.zzsalvtyp = value;
    }

}
