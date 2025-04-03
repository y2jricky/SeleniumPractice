package seleniumconcepts;

import org.openqa.selenium.WebDriver;

public class OpencartTest {
	public static void main(String[] args) {

		// Create object of browser util class
		BrowserUtils brUtil = new BrowserUtils();

		// Open browser
		WebDriver driver = brUtil.initDriver("edge");

		// Launch URL
		brUtil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		// fetch the title of the page
		String title = brUtil.getPageTitle();
		System.out.println(title);
		if (title.contains("Account")) {
			System.out.println("Page title is correct");
		} else {
			System.out.println("Page title is incorrect");
		}

		// fetch the title of the page
		String url = brUtil.getPageUrl();
		System.out.println(url);

		// quit the browser
		brUtil.quitBrowser();

	}

}
