package ui_VerificatonCommands.getText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check_Text_Status 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\MINDQ\\\\Desktop\\\\new_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://outlook.live.com/owa/");
		driver.manage().window().maximize();
		
		if(driver!=null)
		{
			WebElement Text_location=driver.findElement(By.xpath("(//h2[contains(.,'Free Outlook email and calendar')])[2]"));
			String Act_text=Text_location.getText();
			
			String Exp_text="Free Outlook email and calendar";
			
			if(!Act_text.isEmpty())
			{
				System.out.println("Location contains text");
			}
			else
			{
				System.out.println("Location not Contain Text");
			}
			
		}
	
		
		

	}

}
