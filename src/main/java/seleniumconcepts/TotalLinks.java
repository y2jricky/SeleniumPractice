package seleniumconcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinks {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		int totalLinks;
		int totalLinksWithText=0;
		int totalLinksWithoutText=0;
		
		List <WebElement>list = driver.findElements(By.tagName("a"));
		totalLinks= list.size();
		System.out.println("total number of links: " +totalLinks);
		
		for (int i=0; i<totalLinks; i++) {
			String text = list.get(i).getText();
			if (text.length()!=0) {
				totalLinksWithText++;
				System.out.println(text);
			}
			else {
				totalLinksWithoutText++;
				
			}
		}
		System.out.println("number of links with text : " +totalLinksWithText);
		System.out.println("number of links without text : " +totalLinksWithoutText);
	}

}
