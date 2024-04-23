package Pages.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SavedForLaterLocators {

	@FindBy(how = How.XPATH, using = "//span[contains(.,'Gillette')]/ancestor::h3/following-sibling::div[@class='flex flex-col false']//button[@class='Button-sc-1dr2sn8-0 CtaButtons___StyledButton-sc-1tlmn1r-0 hlIKGt jWnUIa']")
	public WebElement Saveforlater;
	//button[@id='headlessui-popover-button-:ri:']//button[@class='Button-sc-1dr2sn8-0 CtaButtons___StyledButton-sc-1tlmn1r-0 hlIKGt jWnUIa']//*[name()='svg']//*[name()='g' and contains(@mask,'url(#SaveI')]//*[name()='path' and contains(@fill,'#202020')]
	

	@FindBy(how = How.XPATH, using = "//button[@class='Button-sc-1dr2sn8-0 Header___StyledButton-sc-19kl9m3-6 FCIoq gKUOcO']")
	public WebElement checkout;

}
