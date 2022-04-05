package mod3.TA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGLogin 
{
	WebDriver driver;
	
	@BeforeTest
	public void beforeLogin()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://liquipedia.net/");
	}
	
	@Test
	public void Login()
	{
		driver.findElement(By.partialLinkText("VALORANT")).click();
		
		driver.findElement(By.id("pt-login")).click();
		
		driver.findElement(By.id("wpName1")).sendKeys("mayank_is_me");
		driver.findElement(By.id("wpPassword1")).sendKeys("me_is_mayank");
		driver.findElement(By.id("wpLoginAttempt")).click();
	}
	
	@AfterTest
	public void AfterLogin()
	{
		driver.close();
	}
}
