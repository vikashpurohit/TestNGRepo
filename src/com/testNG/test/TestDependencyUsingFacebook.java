package com.testNG.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestDependencyUsingFacebook {

	WebDriver driver;

	@Test
	public void openBrowser() {

		try {
			System.setProperty("webdriver.chrome.driver",
					"F:\\\\Selenium\\\\Selenium_Browser_Driver\\\\chromedriver_win32\\\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.get("https://www.facebook.com");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test(dependsOnMethods="openBrowser")
	public void LoginToFacebook() {
		driver.findElement(By.id("email")).sendKeys("vikash.purohit86@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("password");
		driver.findElement(By.id("loginbutton")).click();
	}
}
