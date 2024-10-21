package testsuite;

import org.junit.Assert;
import org.openqa.selenium.edge.EdgeDriver;

import helper.Config;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.LoginPage;

public class LoginStepDef {

	
	@Given("Admin is on login page")
	public void admin_is_on_login_page() {
		
		Config.confEdge () ;
		Config.driver = new EdgeDriver ();
		Config.maximaze();
		String url = "https://practicetestautomation.com/practice-test-login/";
		Config.driver.get(url);
	   
	}

	@When("Admin enter correct user name and correct password")
	public void admin_enter_correct_user_name_and_correct_password() {
		LoginPage page = new LoginPage () ;
		
		page.connect("student", "Password123");
	    
	}

	@Then("Admin is directed to the homepage")
	public void admin_is_directed_to_the_homepage() {
		
		LoginPage page = new LoginPage ();
		String actualtext = page.verifMessageLogin();
		Assert.assertEquals("Logged In Successfully", actualtext);
	    
	}




}
