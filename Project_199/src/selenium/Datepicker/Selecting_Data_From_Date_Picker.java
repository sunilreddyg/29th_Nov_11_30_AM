package selenium.Datepicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selecting_Data_From_Date_Picker
{

	public static void main(String[] args) throws Exception {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://jqueryui.com/resources/demos/datepicker/default.html");
	driver.manage().window().maximize();
	
	//Opening Calendar
	driver.findElement(By.id("datepicker")).click();
	Thread.sleep(1000);

	
	
	/*
	 * If Datepicker editbox is in editable format
	 * so that we can type required date
	 */
	driver.findElement(By.id("datepicker")).clear();
	driver.findElement(By.id("datepicker")).sendKeys("03/25/2022");
	
	
	}

}
