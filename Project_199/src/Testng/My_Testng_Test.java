package framework.Testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class My_Testng_Test 
{
  @Test//invoke method to run without object creation
  public void tc001() 
  {
	  Reporter.log("tc001 executed successfull");
  }
  
  @Test//invoke method to run without object creation
  public void tc002() 
  {
	  Reporter.log("tc002 executed successfull");
  }
}
