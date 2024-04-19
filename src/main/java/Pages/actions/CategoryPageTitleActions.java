package Pages.actions;

import org.openqa.selenium.support.PageFactory;

import Util.SeleniumDriver;

public class CategoryPageTitleActions {

	Pages.locators.CategoryTitleLocators CategoryTitleLocators = null;

	public CategoryPageTitleActions() {
		
		this.CategoryTitleLocators=new Pages.locators.CategoryTitleLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), CategoryTitleLocators);

	}
	
	


}
