/**
 * You are strictly prohibited to copy, disclose, distribute, modify, or use this program in part 
 * or as a whole without the prior written consent of Samsung Techwin Co., Ltd.
 * Samsung Techwin Co., Ltd., owns the intellectual property rights in and to this program.
 *
 * (Copyright ⓒ 2012 Samsung Techwin Co., Ltd. All Rights Reserved| Confidential)
 */
package com.stw.ep.ws.service.M2MMML020M2002;

import java.util.List;

import org.springframework.stereotype.Service;
import com.stw.ep.dao.AbstractDao;

import lombok.extern.slf4j.Slf4j;

//import com.stw.framework.service.FrameworkService;

/**
 * <ul>
 * <li>Created by : 윤석진
 * <li>Created Date : 2012. 12. 18. 오전 4:17:57
 * </ul>
 *
 * @author 윤석진
 */
@Slf4j
@Service
public class M2MMML030M2002Service extends AbstractDao {
	
    public M2MMML030M2002Res doIt(M2MMML030M2002Req req) {
        M2MMML030M2002Res res = new M2MMML030M2002Res();
        List<T_MRLIST> itemList = selectList("M2MMML030M2002Service.selectT_MRLIST", req);
        res.setItem(itemList);
        return res;
    }
    
}
