package seleniumconcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalNumberOfTextBox {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		List <WebElement> list = driver.findElements(By.className("form-control"));
		int totalTextBox = list.size();
		System.out.println("Total number of text box is : " +totalTextBox);
		
		
	}

}
