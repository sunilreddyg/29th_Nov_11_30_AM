package selenium.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_SelectionMethods {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://near-me.hdfcbank.com/branch-atm-locator/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		//Selecting dropdown using option name
		new Select(driver.findElement(By.id("customState")))
		.selectByVisibleText("Telangana");
		Thread.sleep(4000);
		
		
		//Selecting dropdown using option value
		new Select(driver.findElement(By.id("customCity")))
		.selectByValue("hyderabad");
		Thread.sleep(4000);
		
		//Typing text into edtibox
		driver.findElement(By.id("customLocality")).sendKeys("Gandhi nagar");
		
		//Selecting Dropdown option using index number
		new Select(driver.findElement(By.id("customRadius")))
		.selectByIndex(3);
		
		//Selecting checkbox 
		driver.findElement(By.id("amenity_category_order_types49")).click();
		//In Webdriver checkbox selection and deselection we follow click method
		
		driver.findElement(By.xpath("//span[contains(.,'Search')]")).click();
	}

}
