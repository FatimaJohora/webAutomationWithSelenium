package com.LocatorCamp.qa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.UtilityCamp.qa.BaseCamp;

public class AboutuspageLocatorCamp  extends BaseCamp {
	
	public AboutuspageLocatorCamp() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[@title='Play Video']")
	public WebElement playvideoButton;
	
	@FindBy(xpath = "//button[@title='Pause']")  
	public WebElement pauseButton;
	
	@FindBy(xpath = "//div[@id='videoModal']//button[@type='button'][normalize-space()='Close']")
	public WebElement aboutusCloseBtn;
	
	@FindBy(xpath = "(//button[@aria-label='Close'])[4]")
	public WebElement aboutusCloseIcon;
	
	@FindBy(xpath = "//h5[text()='About us']")
	public WebElement Aboutus;

}   
