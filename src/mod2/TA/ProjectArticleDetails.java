package mod2.TA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProjectArticleDetails
{
	public static void main(String[] args)
	{
		boolean a, b, c, d, e, f, g, h;
		WebElement a1, b1, c1, d1, e1, f1, g1, h1;
		
		ProjectBase.setUpBrowser();
		
		WebDriver driver = ProjectBase.generateTest();
		
		driver.findElement(By.partialLinkText("VALORANT")).click();
		ProjectBase.captureScreenshort(driver);
		
		driver.findElement(By.id("searchInput")).sendKeys("Team liquid");
		ProjectBase.captureScreenshort(driver);
		
		driver.findElement(By.className("input-group-append")).click();
		
		a = driver.findElement(By.xpath("//*[@id=\"Results\"]")).isDisplayed();
		a1 = driver.findElement(By.xpath("//*[@id=\"Results\"]"));
		
		b = driver.findElement(By.xpath("//*[@id=\"Organization\"]")).isDisplayed();
		b1 = driver.findElement(By.xpath("//*[@id=\"Organization\"]"));
		
		c = driver.findElement(By.id("Player_Roster")).isDisplayed();
		c1 = driver.findElement(By.id("Player_Roster"));
		
		d = driver.findElement(By.xpath("//*[@id=\"History\"]")).isDisplayed();
		d1 = driver.findElement(By.xpath("//*[@id=\"History\"]"));
		
		System.out.println("\n a: " + a + "\n b: " + b + "\n c: " + c + "\n d: " + d);
		System.out.println("\n a: "+ a1.getText() + "\n b: " + b1.getText() + "\n c: " + c1.getText() + "\n d: " + d1.getText());
		
		ProjectBase.captureScreenshort(driver);
		
		// driver.navigate().back();
		driver.navigate().to(ProjectBase.baseURL);
		ProjectBase.captureScreenshort(driver);
		
		driver.findElement(By.partialLinkText("Counter-Strike")).click();
		ProjectBase.captureScreenshort(driver);
		
		driver.findElement(By.id("searchInput")).sendKeys("pgl");
		ProjectBase.captureScreenshort(driver);
		
		driver.findElement(By.className("input-group-append")).click();
		
		e = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/div[3]/div[3]/div/div[1]/div[1]/div[2]/div[1]/div/div/a/img")).isDisplayed();
		e1 = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/div[3]/div[3]/div/div[1]/div[1]/div[2]/div[1]/div/div/a/img"));
		
		f = driver.findElement(By.id("Interviews")).isDisplayed();
		f1 = driver.findElement(By.id("Interviews"));
		
		g = driver.findElement(By.id("References")).isDisplayed();
		g1 = driver.findElement(By.id("References"));
		
		h = driver.findElement(By.className("infobox-cell-2")).isDisplayed();
		h1 = driver.findElement(By.className("infobox-cell-2"));
		
		System.out.println("\n e: " + e + "\n f: " + f + "\n g: " + g + "\n h: " + h);
		System.out.println("\n e: "+ e1.getTagName() + "\n f: " + f1.getText() + "\n g: " + g1.getText() + "\n h: " + h1.getText() + "\n");
		
		ProjectBase.captureScreenshort(driver);
		
		ProjectBase.tearDown(driver);
	}
}
