package StepDepCamp;

import com.ActionsCamp.qa.ContactpageActionCamp;
import com.ActionsCamp.qa.HomepageActionCamp;
import com.UtilityCamp.qa.BaseCamp;
import com.UtilityCamp.qa.ScreenshotsCamp;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoCamp_74 extends BaseCamp {
	
	HomepageActionCamp  homepageActionCamp = new HomepageActionCamp();
	ContactpageActionCamp  contactpageActionCamp = new ContactpageActionCamp();

  @When("^User click the Contact link on the Home page$")
  public void user_click_the_Contact_link_on_the_Home_page() throws Throwable {
	  
	  homepageActionCamp.UserclicktheContactlinkontheHomepage();
 }

  @Then("^Verify the Contact name field on the  Contact page$")
  public void verify_the_Contact_name_field_on_the_Contact_page() throws Throwable {
	  
	  contactpageActionCamp.VerifytheContactnamefieldontheContactpage();
 }

  @When("^User enters the Contact email$")
  public void user_enters_the_Contact_email() throws Throwable {
	  
	  contactpageActionCamp.UserenterstheContactemail();
 }

  @When("^User enters Contact name$")
  public void user_enters_Contact_name() throws Throwable {
   
	  contactpageActionCamp.UserentersContactname();
 }

  @When("^User writes a messages$")
  public void user_writes_a_messages() throws Throwable {
	  
	  contactpageActionCamp.Userwritesamessages();
	  Thread.sleep(2000);
 }
  
  @When("^User click on Send message button$")
  public void user_click_on_Send_message_button() throws Throwable {
	  
	  contactpageActionCamp.UserclickonSendmessagebutton();
	  
	    
	 }

  @Then("^Verifyu User able to send messages$")
  public void verifyu_User_able_to_send_messages() throws Throwable {
	  	  	  
	  contactpageActionCamp.VerifyuUserabletosendmessages();	
	  
	 ScreenshotsCamp.takeCampScreenshot(driver, "Send Message pop-up");
	 
	 
  }
  @When("^User does not enter the Contact email$")
  public void user_does_not_enter_the_Contact_email() throws Throwable {
	  
	  contactpageActionCamp.UserdoesnotentertheContactemail();
  }

  @When("^User  does not enter the Contact name$")
  public void user_does_not_enter_the_Contact_name() throws Throwable {
     
	  contactpageActionCamp.UserdoesnotentertheContactname();
  }

  @When("^User does not write a messages$")
  public void user_does_not_write_a_messages() throws Throwable {
	  
	  contactpageActionCamp.Userdoesnotwriteamessages();
	  Thread.sleep(2000);
  }
  
  @Then("^Verify User does not able to send messages after once click Send message button$")
  public void verify_User_does_not_able_to_send_messages_after_once_click_Send_message_button() throws Throwable {
	  
	  contactpageActionCamp.VerifyUserdoesnotabletosendmessagesafteronceclickSendmessagebutton();
	  	  
	 
  }

 }
