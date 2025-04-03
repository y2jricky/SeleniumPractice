package seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementDisplayedException {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		boolean flag = driver.findElement(By.className("img-responsive")).isDisplayed();
		System.out.println(flag);
		/*
		 * Actually here in line number 17, we we pass wrong locator, then isDisplayed
		 * method won't return false. It will throw NoSuchElement exception
		 */

		if (flag == true) {
			System.out.println("My image is displayed on the page");
		} else {
			System.out.println("My image is not displayed on the page");
		}

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static boolean isElementDisplayed(By locator) {
		try {
			return getElement(locator).isDisplayed();
		} catch (NoSuchElementException e) {

			System.out.println("Element is not displayed in the webpage :" + locator);
			return false;

		}

	}
}
