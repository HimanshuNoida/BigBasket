package Steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserDetails {

	
	Pages.actions.HomePageUserDetailsActions HomePageUserDetailsActions=new Pages.actions.HomePageUserDetailsActions();
	
	@When("user click on the  user detail icon")
	public void user_click_on_the_user_detail_icon() {
	
		HomePageUserDetailsActions.UserDetailsIcon();
	}

	@Then("is able to see all the {string} options")
	public void is_able_to_see_all_the_options(String Options) throws InterruptedException {
		
		HomePageUserDetailsActions.HomeuserDetailOption(Options);
	}
}
