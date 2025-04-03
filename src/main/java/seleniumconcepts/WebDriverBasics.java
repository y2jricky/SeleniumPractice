package seleniumconcepts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {
	public static void main(String[] args) {
		
		/*
		 * My first step is always to open the browser, then enter the URL.
		 * Before start testing any application, we need to open the browser first
		 */
		//Open browser
		WebDriver driver = new ChromeDriver();
		
		// Open the URL or launch the application
		
		driver.get("https://www.magicbricks.com/?reqFrom=OA");
		
		// Get the title of the page
		
		String actTitle = driver.getTitle();
		System.out.println("The title of my current page is : " +actTitle);
		
		//Check if my title is correct or not
		if(actTitle.equals("Real Estate | Property in India | Buy/Sale/Rent Properties | MagicBricks")) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
			
		driver.close();
		
		
		
	}

}
