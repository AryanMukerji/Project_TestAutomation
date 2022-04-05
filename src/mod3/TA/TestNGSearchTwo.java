package mod3.TA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGSearchTwo
{
	boolean a,b,c,d;
	WebDriver driver;
	
	@BeforeTest
	public void beforeSearchTwo()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://liquipedia.net/");
	}
	
	@Test
	public void SearchTwo()
	{
		driver.findElement(By.partialLinkText("Counter-Strike")).click();
		
		driver.findElement(By.id("searchInput")).sendKeys("pgl");
		driver.findElement(By.className("input-group-append")).click();
		
		a = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/div[3]/div[3]/div/div[1]/div[1]/div[2]/div[1]/div/div/a/img")).isDisplayed();
		b = driver.findElement(By.id("Interviews")).isDisplayed();
		c = driver.findElement(By.id("References")).isDisplayed();
		d = driver.findElement(By.className("infobox-cell-2")).isDisplayed();
	}
	
	@AfterTest
	public void afterSearchOne()
	{
		System.out.println("\n a: " + a + "\n b: " + b + "\n c: " + c + "\n d: " + d);
		
		driver.close();
	}
}
