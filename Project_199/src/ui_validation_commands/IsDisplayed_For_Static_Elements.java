package ui_validation_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class IsDisplayed_For_Static_Elements 
{

	public static void main(String[] args) throws Exception 
	{
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  	//Launch browser
		driver.get("https://www.outlook.com");  //Load webpage
		driver.manage().window().maximize();    //maximize browser window
								
	
		//Identify Signin button
		WebElement Signin_btn=driver.findElement(By.xpath("//a[text()='Sign in']"));
		if(Signin_btn.isDisplayed())
			Signin_btn.click();
		else
			System.out.println("Signin button is not displayed");
		
		WebElement Email=driver.findElement(By.xpath("//input[@id='i0116']"));
		if(Email.isDisplayed() &&  Email.isEnabled())
		{
			Email.clear();
			Email.sendKeys("sunilreddy.gajjala@gmail.com");
		}
		else
		{
			System.out.println("Email is not visible");
		}
		
		

		/*
		 * Note:--> For every object need not to verify object visible and
		 * 			enabled status, Because selenium is desinged to perform
		 * 			action on visible and enabled objects only.
		 * 		
		 * 			WebDriver throws below exceptions when user try invalid
		 * 			actions.
		 * 
		 * ElementNotvisibleException   
		 * 			==> It Throws When user perform action on hidden element  
		 * InvalidElementstateException 
		 * 			==> It Throws When user perform action on disabled element
		 */
		
		
		
		
		
		
		
	
			
			
		
		
		
		
		
		
		

	}

}
