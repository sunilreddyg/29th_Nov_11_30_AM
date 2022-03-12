package ui_VerificatonCommands.getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_PlaceHolder_Value {

	public static void main(String[] args)
	{
		
		/*
		 * Sceanrio:--> verify Placeholder Text
		 * 
		 * 			Given Site url  "http://facebook.com"
		 * 			Then verify Email Textbox Contains Placeholder "Email address or phone number"
		 */
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		
		WebElement Email_textbox=driver.findElement(By.xpath("//input[@id='email']"));
		String Value=Email_textbox.getAttribute("placeholder");
		
		if(Value.equals("Email address or phone number"))
			System.out.println("Testpass, Expected watermark label displayed");
		else
			System.out.println("Testfail, Expected watermark label not displayed");
		

	}

}
