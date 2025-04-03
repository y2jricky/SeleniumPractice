package seleniumconcepts;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsTotalLinks {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		List<WebElement> elements = driver.findElements(By.tagName("a"));// Capture all links having tag name a
		int totalLinks = elements.size();// get the count of total number of links
		System.out.println("the total number of links present in the page : " + totalLinks);// print on the console

		for (int i = 0; i < totalLinks; i++) {
			String linkname = elements.get(i).getText();
			if (linkname.length() != 0) {
				System.out.println(linkname);
			} 

		}

	}
}
