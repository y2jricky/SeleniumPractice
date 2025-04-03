package myTest;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class FirstTestNGConcepts {
	
	//Annotation----> Special character starts with @
	
	@BeforeSuite
	public void connectDB () {
		System.out.println("Connect with DB");
	}
	
	@BeforeTest
	public void createUser () {
		System.out.println("Connect with DB");
	}

}
