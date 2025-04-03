package seleniumconcepts;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebElementConcept {
	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//1st Approach
		driver.findElement(By.id("input-email")).sendKeys("test@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Test@123");
		
		
		//2nd Approach
		/*
		 * WebElement email = driver.findElement(By.id("input-email")); 
		 * WebElement password = driver.findElement(By.id("input-password"));
		 * email.sendKeys("test@gmail.com"); 
		 * password.sendKeys("Test@123");
		 */
		
		//3rd Approach (By locator concept)
		/*
		 * By email= By.id("input-email"); 
		 * By password= By.id("input-password");
		 * WebElement eid = driver.findElement(email); 
		 * WebElement pwd = driver.findElement(password);
		 * eid.sendKeys("test@gmail.com");
		 * pwd.sendKeys("Test@123");
		 */
		
		//4th Approach )By locator + generic method for findElement)
		/*
		 * By email= By.id("input-email"); 
		 * By password= By.id("input-password");
		 * getElement(email).sendKeys("test@gmail.com");
		 * getElement(password).sendKeys("Test@123");
		 */		
		
		//5th Approach (By locator + generic method for findElement+generic method for sendKeys)
		/*
		 * By email= By.id("input-email"); 
		 * By password= By.id("input-password");
		 * doSendKeys(email, "test@gmail.com"); 
		 * doSendKeys(password, "Test@123");
		 */
		
		//6th Approach (By locator+generic methods from utility class)
		 By email= By.id("input-email"); 
		 By password= By.id("input-password");
		 
		 ElementUtil elUtil = new ElementUtil(driver);
		 elUtil.doSendKeys(email, "test@gmail.com");
		 elUtil.doSendKeys(password, "Test@123");
	}
	
	public static WebElement getElement (By loctor) {
		return driver.findElement(loctor);
	}
	
	public static void doSendKeys(By loctor, String value) {
		getElement(loctor).sendKeys(value);
	}

}
