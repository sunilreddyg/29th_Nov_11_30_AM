package selenium.Dropdown.MultipleSelection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selecting_MutipleOPtions {

	public static void main(String[] args) throws Exception
	{
		
		//Selecting Multiple Options from single dropdown
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://bridgeqsystems.com/demo.php");
		driver.manage().window().maximize();
		
		
		//Click on  Select menu link
		driver.findElement(By.xpath("//button[contains(.,'Select Menu')]")).click();
		Thread.sleep(2000);
		
		
		boolean flag=new Select(driver.findElement(By.id("exampleFormControlSelect2"))).isMultiple();
		System.out.println("Dropdown Selection type is --->"+flag);
		
		
		if(flag)
		{
			Select Selector=new Select(driver.findElement(By.id("exampleFormControlSelect2")));
			Selector.deselectAll();
			Selector.selectByIndex(1);
			Selector.selectByIndex(3);
			Selector.selectByIndex(5);
			Thread.sleep(3000);
			
			Selector.deselectByIndex(3);   //Deselecting Single Option from Multiple Selectoin
		}
		else
		{
			System.out.println("Dropdown is not a multiple selection type");
		}
		
		
		
		
		
		
		

	}

}
