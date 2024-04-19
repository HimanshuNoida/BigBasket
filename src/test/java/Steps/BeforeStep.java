package Steps;

import Util.SeleniumDriver;

public class BeforeStep {

	static String tite;

	@io.cucumber.java.BeforeStep("@ShopByCategory")
	public void getTtile() {
		String title = SeleniumDriver.getDriver().getTitle();
		System.out.println(title);

	}

}
