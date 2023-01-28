package com.ActionsCamp.qa;

import org.testng.Assert;

import com.LocatorCamp.qa.CartpageLocatorCamp;
import com.UtilityCamp.qa.BaseCamp;

public class CartpageActionCamp  extends BaseCamp {

	CartpageLocatorCamp  cartpageLocatorCamp = new CartpageLocatorCamp();
	
	public void ClickonaddtoCartbutton() {
		
		cartpageLocatorCamp.addCartButton.click();
		
	//	driver.switchTo().alert().accept();
	}
	public void ClickontheCartlink() {
		
		cartpageLocatorCamp.cartLink.click();
	}
	public void Clickontheplaceorderbutton() {
		
		cartpageLocatorCamp.placeOrderButton.click();
	}
	public void Filluptheplaceorderform() {
		
		cartpageLocatorCamp.placeOrderNameField.sendKeys("Black");
		cartpageLocatorCamp.placeOrderCountryField.sendKeys("USA");
		cartpageLocatorCamp.placeOrderCityField.sendKeys("Newyork");
		cartpageLocatorCamp.placeOrderCardField.sendKeys("Master Card");
		cartpageLocatorCamp.placeOrderMonthField.sendKeys("December");
		cartpageLocatorCamp.placeOrderYearField.sendKeys("2022");
		
	}
	public void Clickonthepurchasebutton() {
		
		cartpageLocatorCamp.purchaseButton.click();
	}
	public void Verifythepurchasemessage() {
		
	boolean verifypurchaseMessage =	cartpageLocatorCamp.purchaseConfirm.isDisplayed();
	Assert.assertTrue(verifypurchaseMessage);
	
	cartpageLocatorCamp.okButton.click();
	}
	
}
