package framework.Testng.Groups;

import org.testng.annotations.Test;

public class TestSuite1 
{
  @Test(groups="G1")
  public void tc001() 
  {
	  System.out.println("tc001 executed");
  }
  
  @Test(groups="G2")
  public void tc002() 
  {
	  System.out.println("tc002 executed");
  }
  
  
  @Test(groups="G2")
  public void tc003() 
  {
	  System.out.println("tc003 executed");
  }
  
  
 
  
}
