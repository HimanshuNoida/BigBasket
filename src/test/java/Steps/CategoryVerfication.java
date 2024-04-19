package Steps;

import org.openqa.selenium.By;
import org.testng.Assert;

import Util.SeleniumDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CategoryVerfication {

	Boolean flag;

	String categoryTitle;
	String category;

	@Given("user was already  login and on the HomaPage of the website {string}")
	public void user_was_already_login_and_on_the_HomaPage_of_the_website(String WebSiteTitle) {

		String title = SeleniumDriver.getDriver().getTitle();
		System.out.println(title);
		if (title.contains(WebSiteTitle)) {
			flag = true;

		} else {
			flag = false;
		}

		// System.out.println(flag);
		// Assert.assertTrue(flag);
	}

	@When("user clik these {string} as below")
	public void user_clik_these_as_below(String category) throws InterruptedException {

	
		category = category;
		SeleniumDriver.getDriver().navigate().refresh();
		SeleniumDriver.getDriver().findElement(By.xpath(
				"//div[@class='TopNav___StyledDiv-sc-1vxbycn-0 iDyRZn']/ul/li/a[@href='https://www.bigbasket.com/pc/fruits-vegetables/"
						+ category + "']")).click();

		categoryTitle = SeleniumDriver.getDriver().getTitle();
		
		System.out.println(categoryTitle);
	}

	@Then("particular category should get displayed in the title")
	public void particular_category_should_get_displayed_in_the_title() {

		Assert.assertEquals(categoryTitle, category);

	}

}
