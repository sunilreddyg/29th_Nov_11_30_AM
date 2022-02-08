package selenium.list_of_items;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selecting_Listof_Items {

	public static void main(String[] args) throws Exception {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//Click element to open list of items
		driver.findElement(By.linkText("Select Product Type")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[@value='5'][contains(.,'EMI')]")).click();
		
		driver.findElement(By.linkText("Select Product")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[contains(.,'Lifecare')]")).click();
		
		//Click on Apply element
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(.,'Apply Online')]")).click();
		
	}

}
