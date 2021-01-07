package com.gmail.reusablecomponents;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.gmail.utility.GetProperties;

public class OpenBrowser {

	static Properties properties = GetProperties.getProperty();

	public static void openBrowser(WebDriver driver) {

		driver.manage().window().maximize();

		String url = properties.getProperty("url");

		driver.get(url);
	}

	
}
