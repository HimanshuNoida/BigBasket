package Pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import Util.SeleniumDriver;

public class ShopByCategoryActions {

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

		try {
			for (int j = 0; j < size; j++) {
				System.out.println("j=" + j);
				WebElement string = ShopByCategoryLocators.list.get(j);
				System.out.println(SeleniumDriver.getDriver().getTitle());
				string.click();
				System.out.println("string=" + string);
				Thread.sleep(3000);
				a1.FilterDisplay();
				ShopByCategoryLocators.ShopByCategory.click();
				System.out.println("hoi");
				Thread.sleep(7000);

			}
		} catch (Exception e) {

			System.out.println("The Exception handled ");
		}

	}
}
