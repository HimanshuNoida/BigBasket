package Pages.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import Pages.locators.SavedForLaterLocators;
import Util.SeleniumDriver;

public class SavedForLaterActions {

	SavedForLaterLocators SavedForLaterLocator = null;

	public SavedForLaterActions() {
		this.SavedForLaterLocator = new SavedForLaterLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), SavedForLaterLocator);

	}

	public void clickSavedForLaterIt() {

		SavedForLaterLocator.Saveforlater.click();

	}

	public void checkout() {

		SavedForLaterLocator.checkout.click();

		JavascriptExecutor js = (JavascriptExecutor) SeleniumDriver.getDriver();
		js.executeScript("arguments[0].scrollIntoView(true);", SavedForLaterLocator.Saveforlater);
		System.out.println("The item is presenet on the  check out page");
	}

}
