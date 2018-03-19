package com.testNG.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGTestCase {

	WebDriver driver;

	@Test
	public void invokeBrowser() {

		System.setProperty("webdriver.gecko.driver",
				"F:\\Selenium\\Selenium_Browser_Driver\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		driver = new FirefoxDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.get("https://www.gmail.com");
		String pageTitle = driver.getTitle();
		
		Assert.assertEquals(pageTitle, "Gmail");
	}

	
	/*public void verifyTitle() {

		driver.get("https://www.gmail.com");
		String pageTitle = driver.getTitle();

		
		 * if(pageTitle.equals("Gmail")) { System.out.println("Test --Passed"); }else
		 * System.out.println("Test-- Failed");
		 
	}*/

	/*public static void main(String[] args) {

	}
*/
}
