package switchcommands.Windows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchTo_Next_Window2 {

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
			    
	    //Get All Dynamic Window ID's
	    Set<String> AllWindowIDs=driver.getWindowHandles();
	    for (String EachWindowID : AllWindowIDs) 
	    {
			driver.switchTo().window(EachWindowID);
		}
	    //Assumption is by default controls will be available at last window
	    
	    System.out.println("Current Window Title is ---> "+driver.getTitle());
	    

	    
	    //Switch Controls back to mainwindow
	    driver.switchTo().window(MainWindow);
	    System.out.println("Main window title is ---> "+driver.getTitle());
	}

}
