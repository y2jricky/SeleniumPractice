package seleniumconcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class DropDownHandleWithoutSelectClass {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new EdgeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial");

		By dropDown = By.xpath("//select[@id='Form_getForm_Country']/option");

		List<WebElement> dropDownElement = driver.findElements(dropDown);
		int dropDownSize = dropDownElement.size() - 1;
		System.out.println(dropDownSize);

		for (WebElement e : dropDownElement) {
			String text = e.getText();
			System.out.println(text);
		}

	}

	public static void selectDropDownValue(By locator, String value) {
		List<WebElement> dropDownElement = driver.findElements(locator);
		int dropDownSize = dropDownElement.size() - 1;
		System.out.println(dropDownSize);

		for (WebElement e : dropDownElement) {
			String text = e.getText();
			System.out.println(text);
			if (text.equals(value)) {
				e.click();
				break;
			}

		}

	}

}
