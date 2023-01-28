package com.ActionsCamp.qa;

import org.testng.Assert;

import com.LocatorCamp.qa.ProfilepageLocatorCamp;
import com.UtilityCamp.qa.BaseCamp;

public class ProfilepageActionCamp extends BaseCamp {
	
	ProfilepageLocatorCamp  profilepageLocatorCamp = new ProfilepageLocatorCamp();
	
	 public void  Verifyusercanloginsuccessfully() {
		  
		boolean verifyLogin = profilepageLocatorCamp.profileName.isDisplayed();
		Assert.assertTrue(verifyLogin);
		 
		
		profilepageLocatorCamp.logoutLink.click();
	 }
	 
	

}
