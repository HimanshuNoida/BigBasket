package Util;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumDriver {

	private static SeleniumDriver seleniumDriver;
	private static WebDriver driver;
	private static int TIMEOUT = 30;
	public final static int PAGE_LOAD_TIMEOUT = 50;
	public static WebDriverWait wait;

	public SeleniumDriver() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void getURL(String URL) {
		driver.get(URL);

	}

	public static void setDriver() {
		if (seleniumDriver == null) {
			seleniumDriver = new SeleniumDriver();
			seleniumDriver.getDriver().manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		}

	}

	public void tearDown() {

		if (driver != null) {
			driver.close();
			driver.quit();
		}
		seleniumDriver = null;

	}

}
