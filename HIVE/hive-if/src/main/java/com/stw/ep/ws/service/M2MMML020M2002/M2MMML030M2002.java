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

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

//import com.diablo3.common.util.DateUtil;
/**
 * <ul>
 * <li>I/F ID : M2_MMM_L030
 * <li>I/F 명 : Mold Repair History Interface
 * <li>방식 : 동기
 * </ul>
 * 
 * <ul>
 * <li>Created by : 윤석진
 * <li>Created Date : 2012. 12. 18. 오후 4:32:34
 * </ul>
 *
 * @author 윤석진
 */

@Slf4j
@WebService
@Component
@SOAPBinding(parameterStyle = ParameterStyle.BARE)
public class M2MMML030M2002 {
    
    @Autowired
    private M2MMML030M2002Service service;
    
    @WebMethod
    public M2MMML030M2002Res process(@WebParam(name = "M2MMML030M2002Req") M2MMML030M2002Req req) {
        M2MMML030M2002Res res = null;
        
        try {
            res = service.doIt(req);
            res.setEV_ZIFFLAG("S");
            res.setEV_ZIFMSG("SUCCESS");
        } catch(Exception e) {
            res = new M2MMML030M2002Res();
            res.setEV_ZIFFLAG("E");
            res.setEV_ZIFMSG(e.getMessage());
            log.info("e", e);
        }
        //res.setEV_ZIFDATE(DateUtil.getDateString("yyyyMMdd"));
        return res;
    }
}
