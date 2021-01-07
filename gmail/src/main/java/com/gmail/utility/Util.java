package com.gmail.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Util {

	public static WebDriver driver = null;
	public static Actions actions = null;

	public static WebDriver Connection() {

		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}

	public static Actions getAction() {
		actions = new Actions(driver);
		return actions;
	}
}
