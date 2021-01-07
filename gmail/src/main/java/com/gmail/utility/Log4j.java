package com.gmail.utility;

import org.apache.log4j.Logger;

public class Log4j {
	static Logger logger;

	public static void log4j(String className) {
		logger = Logger.getLogger(className);
	}

	public Logger getLogger() {
		return logger;
	}

}
