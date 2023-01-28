package com.ActionsCamp.qa;



import com.LocatorCamp.qa.LoginpageLocatorCamp;
import com.UtilityCamp.qa.BaseCamp;

public class LoginpageActionCamp  extends BaseCamp {
	
	LoginpageLocatorCamp  loginpageLocatorCamp = new LoginpageLocatorCamp();
	
	
	public void Enteravalidusername(String uName) {
		
		loginpageLocatorCamp.loginUsername.sendKeys(uName);
		
	}
	public void Enteravalidpassword(String uPassword) {
		
		loginpageLocatorCamp.loginPassword.sendKeys(uPassword);
		
	}
	public void ClicktheLoginbutton() {
		
		loginpageLocatorCamp.loginButton.click();
		
	}
	public void Enteraninvalidusername() {
		loginpageLocatorCamp.loginUsername.sendKeys("java point");
		
	}
	public void  Enteraninvalidpassword() {
		
		loginpageLocatorCamp.loginPassword.sendKeys("java7");
		
	}
	

	 public void Verifyusercannotloginsuccessfully() {
		 
			driver.switchTo().alert().accept();
			
		}

}
