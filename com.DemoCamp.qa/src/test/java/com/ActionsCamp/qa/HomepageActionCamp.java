package com.ActionsCamp.qa;

import org.testng.Assert;

import com.LocatorCamp.qa.HomepageLocatorCamp;
import com.UtilityCamp.qa.BaseCamp;

public class HomepageActionCamp extends BaseCamp {

	HomepageLocatorCamp  homepageLocatorCamp = new HomepageLocatorCamp();
	
	public void ClicktheHomelinkontheHomepage() {
		
		homepageLocatorCamp.HomepageLink.click();
	}
	
	public void VerifyHomepageisaccessibletotheuser() {
		
	boolean verifyHomepage = homepageLocatorCamp.HomepageVerify.isDisplayed();
	Assert.assertTrue(verifyHomepage);
	
	}
	
	public void UserclicktheLoginlinkontheHomepage() {
		
		homepageLocatorCamp.loginLink.click();
	}
	
	public void UserclicktheSignuplinkontheHomepage() {
		
		homepageLocatorCamp.signupLink.click();
		
	}
	public void UserclicktheContactlinkontheHomepage() {
		
		homepageLocatorCamp.contactLink.click();
	}
		
	
	public void UserclicktheAboutuslinkontheHomepage() {
		homepageLocatorCamp.aboutusLink.click();
		
	}
	public void UserclickonCartlinkinHomepage() {
		homepageLocatorCamp.cartLink.click();
	}
	public void Clickonanitem() {
		
		homepageLocatorCamp.samsunggalaxyS6.click();
	}
	
}
