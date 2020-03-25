package com.stw.ep.config;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.sift.Discriminator;

/**
 * @description 
   * Log loggername manager
   * Implement dynamic configuration logback log file name parameter
 * @author hj.park
 */
public class LoggerNameBasedDiscriminator implements Discriminator<ILoggingEvent>{

	private static final String KEY = "loggerName";

	private boolean started;

	/**
	 * @description 
	  * Registered with cxf's SpringBus
	  * After LoggingInInterceptor/LoggingOutInterceptor
	  * Specify discriminator in logback 
	  * You can use parameters for <file>xxx</file> here.
	  * Thereby achieving the function of dynamically generating fileName
	 * @author hj.park
	 */
	@Override
	public String getDiscriminatingValue(ILoggingEvent iLoggingEvent) {
		String loggerName = iLoggingEvent.getLoggerName();
		if(!loggerName.contains("cxf")) {
			return iLoggingEvent.getLoggerName();
		}
		String[] arr = loggerName.split("\\.");
		String lastName = arr[arr.length-2];
	    return lastName;
	}

	@Override
	public String getKey() {
	    return KEY;
	}

	public void start() {
	    started = true;
	}

	public void stop() {
	    started = false;
	}

	public boolean isStarted() {
	    return started;
	}

}