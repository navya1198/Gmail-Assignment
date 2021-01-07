package com.gmail.pageobject;

import org.openqa.selenium.By;

public class ComposeEmailPOM {

	public static By composeButton = By.xpath("//div[@class='T-I T-I-KE L3']");
	public static By subjectField = By.xpath("//input[@name='subjectbox']");
	public static By toField=By.xpath("//textarea[@name='to']");
	public static By attachmentlink = By.id("//input[@name='Filedata']");
	public static By sendButton = By.id("//div[text()='Send']");
}
