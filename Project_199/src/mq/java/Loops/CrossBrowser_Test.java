package mq.java.Loops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowser_Test {

	public static void main(String[] args) throws Exception 
	{
		
		
		String browsers[]= {"chrome","firefox"};
		String driver_path="C:\\Users\\MINDQ\\Desktop\\recent_drivers\\";
		//outter loop
		for (int i = 0; i < browsers.length; i++)
		{
			String browsername = browsers[i];
			WebDriver driver = null;
			if(browsername.equals("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", driver_path+"chromedriver.exe");
				driver=new ChromeDriver();
			}
			else if(browsername.equals("firefox"))
			{
				System.setProperty("webdriver.gecko.driver", driver_path+"geckodriver.exe");
				driver=new FirefoxDriver();
			}
			
			

			String links[]={"Sign Up","Log In","Messenger","Places"
					,"Games","Terms","Services","Careers","Cookies","Developers","Create Page"};
			
			//inner Loop
		     for (int j = 0; j < links.length; j++) 
		     {
		    	 driver.get("http://facebook.com");
		    	 
		    	driver.findElement(By.linkText(links[j])).click();
		    	 Thread.sleep(3000);
		    	 System.out.println(links[j]+"    "+driver.getTitle());
		     }
			
			
			
			
		}

	}

}
