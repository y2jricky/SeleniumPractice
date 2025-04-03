package seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementEnabled {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
		
		boolean f1 = driver.findElement(By.id("fname")).isDisplayed();//ture
		boolean f2 = driver.findElement(By.id("fname")).isEnabled();//true
		boolean f3 = driver.findElement(By.id("pass")).isDisplayed();//true
		boolean f4 = driver.findElement(By.id("pass")).isEnabled();//false
		
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		System.out.println(f4);
		
	}

}
