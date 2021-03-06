package mq.java.Loops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class User_Login 
{

	public static void main(String[] args) throws Exception 
	{
		/*
		 * example:--> Perform user-login with multiple set of table driven data.
		 */
	
		//Set Runtime environment variable for chrome driver
		String chrome_path="C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
				
		//browser initiation command
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//Double dimensional runtime array
		String userdata[][]=
			{
					{"Newuser1","Newpwd1"},
					{"Newuser2","Newpwd2"},
					{"Newuser3","Newpwd3"},
					{"Newuser4","Newpwd4"},
					{"Newuser5","Newpwd5"},
					{"Newuser6","Newpwd6"},
					{"Newuser7","Newpwd7"},
					{"Arunk","Al123"},
					{"Akhil","Ak1234"},
					{"darshan","darshan123"},
			};
		
		
		   for (int i =0; i < userdata.length; i++) 
		   {
			   
			   	 driver.get("http://facebook.com");
			     String[] EachRow = userdata[i];
			     
			     String UID=EachRow[0];
			     String PWD=EachRow[1];
			     
			     WebElement Email=driver.findElement(By.id("email"));
			     Email.clear();
			     Email.sendKeys(UID);
			     
			     WebElement password=driver.findElement(By.id("pass"));
			     password.clear();
			     password.sendKeys(PWD);
			
			     
			     Thread.sleep(1000);
		   }  
	   
		
		   
		   
	}

}
