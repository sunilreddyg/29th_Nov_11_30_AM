package framework.Testng.DataProvider;

import org.testng.annotations.Test;

public class Fetch_DataProvide_Data_From_OtherClass 
{
	
	/*
	 * Inorder to use dataprovider annotated data at differnet
	 * class. We must include Classname along with methodname of
	 * data provider class..
	 */
	
	@Test(dataProvider="User_info",dataProviderClass=DP_InputData.class)
	public void get_user_details(String Name,String Empid,String email)
	{
		
	}


	
	
}
