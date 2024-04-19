package Pages.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import Util.SeleniumDriver;

public class HomePageUserDetailsActions {
	Pages.locators.HomePageUserDetailsLocators HomePageUserDetailsLocators = null;

	public HomePageUserDetailsActions() {

		this.HomePageUserDetailsLocators = new Pages.locators.HomePageUserDetailsLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), HomePageUserDetailsLocators);

	}

	public void UserDetailsIcon() {

		HomePageUserDetailsLocators.userIcon.click();

	}

	public  void HomeuserDetailOption(String options) throws InterruptedException {
		WebElement item = SeleniumDriver.getDriver()
				.findElement(By.xpath("//*[contains(text()," + "'" + options + "')]"));

		System.out.println(item);

		if (item.isDisplayed()) {
			System.out.println(true);

		} else {
			System.out.println(false);
		}

		HomePageUserDetailsLocators.userIcon.click();

	}
	
	
	

}
