package com.testNG.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAssertion {

	WebDriver driver;

	@BeforeTest
	public void invokeBrowser() {

		try {
			System.setProperty("webdriver.chrome.driver",
					"F:\\Selenium\\Selenium_Browser_Driver\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.get("https://www.gmail.com");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void getTitle() {
		String title= driver.getTitle();
		Assert.assertEquals(title, "Gmail");
		System.out.println("vikash");
	}

	@Test
	public void testEquility() {
		Assert.assertEquals(true, isEquals(10, 12));
		System.out.println("Equals");
	}

	public boolean isEquals(int a, int b) {

		if (a == b) {
			return true;

		} else {
			return false;
		}
	}
	
	/*@AfterTest
	public void closeBrowser() {
		driver.quit();
	}*/
}
