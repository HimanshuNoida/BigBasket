package Steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Pages.actions.Classs;
import Util.SeleniumDriver;
import io.cucumber.java.Scenario;

public class AfterActions {

	public static void tearDown(Scenario scenario) {

		if (scenario.isFailed()) {
			WebDriver driver = SeleniumDriver.getDriver();
			final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", scenario.getName());
		}

	}

}
