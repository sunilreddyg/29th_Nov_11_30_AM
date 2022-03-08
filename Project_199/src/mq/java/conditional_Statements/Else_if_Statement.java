package mq.java.conditional_Statements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Else_if_Statement {

	public static void main(String[] args) 
	{
	
	//Multile decision statements take place here
	 String browser="chrome";
	 
	if(browser.equals("opera"))
	{
		System.out.println("firefox opened");
	}
	else if (browser.equals("safari"))
	{
		System.out.println("Safari opened");
	}
	else if (browser.equals("opera")) 
	{
		System.out.println("opear opened");
	}
	else if (browser.contains("chrome")) 
	{
		System.out.println("Chrome Browser is opened");
	}
	else 
	{
		System.out.println("Browser name mismatch");
	}
	 
	 
	 
	 
	 //Cross Browser automation
	 
	WebDriver driver=null;
	if(browser.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	else if(browser.equals("firefox"))
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
	}
	else
	{
		System.out.println("Browser name is mismatched");
	}
	
	 driver.get("http://facebook.com");

	}

}
