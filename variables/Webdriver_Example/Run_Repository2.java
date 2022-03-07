package mq.java.variables.Webdriver_Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Run_Repository2 
{

	public static void main(String[] args) {
		
		
		Repository obj=new Repository();
		obj.url="http://facebook.com";
		obj.setup_browser();
		
		WebDriver driver=obj.driver;
		driver.findElement(By.id("email")).sendKeys("Darshan");
		obj.CloseBrowser();
		
		
	}

}
