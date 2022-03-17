package switchcommands.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchTo_Frame_With_WebElementReference 
{

	public static void main(String[] args) throws Exception 
	{
		
		
		//setting runtime environment variable
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();     //Launching browser method
		driver.get("https://www.cleartrip.com/account/trips");
	    driver.manage().window().maximize();
	    Thread.sleep(5000);
	    
	    //Switch to frame using webelement reference
	    WebElement FrameLocator=driver.findElement(By.cssSelector(".spinnerMedium"));
	    driver.switchTo().frame(FrameLocator);
	    
	    WebElement Email=driver.findElement(By.xpath("//input[@id='email']"));
	    Email.clear();
	    Email.sendKeys("info.dsnr@gmail.com");
	    
	    
	    WebElement tripId=driver.findElement(By.id("tripidSecond"));
	    tripId.clear();
	    tripId.sendKeys("67897897");
	    
	}

}
