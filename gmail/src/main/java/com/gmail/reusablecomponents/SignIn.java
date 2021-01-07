package com.gmail.reusablecomponents;

import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.WebDriverWait;
import com.gmail.pageobject.SignInPOM;
import com.gmail.utility.GetProperties;

public class SignIn {
	WebDriver driver = null;
	public SignIn(WebDriver driver) {
		this.driver = driver;
	}
	static Properties properties = GetProperties.getProperty();

	public void gmailSignIn() {
		
		WebElement webElement = null;
		webElement = driver.findElement(SignInPOM.emailTextBox);
			String email = properties.getProperty("gmail");
			Events.eventSendKeys(webElement, email);
			WebDriverWait wait=new WebDriverWait(driver, 20);        
			webElement= driver.findElement(SignInPOM.nextButton);   
			Events.eventClick(webElement);
            driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS); 
            webElement= driver.findElement(SignInPOM.passwordTextBox);  
            String password = properties.getProperty("password");
			Events.eventSendKeys(webElement, password);
	}
	




}
