package Pages.actions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Util.SeleniumDriver;

public class ShopByCategoryActions implements Addtoccart {

	Pages.locators.ShopByCategoryLocators ShopByCategoryLocators = null;

	public ShopByCategoryActions() {

		this.ShopByCategoryLocators = new Pages.locators.ShopByCategoryLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), ShopByCategoryLocators);

	}

	public void shopBycateegoryButton() throws InterruptedException {

		ShopByCategoryLocators.ShopByCategory.click();
		Thread.sleep(3000);
		ShopByCategoryLocators.ShopByCategory.click();

	}

	public void ListOfCategory(String[] link, HomePageFilterDispayFilterActions a1) throws InterruptedException {
		ShopByCategoryLocators.ShopByCategory.click();

		System.out.println("link=" + link.length);

		int size = ShopByCategoryLocators.list.size();
		System.out.println("size=" + size);

		for (int j = 0; j < size; j++) {

			try {
				System.out.println("j=" + j);
				WebElement string = ShopByCategoryLocators.list.get(j);
				String ExpectedTitle = string.getText().toLowerCase();
				System.out.println("ExpectedTitle=" + ExpectedTitle);
				string.click();
				System.out.println("string=" + string);
				Thread.sleep(3000);
				a1.FilterDisplay();
				Thread.sleep(3000);
				ShopByCategoryActions ShopByCategoryAction = new ShopByCategoryActions();
				scrollby();
				Thread.sleep(10000);
				ShopByCategoryAction.Addtoccart();
				// ClickAddby();
				scrollupby();
				String ActualTitle = SeleniumDriver.getDriver().getCurrentUrl();
				System.out.println("Actualtitle=" + ActualTitle);
				if (ActualTitle.contains(ExpectedTitle)) {
					System.out.println("The title is coming as per the category clicked ");
				}
				System.out.println("hoi");
				System.out.println("h");
				Thread.sleep(9000);

				ShopByCategoryLocators.ShopByCategory.click();
				Thread.sleep(4000);
			} catch (ElementClickInterceptedException e) {
				System.out.println("k");

				System.out.println("There is  a exception in last category clicking ");
			}

		}

	}

	public void ClickAddby() {

		while (ShopByCategoryLocators.Add.isDisplayed()) {
			System.out.println("addding1");
			ShopByCategoryLocators.Add.click();
		}

	}

	public static void scrollby() {
		JavascriptExecutor jse = (JavascriptExecutor) SeleniumDriver.getDriver();
		jse.executeScript("window.scrollBy(0,500)", "");

	}

	@Override
	public void Addtoccart() {
		System.out.println("Adding");

		int s = 0;
		s = s + 1;
		WebElement list = SeleniumDriver.getDriver().findElement(By.xpath(

				"//div[@class='col-span-12 mt-3 mb-8']/div[2]/section[2]//li[1]/div/div/div[5]/div/div[2]/button"));

		list.click();
		
	

	}

	public static void scrollupby() {
		// Scroll to the top of the page
		JavascriptExecutor js = (JavascriptExecutor) SeleniumDriver.getDriver();
		js.executeScript("window.scrollTo(0, 0);");
	}

}