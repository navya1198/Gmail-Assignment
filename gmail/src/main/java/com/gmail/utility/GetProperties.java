package com.gmail.utility;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

public class GetProperties {

	public static Properties getProperty() {

		Properties properties = new Properties();
		File io = new File(System.getProperty("user.dir") + "\\resources\\config.properties");
		FileReader reader;
		try {
			reader = new FileReader(io);
			properties.load(reader);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return properties;
	}
}