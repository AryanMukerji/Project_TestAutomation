package mod3.TA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGRegistration
{
	WebDriver driver;
	
	@BeforeTest
	public void beforeSignUp() 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://liquipedia.net/");
	}
	
	@Test
	public void SignUp()
	{
		driver.findElement(By.partialLinkText("VALORANT")).click();
		
		driver.findElement(By.id("pt-createaccount")).click();
		
		driver.findElement(By.id("regf3")).sendKeys("TaniAry");
		driver.findElement(By.id("regf2")).sendKeys("thisisourpassword");
		driver.findElement(By.id("regf4")).sendKeys("thisisourpassword");
		driver.findElement(By.id("regf1")).sendKeys("500076374@stu.upes.ac.in");
		
		driver.findElement(By.cssSelector("#create_account > form:nth-child(1) > input:nth-child(7)")).click();
	}
	
	@AfterTest
	public void afterSignUp()
	{
		driver.close();
	}
}
