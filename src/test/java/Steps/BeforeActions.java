package Steps;

import Util.SeleniumDriver;
import io.cucumber.java.Before;


public class BeforeActions {

	@Before
	public void setUpDriver() {

		SeleniumDriver.setDriver();

	}

}
