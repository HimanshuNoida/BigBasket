package Pages.locators;

import java.util.List;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePageLoginLocators {
	
	@FindBy(how=How.XPATH,using="//div[@class='grid grid-flow-col gap-x-6 h-9 mt-3.5 mb-2.5']/div[2]/div[2]/button")
	public WebElement LoginLabel;

	
	
	@FindBy(how=How.XPATH,using="//div[@class='flex flex-row']//input[@placeholder='Enter Phone number/ Email Id']")
	public WebElement MobileNumber;
	
	
	
	@FindBy(how=How.XPATH,using="//form[@class='w-71.5 pt-8.1 pb-2.5']/button")
	public WebElement Continue;
	
	
	
	@FindBy(how=How.XPATH,using="//form[@class='w-71.5 pt-4 pb-2.5']/button")
	public WebElement VerifyAndSubmit;
	
	
	@FindBy(how=How.XPATH,using="//*[contains(text(),'Got it')]")
	public WebElement Gotit;
	
	
	
	@FindBy(how=How.XPATH,using="//div[@class='flex gap-x-1.7 flex-row']/input")
	public List<WebElement> ListOFOTP;
	
	
	
	

}
