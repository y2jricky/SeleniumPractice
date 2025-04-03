package seleniumconcepts;

//In this class we will create our own exception

public class BrowserException extends RuntimeException{
	
	public BrowserException (String mesg) {
		super(mesg);
	}
	

}
