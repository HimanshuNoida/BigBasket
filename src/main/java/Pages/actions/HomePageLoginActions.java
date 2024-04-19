package Pages.actions;

import java.util.Arrays;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Util.SeleniumDriver;

public class HomePageLoginActions {


	Pages.locators.HomePageLoginLocators HomePageLoginLocators = null;



	public HomePageLoginActions() {



		this.HomePageLoginLocators = new Pages.locators.HomePageLoginLocators();

		PageFactory.initElements(SeleniumDriver.getDriver(), HomePageLoginLocators);



	}



	public void Login(String MobileNumber) throws InterruptedException {



		HomePageLoginLocators.LoginLabel.click();



		SeleniumDriver.wait.until(ExpectedConditions.elementToBeClickable(HomePageLoginLocators.MobileNumber));

		HomePageLoginLocators.MobileNumber.sendKeys(MobileNumber);

		Thread.sleep(4000);

		HomePageLoginLocators.Continue.click();



	}



	public void enterOTP() throws InterruptedException {

		Thread.sleep(40000);

		HomePageLoginLocators.VerifyAndSubmit.click();

		Thread.sleep(3000);

		HomePageLoginLocators.Gotit.click();

	}



	public void WrongOTP(String OTP) throws InterruptedException {



		System.out.println(OTP);



		String[] ch = new String[] { OTP };

		Arrays.toString(ch);

		int size = ch.length;

		System.out.println(size);

		for (int i = 0; i < size; i++) {

			String h = ch[i];

			System.out.println(ch[i]);

			HomePageLoginLocators.ListOFOTP.get(i).sendKeys(h);

			Thread.sleep(4000);

		}



		HomePageLoginLocators.VerifyAndSubmit.click();

		Thread.sleep(3000);

		HomePageLoginLocators.Gotit.click();

	}



}
