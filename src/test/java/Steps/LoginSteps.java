package Steps;

import Pages.actions.HomePageLoginActions;
import Util.SeleniumDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	HomePageLoginActions homePage = new HomePageLoginActions();

	/*
	 * @Given("User is on the Home Page of the Website {string}") public void
	 * user_is_on_the_home_page_of_the_website(String URL) {
	 * 
	 * 
	 * SeleniumDriver.getDriver().get(URL);
	 * 
	 * }
	 * 
	 * @When("user  enter the  <{string}>") public void user_enter_the(String
	 * Mobile_Number) throws InterruptedException {
	 * 
	 * 
	 * homePage.Login();
	 * 
	 * }
	 * 
	 * @And("enter the OTP") public void enter_the_otp() throws InterruptedException
	 * {
	 * 
	 * Thread.sleep(5000000); homePage.EnterOTP(" ");
	 * 
	 * }
	 * 
	 * @Then("user able to login into the website") public void
	 * user_able_to_login_into_the_website() {
	 * System.out.println("User checked correct username and correct password");
	 * 
	 * 
	 * }
	 */

	@Given("User is on the Home Page of the Website {string}")
	public void user_is_on_the_Home_Page_of_the_Website(String URL) {
		SeleniumDriver.getDriver().get(URL);
		String window1 = SeleniumDriver.getDriver().getWindowHandle();
		System.out.println(window1);

	}

	@When("user  enter the  {string}")
	public void user_enter_the(String MobileNumber) throws InterruptedException {
		homePage.Login(MobileNumber);

	}

	@When("enter the {string}")
	public void enter_the(String OTP) throws InterruptedException {

		homePage.WrongOTP(OTP);
	}

	@Then("user not able to login into the website")
	public void user_not_able_to_login_into_the_website() {

		System.out.println("user not able to login");
	}

	@When("enter the OTP")
	public void enter_the_OTP() throws InterruptedException {
		homePage.enterOTP();

	}

	@Then("user able to login into the website")
	public void user_able_to_login_into_the_website() {
		System.out.println("If OTP is correct The user is able to");

	}

}
