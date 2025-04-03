package seleniumconcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetvsNavigate {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.get("https://www.flipkart.com/");
		driver.navigate().back();
		driver.navigate().forward();

	}

}
