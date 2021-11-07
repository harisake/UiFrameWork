package com.Hari.Test;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;

public class ParametersOrangHRM {
	WebDriver driver;

	@Parameters("browserName")
	@BeforeTest
	public void InitializeBrowser(String browserName )
	{
		switch (browserName.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();	
			break;
			
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();	
			break;
			
		case "edge":
			WebDriverManager.edgedriver().setup();
			 driver = new EdgeDriver();	
			break;

		default:
			System.err.println("The browser name  is invalid");
			break;
		}
	
		driver.manage().window().maximize();
		
	}
	
	@AfterTest
	public void TearDown()
	{
		driver.quit();
	}
	
	@Parameters("url")
	@Test
	public void LaunchApp(String url)
	{
	
		driver.get("url");	
	}
	
	@Parameters({"username", "password"})
	@Test
	public void EnterLoginDetails(String userName,String Password) throws Exception
	{
		driver.findElement(By.id("txtUsername")).sendKeys(userName);;
		driver.findElement(By.id("txtPassword")).sendKeys(Password);;
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(2000);
	}
	@Test
	public void NavigatingToMyinfo()
	{
		driver.findElement(By.id("menu_pim_viewMyDetails")).click();
	}
	
	@Test
public void VerfyMyInfo()
{
		// assersions
 boolean actualValue =	(driver.findElement(By.id("employee-details")).isDisplayed());
 assertTrue(actualValue);
 
 
	
}
	@Test
	public void VerifyLogin()
	{
		WebElement element= driver.findElement(By.id("welcome"));
		assertTrue(element.isDisplayed());
		assertTrue(element.getText().startsWith("Welcome"));
		
				
	}

}
