/**
 * You are strictly prohibited to copy, disclose, distribute, modify, or use this program in part 
 * or as a whole without the prior written consent of Samsung Techwin Co., Ltd.
 * Samsung Techwin Co., Ltd., owns the intellectual property rights in and to this program.
 *
 * (Copyright ⓒ 2012 Samsung Techwin Co., Ltd. All Rights Reserved| Confidential)
 */
package com.stw.ep.ws.service.M2MMML020M2002;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * <ul>
 * <li>Created by : 윤석진
 * <li>Created Date : 2012. 12. 18. 오후 2:48:21
 * </ul>
 *
 * @author 윤석진
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class M2MMML030M2002Req {
    private String IV_BUKRS;
    @XmlElement(required=true)
    private String IV_ANLN1_F;
    @XmlElement(required=true)
    private String IV_ANLN2_F;
    private String IV_ZMOLDNO;
    /**
     * @return the iV_BUKRS
     */
    public String getIV_BUKRS() {
        return IV_BUKRS;
    }
    /**
     * @param iV_BUKRS the iV_BUKRS to set
     */
    public void setIV_BUKRS(String iV_BUKRS) {
        IV_BUKRS = iV_BUKRS;
    }
    /**
     * @return the iV_ANLN1_F
     */
    public String getIV_ANLN1_F() {
        return IV_ANLN1_F;
    }
    /**
     * @param iV_ANLN1_F the iV_ANLN1_F to set
     */
    public void setIV_ANLN1_F(String iV_ANLN1_F) {
        IV_ANLN1_F = iV_ANLN1_F;
    }
    /**
     * @return the iV_ANLN2_F
     */
    public String getIV_ANLN2_F() {
        return IV_ANLN2_F;
    }
    /**
     * @param iV_ANLN2_F the iV_ANLN2_F to set
     */
    public void setIV_ANLN2_F(String iV_ANLN2_F) {
        IV_ANLN2_F = iV_ANLN2_F;
    }
    /**
     * @return the iV_ZMOLDNO
     */
    public String getIV_ZMOLDNO() {
        return IV_ZMOLDNO;
    }
    /**
     * @param iV_ZMOLDNO the iV_ZMOLDNO to set
     */
    public void setIV_ZMOLDNO(String iV_ZMOLDNO) {
        IV_ZMOLDNO = iV_ZMOLDNO;
    }
    
}
