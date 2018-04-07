package com.craftsvilla.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest implements AutoConst
{
	public static WebDriver driver = null;
	public static WebDriverWait wait = null;
	
	@BeforeMethod
	public void OpenApp()
	{
		System.setProperty(chrome_key, chrome_value);
		driver = new ChromeDriver();
		driver.get("https://www.craftsvilla.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 10);
	}
	
	
	
	@AfterMethod
	public void closeApp()
	{
		driver.quit();
	}

}
