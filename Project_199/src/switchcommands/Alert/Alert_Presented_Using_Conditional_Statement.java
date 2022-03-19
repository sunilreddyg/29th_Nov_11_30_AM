package switchcommands.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Presented_Using_Conditional_Statement 
{

	public static void main(String[] args) throws Exception 
	{
		//setting runtime environment variable
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("http://demo.automationtesting.in/Alerts.html");
	    driver.manage().window().maximize();
	    
	    
	    WebElement Alert_prompt_link=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
	    Alert_prompt_link.click();
	    Thread.sleep(3000);
	    
	  
	    boolean flag=false;
	    try {
			driver.switchTo().alert();
			flag=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
	    
	    if(flag==true)
	    {
	    	driver.switchTo().alert().accept();
	    }
	    else
	    {
	    	System.out.println("Alert is not presente");
	    }
	    
	    

	}

}
