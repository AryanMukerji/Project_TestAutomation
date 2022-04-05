package mod2.TA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ProjectLoggerTest
{
	static WebDriver driver;
	static String driverPath;
	static String baseURL;
	
	@Test
	public static void logSample()
	{
		driverPath = "E:\\Selenium\\chromedriver.exe";
		baseURL = "https://liquipedia.net/";
		
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		Reporter.log("Browser Is Now Opened");
		
		driver.manage().window().maximize();
		Reporter.log("Browser Is Now Maximized");
		
		driver.get(baseURL);
		Reporter.log("liquipedia.com Is Now Opened");
		
		driver.close();
		Reporter.log("Browser Is Now Closed");
	}
}
