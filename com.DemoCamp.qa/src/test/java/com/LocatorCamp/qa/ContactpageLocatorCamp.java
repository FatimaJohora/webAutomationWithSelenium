package com.LocatorCamp.qa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.UtilityCamp.qa.BaseCamp;

public class ContactpageLocatorCamp  extends BaseCamp{
	
	public ContactpageLocatorCamp() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath= "//label[text()='Contact Name:']")
	public WebElement contactName;
	
	@FindBy(id = "recipient-email")
	public WebElement contactEmailField;
	
	@FindBy(css = "#recipient-name")
	public WebElement contactNameField;
	
	@FindBy(css = "#message-text")
	public WebElement messageField;
	
	@FindBy(xpath = "//button[text()='Send message']")
	public WebElement sendmessageBtn;

}
