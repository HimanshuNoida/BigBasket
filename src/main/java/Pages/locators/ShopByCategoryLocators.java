package Pages.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ShopByCategoryLocators {

	@FindBy(how = How.XPATH, using = "//div[@class='Header___StyledCategoryMenu2-sc-19kl9m3-13 ibVaum']/div/div/button")
	public WebElement ShopByCategory;

	@FindBy(how = How.XPATH, using = "//div[@class='CategoryMenu___StyledMenuItems-sc-d3svbp-4 cAslOa']/nav/ul[1]/li")
	public List<WebElement> list;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Add')]")
	public WebElement Add;

}
