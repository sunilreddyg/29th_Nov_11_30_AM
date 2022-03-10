package ui_VerificatonCommands.getText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_TextVisible_At_Webpage {

	public static void main(String[] args) throws Exception 
	{
		/*
		 * Scenario:  Verify Email validation using blank
		 * 		Given site url is "http://outlook.com"
		 * 		And click on Sign in button
		 * 		When User Click Next Button without Enter Email
		 * 		Then verify Error message displayed "Enter a valid email address, phone number, or Skype name."
		 */
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://outlook.com");
		driver.manage().window().maximize();
		
		
		WebElement Signin_btn=driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[1]"));
		Signin_btn.click();
		
		WebElement Next_btn=driver.findElement(By.xpath("//input[@id='idSIButton9']"));
		Next_btn.click();
		Thread.sleep(3000);
	
		String page_VisbleText=driver.findElement(By.tagName("body")).getText();
		System.out.println(page_VisbleText);
		
		String Exp_text="Enter a valid email address, phone number, or Skype name.";
		
		if(page_VisbleText.contains(Exp_text))
			System.out.println("Testpass, Expected text visible at webpage");
		else
			System.out.println("Testfail, Expected text not visible at webpage");

	}

}
