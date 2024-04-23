package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import Pages.actions.CommonM;
import Pages.actions.SavedForLaterActions;
import Pages.locators.SavedForLaterLocators;
import Util.SeleniumDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class savedFoLater extends CommonMethods implements CommonM {

	String ActualURL = "https://www.bigbasket.com/";
	SavedForLaterActions SavedForLaterAction = new SavedForLaterActions();
	SavedForLaterLocators SavedForLaterLocator = new SavedForLaterLocators();
	
	
	

	@Given("user was logged in and is on the category page")
	public void user_was_logged_in_and_is_on_the_category_page() {

		String url = SeleniumDriver.getDriver().getCurrentUrl();

		Assert.assertEquals(ActualURL, url, "The user is not on the HomePage of the webSite");

	}

	@When("user scroll to {string} item")
	public void user_scroll_to_item(String string) {
		ScrooltoElement("Pre Shave Foam - Classic Menthol");
	}

	@When("click on saved for later tag")
	public void click_on_saved_for_later_tag() throws InterruptedException {
		Thread.sleep(6000);
		SavedForLaterAction.clickSavedForLaterIt();
	}

	@Then("the item should get marked for save for later")
	public void the_item_should_get_marked_for_save_for_later() {
		if (SeleniumDriver.getDriver().findElement(By.xpath("//span[normalize-space()='Remove Product']"))
				.isDisplayed()) {

			System.out.println("The item is marked as saved for later");
		} else {
			System.out.println("The item is not marked for saved for later ");
		}

	}

	@Given("and user is on the saved for later page and user has already marked a item for save for later")
	public void and_user_is_on_the_saved_for_later_page_and_user_has_already_marked_a_item_for_save_for_later()
			throws InterruptedException {
		SavedForLaterAction.checkout();
		Thread.sleep(3000);
	}

	@Then("it should get display in saved for later page")
	public void it_should_get_display_in_saved_for_later_page() throws InterruptedException {
		SavedForLaterAction.checkout();
		Thread.sleep(3000);
	}

	@Override
	public void MousehOver() {

		Actions act = new Actions(SeleniumDriver.getDriver());
		act.moveToElement(SavedForLaterLocator.Saveforlater).build().perform();

	}

	@Override
	public void ScrooltoElement(String Element) {
		JavascriptExecutor js = (JavascriptExecutor) SeleniumDriver.getDriver();
		WebElement item = SeleniumDriver.getDriver().findElement(By.xpath("//*[contains(text(),'" + Element + "')]"));
		js.executeScript("arguments[0].scrollIntoView(true);", item);

	}
}
