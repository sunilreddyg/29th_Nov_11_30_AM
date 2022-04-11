package pageobjects.Without_PageFacetory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Run_FB_Homepage {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		driver.findElement(FB_Homepage.Login_email).sendKeys("darshan@gmail.com");
		driver.findElement(FB_Homepage.Login_password).sendKeys("");
		driver.findElement(FB_Homepage.Login_Submit_button).click();
		Thread.sleep(5000);
		boolean flag=driver.findElement
				(FB_Homepage.password_field_error_location).isDisplayed();
		if(flag==true)
			System.out.println("Error message displayed");
		else
			System.out.println("Error message not displayed");
	}

}
