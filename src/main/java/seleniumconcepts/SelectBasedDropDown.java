package seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectBasedDropDown {
	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial");
		By country = By.id("Form_getForm_Country");
		WebElement countryDropDown = driver.findElement(country);
		Select sel = new Select(countryDropDown);
		sel.selectByVisibleText("Somalia");
		
		
	}

}
