package com.wordpress.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageNew {

	WebDriver driver;

	public LoginPageNew(WebDriver driver1) {

		this.driver = driver1;
	}

	@FindBy(id = "user_login")
	@CacheLookup // keep the elements in cache so that it will not find elements in webpage again and
					// this will increase the performance but web element should not change
	WebElement username;

	@FindBy(how = How.ID, using = "user_pass")
	@CacheLookup
	WebElement password;

	@FindBy(how = How.XPATH, using = ".//*[@id='wp-submit']")
	@CacheLookup
	WebElement submit_button;

	@FindBy(how = How.LINK_TEXT, using = "Lost your password?")
	@CacheLookup
	WebElement forget_password_link;

	public void loginToWordPress(String uid, String pass) {

		username.sendKeys(uid);
		password.sendKeys(pass);
		submit_button.click();
	}
}
