package Pages.actions;



import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import Pages.locators.searchProductLocators;
import Util.SeleniumDriver;

public class searchProductActions {

	searchProductLocators searchProductLocators = null;

	public searchProductActions() {

		this.searchProductLocators = new searchProductLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), searchProductLocators);
	}

	public void HomePageTitle() {

		String tilte = SeleniumDriver.getDriver().getTitle();
		System.out.println("tilte"); 
	//	searchProductLocators.Gotit.click();
		
	}

	public void searchBar(String tea) throws InterruptedException {
		searchProductLocators.searchbar.sendKeys(tea);
		Thread.sleep(3000);
		Actions act = new Actions(SeleniumDriver.getDriver());
		searchProductLocators.searchbar.sendKeys(Keys.ENTER);

	}

	public void list() {

		List<WebElement> list = searchProductLocators.list;
		int size = list.size();
		for (int i = 0; i < size; i++) {
			WebElement item = list.get(i);
			String string = item.getText();
			System.out.println(string);
		}

	}

}
