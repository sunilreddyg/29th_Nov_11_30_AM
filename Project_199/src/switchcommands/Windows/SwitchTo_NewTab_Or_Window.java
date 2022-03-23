package switchcommands.Windows;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchTo_NewTab_Or_Window 
{

	public static void main(String[] args) 
	{
		
		//Only Selenium 4 had this feature to open a page in new window or tab
		
		//setting runtime environment variable
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();     //Launching browser method
		driver.get("https://www.instagram.com");
	    driver.manage().window().maximize();
	    
	    System.out.println("Current Window Title is --> "+driver.getTitle());
	    
	    
	   WebDriver metatab= driver.switchTo().newWindow(WindowType.TAB);
	   metatab.get("https://about.facebook.com/meta");
	   System.out.println("Current Window Title is --> "+metatab.getTitle());
	    
	   
	   WebDriver Blog_Window=driver.switchTo().newWindow(WindowType.WINDOW);
	   Blog_Window.get("https://about.instagram.com/en_US/blog");
	   System.out.println("Curret window title is --> "+Blog_Window.getTitle());
	   
	    

	}

}
