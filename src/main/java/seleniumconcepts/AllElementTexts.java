package seleniumconcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllElementTexts {
	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By links = By.tagName("a");
		getElementTexts(links);
	}
	
	// This is the utility for findElements() method
		public static List<WebElement> getElements(By locator) {
			return driver.findElements(locator);
		}

		// This method will return how many number of elements are available
		public static int getElementCount(By locator) {
			return getElements(locator).size();
		}

		// This method will capture and print text from all the elements
		public static void getElementTexts(By locator) {
			List<WebElement> lst = getElements(locator);
			int size = lst.size();
			System.out.println(size);

			for (WebElement e : lst) {
				String text = e.getText();
				if (text.length() != 0) {
					System.out.println(text);
				}
			}
		}

}
