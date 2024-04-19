package Pages.locators;

import java.util.List;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class searchProductLocators {

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'Header___StyledQuickSearch2-sc-19kl9m3-0 gzbZOD')]//input[contains(@placeholder,'Search for Products...')]")
	public WebElement searchbar;

	@FindBy(how=How.XPATH,using="//div[@class='col-span-12 pb-5 pt-2.5 mb-2 border-b border-dashed border-silverSurfer-400']/div/button")
	public  List<WebElement>list;
	
	
	@FindBy(how=How.XPATH,using="//*[contains(text(),‘Got it’)]")
	public WebElement Gotit;

}
