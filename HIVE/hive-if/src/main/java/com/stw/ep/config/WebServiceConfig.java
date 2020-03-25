package com.stw.ep.config;

import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.ext.logging.LoggingInInterceptor;
import org.apache.cxf.ext.logging.LoggingOutInterceptor;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ws.config.annotation.EnableWs;

import com.stw.ep.ws.service.M2MMML020M2002.M2MMML030M2002;

@EnableWs
@Configuration
public class WebServiceConfig {//extends WsConfigurerAdapter{
	
	@Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus springBus() {
        SpringBus springBus = new SpringBus();
        LoggingInInterceptor ipt = new LoggingInInterceptor();
        LoggingOutInterceptor opt = new LoggingOutInterceptor();
        ipt.setPrettyLogging(true);
        ipt.setLimit(1024);
        opt.setPrettyLogging(true);
        opt.setLimit(1024);
        springBus.getInInterceptors().add(ipt);
        springBus.getOutInterceptors().add(opt);
        return springBus;
    }
	
	// context-ws.xml 대체
	// <jaxws:endpoint implementor="com.stw.ep.ws.service.M2MMML030M2002.M2MMML030M2002" address="/M2_MMM_L030_M2002"/>
	@Autowired
	private M2MMML030M2002 M2MMML030M2002;
	@Bean
	public Endpoint M2_MMM_L030_M2002() {
		EndpointImpl endpoint = new EndpointImpl(springBus(), M2MMML030M2002);
        endpoint.publish("/M2_MMM_L030_M2002");
        return endpoint;
	}
//	@Bean
//	public Endpoint M2_MMM_L030_M2003(Bus cxfBus) {
//		EndpointImpl endpoint = new EndpointImpl(springBus(), new M2MMML030M2002());
//		endpoint.publish("/M2_MMM_L030_M2003");
//		return endpoint;
//	}
	
}
