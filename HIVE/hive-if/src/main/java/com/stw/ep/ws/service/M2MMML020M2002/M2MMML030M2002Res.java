/**
 * You are strictly prohibited to copy, disclose, distribute, modify, or use this program in part 
 * or as a whole without the prior written consent of Samsung Techwin Co., Ltd.
 * Samsung Techwin Co., Ltd., owns the intellectual property rights in and to this program.
 *
 * (Copyright ⓒ 2012 Samsung Techwin Co., Ltd. All Rights Reserved| Confidential)
 *
 * $Revision: 654 $
 * $LastChangedDate: 2013-11-25 20:55:30 +0900 (월, 25 11 2013) $
 * $LastChangedBy: seokjin.yoon $
 */
package com.stw.ep.ws.service.M2MMML020M2002;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * <ul>
 * <li>Created by : 윤석진
 * <li>Created Date : 2012. 12. 14. 오전 9:37:44
 * </ul>
 *
 * @author 윤석진
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class M2MMML030M2002Res {
    @XmlElement(name = "T_MRLIST")
    private List<T_MRLIST> item;
    
    private String EV_ZIFFLAG;
    
    private String EV_ZIFDATE;
    
    private String EV_ZIFMSG;

    /**
     * @return the item
     */
    public List<T_MRLIST> getItem() {
        return item;
    }

    /**
     * @param item the item to set
     */
    public void setItem(List<T_MRLIST> item) {
        this.item = item;
    }

    /**
     * @return the eV_ZIFFLAG
     */
    public String getEV_ZIFFLAG() {
        return EV_ZIFFLAG;
    }

    /**
     * @param eV_ZIFFLAG the eV_ZIFFLAG to set
     */
    public void setEV_ZIFFLAG(String eV_ZIFFLAG) {
        EV_ZIFFLAG = eV_ZIFFLAG;
    }

    /**
     * @return the eV_ZIFDATE
     */
    public String getEV_ZIFDATE() {
        return EV_ZIFDATE;
    }

    /**
     * @param eV_ZIFDATE the eV_ZIFDATE to set
     */
    public void setEV_ZIFDATE(String eV_ZIFDATE) {
        EV_ZIFDATE = eV_ZIFDATE;
    }

    /**
     * @return the eV_ZIFMSG
     */
    public String getEV_ZIFMSG() {
        return EV_ZIFMSG;
    }

    /**
     * @param eV_ZIFMSG the eV_ZIFMSG to set
     */
    public void setEV_ZIFMSG(String eV_ZIFMSG) {
        EV_ZIFMSG = eV_ZIFMSG;
    }
    
    
}
