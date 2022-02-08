package selenium.Dropdown;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selecting_Dropdown_Options {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		driver.manage().window().maximize();
		
		
		new Select(driver.findElement(By.id("day")))
		.selectByVisibleText("15");
		
		new Select(driver.findElement(By.id("month")))
		.selectByValue("9");
		
		new Select(driver.findElement(By.id("year")))
		.selectByIndex(21);
		

	}

}
