package framework.Testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class BeforeMethod_And_AfterMethod {

  @BeforeMethod  //Invoke before every @Test annotated method.
  public void beforeMethod() 
  {
	  System.out.println("Method- precondition");
  }

  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println("Method post-condition"+"\n");
  }
  
  
  @Test(priority=0)
  public void tc001() 
  {
	  Reporter.log("Tc001 executed",true);
  }
  
  @Test(priority=1)
  public void tc002() 
  {
	  Reporter.log("Tc002 executed",true);
  }


}
