package mq.java.Loops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class While_Loop_Example {

	public static void main(String[] args) throws Exception
	{
	
		//Print number 1 to 10 using while loop
		int i=0;
		while(i < 10)
		{
			System.out.println(i);
			i=i+1;
		}
		
		//While with False Condition
		int j=10;
		while(j < 0)   //false condition
		{
			System.out.println("No-Run");
		}
		
		
	
		//Manage Explicitwait using while loop
		String chrome_path="C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
						
		//browser initiation command
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
			
		
		
		//It is a Hidden Element
		WebElement Retype_Passwrod=driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		
		int count=0;
		while(!Retype_Passwrod.isDisplayed())
		{
			System.out.println("Finding object to visible");
			
			
			count=count+1;
			Thread.sleep(1000);
			if(count==100)
			{
				throw new Exception("Object Not Found Almost Verified for 10 Seconds");
			}
		}
		
		System.out.println("Object is Visible");

	}

}
