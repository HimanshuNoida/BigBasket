package Steps;

import Util.SeleniumDriver;

public class After {

	static String title;

	@io.cucumber.java.After("@ShopByCategory")
	public void getTtile() {

		title = SeleniumDriver.getDriver().getTitle();
		System.out.println(title);

	}

}
