/**
 * 
 */
package com.hps.mes.ws.service.A0MDZ0210M2041;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
/**
 * @author mooney
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="INF_DEPTCD_DEPTNM_IN_MDG")
public class INF_DEPTCD_DEPTNM_IN_MDG {
	@XmlElement(required=true)
    private String SPRAS;
    
    private String DEPTNM;
    
    @XmlTransient
    private String DEPTCD;
    
    @XmlTransient
    private String CORPCD;

    /**
     * @return the sPRAS
     */
    public String getSPRAS() {
        return SPRAS;
    }

    /**
     * @param sPRAS the sPRAS to set
     */
    public void setSPRAS(String sPRAS) {
        SPRAS = sPRAS;
    }

    /**
     * @return the dEPTNM
     */
    public String getDEPTNM() {
        return DEPTNM;
    }

    /**
     * @param dEPTNM the dEPTNM to set
     */
    public void setDEPTNM(String dEPTNM) {
        DEPTNM = dEPTNM;
    }

    /**
     * @return the dEPTCD
     */
    public String getDEPTCD() {
        return DEPTCD;
    }

    /**
     * @param dEPTCD the dEPTCD to set
     */
    public void setDEPTCD(String dEPTCD) {
        DEPTCD = dEPTCD;
    }

    /**
     * @return the cORPCD
     */
    public String getCORPCD() {
        return CORPCD;
    }

    /**
     * @param cORPCD the cORPCD to set
     */
    public void setCORPCD(String cORPCD) {
        CORPCD = cORPCD;
    }
}
