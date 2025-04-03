package seleniumconcepts;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverManagerConcept {
	/*
	 * Before selenium 4.6.0 version, we should set the system property path
	 * (chromedriver.exe). 
	 * We have to configure .exe file. After 4.6.0 version onwards
	 * no need to configure the .exe file
	 * System.setProperty (String key, String value);
	 * System.setProperty ("webdriver.chrome.driver", "\\....path\\chromedriver.exe");
	 * From selenium 4.6.0 selenium manager/webdriver manager is part of selenium.
	 */
	
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
	}

}
