package seleniumconcepts;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ElementUtil {
	private WebDriver driver;

	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}

	// Utility for findElement method

	public WebElement getElement(By loctor) {
		return driver.findElement(loctor);
	}

	// This is the utility for findElements() method
	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	// This method will return how many number of elements are available
	public int getElementsCount(By locator) {
		return getElements(locator).size();
	}

	// This method will capture and print text from all the elements
	// Here in the for loop, once I will get my element which is not zero length, I
	// will add them into my list of String arrays
	public List<String> getElementTexts(By locator) {
		List<WebElement> eleList = getElements(locator);
		List<String> eleTextList = new ArrayList<String>();

		for (WebElement e : eleList) {
			String eleText = e.getText();
			if (eleText.length() != 0) {
				eleTextList.add(eleText);
			}
		}
		return eleTextList;
	}

	// This method will print all the text from links or images (based on the
	// locator)

	public void printElementTexts(By locator) {
		List<String> eleTextList = getElementTexts(locator);
		for (String s : eleTextList) {
			System.out.println(s);
		}
	}

	// Utility for sendkeys

	public void doSendKeys(By loctor, String value) {
		getElement(loctor).sendKeys(value);
	}

	// Overloaded doSendKeys method as it will accept Charsequence

	public void doSendKeys(By loctor, CharSequence... value) {
		getElement(loctor).sendKeys(value);
	}

	// Utility for click method

	public void doClick(By locator) {
		getElement(locator).click();
	}

	// Utility for get text method

	public String getElementText(By locator) {
		String eleText = getElement(locator).getText();
		if (eleText != null) {
			return eleText;
		} else {
			return null;
		}
	}
	// Utility for isDisplayed method

	public boolean isElementDisplayed(By locator) {
		try {
			return getElement(locator).isDisplayed();
		} catch (NoSuchElementException e) {

			System.out.println("Element is not displayed in the webpage :" + locator);
			return false;

		}

	}

	// This is utility method for isEnabled
	public boolean isElementEnabled(By locator) {
		return getElement(locator).isEnabled();
	}

	// This is utility method for isSelected
	public boolean isElementSelected(By locator) {
		return getElement(locator).isSelected();
	}

	// This method will check if element is present on the page or not using
	// findElements() method
	public boolean isElementPresent(By locator) {
		if (getElementsCount(locator) == 1) {
			return true;
		}
		return false;
	}

	// This method will check how many element is present on the page or not using
	// findElements() method
	public boolean isElementPresent(By locator, int expectedElementCount) {
		if (getElementsCount(locator) == expectedElementCount) {
			return true;
		}
		return false;
	}

	// This method will check if element is not present on the page or not using
	// findElements() method
	public boolean isElementNotPresent(By locator) {
		if (getElementsCount(locator) == 0) {
			return true;
		}
		return false;
	}

	// This method will check if element is not present on the page multiple times
	// or not
	public boolean isElementPresentMultipleTimes(By locator) {
		if (getElementsCount(locator) >= 1) {
			return true;
		}
		return false;
	}

	// *********************Select class Utilities***************//
	
	/*
	 * Why we use this below private method getSelect() ??? else every time we need
	 * to write Select sel = new Select(getElement(locator))
	 */

	private Select getSelect(By locator) {
		return new Select(getElement(null));
	}
	
	
	/* This method will select the value from the dropdown based on visible text */
	/*
	 * public void selectDropDownValueByVisibleText(By locator, String visibleText)
	 * { Select sel = new Select (getElement(locator));
	 * sel.selectByVisibleText(visibleText); }
	 */

	/* This method will select the value from the dropdown based on visible text */
	public void selectDropDownValueByVisibleText(By locator, String visibleText) {
		getSelect(locator).selectByVisibleText(visibleText);
	}

	/* This method will select the value from the dropdown based on index */
	public void selectDropDownValueByIndex(By locator, int index) {
		getSelect(locator).selectByIndex(index);
	}

	/* This method will select the value from the dropdown based on value */
	public void selecDropDownValueByValue(By locator, String value) {
		getSelect(locator).selectByValue(value);
	}

	/* This method will return the number of options present in the drop down */
	public int getDropDownOptions(By locator) {
		return getSelect(locator).getOptions().size();
	}

	/*
	 * This method will return the text from the down down (like print all the
	 * dropdown options)
	 */

	public List<String> getDropDownOptionsListText(By locator) {
		List<WebElement> dropDownList = getSelect(locator).getOptions();
		System.out.println(dropDownList.size());
		List<String> dropDownListText = new ArrayList<String>();

		for (WebElement e : dropDownList) {
			String text = e.getText();
			dropDownListText.add(text);// here we are adding the drop down options to an arraylist
		}
		return dropDownListText;

	}

	/* This method will select drop down value without Select class */
	public void selectDropDownValueWithOutSelect(By locator, String value) {
		List<WebElement> dropDownElement = getElements(locator);
		int dropDownSize = dropDownElement.size() - 1;
		System.out.println(dropDownSize);

		for (WebElement e : dropDownElement) {
			String text = e.getText();
			System.out.println(text);
			if (text.equals(value)) {
				e.click();
				break;
			}

		}
	}

	/*
	 * This method will select drop down value using select class
	 */
	public void selectDropDownValueUsingSelect(By locator, String value) {
		List<WebElement> allDropDownElements = getSelect(locator).getOptions();
		int dropDownOptions = allDropDownElements.size() - 1;
		System.out.println(dropDownOptions);

		for (WebElement e : allDropDownElements) {
			String text = e.getText();
			System.out.println(text);
			if (text.equals(value)) {
				e.click();
				break;
			}

		}

	}
	// *********************Select class Utilities End Here***************//
	

}
