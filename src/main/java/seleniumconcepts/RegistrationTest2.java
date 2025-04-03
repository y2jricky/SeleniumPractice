package seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationTest2 {

	public static void main(String[] args) {

		By firstName = By.id("input-firstname");
		By lastName = By.name("lastname");
		By email = By.xpath("//*[@id=\"input-email\"]");
		By telephone = By.cssSelector("#input-telephone");
		By password = By.id("input-password");
		By confirmPassword = By.id("input-confirm");
		By subscribe = By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input");
		By privacy = By.cssSelector("#content > form > div > div > input[type=checkbox]:nth-child(2)");
		By submitBtn = By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
		By head = By.tagName("h1");

		BrowserUtils brUtil = new BrowserUtils();
		WebDriver driver = brUtil.initDriver("chrome");
		brUtil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys(firstName, "Biswajit");
		eleUtil.doSendKeys(lastName, "Mahapatra");
		eleUtil.doSendKeys(email, "shtf@gmail.com");
		eleUtil.doSendKeys(telephone, "9999999999");
		eleUtil.doSendKeys(password, "@stoneCold316");
		eleUtil.doSendKeys(confirmPassword, "@stoneCold316");
		eleUtil.doClick(privacy);
		eleUtil.doClick(submitBtn);

		/*
		 * WebElement header = driver.findElement(head); String headerText =
		 * header.getText(); if (headerText.equals("Your Account Has Been Created!")) {
		 * System.out.println("PASS"); } else { System.out.println("FAIL"); }
		 */

		String header = eleUtil.getElementText(head);
		if (header.equals("Your Account Has Been Created!")) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}

	}

}
