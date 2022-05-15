package stepDefination;

import io.cucumber.java.en.When;

public class Outline_Steps 
{
	
	@When("User enters {string} and {string}")
	public void user_enters_and(String string, String string2) 
	{
	    System.out.println(string+"   "+string2);
	}


}
