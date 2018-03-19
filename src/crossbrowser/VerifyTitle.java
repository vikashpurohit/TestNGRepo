package crossbrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class VerifyTitle {

	WebDriver driver;

	@Test
	@Parameters("browser")
	public void verifyPageTitle(String browserName) {

		if (browserName.equalsIgnoreCase("firefox")) {
 
			System.setProperty("webdriver.gecko.driver",
					"F:\\Selenium\\Selenium_Browser_Driver\\geckodriver-v0.19.1-win64\\geckodriver.exe");
			driver = new FirefoxDriver();

		} else if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"F:\\Selenium\\Selenium_Browser_Driver\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver",
					"F:\\Selenium\\Selenium_Browser_Driver\\IEDriverServer_x64_3.8.0\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
		driver.get("http://www.learn-automation.com");
		System.out.println(driver.getTitle());
		
		driver.quit();
	}
}
