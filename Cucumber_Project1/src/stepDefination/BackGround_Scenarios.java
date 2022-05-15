package stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BackGround_Scenarios 
{
	@Given("site address flipkart")
	public void site_address_flipkart() {
	   System.out.println("Flipkart is Opened");
	}
	@Given("user search product")
	public void user_search_product() {
	   System.out.println("Search Found");
	}
	@Given("user click on add product")
	public void user_click_on_add_product() {
	   System.out.println("Item Added to cart");
	}
	@When("user click plus button")
	public void user_click_plus_button() {
	    System.out.println("Plus button Pressed");
	}
	@Then("verify product is increased")
	public void verify_product_is_increased() {
	    System.out.println("Product is increased");
	}
	
	@When("user click on minus button")
	public void user_click_on_minus_button() {
	    System.out.println("Click on Minus button");
	}
	@Then("verify no effect on increase")
	public void verify_no_effect_on_increase() {
	   System.out.println("Button is disabled");
	}


}
