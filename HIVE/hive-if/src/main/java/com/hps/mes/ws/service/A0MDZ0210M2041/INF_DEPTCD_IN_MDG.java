/**
 * 
 */
package com.hps.mes.ws.service.A0MDZ0210M2041;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
/**
 * @author mooney
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="INF_DEPTCD_IN_MDG")
public class INF_DEPTCD_IN_MDG {
	@XmlElement(required=true)
    private String DEPTCD;
    
    @XmlElement(required=true)
    private String CORPCD;
    
    private String COMPCD;
    
    private String PDEPTCD;
    
    private String CCCD;
    
    private String PCCD;
    
    private String BICD;
    
    private String WERKS;
    
    private String BIZAREA;
    
    private String GNCD;
    
    private String DHEMPID;
    
    private String VALIDFROMDT;
    
    private String VALIDTODT;
    
    private String DEPTLVL;
    
    private String DEPTPOSNO;
    
    private String WKCD;
    
    @XmlElement(name = "INF_DEPTCD_DEPTNM_IN_MDG")
    private List<INF_DEPTCD_DEPTNM_IN_MDG> DEPTNM;
    
    @XmlElement(name = "INF_DEPTCD_COMPNM_IN_MDG")
    private List<INF_DEPTCD_COMPNM_IN_MDG> COMPNM;
    
    @XmlElement(name = "INF_DEPTCD_CORPNM_IN_MDG")
    private List<INF_DEPTCD_CORPNM_IN_MDG> CORPNM;

    
    
    public List<INF_DEPTCD_DEPTNM_IN_MDG> getDEPTNM() {
        if(DEPTNM == null){
            DEPTNM = new ArrayList<INF_DEPTCD_DEPTNM_IN_MDG>();
        }
        return DEPTNM;
    }

    public List<INF_DEPTCD_COMPNM_IN_MDG> getCOMPNM() {
        if(COMPNM == null){
            COMPNM = new ArrayList<INF_DEPTCD_COMPNM_IN_MDG>();
        }
        return COMPNM;
    }

    public List<INF_DEPTCD_CORPNM_IN_MDG> getCORPNM() {
        if(CORPNM == null){
            CORPNM = new ArrayList<INF_DEPTCD_CORPNM_IN_MDG>();
        }
        return CORPNM;
    }

    public void setDEPTNM(List<INF_DEPTCD_DEPTNM_IN_MDG> dEPTNM) {
        DEPTNM = dEPTNM;
    }

    public void setCOMPNM(List<INF_DEPTCD_COMPNM_IN_MDG> cOMPNM) {
        COMPNM = cOMPNM;
    }

    public void setCORPNM(List<INF_DEPTCD_CORPNM_IN_MDG> cORPNM) {
        CORPNM = cORPNM;
    }

    public String getDEPTCD() {
        return DEPTCD;
    }

    public String getCORPCD() {
        return CORPCD;
    }

    public String getCOMPCD() {
        return COMPCD;
    }

    public String getPDEPTCD() {
        return PDEPTCD;
    }

    public String getCCCD() {
        return CCCD;
    }

    public String getPCCD() {
        return PCCD;
    }

    public String getBICD() {
        return BICD;
    }

    public String getWERKS() {
        return WERKS;
    }

    public String getBIZAREA() {
        return BIZAREA;
    }

    public String getGNCD() {
        return GNCD;
    }

    public String getDHEMPID() {
        return DHEMPID;
    }

    public String getVALIDFROMDT() {
        return VALIDFROMDT;
    }

    public String getVALIDTODT() {
        return VALIDTODT;
    }

    public String getDEPTLVL() {
        return DEPTLVL;
    }

    public String getDEPTPOSNO() {
        return DEPTPOSNO;
    }

    public void setDEPTCD(String dEPTCD) {
        DEPTCD = dEPTCD;
    }

    public void setCORPCD(String cORPCD) {
        CORPCD = cORPCD;
    }

    public void setCOMPCD(String cOMPCD) {
        COMPCD = cOMPCD;
    }

    public void setPDEPTCD(String pDEPTCD) {
        PDEPTCD = pDEPTCD;
    }

    public void setCCCD(String cCCD) {
        CCCD = cCCD;
    }

    public void setPCCD(String pCCD) {
        PCCD = pCCD;
    }

    public void setBICD(String bICD) {
        BICD = bICD;
    }

    public void setWERKS(String wERKS) {
        WERKS = wERKS;
    }

    public void setBIZAREA(String bIZAREA) {
        BIZAREA = bIZAREA;
    }

    public void setGNCD(String gNCD) {
        GNCD = gNCD;
    }

    public void setDHEMPID(String dHEMPID) {
        DHEMPID = dHEMPID;
    }

    public void setVALIDFROMDT(String vALIDFROMDT) {
        VALIDFROMDT = vALIDFROMDT;
    }

    public void setVALIDTODT(String vALIDTODT) {
        VALIDTODT = vALIDTODT;
    }

    public void setDEPTLVL(String dEPTLVL) {
        DEPTLVL = dEPTLVL;
    }

    public void setDEPTPOSNO(String dEPTPOSNO) {
        DEPTPOSNO = dEPTPOSNO;
    }

    public String getWKCD() {
        return WKCD;
    }

    public void setWKCD(String wKCD) {
        WKCD = wKCD;
    }
}
