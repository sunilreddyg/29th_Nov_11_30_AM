package ui_validation_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled_Or_Disabled {

	public static void main(String[] args) throws Exception 
	{
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  	
		driver.get("https://www.instagram.com/accounts/emailsignup/");  
		driver.manage().window().maximize();  
		Thread.sleep(4000);
								
		WebElement Signup=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/main[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[7]/div[1]/button[1]"));
		if(!Signup.isEnabled())
		{
			System.out.println("Testpass, Button is disabled before entry of name and email");
		}
		else
		{
			System.out.println("Testfail, Button is enabled before entry of name and email");
		}
		
			

	}

}
