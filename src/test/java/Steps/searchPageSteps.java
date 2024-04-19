package Steps;

import Pages.actions.searchProductActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class searchPageSteps {

	searchProductActions searchProductActions = new searchProductActions();

	@Given("A user is on the hompage of the Website https:\\/\\/www.bigbasket.com\\/")
	public void a_user_is_on_the_hompage_of_the_Website_https_www_bigbasket_com() {
		searchProductActions.HomePageTitle();
		
	}

	@When("user search {string} in searh bar")
	public void user_search_in_searh_bar(String tea) throws InterruptedException {
		searchProductActions.searchBar(tea);
	}

	@Then("user is able to find the product in the list")
	public void user_is_able_to_find_the_product_in_the_list() {

		searchProductActions.list();
	

	}

}
