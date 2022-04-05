package mod1.TA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MozillaLogin
{
	public static void main(String[] args)
	{
		String baseurl = "https://liquipedia.net/";
		String driverpath = "E:\\Selenium\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", driverpath);
		
		WebDriver mozilla = new FirefoxDriver();
		mozilla.navigate().to(baseurl);
		mozilla.manage().window().maximize();
		
		mozilla.findElement(By.partialLinkText("VALORANT")).click();
		
		mozilla.findElement(By.id("pt-login")).click();
		
		mozilla.findElement(By.id("wpName1")).sendKeys("mayank_is_me");
		mozilla.findElement(By.id("wpPassword1")).sendKeys("me_is_mayank");
		mozilla.findElement(By.id("wpLoginAttempt")).click();

		mozilla.close();
	}
}
