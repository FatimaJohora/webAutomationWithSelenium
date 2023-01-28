package StepDepCamp;

import com.ActionsCamp.qa.AboutuspageActionCamp;
import com.ActionsCamp.qa.HomepageActionCamp;
import com.UtilityCamp.qa.BaseCamp;
import com.UtilityCamp.qa.ScreenshotsCamp;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoCamp_75 extends BaseCamp {
	AboutuspageActionCamp  aboutuspageActionCamp = new AboutuspageActionCamp();
	HomepageActionCamp  homepageActionCamp  =new HomepageActionCamp();
	
	@When("^User click the About us link on the Home page$")
	public void user_click_the_About_us_link_on_the_Home_page() throws Throwable {
		
		homepageActionCamp.UserclicktheAboutuslinkontheHomepage();
		Thread.sleep(2000);
	 }

	@When("^User click the play icon of the video on the About us page$")
	public void user_click_the_play_icon_of_the_video_on_the_About_us_page() throws Throwable {
		
		aboutuspageActionCamp.UserclicktheplayiconofthevideoontheAboutuspage();
		Thread.sleep(2000);
	}

	@When("^The user can pause the video anytime$")
	public void the_user_can_pause_the_video_anytime() throws Throwable {
	   
		Thread.sleep(5000);
		aboutuspageActionCamp.Theusercanpausethevideoanytime();
		Thread.sleep(2000);
		
		ScreenshotsCamp.takeCampScreenshot(driver,"About us page");
	}

	@Then("^Verify User is able to close the page after once click the close button$")
	public void verify_User_is_able_to_close_the_page_after_once_click_the_close_button() throws Throwable {
	   
		aboutuspageActionCamp.VerifyUserisabletoclosethepageafteronceclicktheclosebutton();
	}
	@Then("^Verify About us text will display on the About us page$")
	public void verify_About_us_text_will_display_on_the_About_us_page() throws Throwable {
		
		aboutuspageActionCamp.VerifyAboutustextwilldisplayontheAboutuspage();

	}


}
