package mod3.TA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGSearchOne
{
	WebDriver driver;
	boolean a,b,c,d;
	
	@BeforeTest
	public void beforeSearchOne()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://liquipedia.net/");
	}
	
	@Test
	public void searchOne()
	{
		driver.findElement(By.partialLinkText("VALORANT")).click();
		
		driver.findElement(By.id("searchInput")).sendKeys("Team liquid");
		driver.findElement(By.className("input-group-append")).click();
		
		a = driver.findElement(By.xpath("//*[@id=\"Results\"]")).isDisplayed();
		b = driver.findElement(By.xpath("//*[@id=\"Organization\"]")).isDisplayed();
		c = driver.findElement(By.id("Player_Roster")).isDisplayed();
		d = driver.findElement(By.xpath("//*[@id=\"History\"]")).isDisplayed();
	}
	
	@AfterTest
	public void afterSearchOne()
	{
		System.out.println("\n a: " + a + "\n b: " + b + "\n c: " + c + "\n d: " + d);
		
		driver.close();
	}
}
