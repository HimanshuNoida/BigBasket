package Pages.actions;

import org.openqa.selenium.support.PageFactory;

import Util.SeleniumDriver;

public class HomePageFilterDispayFilterActions {

	Pages.locators.HomePageFilterDispayFilterLocators HomePageFilterDispayFilterLocator = null;

	public HomePageFilterDispayFilterActions() {

		this.HomePageFilterDispayFilterLocator = new Pages.locators.HomePageFilterDispayFilterLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), HomePageFilterDispayFilterLocator);
	}

	public void FilterDisplay() {

		if (HomePageFilterDispayFilterLocator.HidefilterDisplay.isDisplayed()) {
			HomePageFilterDispayFilterLocator.HidefilterDisplay.click();
		}
		if (HomePageFilterDispayFilterLocator.showfilterDisplay.isDisplayed()) {
			HomePageFilterDispayFilterLocator.showfilterDisplay.click();
		}

	}

}
