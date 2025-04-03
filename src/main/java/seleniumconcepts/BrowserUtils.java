package seleniumconcepts;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtils {
	private WebDriver driver;
	
	/**
	 * This method is used to initialize the driver based on the browser name
	 * @param browserName
	 * @return this returns driver
	 */
	public WebDriver initDriver (String browserName) {
		
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
			throw new BrowserException("======INVALID BROWSER++++++++++++");
		}
		return driver;
	}
	
	/**
	 * This method will launch the URL, we have added the condition here to check 
	 * if user has passed the correct URl with https/http and url length must not be zero
	 * @param url
	 */
	
	public void launchUrl (String url) {	
		if (url.indexOf("http")!=0 || url.length()==0) {
			throw new BrowserException("url is wrong as http is missing");
		}
		driver.get(url);
		driver.manage().window().maximize();
		
	}
	
	//Overload launch method
	public void launchUrl (URL url) {
		driver.navigate().to(url);
		driver.manage().window().maximize();
	}
	
	/**
	 * This method will close the browser
	 */
	public void closeBrowser () {
		driver.close();
	}
	
	/**
	 * This method will quit the browser
	 */
	
	public void quitBrowser () {
		driver.quit();
	}
	
	/**
	 * this method will fetch the page title
	 * @return
	 */
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	/**
	 * this method will fetch the page url
	 * @return
	 */
	public String getPageUrl() {
		return driver.getCurrentUrl();
	}

}
