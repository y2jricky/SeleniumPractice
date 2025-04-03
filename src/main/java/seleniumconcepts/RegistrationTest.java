package seleniumconcepts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationTest {
	public static void main(String[] args) {
		
		By fName = By.id("input-firstname");
		By lName =By.id("input-lastname");
		By eid =By.id("input-email");
		By phn =By.id("input-telephone");
		By pwd =By.id("input-password");
		By cnfpwd =By.id("input-confirm");
		
		BrowserUtils brutils = new BrowserUtils();
		WebDriver driver = brutils.initDriver("chrome");
		
		brutils.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		System.out.println(brutils.getPageTitle());
		System.out.println(brutils.getPageUrl());
		
		ElementUtil elutil = new ElementUtil(driver);
		elutil.doSendKeys(fName, "Biswajit");
		elutil.doSendKeys(lName, "Mahapatra");
		elutil.doSendKeys(eid, "biswajit.qa2016@gmail.com");
		elutil.doSendKeys(phn, "9438065665");
		elutil.doSendKeys(pwd, "@stoneCold316");
		elutil.doSendKeys(cnfpwd, "@stoneCold316");
		
		
	}

}
