package mod3.TA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAssertions
{
	WebDriver driver;
	boolean a,b,c,d,e,f,g,h;
	
	@BeforeTest
	public void beforeSearchOne()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://liquipedia.net/");
	}
	
	@Test(priority=0, enabled=true)
	public void searchOne()
	{
		driver.findElement(By.partialLinkText("VALORANT")).click();
		
		driver.findElement(By.id("searchInput")).sendKeys("Team liquid");
		driver.findElement(By.className("input-group-append")).click();
		
		a = driver.findElement(By.xpath("//*[@id=\"Results\"]")).isDisplayed();
		Assert.assertEquals(a,true);
		
		b = driver.findElement(By.xpath("//*[@id=\"Organization\"]")).isDisplayed();
		Assert.assertEquals(b,true);
		
		c = driver.findElement(By.id("Player_Roster")).isDisplayed();
		Assert.assertEquals(c,true);
		
		d = driver.findElement(By.xpath("//*[@id=\"History\"]")).isDisplayed();
		Assert.assertEquals(d,true);
	}
	
	@Test(priority=1, enabled=true)
	public void SearchTwo()
	{
		// driver.navigate().back();
		driver.navigate().to("https://liquipedia.net/");
		
		driver.findElement(By.partialLinkText("Counter-Strike")).click();
		
		driver.findElement(By.id("searchInput")).sendKeys("pgl");
		driver.findElement(By.className("input-group-append")).click();
		
		e = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/div[3]/div[3]/div/div[1]/div[1]/div[2]/div[1]/div/div/a/img")).isDisplayed();
		Assert.assertEquals(e,true);
		
		f = driver.findElement(By.id("Interviews")).isDisplayed();
		Assert.assertEquals(f,true);
		
		g = driver.findElement(By.id("References")).isDisplayed();
		Assert.assertEquals(g,true);

		h = driver.findElement(By.className("infobox-cell-2")).isDisplayed();
		Assert.assertEquals(h,true);
	}
	
	@AfterTest
	public void afterSearchOne()
	{
		System.out.println("\n a: " + a + "\n b: " + b + "\n c: " + c + "\n d: " + d);
		System.out.println("\n e: " + e + "\n f: " + f + "\n g: " + g + "\n h: " + h + "\n");
		
		driver.close();
	}
}
