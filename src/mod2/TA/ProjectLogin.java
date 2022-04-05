package mod2.TA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProjectLogin
{
	public static void main(String[] args)
	{
		ProjectBase.setUpBrowser();
		
		WebDriver driver = ProjectBase.generateTest();
		
		driver.findElement(By.partialLinkText("VALORANT")).click();
		ProjectBase.captureScreenshort(driver);
		
		driver.findElement(By.id("pt-login")).click();
		
		driver.findElement(By.id("wpName1")).sendKeys("mayank_is_me");
		ProjectBase.captureScreenshort(driver);
		
		driver.findElement(By.id("wpPassword1")).sendKeys("me_is_mayank");
		ProjectBase.captureScreenshort(driver);
		
		driver.findElement(By.id("wpLoginAttempt")).click();
		
		ProjectBase.captureScreenshort(driver);
		
		ProjectBase.tearDown(driver);
	}
}
