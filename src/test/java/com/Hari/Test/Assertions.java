package com.Hari.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertions {

	@Test
	public void TestGoogle() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("UPSC",Keys.ENTER);
		String expectedTitle ="UPSC - Google Search";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle,"The Title is Mismatched");
		Thread.sleep(5000);
		driver.quit();

	}

}
