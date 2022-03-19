package switchcommands.Windows;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchTo_Next_Window {

	public static void main(String[] args) throws Exception 
	{
		//setting runtime environment variable
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();     //Launching browser method
		driver.get("https://www.instagram.com");
	    driver.manage().window().maximize();
	    
	    //Hyper link open page at new window
	    WebElement Blog=driver.findElement(By.linkText("Blog"));
	    Blog.click();
	    Thread.sleep(4000);
	    
	   
	    //Get All Dynamic Window ID's
	    Set<String> AllWindowIDs=driver.getWindowHandles();
	    
	    //Converting SetString into Iterators
	    Iterator<String> itr=AllWindowIDs.iterator();
	    
	    String window1=itr.next();
	    String window2=itr.next();
	    
	    driver.switchTo().window(window2);
	    System.out.println(driver.getTitle());
	    
	    //Switch to Mainwindow
	    driver.switchTo().window(window1);
	    System.out.println("Main window title is  ---> "+driver.getTitle());
	    
	}

}
