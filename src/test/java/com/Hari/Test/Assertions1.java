package com.Hari.Test;

import static org.testng.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertions1 {
	
	@Test
	public void TestFacebook() 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("Kirikue",Keys.ENTER);
		System.out.println(driver.getTitle());
	
		
		SoftAssert softassert = new SoftAssert();
		
		
		//Title assertion
		String actualtitle = driver.getTitle();
		String expectedTitle = "Log in to Facebook";
		softassert.assertEquals(actualtitle,expectedTitle,"Title is missmatched !!!");
		
		// URL assertion 
		String actualURL =driver.getCurrentUrl();
		String expectedURL= "https://www.facebook.com/";
		softassert.assertNotEquals(actualURL,expectedURL,"URL is mismatched..!!!");
		
		
		//TextAssersion
//				String actualText =driver.findElement(By.name("email")).getAttribute("value");
//				String expectedText= "";
//				softassert.assertEquals(actualText,expectedText,"Username text is mismatched..!!!");
		
		//BorderAssersion
//		String actualBorder =driver.findElement(By.name("email")).getCssValue("border");
//		String expectedBorder= "1px solid rgb(240, 40, 73)";
//		softassert.assertEquals(actualBorder,expectedBorder,"Username Border is mismatched..!!!");
		
		
	//ErrorMessag Assertion
		String actualErrormessage =driver.findElement(By.xpath("(//div[@id='error_box']/div)[last()]")).getText();
		String expectedErrormessage = "Invalid username or password";
		softassert.assertEquals(actualErrormessage,expectedErrormessage,"sai msg is mis matched...!!!!!!!!!!!!!");

		driver.quit();
		softassert.assertAll();
	}
	
	
	

}
