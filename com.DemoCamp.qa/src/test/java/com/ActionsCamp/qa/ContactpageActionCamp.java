package com.ActionsCamp.qa;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.LocatorCamp.qa.ContactpageLocatorCamp;
import com.UtilityCamp.qa.BaseCamp;
import com.UtilityCamp.qa.ScreenshotsCamp;



public class ContactpageActionCamp extends BaseCamp {
 
	ContactpageLocatorCamp contactpageLocatorCamp = new ContactpageLocatorCamp();
	
	public void VerifytheContactnamefieldontheContactpage() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(contactpageLocatorCamp.contactName));
		
	boolean verifycontactnamefield = contactpageLocatorCamp.contactName.isDisplayed();
	Assert.assertTrue(verifycontactnamefield);	
	}
	
	public void UserenterstheContactemail() {
		
		contactpageLocatorCamp.contactEmailField.sendKeys("Black@gmail.com");
	}
	public void UserentersContactname() {
		
		contactpageLocatorCamp.contactNameField.sendKeys("Black Widow");
	}
	public void  Userwritesamessages() {
		
		contactpageLocatorCamp.messageField.sendKeys("Please send my online order as early as possible");
	}
	public void UserclickonSendmessagebutton() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(contactpageLocatorCamp.sendmessageBtn));
		
		contactpageLocatorCamp.sendmessageBtn.click();
				 
	}
	public void VerifyuUserabletosendmessages() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.alertIsPresent());
		
		driver.switchTo().alert().accept();
	}
	public void  UserdoesnotentertheContactemail() {
		
		contactpageLocatorCamp.contactEmailField.sendKeys(" ");
	}
	public void UserdoesnotentertheContactname() {
		
		contactpageLocatorCamp.contactNameField.sendKeys(" ");
	}
	public void Userdoesnotwriteamessages() {
		
		contactpageLocatorCamp.messageField.sendKeys(" ");
	}
	public void VerifyUserdoesnotabletosendmessagesafteronceclickSendmessagebutton() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.alertIsPresent());
		
		driver.switchTo().alert().accept();
	}
	
	
}
