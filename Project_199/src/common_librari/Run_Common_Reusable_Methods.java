package common_librari;

import org.openqa.selenium.Keys;

public class Run_Common_Reusable_Methods 
{

	public static void main(String[] args) 
	{
		
		
		CommonReusableActions obj=new CommonReusableActions();
		obj.LaunchBrowser("chrome");
		obj.load_webpage("http://facebook.com/reg");
		obj.set_explicitwait_time(30);
		
		FB_Signup signup=new FB_Signup(obj.getdriver());
		obj.Type_text(signup.FirstName, "Newuser");
		obj.Type_text(signup.SurName, "WebDriver");
		obj.wait(2000);
		obj.select_dropdown(signup.DOB_Day, "index", "4");
		obj.select_dropdown(signup.DOB_month, "text", "Dec");
		obj.Send_keyboard_keys(signup.Gender_Female, Keys.TAB);
		obj.Send_keyboard_keys(Keys.ESCAPE);
		obj.capturescreen("Registration");
	}

}
