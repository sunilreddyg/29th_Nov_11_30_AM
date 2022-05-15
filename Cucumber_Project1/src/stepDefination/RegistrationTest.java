package stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationTest 
{
	
	@Given("Open browser {string}")
	public void open_browser(String string) {
	   System.out.println(string+" browser is opened");
	}
	@Given("type url as {string}")
	public void type_url_as(String string) {
	   System.out.println("url typed is -> "+string);
	}
	@When("user type firstname as {string}")
	public void user_type_firstname_as(String string) {
	   System.out.println("firstname typed is -->  "+string);
	}
	@When("type Surname as {string}")
	public void type_surname_as(String string) {
	   System.out.println("Surname typed is ---> "+string);
	}
	@When("type email as {string}")
	public void type_email_as(String string) {
	   System.out.println("Email typed  is --> "+string);
	}
	
	@When("age selected {int}")
	public void age_selected(Integer int1) {
	    System.out.println("age selected as --> "+int1);
	}

	@When("click on create account button")
	public void click_on_create_account_button() {
	   System.out.println("Registration button clicked");
	}
	@Then("verify status message displayed as {string}")
	public void verify_status_message_displayed_as(String string) {
	   System.out.println("Status message displayed is --> "+string);
	}



}
