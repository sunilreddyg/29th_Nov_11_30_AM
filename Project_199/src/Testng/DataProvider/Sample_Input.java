package framework.Testng.DataProvider;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class Sample_Input 
{
  @Test(dataProvider = "dp")
  public void f(Integer n, String s, String t) 
  {
	  System.out.println(n+"   "+s+"  "+t);
  }

  @DataProvider
  public Object[][] dp() 
  {
    return new Object[][] 
    {
      new Object[] { 1, "a" ,"x"},
      new Object[] { 2, "b" ,"y"},
      new Object[] { 3, "c" ,"z"},
    };
  }
}
