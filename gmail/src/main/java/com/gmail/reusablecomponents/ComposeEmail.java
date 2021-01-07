package com.gmail.reusablecomponents;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.gmail.pageobject.ComposeEmailPOM;
import com.gmail.pageobject.SignInPOM;
import com.gmail.utility.GetProperties;

public class ComposeEmail {
	
	WebDriver driver = null;
	public ComposeEmail(WebDriver driver) {
		this.driver = driver;
	}
	static Properties properties = GetProperties.getProperty();

public void composeEmail() throws IOException {
		
		WebElement webElement = null;
		webElement = driver.findElement(ComposeEmailPOM.toField);
			String email = properties.getProperty("gmailTo");
			Events.eventSendKeys(webElement, email);
			WebDriverWait wait=new WebDriverWait(driver, 20);   
			webElement = driver.findElement(ComposeEmailPOM.subjectField);
			String subject = properties.getProperty("subject");
			Events.eventSendKeys(webElement, subject);
            driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS); 
            driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@tabindex='1']")));
            driver.findElement(By.xpath("//body[@class='editable LW-avf']")).sendKeys("Selenium email body");
            driver.switchTo().defaultContent();
            driver.findElement(By.xpath("//div[@class='a1 aaA aMZ']")).click();
            String filePath = System.getProperty("user.dir") + "/attachment/image.jpg";
            
            driver.findElement(By.xpath("//div[text()='Send']")).click();
            String msg = driver.findElement(By.xpath("//div[contains(text(),'Your message has been sent.')]")).getText();
            String exp = "Your message has been sent. View message";
            Assert.assertEquals(msg, exp);
            System.out.println("pass");
            driver.close();
			
	}
}
