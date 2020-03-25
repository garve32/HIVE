package com.stw.ep.ws.service.M2MMML020M2002;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T_MRLIST")
public class T_MRLIST {
    @XmlElement(required = true)
    private String LIFNR;
    @XmlElement(required = true)
    private String ZMOLDNO;
    private String ZMOLDNAME;
    @XmlElement(required = true)
    private String MATNR;
    private String MAKTX;
    @XmlElement(required = true)
    private String ANLN1;
    @XmlElement(required = true)
    private String ANLN2;
    @XmlElement(required = true)
    private String ZMOLDICFM;
    private String ZMOLDFCFM;
    private String ZLIFNR;
    private String NAME1;
    /**
     * @return the lIFNR
     */
    public String getLIFNR() {
        return LIFNR;
    }
    /**
     * @param lIFNR the lIFNR to set
     */
    public void setLIFNR(String lIFNR) {
        LIFNR = lIFNR;
    }
    /**
     * @return the zMOLDNO
     */
    public String getZMOLDNO() {
        return ZMOLDNO;
    }
    /**
     * @param zMOLDNO the zMOLDNO to set
     */
    public void setZMOLDNO(String zMOLDNO) {
        ZMOLDNO = zMOLDNO;
    }
    /**
     * @return the zMOLDNAME
     */
    public String getZMOLDNAME() {
        return ZMOLDNAME;
    }
    /**
     * @param zMOLDNAME the zMOLDNAME to set
     */
    public void setZMOLDNAME(String zMOLDNAME) {
        ZMOLDNAME = zMOLDNAME;
    }
    /**
     * @return the mATNR
     */
    public String getMATNR() {
        return MATNR;
    }
    /**
     * @param mATNR the mATNR to set
     */
    public void setMATNR(String mATNR) {
        MATNR = mATNR;
    }
    /**
     * @return the mAKTX
     */
    public String getMAKTX() {
        return MAKTX;
    }
    /**
     * @param mAKTX the mAKTX to set
     */
    public void setMAKTX(String mAKTX) {
        MAKTX = mAKTX;
    }
    /**
     * @return the aNLN1
     */
    public String getANLN1() {
        return ANLN1;
    }
    /**
     * @param aNLN1 the aNLN1 to set
     */
    public void setANLN1(String aNLN1) {
        ANLN1 = aNLN1;
    }
    /**
     * @return the aNLN2
     */
    public String getANLN2() {
        return ANLN2;
    }
    /**
     * @param aNLN2 the aNLN2 to set
     */
    public void setANLN2(String aNLN2) {
        ANLN2 = aNLN2;
    }
    /**
     * @return the zMOLDICFM
     */
    public String getZMOLDICFM() {
        return ZMOLDICFM;
    }
    /**
     * @param zMOLDICFM the zMOLDICFM to set
     */
    public void setZMOLDICFM(String zMOLDICFM) {
        ZMOLDICFM = zMOLDICFM;
    }
    /**
     * @return the zMOLDFCFM
     */
    public String getZMOLDFCFM() {
        return ZMOLDFCFM;
    }
    /**
     * @param zMOLDFCFM the zMOLDFCFM to set
     */
    public void setZMOLDFCFM(String zMOLDFCFM) {
        ZMOLDFCFM = zMOLDFCFM;
    }
    /**
     * @return the zLIFNR
     */
    public String getZLIFNR() {
        return ZLIFNR;
    }
    /**
     * @param zLIFNR the zLIFNR to set
     */
    public void setZLIFNR(String zLIFNR) {
        ZLIFNR = zLIFNR;
    }
    /**
     * @return the nAME1
     */
    public String getNAME1() {
        return NAME1;
    }
    /**
     * @param nAME1 the nAME1 to set
     */
    public void setNAME1(String nAME1) {
        NAME1 = nAME1;
    }
    
}