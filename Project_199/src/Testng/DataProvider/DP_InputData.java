package framework.Testng.DataProvider;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DP_InputData 
{
  @Test(dataProvider = "dp",enabled=false)
  public void test(String name,String Emid) 
  {
	  
  }

  @DataProvider
  public Object[][] dp() 
  {
    return new Object[][] 
    {
      new Object[] {"Hari","9030245"},
      new Object[] {"Rakesh","5214578" },
      new Object[] {"kamal","666768" },
    };
  }
  
  
  
  
  
  @Test(dataProvider="User_info")
  public void get_user_info(String name,String Emid,String email)
  {
	  
  }
  
  
  @DataProvider
  public String[][] User_info()
  {
	  String data[][]=
		  {
				  {"user1","100","user1@gmail.com"},
				  {"user2","101","user2@gmail.com"},
				  {"user3","102","user3@gmail.com"},
				  {"user4","103","user4@gmail.com"},
		  };
	  
	  return data;
  }
  
  
  
  
  
  
}
