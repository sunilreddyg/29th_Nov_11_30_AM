package framework.Testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class BeforeClass_And_AfterClass 
{

  @BeforeClass
  public void beforeClass() 
  {
	  System.out.println("Class-Precondition");
  }

  @AfterClass
  public void afterClass() 
  {
	  System.out.println("Class-PostCondition");
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
