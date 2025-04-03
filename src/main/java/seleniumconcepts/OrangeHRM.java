package seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrangeHRM {
	
	public static void main(String[] args) {
		String browserName = "chrome";
		BrowserUtils brUtil = new BrowserUtils();
		WebDriver driver = brUtil.initDriver(browserName);
		brUtil.launchUrl("https://www.orangehrm.com/30-day-free-trial");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		By userName = By.id("Form_getForm_subdomain");
		By firstName = By.id("Form_getForm_Name");
		By email = By.id("Form_getForm_Email");
		By phoneNumber = By.id("Form_getForm_Contact");
		By countryDropDown = By.id("Form_getForm_Country");
		eleUtil.doSendKeys(userName, "y2jricky");
		eleUtil.doSendKeys(firstName, "Biswajit");
		eleUtil.doSendKeys(email, "biswajit.ricky031@outlook.com");
		eleUtil.doSendKeys(phoneNumber, "9438065665");
		eleUtil.selectDropDownValueByVisibleText(countryDropDown, "India");
	}
	

}
