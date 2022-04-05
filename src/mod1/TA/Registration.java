package mod1.TA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://liquipedia.net/");
		
		driver.findElement(By.partialLinkText("VALORANT")).click();
		
		driver.findElement(By.id("pt-createaccount")).click();
		
		driver.findElement(By.id("regf3")).sendKeys("TaniAry");
		driver.findElement(By.id("regf2")).sendKeys("thisisourpassword");
		driver.findElement(By.id("regf4")).sendKeys("thisisourpassword");
		driver.findElement(By.id("regf1")).sendKeys("500076374@stu.upes.ac.in");
		
		driver.findElement(By.cssSelector("#create_account > form:nth-child(1) > input:nth-child(7)")).click();
	}
}
