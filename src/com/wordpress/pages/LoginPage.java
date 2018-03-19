/**
 * 
 */
package com.wordpress.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author vikash
 *
 *         This class will store all the locators and methods of login page
 */
public class LoginPage {

	WebDriver driver;

	By username = By.id("user_login");
	By password = By.xpath(".//*[@name='pwd']");
	By loginButton = By.xpath(".//*[@id='wp-submit']");

	public LoginPage(WebDriver driver) {

		this.driver = driver;
	}
	
	public void typeUserName(String user) {
		
		//driver.findElement(username).sendKeys("admin");
		driver.findElement(username).sendKeys(user);
	}
	
	public void typePasword(String pass) {
		
		//driver.findElement(password).sendKeys("demo123");
		driver.findElement(password).sendKeys(pass);
	}
	
	public void clickOnLoginButton() {
		
		driver.findElement(loginButton).click();
	}

}
