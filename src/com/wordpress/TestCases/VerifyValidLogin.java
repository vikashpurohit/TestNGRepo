package com.wordpress.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.wordpress.pages.LoginPageNew;

import pageFactoryHelper.BrowserFactory;

public class VerifyValidLogin {

	@Test
	public void checkValidUser() {
		
		//Tis will launch browser and specific url
		WebDriver driver=BrowserFactory.startBrowser("firefox", "http://demosite.center/wordpress/wp-login.php");
		
		//Created Page Object using PageFactory
		LoginPageNew pageNew=PageFactory.initElements(driver, LoginPageNew.class);
		
		//Call the method
		pageNew.loginToWordPress("admin", "demo123");
	}
	
}
