package Steps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import Pages.actions.HomePageFilterDispayFilterActions;
import Util.SeleniumDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public  class ShopByCategorySteps extends CommonMethods{
	String title = "bigbasket.com/";
	Pages.actions.ShopByCategoryActions ShopByCategoryAction = new Pages.actions.ShopByCategoryActions();

	HomePageFilterDispayFilterActions HomePageFilterDispayFilterAction = new HomePageFilterDispayFilterActions();


	String category1;
	String category2;
	String category3;
	String category4;
	String category5;

	String[] string1;

	@Given("user was already login and is on the HomePage of the website")
	public void user_was_already_login_and_is_on_the_home_page_of_the_website() {
		String pageTitle = SeleniumDriver.getDriver().getTitle();
		if (pageTitle.contains(title)) {
			System.out.println("The user has been logined and on the HomeLanding Page");
		} else {
			System.out.println("The User is on the wrong page ");
		}

	}

	@When("user clicks the shop by category button")
	public void user_clicks_the_shop_by_category_button() throws InterruptedException {

		ShopByCategoryAction.shopBycateegoryButton();

	}

	@And("selects any category like below")
	public void selects_any_category_like_below(io.cucumber.datatable.DataTable dataTable) {

		List<List<String>> data = dataTable.asLists();

		System.out.println(category1 = data.get(0).get(0));
		System.out.println(category2 = data.get(0).get(1));
		System.out.println(category3 = data.get(0).get(2));
		System.out.println(category4 = data.get(0).get(3));
		System.out.println(category5 = data.get(0).get(4));

		String[] string = { category1, category2, category3, category4, category5 };
		string1 = string;

	}

	@Then("particular categoryName should come in the  title bar")
	public void particular_category_name_should_come_in_the_title_bar() throws InterruptedException {
		ShopByCategoryAction.ListOfCategory(string1, HomePageFilterDispayFilterAction);

	}

	@Override
	public void ScrooltoElement(String Element) {
		
		
	}


	

	
	
}
