package mq.java.variables.Webdriver_Example;

import org.openqa.selenium.WebDriver;

public class Run_Repository 
{

	public static void main(String[] args) {
		
		
		Repository obj=new Repository();
		obj.url="http://facebook.com";   //Assigning value at runtime
		obj.setup_browser();
		
		
		//Getting other class Global variable to Current Class
		WebDriver driver=null;
		driver=obj.driver;
		System.out.println(driver.getTitle());
		
		
		//Getting other class Browser Controls to Current Class using method
		WebDriver wd;
		wd=obj.getDriver();
		System.out.println(wd.getTitle());
		
		

	}

}
