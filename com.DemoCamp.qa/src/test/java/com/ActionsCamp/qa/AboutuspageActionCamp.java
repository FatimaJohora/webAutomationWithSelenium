package com.ActionsCamp.qa;

import org.testng.Assert;

import com.LocatorCamp.qa.AboutuspageLocatorCamp;
import com.UtilityCamp.qa.BaseCamp;

public class AboutuspageActionCamp extends BaseCamp {

	AboutuspageLocatorCamp  aboutuspageLocatorCamp = new AboutuspageLocatorCamp();
	
	public void UserclicktheplayiconofthevideoontheAboutuspage() {
		
		aboutuspageLocatorCamp.playvideoButton.click();
	}
	public void Theusercanpausethevideoanytime() {
		
		aboutuspageLocatorCamp.pauseButton.click();
	}
	public void  VerifyUserisabletoclosethepageafteronceclicktheclosebutton() {
		
		aboutuspageLocatorCamp.aboutusCloseBtn.click();
	}
	public void VerifyAboutustextwilldisplayontheAboutuspage() {
		
		boolean verifyAboutus = aboutuspageLocatorCamp.Aboutus.isDisplayed();
		Assert.assertTrue(verifyAboutus);
	}
	
	
	
}
