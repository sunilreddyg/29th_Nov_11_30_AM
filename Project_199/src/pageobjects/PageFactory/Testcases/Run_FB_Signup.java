package pageobjects.PageFactory.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageobjects.PageFactory.pages.FB_Signup;

public class Run_FB_Signup {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		driver.manage().window().maximize();
		
		
		FB_Signup signup=new FB_Signup(driver);
		if(signup.Verify_SignupTitle("Sign up for Facebook | Facebook"))
		{
			System.out.println("Title verified");
			signup.Enter_Registration_Details("Newuser", "Webdriver","Newuser@gmail.com", "newuser@gmail.com", "Dhi@123", "13", "May", "2012");
		}
		else
		{
			System.out.println("Title not verified");
		}
		

	}

}
