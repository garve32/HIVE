/**
 * 
 */
package com.hps.mes.ws.service.A0MDZ0210M2041;

import org.springframework.stereotype.Service;

import com.stw.ep.dao.AbstractDao;

/**
 * @author mooney
 *
 */
@Service
public class A0MDZ0210M2041Service extends AbstractDao{
	
	public A0MDZ0210M2041Service() {
		System.out.println("A0MDZ0210M2041Service init!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	}
	
	 public void doIt(INF_DEPTCD_IN_MDG item) {
		 update("A0MDZ0210M2041Query.updateINF_DEPTCD_IN_MDG", item);
        
        for(INF_DEPTCD_DEPTNM_IN_MDG deptnm : item.getDEPTNM()) {
            deptnm.setDEPTCD(item.getDEPTCD());
            deptnm.setCORPCD(item.getCORPCD());
            update("A0MDZ0210M2041Query.updateINF_DEPTCD_DEPTNM_IN_MDG", deptnm);
        }
        
        for(INF_DEPTCD_COMPNM_IN_MDG compnm : item.getCOMPNM()) {
            compnm.setDEPTCD(item.getDEPTCD());
            compnm.setCORPCD(item.getCORPCD());
            update("A0MDZ0210M2041Query.updateINF_DEPTCD_COMPNM_IN_MDG", compnm);
        }
        
        for(INF_DEPTCD_CORPNM_IN_MDG corpnm : item.getCORPNM()){
            corpnm.setDEPTCD(item.getDEPTCD());
            corpnm.setCORPCD(item.getCORPCD());
            update("A0MDZ0210M2041Query.updateINF_DEPTCD_CORPNM_IN_MDG", corpnm);
        }
    }
}
