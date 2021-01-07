package com.gmail.reusablecomponents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Events {

	static WebDriver driver;
	public static void eventClick(WebElement webelement) {
		webelement.click();
	}

	public static void eventSendKeys(WebElement webelement, String keys) {
		webelement.sendKeys(keys);
	}
	
	
}
