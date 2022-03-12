package ui_VerificatonCommands.getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute_Testcase {

	public static void main(String[] args) throws Exception {
	
		/*
		 * Given site url is http://makemytrip.com
		 * And make sure one way radio button is Selected
		 * Then Verify Double Seat fares selection is active
		 */
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);

		
		//Identifying oneway radio button
		WebElement oneway=driver.findElement(By.xpath("//li[@data-cy='oneWayTrip']"));
		//Get Runtime Class Property
		if(!oneway.getAttribute("class").contains("selected"))
		{
			oneway.click();
			System.out.println("Oneway button is Clicked");
		}
		
		
		if(oneway.getAttribute("class").contains("selected"))
		{
			System.out.println("Onway Button is Selected");
			Thread.sleep(10000);
			//Identifying DoubleFares button
			WebElement DoubleFares=driver.findElement(By.xpath("//ul[@class='specialFareNew']/li[5]"));
			if(!DoubleFares.getAttribute("class").contains("isItemDisabled"))
			{
				System.out.println("DoubleFraes button is Active and Ready to Select");
			}
			else
			{
				System.out.println("Testfail, DOuble fares is disabeld on oneway selection");
			}
		}
		else
		{
			System.out.println("PreCondition is Not Satisfied");
		}
		
		
	
		
		
		
	}

}
