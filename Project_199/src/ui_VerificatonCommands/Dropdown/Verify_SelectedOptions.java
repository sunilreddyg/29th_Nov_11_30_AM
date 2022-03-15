package ui_VerificatonCommands.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_SelectedOptions {

	public static void main(String[] args) 
	{
		
		/*
		 * Given Site url is  https://www.facebook.com/r.php
		 * Then verify DOB month display Current Month
		 */
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		

		WebElement Dropdown_month=driver.findElement(By.id("month"));
		
		//Get First Selected Option / Default selected option at dropdown
		String OptionName=new Select(Dropdown_month)
				.getFirstSelectedOption().getText();
		
		
		if(OptionName.equals("Mar"))
			System.out.println("Expected Month Displayed");
		else
			System.out.println("Wrong month displayed");
	}

}
