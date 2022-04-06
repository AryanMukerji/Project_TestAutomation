package mod1.TA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ProjectExtentReports
{
	static ExtentTest test;
	static ExtentReports report;

	String baseurl = "https://liquipedia.net/";
	String driverpath = "E:\\Selenium\\chromedriver.exe";
	WebDriver chromeDriver;

	@BeforeClass
	public static void initializeReport()
	{
		report = new ExtentReports("E:\\Eclipse\\Eclipse_Workspace_Java\\TestAutomation.Project\\ExtentReportResults.html");
		test = report.startTest("ExtentDemo");
	}

	@BeforeTest
	public void launchingBrowser()
	{
		System.setProperty("webdriver.chrome.driver", driverpath);
		chromeDriver = new ChromeDriver();
		chromeDriver.manage().window().maximize();
		chromeDriver.get(baseurl);
	}

	@Test(priority=0, enabled=true)
	public void verifyingTitle()
	{
		// Inspecting the page - Check the title name under HTML tag
		String expected = "Liquipedia";
		String actual = chromeDriver.getTitle();
		
		if(actual.equalsIgnoreCase(expected))
		{
			test.log(LogStatus.PASS, "Title page verified");
		}
		
		else
		{
			test.log(LogStatus.FAIL, "Title page test failed");
		}
	}
	
	@Test(priority=1, enabled=true)
	public void goToValorant()
	{
		chromeDriver.findElement(By.partialLinkText("VALORANT")).click();
	}
	
	@Test(priority=2, enabled=true)
	public void clickOnSign()
	{
		chromeDriver.findElement(By.id("pt-login")).click();
		
		//Checking if Navigated to login page
		if(chromeDriver.findElement(By.id("wpName1")) != null)
		{
			test.log(LogStatus.PASS, "Sign On verified");
		}
		
		else
		{
			test.log(LogStatus.FAIL, "Sign on not verified");
		}
	}

	@Test(priority=3, enabled=true)
	public void enterYourLoginName()
	{
		WebElement email = chromeDriver.findElement(By.id("wpName1"));
		email.sendKeys("mayank_is_me");
		
		// continue button would be displayed
		if(chromeDriver.findElement(By.id("wpPassword1")) != null)
		{
			test.log(LogStatus.PASS, "Login name entered correctly");
		}
		
		else
		{
			test.log(LogStatus.FAIL, "Login name is not entered correctly");
		}
	}

	@Test(priority=4, enabled=true)
	public void pressContinueAfterLoginNameIsEntered()
	{
		WebElement continueButton = chromeDriver.findElement(By.id("wpPassword1"));
		continueButton.sendKeys("me_is_mayank");;
		
		// the password field is shown now
		if(chromeDriver.findElement(By.id("wpLoginAttempt")) != null)
		{
			test.log(LogStatus.PASS, "Continue button has been pressed successfully");
		}
		
		else
		{
			test.log(LogStatus.FAIL, "Continue button is not pressed correctly");
		}
	}

	@AfterTest
	public void destroyingSession()
	{
		chromeDriver.close();
		test.log(LogStatus.PASS, "Browser Closed Successfully");
	}
	
	@AfterClass
	public void publishingReport() 
	{
		report.endTest(test);
		report.flush();
	}
}
