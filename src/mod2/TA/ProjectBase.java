package mod2.TA;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ProjectBase
{
	static WebDriver driver;
	static String driverPath;
	static String baseURL;
	
	@BeforeTest
	public static void setUpBrowser()
	{
		driverPath = "E:\\Selenium\\chromedriver.exe";
		baseURL = "https://liquipedia.net/";
	}
	
	@Test
	public static WebDriver generateTest()
	{
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(baseURL);
		captureScreenshort(driver);
		
		return driver;
	}
	
	public static void captureScreenshort(WebDriver ldriver)
	{
		String folderPath = "E:\\Eclipse\\Eclipse_Workspace_Java\\TestAutomation.Project\\Project Screenshots\\";
		
		File src = ((TakesScreenshot)ldriver).getScreenshotAs(OutputType.FILE);
		
		try
		{
			FileUtils.copyFile(src, new File(folderPath + System.currentTimeMillis() + ".png"));
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("deprecation")
	public static void implicitWait()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@SuppressWarnings("deprecation")
	public static void explicittWait()
	{
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.alertIsPresent());
	}
	
	@AfterTest
	public static void tearDown(WebDriver driver)
	{
		driver.close();
	}
}
