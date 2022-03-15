package ui_validation_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed_for_RuntimeObject {

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * Verify Retype Email is visible after typing valid email
		 */
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  	//Launch browser
		driver.get("https://www.facebook.com/reg/");  //Load webpage
		driver.manage().window().maximize();    //maximize browser window

		
		WebElement Email=driver.findElement(By.xpath("//input[@name='reg_email__']"));
		Email.clear();
		Email.sendKeys("info@mindqsystems.com");
		Thread.sleep(2000);
		
		
		WebElement Retype_email=driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		if(Retype_email.isDisplayed())
			Retype_email.sendKeys("info@gmail.com");
		else
			System.out.println("Retype email is not visible at webpage");
		
		
		
	}

}
