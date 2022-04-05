package mod1.TA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchTwo
{
	public static void main(String[] args)
	{
		boolean a,b,c,d;
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://liquipedia.net/");
		
		driver.findElement(By.partialLinkText("Counter-Strike")).click();
		
		driver.findElement(By.id("searchInput")).sendKeys("pgl");
		driver.findElement(By.className("input-group-append")).click();
		
		a = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/div[3]/div[3]/div/div[1]/div[1]/div[2]/div[1]/div/div/a/img")).isDisplayed();
		b = driver.findElement(By.id("Interviews")).isDisplayed();
		c = driver.findElement(By.id("References")).isDisplayed();
		d = driver.findElement(By.className("infobox-cell-2")).isDisplayed();
		
		System.out.println("\n a: " + a + "\n b: " + b + "\n c: " + c + "\n d: " + d);
	}
}
