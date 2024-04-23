package Pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import Pages.actions.ShopByCategoryActions;

public class HomePageUserDetailsLocators {
	
	@FindBy(how=How.XPATH,using="//div[@class='MemberDropdown___StyledDiv-sc-ce95dd-0 drTWhv']/button")
	public WebElement userIcon;
	
	
	
}
