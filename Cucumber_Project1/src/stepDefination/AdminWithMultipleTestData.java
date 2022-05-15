package stepDefination;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdminWithMultipleTestData 
{
	
	@Given("User is on Home Page")
	public void user_is_on_home_page() 
	{
		System.out.println("User available at homepage");

	}
	@When("User Navigate to LogIn Page")
	public void user_navigate_to_log_in_page() {
	   System.out.println("navigated to login page");
	}
	
	@When("User enters Credentials to LogIn")
	public void user_enters_credentials_to_log_in(io.cucumber.datatable.DataTable dataTable) 
	{
	    String UID1=dataTable.row(0).get(0);
	    String PWD1=dataTable.row(0).get(1);
	    System.out.println(UID1+"  "+PWD1);
	    
	    String UID2=dataTable.row(1).get(0);
	    String PWD2=dataTable.row(1).get(1);
	    System.out.println(UID2+"  "+PWD2);
	    
	}
	
	
	@Then("Message displayed Login Successfully")
	public void message_displayed_login_successfully()
	{
	    System.out.println("Message Displayed as ");
	}

}
