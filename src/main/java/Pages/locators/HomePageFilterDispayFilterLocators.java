package Pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePageFilterDispayFilterLocators {

	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Hide Filter']")
	public WebElement HidefilterDisplay;

	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Show Filter']")
	public WebElement showfilterDisplay;

}
