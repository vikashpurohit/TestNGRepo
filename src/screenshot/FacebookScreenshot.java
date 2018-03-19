package screenshot;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import libClasses.ScreenshotUtility;

public class FacebookScreenshot {

	@Test
	public void captureScreenshot() throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"F:\\Selenium\\Selenium_Browser_Driver\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com");

		ScreenshotUtility.captureScreenshot(driver, "BrowserStarted");

		driver.findElement(By.id("email")).sendKeys("vikash");

		ScreenshotUtility.captureScreenshot(driver, "facebooklogin");

		driver.quit();
	}

}
