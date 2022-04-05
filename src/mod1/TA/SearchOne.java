package mod1.TA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchOne
{
	public static void main(String[] args)
	{
		boolean a,b,c,d;
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://liquipedia.net/");
		
		driver.findElement(By.partialLinkText("VALORANT")).click();
		
		driver.findElement(By.id("searchInput")).sendKeys("Team liquid");
		driver.findElement(By.className("input-group-append")).click();
		
		a = driver.findElement(By.xpath("//*[@id=\"Results\"]")).isDisplayed();
		b = driver.findElement(By.xpath("//*[@id=\"Organization\"]")).isDisplayed();
		c = driver.findElement(By.id("Player_Roster")).isDisplayed();
		d = driver.findElement(By.xpath("//*[@id=\"History\"]")).isDisplayed();
		
		System.out.println("\n a: " + a + "\n b: " + b + "\n c: " + c + "\n d: " + d);
	}
}
