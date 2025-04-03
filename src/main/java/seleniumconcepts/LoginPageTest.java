package seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageTest {
	public static void main(String[] args) {

		BrowserUtils brUtil = new BrowserUtils();
		WebDriver driver = brUtil.initDriver("chrome");
		brUtil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		System.out.println(brUtil.getPageUrl());
		System.out.println(brUtil.getPageTitle());

		By email = By.id("input-email");
		By password = By.id("input-password");

		ElementUtil elUtil = new ElementUtil(driver);
		elUtil.doSendKeys(email, "test@gmail.com");
		elUtil.doSendKeys(password, "Test@123");
		
		brUtil.closeBrowser();
	}

}
