package javascript_executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScript_TypeText 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();     //Launching browser method
		driver.get("https://www.facebook.com");
	    driver.manage().window().maximize();
	    
	    //Enabled javascript on automation browser
	    JavascriptExecutor js=((JavascriptExecutor)driver);
	    

	    js.executeScript("document.getElementById('email').value='qadarshan@gmail.com'");
	    js.executeScript("document.getElementById('pass').value='Hello'");
	    
	    //Javascript Object identification other than id property
	    WebElement Login_button=driver.findElement(By.name("login"));
	    js.executeScript("arguments[0].click()", Login_button);
	    
	    
	    
	    
	    
	}

}
