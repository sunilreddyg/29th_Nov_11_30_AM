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
		String chrome_path="C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe";
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
			};
		
		
		   for (int i = 0; i < userdata.length; i++) 
		   {
			   		String[] EachRow = userdata[i];
			   		driver.get("https://www.facebook.com");
		    		
			   		String UID=EachRow[0];
		    		WebElement Email=driver.findElement(By.id("email"));
		    		Email.clear();
		    		Email.sendKeys(UID);
		    		
		    		String PWD=EachRow[1];
		    		WebElement Password=driver.findElement(By.id("pass"));
		    		Password.clear();
		    		Password.sendKeys(PWD);
			
		    }   
	   
		

	}

}
