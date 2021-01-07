package com.gmail.utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshots {
	WebDriver driver = null;

	public Screenshots(WebDriver driver) {
		this.driver = driver;
	}

	public void Screen() throws IOException {
		String timeStamp = new SimpleDateFormat("yyyymmdd_HHmmss").format(new Date());
		String fileName = System.getProperty("user.dir")+"/Screenshot/report"+timeStamp+".png";
		File destFile = new File(fileName);
		TakesScreenshot ss= ((TakesScreenshot)driver);
		File srcFile = ss.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, destFile);
	}
}
