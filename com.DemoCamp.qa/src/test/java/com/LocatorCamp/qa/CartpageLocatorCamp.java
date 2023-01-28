package com.LocatorCamp.qa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.UtilityCamp.qa.BaseCamp;

public class CartpageLocatorCamp  extends BaseCamp {
	
	public CartpageLocatorCamp() {
		
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText = "Add to cart")
	public WebElement addCartButton;
	
	@FindBy(id = "cartur")
	public WebElement cartLink;
	
	@FindBy(xpath = "//button[text()='Place Order']")
	public WebElement placeOrderButton;
	
	@FindBy(xpath = "//*[@id='name']")
	public WebElement placeOrderNameField;
	
	@FindBy(xpath = "//*[@id='country']")
	public WebElement placeOrderCountryField;
	
	@FindBy(xpath = "//*[@id='city']")
	public WebElement placeOrderCityField;
	
	@FindBy(xpath = "//*[@id='card']")
	public WebElement placeOrderCardField;
	
	@FindBy(xpath = "//*[@id='month']")
	public WebElement placeOrderMonthField;
	
	@FindBy(xpath = "//*[@id='year']")
	public WebElement placeOrderYearField;
	
	@FindBy(xpath = "//*[text()='Purchase']")
	public WebElement purchaseButton;
	
	@FindBy(xpath = "//h2[text()='Thank you for your purchase!']")
	public WebElement purchaseConfirm;
	
	@FindBy(xpath = "//*[text()='OK']")
	public WebElement okButton;
	
}
