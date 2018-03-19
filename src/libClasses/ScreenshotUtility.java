package libClasses;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtility {

	public static void captureScreenshot(WebDriver driver, String screenshotName) {

		try {
			TakesScreenshot screenshot = (TakesScreenshot) driver;// TakesScreenshot is a interface
			File source = screenshot.getScreenshotAs(OutputType.FILE);

			FileUtils.copyFile(source, new File("./screenshots/" + screenshotName + ".png"));
		} catch (Exception e) {

			System.out.println("Exception while taking screenshot " + e.getMessage());
		}
	}
}
