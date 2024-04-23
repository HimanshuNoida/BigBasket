package Steps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import Pages.actions.CommonM;
import Util.SeleniumDriver;

public abstract class CommonMethods implements CommonM {

	static savedFoLater saved = new savedFoLater();

	public abstract void ScrooltoElement(String Element);

	public static void clickaddtocart() {

		List<WebElement> list = SeleniumDriver.getDriver().findElements(By.xpath("//button[contains(text(),'Add')]"));

		int size = list.size();
		for (int i = 0; i < size; i++) {
			WebElement addtocart = list.get(0);
			
			addtocart.click();
			break;
		}

		saved.ScrooltoElement("");

	}



	@Override
	public void MousehOver() {
		
		

	}

}