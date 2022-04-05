package mod2.TA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProjectSearch
{
	public static void main(String[] args)
	{
		ProjectBase.setUpBrowser();
		
		WebDriver driver = ProjectBase.generateTest();
		
		driver.findElement(By.partialLinkText("Rocket League")).click();
		ProjectBase.captureScreenshort(driver);
		
		boolean p1 = driver.findElement(By.className("logotype")).isDisplayed();
		WebElement p11 = driver.findElement(By.className("logotype"));
		
		boolean p2 = driver.findElement(By.cssSelector("#mw-content-text > div > div:nth-child(2) > div > div:nth-child(1) > div > div > a")).isDisplayed();
		WebElement p22 = driver.findElement(By.cssSelector("#mw-content-text > div > div:nth-child(2) > div > div:nth-child(1) > div > div > a"));
		
		boolean p3 = driver.findElement(By.cssSelector("#mw-content-text > div > div:nth-child(2) > div > div:nth-child(5) > div > div > a")).isDisplayed();
		WebElement p33 = driver.findElement(By.cssSelector("#mw-content-text > div > div:nth-child(2) > div > div:nth-child(5) > div > div > a"));
		
		boolean p4 = driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div/div[3]/div/div[2]/div[2]/div/div[1]/div[2]/div/ul/li[1]/span")).isDisplayed();
		WebElement p44 = driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div/div[3]/div/div[2]/div[2]/div/div[1]/div[2]/div/ul/li[1]/span"));
		
		System.out.println("\n p1 = " + p1 + "\n p2 = " + p2 + "\n p3 = " + p3 + "\n p4 = " + p4);
		System.out.println("\n p11 = " + p11.getText() + "\n p22 = " + p22.getText() + "\n p33 = " + p33.getText() + "\n p44 = " + p44.getText());
		
		ProjectBase.captureScreenshort(driver);
		
		ProjectBase.tearDown(driver);
	}
}
