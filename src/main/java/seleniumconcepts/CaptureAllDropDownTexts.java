package seleniumconcepts;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CaptureAllDropDownTexts {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial");
		By countryDropDown = By.id("Form_getForm_Country");
		/*
		 * Select sel = new Select(driver.findElement(countryDropDown));
		 * List<WebElement> dropDownList = sel.getOptions();
		 * System.out.println(dropDownList.size());
		 * 
		 * for (WebElement e : dropDownList) { String text = e.getText();
		 * System.out.println(text); }
		 */
		
		if(getDropDownListText(countryDropDown).contains("India1")) {
			System.out.println("PASS");
		}
		
		List <String> dropDownOptionsList = Arrays.asList("Australia", "Indonesia");
		if(getDropDownListText(countryDropDown).containsAll(dropDownOptionsList)) {
			System.out.println("PASS");
		}

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static List<String> getDropDownListText(By locator) {
		Select sel = new Select(getElement(locator));
		List<WebElement> dropDownList = sel.getOptions();
		System.out.println(dropDownList.size());
		List<String> dropDownListText = new ArrayList<String>();

		for (WebElement e : dropDownList) {
			String text = e.getText();
			dropDownListText.add(text);
		}
		return dropDownListText;

	}

}
