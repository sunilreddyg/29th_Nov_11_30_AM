package stepDefination;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CucumberHooks 
{
	
	@Before  //Invoke before every scenario execution
	public void OpenBrowser()
	{
		System.out.println("Browser is Opened");
	}
	
	
	@After  //Invoke after every scenario execution
	public void CloseBrowser()
	{
		System.out.println("Browser is Closed");
	}

}
