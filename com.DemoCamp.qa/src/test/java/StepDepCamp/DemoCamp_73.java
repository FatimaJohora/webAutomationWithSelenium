package StepDepCamp;

import com.ActionsCamp.qa.HomepageActionCamp;
import com.ActionsCamp.qa.SignuppageActionCamp;
import com.UtilityCamp.qa.BaseCamp;
import com.UtilityCamp.qa.ScreenshotsCamp;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoCamp_73  extends BaseCamp {
	
	
	HomepageActionCamp  homepageActionCamp = new HomepageActionCamp();
	SignuppageActionCamp  signuppageActionCamp = new SignuppageActionCamp();
	
	@When("^User click the Signup link on the Home page$")
	public void user_click_the_Sign_up_link_on_the_Home_page() throws Throwable {
		
		homepageActionCamp.UserclicktheSignuplinkontheHomepage();
	   
	}
	@Then("^Verify the Username field on the Sign-up page$")
	public void verify_the_Username_field_on_the_Sign_up_page() throws Throwable {
		
		
		signuppageActionCamp.VerifytheUsernamefieldontheSignuppage();
		
	}


	@When("^Empty username field$")
	public void empty_username_field() throws Throwable {
		
		signuppageActionCamp.Emptyusernamefield();
	}

	@When("^Empty password field$")
	public void empty_password_field() throws Throwable {
		
		signuppageActionCamp.Emptypasswordfield();
		Thread.sleep(2000);
	}

	@When("^User click on the Signup button$")
	public void user_click_on_the_Signup_button() throws Throwable {
		
		signuppageActionCamp.UserclickontheSignupbutton();
		
		
	}

	@Then("^Verify user can not Sign up$")
	public void verify_user_can_not_Sign_up() throws Throwable {
	  
		signuppageActionCamp.VerifyusercannotSignup();
		
	}
	
	@When("^Enter a username in the username field$")
	public void enter_a_username_in_the_username_field() throws Throwable {
		
		signuppageActionCamp.Enterausernameintheusernamefield();
	   
	}

	@When("^Enter a password in the password field$")
	public void enter_a_password_in_the_password_field() throws Throwable {
		
		signuppageActionCamp.Enterapasswordinthepasswordfield();
		
	}

	@Then("^Verify user can  register successfully$")
	public void verify_user_can_register_successfully() throws Throwable {
		 
		signuppageActionCamp.Verifyusercanregistersuccessfully();
		
		ScreenshotsCamp.takeCampScreenshot(driver,"Sign Up Successful" );
		
	
	}




}
