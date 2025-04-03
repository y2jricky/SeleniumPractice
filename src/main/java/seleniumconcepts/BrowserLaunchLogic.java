package seleniumconcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunchLogic {
	
	public static void main(String[] args) {
		
		WebDriver driver = null;
		String browserName = "Edge";
		
		if (browserName.equals("chrome")) {
			driver = new ChromeDriver();
		}
		else if (browserName.equals("edge")) {
			driver = new EdgeDriver();
		}
		else if (browserName.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		else {
			System.out.println("please pass a correct browser name : "  +browserName);
		}
		
		driver.get("https://www.magicbricks.com/?reqFrom=OA");
		driver.manage().window().maximize();
		driver.close();
	}

}
