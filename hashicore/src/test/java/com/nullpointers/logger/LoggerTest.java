package com.nullpointers.logger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerTest {

	private static final Logger log = LogManager.getLogger(LoggerTest.class);
	
	public void testLogLevels()
	{
		log.debug("Debug message being printed ...");
		log.info("Info message being printed ...");
		log.warn("Warning message being printed ...");
		log.error("Error message being printed ...");
	}
	
}
