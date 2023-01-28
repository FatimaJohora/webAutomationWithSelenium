package com.LocatorCamp.qa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.UtilityCamp.qa.BaseCamp;

public class SignuppageLocatorCamp  extends BaseCamp {
	
	public SignuppageLocatorCamp () {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//label[@for='sign-username']")
	public WebElement signupUsername;
	
	@FindBy(xpath = "//input[@id='sign-username']")
	public WebElement singupUsernameField;
	
	@FindBy(xpath = "//input[@id='sign-password']")
	public WebElement signupPasswordField;
	
	@FindBy(xpath = "//button[text()='Sign up']")
	public WebElement signupButton;
	

}
