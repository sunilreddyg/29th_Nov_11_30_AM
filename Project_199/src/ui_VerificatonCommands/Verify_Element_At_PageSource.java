package ui_VerificatonCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Element_At_PageSource 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		//Condition verify expected elemet presented source
		if(driver.getPageSource().contains("txtUsername"))
		{
			driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		}
		else
		{
			System.out.println("Username Element Not presented at source");
		}
		
		
		//Exception handled in case element not presented at webpage
		try {
			driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		} catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
		}
		
		

	}

}
