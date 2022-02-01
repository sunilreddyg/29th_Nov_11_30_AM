package objectidentification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_IDentification 
{

	public static void main(String[] args) 
	{
		//Setting Runtime environment variable for chromedriver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		//Launching chrome browser and storing reference into WebDriver interface
		WebDriver driver=new ChromeDriver();
		//Load Webpage to automation browser
		driver.get("http://facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("qadarshan@gmail.com");
		
		
	}

}
