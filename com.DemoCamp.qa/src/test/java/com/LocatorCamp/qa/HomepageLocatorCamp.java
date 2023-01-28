package com.LocatorCamp.qa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.UtilityCamp.qa.BaseCamp;

public class HomepageLocatorCamp extends BaseCamp {
	
	public HomepageLocatorCamp() {
		
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Home ']")
	public WebElement HomepageLink;
	
	@FindBy(xpath = "//a[@id='nava']")
	public WebElement HomepageVerify;
	
	
	@FindBy(xpath="//a[text()='Log in']")
	public WebElement loginLink;
	
	@FindBy(xpath = "//a[text()='Sign up']")
	public WebElement signupLink;
	
	@FindBy(xpath = "//a[text()='Contact']")
	public WebElement contactLink;
	
	@FindBy(xpath = "//a[text()='About us']")
	public WebElement aboutusLink;
	
	@FindBy(xpath = "//a[text()='Cart']")
	public WebElement cartLink;
	
	@FindBy(xpath = "//a[text()='Samsung galaxy s6']")
	public WebElement samsunggalaxyS6;
	
	@FindBy(xpath = "//a[text()='Nokia lumia 1520']")
	public WebElement nokiaLumia;
	
	@FindBy(linkText = "Iphone 6 32gb")
	public WebElement iphone6;
	
	
	
	

}
