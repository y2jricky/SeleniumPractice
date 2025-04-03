package seleniumconcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		By search = By.id("APjFqb");
		WebElement searchBox = driver.findElement(search);
		searchBox.sendKeys("undertaker");
		Thread.sleep(3000);
		
		By list = By.xpath("//ul/li//div[@class='wM6W7d']/span");
		List <WebElement> suggestionsList = driver.findElements(list);
		
		int listSize = suggestionsList.size();
		System.out.println(listSize);
		for(WebElement e : suggestionsList) {
			String text = e.getText();
			System.out.println(text);
			if (text.contains("brother")) {
				e.click();
				break;
			}
		}
	}
	
	 

}
