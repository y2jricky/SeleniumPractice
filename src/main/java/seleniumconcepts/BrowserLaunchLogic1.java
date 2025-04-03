package seleniumconcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunchLogic1 {
	public static void main(String[] args) {

		String browserName = "edge";
		WebDriver driver = null;

		switch (browserName.trim().toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		default:
			System.out.println("Please enter correct browser name : " + browserName);
			break;
		}
		driver.get("https://www.magicbricks.com/?reqFrom=OA");
		driver.manage().window().maximize();
		driver.close();

	}

}
