package screenshot;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import libClasses.ScreenshotUtility;

public class FacebookScreenshotOnFailure {
	
	WebDriver driver;

	@Test
	public void captureScreenshot() throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"F:\\Selenium\\Selenium_Browser_Driver\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email123")).sendKeys("vikash");
	}

	@AfterMethod
	public void tearDown(ITestResult result) {

		if (ITestResult.FAILURE == result.getStatus()) {

			ScreenshotUtility.captureScreenshot(driver, result.getName());
		}

		driver.quit();
	}

}
