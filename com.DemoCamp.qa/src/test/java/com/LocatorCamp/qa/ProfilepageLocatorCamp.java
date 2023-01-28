package com.LocatorCamp.qa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.UtilityCamp.qa.BaseCamp;

public class ProfilepageLocatorCamp  extends BaseCamp {
	
	public ProfilepageLocatorCamp() {
		
		PageFactory.initElements(driver, this);
	}
   
	@FindBy(xpath = "//a[@id='nameofuser']")
	public WebElement profileName;
	
	@FindBy(xpath = "//a[@id='logout2']")
	public WebElement logoutLink;
}
