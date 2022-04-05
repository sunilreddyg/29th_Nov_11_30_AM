package mq.java.Loops;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Do_While_Example {

	public static void main(String[] args)
	{
		
		
		int i=0;
		do {
			
			
			System.out.println(i);
			i=i+1;
			
		} while (i < 10);   //True Condition
		
		
		
		//Loop Eject after first iteration
		int j=10;
		do {
			
			j=j+1;
			System.out.println(j);
		} while ( j < 0);   //False Condition
		
		
		//Manage Explicitwait using while loop
		String chrome_path="C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
						
		//browser initiation command
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		int count=0;
		boolean flag=false;
		do {
			driver.get("https://www.facebook.com/reg");
			
			try {
				flag=new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.titleIs("Sign up for Facebook | Facebook"));
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		
			count=count+1;
			if(count==10)
			{
				break;
			}
			
		} while (flag==false);
		System.out.println("Page load Completed");
		

		

	}

}
