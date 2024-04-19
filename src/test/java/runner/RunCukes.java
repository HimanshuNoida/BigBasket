package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = { "json:target/positive/cucumber.json", "pretty", "html:target/RunCuke/cucumber.html",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, tags = "@Valid or @ShopByCategory ", glue = {
				"Steps" }, features = { "src/test/resources/features" })
public class RunCukes extends AbstractTestNGCucumberTests {

	
}
