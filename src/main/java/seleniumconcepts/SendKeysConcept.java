package seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysConcept {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		WebElement email= driver.findElement(By.id("input-email"));
		
		String name = "Biswajit";
		StringBuffer sf = new StringBuffer("mahapatra");
		StringBuilder sb = new StringBuilder("y2jricky");
		String s = null;
		
		email.sendKeys(name, sf, sb);
		
		email.sendKeys(null);//It will throw exception
		
		email.sendKeys(name, sf, sb, null);//It will throw exception
		
		email.sendKeys(name, sf, sb, s);//It will throw exception
		
		//Exception in thread "main" java.lang.IllegalArgumentException: Keys to send should be a not null CharSequence//
	}
	
	

}
