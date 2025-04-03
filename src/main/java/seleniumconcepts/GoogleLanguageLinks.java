package seleniumconcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLanguageLinks {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		// 1 Using LinkText locator
		/*
		 * driver.findElement(By.linkText("ਪੰਜਾਬੀ")).click();
		 * System.out.println("its clicking on ਪੰਜਾਬੀ");
		 */

		// Using for loop and findElements

		By language = By.xpath("//div[@id='SIvCob']/a");
		List<WebElement> languageLinks = driver.findElements(language);
		int langCount = languageLinks.size();
		for (WebElement e : languageLinks) {
			String text = e.getText();
			System.out.println(text);
			if (text.contains("ਪੰਜਾਬੀ")) {
				e.click();
				System.out.println("its clicking on ਪੰਜਾਬੀ");
				break;
			}
		}
	}

}
