package mod1.TA;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelReader
{
	public static void main(String[] args) throws IOException
	{
		String Email = "";
		String Password = "";
		
		try 
		{
			FileInputStream file = new FileInputStream("E:\\Eclipse\\Eclipse_Workspace_Java\\TestAutomation.Project\\ReadData.xlsx");
			try (XSSFWorkbook wb = new XSSFWorkbook(file)) 
			{
				XSSFSheet sheet = wb.getSheet("Login");
				
				int rowCount = sheet.getLastRowNum();
				
				for(int i = 1; i <= rowCount; i++)
				{
					XSSFRow row = sheet.getRow(i);
					
					if(row.getCell(0).getCellType() == CellType.NUMERIC)
					{
						Email = row.getCell(0).getRawValue();
					}
					else
					{
						Email = row.getCell(0).toString();
					}
					
					Password = row.getCell(1).toString();
					
					login(Email, Password);
				}
			}
			
			file.close();
		} 
		
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		} 
		
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public static void login(String Email, String Password)
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://liquipedia.net/");
		
		driver.findElement(By.partialLinkText("VALORANT")).click();
		
		driver.findElement(By.id("pt-login")).click();
		
		driver.findElement(By.id("wpName1")).sendKeys(Email);
		driver.findElement(By.id("wpPassword1")).sendKeys(Password);
		driver.findElement(By.id("wpLoginAttempt")).click();
		
		System.out.println("\n Email Used : " + Email + "\n Password Used : " + Password + "\n");
		
		driver.close();
	}
}
