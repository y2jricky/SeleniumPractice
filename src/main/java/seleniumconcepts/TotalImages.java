package seleniumconcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalImages {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		List <WebElement> images = driver.findElements(By.tagName("img"));
		int totalImages = images.size();
		System.out.println("Total number of images available in this page : " +totalImages);
		
		for (WebElement e : images) {
			e.getAttribute("src");
		}
		
	}

}
