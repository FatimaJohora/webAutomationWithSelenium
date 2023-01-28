package StepDepCamp;

import com.ActionsCamp.qa.CartpageActionCamp;
import com.ActionsCamp.qa.HomepageActionCamp;
import com.UtilityCamp.qa.BaseCamp;
import com.UtilityCamp.qa.ScreenshotsCamp;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoCamp_76 extends BaseCamp {
   
	HomepageActionCamp  homepageActionCamp = new HomepageActionCamp(); 
	CartpageActionCamp  cartpageActionCamp = new CartpageActionCamp();
	
	@When("^Click on an item$")
	public void click_on_an_item() throws Throwable {
		
		homepageActionCamp.Clickonanitem();
		Thread.sleep(2000);
	}

	@When("^Click on add to Cart button$")
	public void click_on_add_to_Cart_button() throws Throwable {
		
		cartpageActionCamp.ClickonaddtoCartbutton();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	}

	@When("^Click on the Cart link$")
	public void click_on_the_Cart_link() throws Throwable {
		
		cartpageActionCamp.ClickontheCartlink();
		Thread.sleep(2000);
	}

	@Then("^Verify after adding the item, items displayed on the Cart page$")
	public void verify_after_adding_the_item_items_displayed_on_the_Cart_page() throws Throwable {
		
		Thread.sleep(2000);
		ScreenshotsCamp.takeCampScreenshot(driver,"Verify Cart");
	}

	@When("^Click on the place order button$")
	public void click_on_the_place_order_button() throws Throwable {
	   
		cartpageActionCamp.Clickontheplaceorderbutton();
		Thread.sleep(2000);
	}

	@When("^Fill up the place order form$")
	public void fill_up_the_place_order_form() throws Throwable {
	   
		cartpageActionCamp.Filluptheplaceorderform();
		Thread.sleep(2000);
	}

	@When("^Click on the purchase button$")
	public void click_on_the_purchase_button() throws Throwable {
		
		Thread.sleep(2000);
		cartpageActionCamp.Clickonthepurchasebutton();
	}

	@Then("^Verify the purchase message$")
	public void verify_the_purchase_message() throws Throwable {
		
		Thread.sleep(2000);
		cartpageActionCamp.Verifythepurchasemessage();
	}


}
