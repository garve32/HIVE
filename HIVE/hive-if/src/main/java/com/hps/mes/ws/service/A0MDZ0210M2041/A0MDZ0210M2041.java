/**
 * 
 */
package com.hps.mes.ws.service.A0MDZ0210M2041;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author mooney
 *
 */
@WebService
@Component
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public class A0MDZ0210M2041 {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public A0MDZ0210M2041() {
		System.out.println("A0MDZ0210M2041 init!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	}
	
	@Inject
    private A0MDZ0210M2041Service service;
    
    @WebMethod
    public void process(@WebParam(name = "A0MDZ0210M2041Req") A0MDZ0210M2041Req req) {
        // Individual Transaction Processing
        for(INF_DEPTCD_IN_MDG item : req.getItems()) {
            try {
            	System.out.println(service.getClass());
                service.doIt(item);
//                loggingSupport.rowSuccess();
            } catch(Exception e) {
                logger.error(e.getMessage(), e);
                //loggingSupport.rowFail(e);
            }
        }
    }
}
