/**
 * 
 */
package com.wordpress.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.wordpress.pages.LoginPage;

/**
 * @author vikash
 *
 */
public class VerifyWordpPressLoginWithParameters {

	@Test
	public void verifyValidLogin() {

		System.setProperty("webdriver.chrome.driver",
				"F:\\Selenium\\Selenium_Browser_Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demosite.center/wordpress/wp-login.php");

		LoginPage loginPage = new LoginPage(driver);
		loginPage.typeUserName("admin");
		loginPage.typePasword("demo123");
		loginPage.clickOnLoginButton();
		driver.quit();
	}

}
