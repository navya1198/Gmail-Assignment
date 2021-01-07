package simple.gmail;


import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.gmail.reusablecomponents.OpenBrowser;
import com.gmail.reusablecomponents.SignIn;
import com.gmail.utility.ExtentReport;
import com.gmail.utility.Util;


public class AppTest {

	static WebDriver driver = Util.Connection();
	static Actions actions = Util.getAction();
	static ExtentReport report = new ExtentReport();
	static ExtentTest extentTest;
	Logger logger = Logger.getLogger(App.class.getClass());

	@BeforeClass
	public void driverLoad() {
		OpenBrowser.openBrowser(driver);
		logger.info("Browser is opened by chrome");

	}

	@Test
	public void signIn() throws IOException {
		extentTest = report.extentreport();
		SignIn signIn = new SignIn(driver);
		signIn.gmailSignIn();
		logger.info("Successfully signed in");
		extentTest.log(Status.PASS, "browser launched");
	}

	@Test
	public void ComposeEmail() throws IOException {
		extentTest = report.extentreport();
		SignIn signIn = new SignIn(driver);
		signIn.gmailSignIn();
		logger.info("Successfully signed in");
		extentTest.log(Status.PASS, "browser launched");
		
	}

	@AfterClass
	public void afterClass()
	{
	driver.quit();
	}
}


