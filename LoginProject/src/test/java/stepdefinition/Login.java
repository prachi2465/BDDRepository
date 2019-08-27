package stepdefinition;

import cucumber.api.java.en.Given;

public class Login {
	
	@Given("^I want to open application$")
	public void i_want_to_open_application() throws Throwable {
		
		System.out.println("Application is launched");
		
	}

	@Given("^Login with username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void login_with_username_and_password(String arg1, String arg2) throws Throwable {
		
		if(arg1.equals("admin") && arg2.equals("rpass123")) {
			System.out.println("Welcome");
		}else {
			System.out.println("Invalid username password");
		}
	
	}
	
}
