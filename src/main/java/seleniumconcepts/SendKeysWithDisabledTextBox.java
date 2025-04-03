package seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysWithDisabledTextBox {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
		driver.findElement(By.id("pass")).sendKeys("testest");//It Will throw exception
		
		//Exception in thread "main" org.openqa.selenium.ElementNotInteractableException: element not interactable
		
		driver.findElement(By.id("pass")).click();//No Exception, but it won't work
	}

}
