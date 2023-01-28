package com.ActionsCamp.qa;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.LocatorCamp.qa.SignuppageLocatorCamp;
import com.UtilityCamp.qa.BaseCamp;

public class SignuppageActionCamp extends BaseCamp {
	
	SignuppageLocatorCamp  signuppageLocatorCamp = new SignuppageLocatorCamp();
	
	public void VerifytheUsernamefieldontheSignuppage() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(signuppageLocatorCamp.signupUsername));
		
		boolean verifySignupUsername = signuppageLocatorCamp.signupUsername.isDisplayed();
		Assert.assertTrue(verifySignupUsername);
		
		
	}
	public void Emptyusernamefield () {
		
		signuppageLocatorCamp.singupUsernameField.sendKeys("");
	}
	public void Emptypasswordfield() {
		
		signuppageLocatorCamp.signupPasswordField.sendKeys("");
	}
	public void UserclickontheSignupbutton() {
		
		signuppageLocatorCamp.signupButton.click();
	}
	public void VerifyusercannotSignup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.alertIsPresent());
	
		driver.switchTo().alert().accept();
		
	}
	public void Enterausernameintheusernamefield() {
		
		signuppageLocatorCamp.singupUsernameField.sendKeys("Black Widow");
	}
	public void Enterapasswordinthepasswordfield() {
		
		signuppageLocatorCamp.signupPasswordField.sendKeys("Black7");
	}
	public void Verifyusercanregistersuccessfully() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.alertIsPresent());
		
		driver.switchTo().alert().accept();
	}
	

}
