package seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementSelected {
	public static void main(String[] args) {

		BrowserUtils brutil = new BrowserUtils();
		WebDriver driver = brutil.initDriver("edge");
		brutil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		By checkbox = By.name("agree");

		ElementUtil eleutil = new ElementUtil(driver);
		boolean b1 = eleutil.isElementSelected(checkbox);
		System.out.println(b1);
		eleutil.doClick(checkbox);
		boolean b2 = eleutil.isElementSelected(checkbox);
		System.out.println(b2);

	}

}
