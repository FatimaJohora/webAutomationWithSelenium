package StepDepCamp;

import com.ActionsCamp.qa.HomepageActionCamp;
import com.UtilityCamp.qa.BaseCamp;
import com.UtilityCamp.qa.ScreenshotsCamp;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoCamp_71 extends BaseCamp {
	
	HomepageActionCamp  homepageActionCamp = new HomepageActionCamp();
	
	@When("^Click the Home link on the Home page$")
	public void click_the_Home_link_on_the_Home_page() throws Throwable {
	  
		homepageActionCamp.ClicktheHomelinkontheHomepage();
		 Thread.sleep(3000);
	}

	@Then("^Verify Home page is accessible to the user$")
	public void verify_Home_page_is_accessible_to_the_user() throws Throwable {
	   
		homepageActionCamp.VerifyHomepageisaccessibletotheuser();
		 Thread.sleep(3000);
	}

	@Then("^Verify Contact page is accessible to the user$")
	public void verify_Contact_page_is_accessible_to_the_user() throws Throwable {
		
	    Thread.sleep(3000);
		ScreenshotsCamp.takeCampScreenshot(driver, " Contact Page");
	}

	@Then("^Verify About us page is accessible to the user$")
	public void verify_About_us_page_is_accessible_to_the_user() throws Throwable {
		
		Thread.sleep(3000);
		ScreenshotsCamp.takeCampScreenshot(driver, " Aboutus Page");
		
	}

	@When("^User click on Cart link in Homepage$")
	public void user_click_on_Cart_link_in_Homepage() throws Throwable {
		
		homepageActionCamp.UserclickonCartlinkinHomepage();
	}

	@Then("^Verify Cart page is accessible to the user$")
	public void verify_Cart_page_is_accessible_to_the_user() throws Throwable {
		
		Thread.sleep(3000);
		ScreenshotsCamp.takeCampScreenshot(driver, " Cart Page");
	}

	@Then("^Verify Login page is accessible to the user$")
	public void verify_Login_page_is_accessible_to_the_user() throws Throwable {
		
		Thread.sleep(3000);
		ScreenshotsCamp.takeCampScreenshot(driver, " Login Page");
	}

	@Then("^Verify Sign Up page is accessible to the user$")
	public void verify_Sign_Up_page_is_accessible_to_the_user() throws Throwable {
	   
		Thread.sleep(3000);
		ScreenshotsCamp.takeCampScreenshot(driver, "Signup Page");
	}



}
