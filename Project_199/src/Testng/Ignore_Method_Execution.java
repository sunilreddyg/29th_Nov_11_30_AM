package framework.Testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ignore_Method_Execution
{

	@Test
	public void tc001()
	{
		Reporter.log("tc001 executed");
	}
	
	@Test(enabled=false) //This property ignore method execution
	public void tc002()
	{
		Reporter.log("tc002 executed");
	}
	

}
