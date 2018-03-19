package runner;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class FailedtestCaseRunner {

	public static void main(String[] args) {

		TestNG runner = new TestNG();

		List<String> list = new ArrayList<String>();
		list.add("F:\\Selenium\\Selenium_Workspace\\TestNGProject\\test-output\\SmokeTestScenario\\testng-failed.xml");

		runner.setTestSuites(list);
		
		runner.run();
	}

}
