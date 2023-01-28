package com.LocatorCamp.qa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.UtilityCamp.qa.BaseCamp;

public class LoginpageLocatorCamp  extends BaseCamp {
	
	public LoginpageLocatorCamp() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='loginusername']")
	public WebElement loginUsername;
	
	@FindBy(xpath = "//input[@id='loginpassword']")
	public WebElement loginPassword;
	
	@FindBy(xpath = "//button[text()='Log in']")
	public WebElement loginButton;

}
