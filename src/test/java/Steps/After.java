package Steps;

import Util.SeleniumDriver;


public class After {

	static String tite;

	@io.cucumber.java.After("@ShopByCategory")
	public void getTtile() {

		String title = SeleniumDriver.getDriver().getTitle();
		System.out.println(title);

	}

}
