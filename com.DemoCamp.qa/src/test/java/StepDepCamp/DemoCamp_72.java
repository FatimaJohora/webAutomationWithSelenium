package StepDepCamp;

import com.ActionsCamp.qa.HomepageActionCamp;
import com.ActionsCamp.qa.LoginpageActionCamp;
import com.ActionsCamp.qa.ProfilepageActionCamp;
import com.UtilityCamp.qa.BaseCamp;
import com.UtilityCamp.qa.ScreenshotsCamp;
import com.UtilityCamp.qa.TestDataCamp;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

 public class DemoCamp_72  extends BaseCamp {
	 
	 HomepageActionCamp  homepageActionCamp = new HomepageActionCamp();
	 LoginpageActionCamp  loginpageActionCamp = new LoginpageActionCamp();
	 ProfilepageActionCamp  profilepageActionCamp = new ProfilepageActionCamp();
	
	 @Given("^Launch the application<\"([^\"]*)\">$")
	 public void launch_the_application(String URL) throws Throwable {
	    
		 lunchURL(URL);
		 ScreenshotsCamp.takeCampScreenshot(driver, "Home Page");
	 }

    @When("^User click the Log in link on the Home page$")
    public void user_click_the_Log_in_link_on_the_Home_page() throws Throwable {
    
    homepageActionCamp.UserclicktheLoginlinkontheHomepage();
 }

    @When("^Enter a valid username$")
    public void enter_a_valid_username() throws Throwable {
    	
    	loginpageActionCamp.Enteravalidusername(TestDataCamp.uName);  
 }

    @When("^Enter a valid password$")
    public void enter_a_valid_password() throws Throwable {
    	
    	loginpageActionCamp.Enteravalidpassword(TestDataCamp.uPassword);
 }

   @When("^Click the Login button$")
   public void click_the_Login_button() throws Throwable {
	  
	   loginpageActionCamp.ClicktheLoginbutton();
	   
	   Thread.sleep(2000);
   
 }

    @Then("^Verify user can log in successfully$")
    public void verify_user_can_log_in_successfully() throws Throwable {
    	
    	profilepageActionCamp.Verifyusercanloginsuccessfully();
  
        ScreenshotsCamp.takeCampScreenshot(driver, "Profile Name");
        
        
 }
  
    @When("^Enter an invalid username$")
    public void enter_an_invalid_username() throws Throwable {
    	loginpageActionCamp.Enteraninvalidusername();
    }

    @When("^Enter an invalid password$")
    public void enter_an_invalid_password() throws Throwable {
     
    	loginpageActionCamp.Enteraninvalidpassword();
    }

    @Then("^Verify user can not log in successfully$")
    public void verify_user_can_not_log_in_successfully() throws Throwable {
    	
    	
    //	ScreenshotsCamp.takeCampScreenshot(driver, "User not exist pop up");
       
    	Thread.sleep(2000);
    	loginpageActionCamp.Verifyusercannotloginsuccessfully();
    	
    	Thread.sleep(2000);
    	
    }




 }
