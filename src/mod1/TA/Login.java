package mod1.TA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://liquipedia.net/");
		
		driver.findElement(By.partialLinkText("VALORANT")).click();
		
		driver.findElement(By.id("pt-login")).click();
		driver.findElement(By.id("wpName1")).sendKeys("mayank_is_me");
		driver.findElement(By.id("wpPassword1")).sendKeys("me_is_mayank");
		driver.findElement(By.id("wpLoginAttempt")).click();
		
		driver.close();
	}
}
