package ddt;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import libClasses.ReadExcelConfig;

public class WordPressLoginExcel {

	WebDriver driver;

	@Test(dataProvider = "wordPressLoginData")
	public void loginToWordPress(String username, String password) {

		try {
			System.setProperty("webdriver.chrome.driver",
					"F:\\Selenium\\Selenium_Browser_Driver\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.get("http://demosite.center/wordpress/wp-login.php");

			driver.findElement(By.id("user_login")).sendKeys(username);
			driver.findElement(By.id("user_pass")).sendKeys(password);
			driver.findElement(By.id("wp-submit")).click();
			Thread.sleep(3000);

			// System.out.println("Title is= "+ driver.getTitle());
			Assert.assertTrue(driver.getTitle().contains("Dashboard"), "User Unable to Login- Invalid Credentials");

			System.out.println("Page Tilte is verified, user Login Successful");

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

	@DataProvider(name = "wordPressLoginData")
	public Object[][] passData() {

		ReadExcelConfig excelConfig = new ReadExcelConfig(
				"F:\\Selenium\\Selenium_Workspace\\TestNGProject\\TestData\\loginData.xlsx");

		int rows = excelConfig.getRowCont(0);

		Object[][] data = new Object[rows][2];

		for (int i = 0; i < rows; i++) {

			data[i][0] = excelConfig.getData(0, i, 0);
			data[i][1] = excelConfig.getData(0, i, 1);
		}
		return data;
	}

}
