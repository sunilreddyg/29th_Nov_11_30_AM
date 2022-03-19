package switchcommands.Windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SwitchToWindow_Using_WindowTitle {

	public static void main(String[] args) throws Exception {
		
		
		//setting runtime environment variable
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();     //Launching browser method
		driver.get("https://www.instagram.com");
	    driver.manage().window().maximize();
	    
	    //Storing main window id
	    String MainWindow=driver.getWindowHandle();
	    
	    //Hyper link open page at new window
	    WebElement Blog=driver.findElement(By.linkText("Blog"));
	    Blog.click();
	    Thread.sleep(4000);
	    
	    WebElement Meta=driver.findElement(By.linkText("Meta"));
	    Meta.click();
	    Thread.sleep(4000);
	    
	    
	    for (String EachWindow : driver.getWindowHandles()) 
	    {
			String WindowTitle=driver.switchTo().window(EachWindow).getTitle();
			if(WindowTitle.contains("Meta"))
			{
				break;
			}
		}
	    
	  
	    System.out.println("Current Focused title is ---> "+driver.getTitle());
	    
	    
	  
	    
	    
	    
	    
	    

	}

}
