package mq.java.variables.Webdriver_Example;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Repository 
{
	
	String chrome_path="C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe";
	WebDriver driver=null;
	String url=null;
	
	public void launch_chrome_Browser()
	{
		System.setProperty("webdriver.chrome.driver", chrome_path);
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	public void loadurl()
	{
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	public void setup_browser()
	{
		launch_chrome_Browser();
		loadurl();
	}
	

	public WebDriver getDriver()
	{
		return driver;    
	}
	
	public void CloseBrowser()
	{
		driver.close();
	}

}
