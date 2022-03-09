package ui_VerificatonCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Page_Title {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.skyscanner.co.in/");
		driver.manage().window().maximize();
		
		
		//Getting Current window page title
		String pagetitle=driver.getTitle();
		System.out.println("Current Window Page title is --> "+pagetitle);
		
		
		String Exp_title="Skyscanner Travel: Compare Cheap Flight Tickets, Hotels & Rental Cars";

		//Condition to verify expected title presented at webpage
		if(pagetitle.equals(Exp_title))
		{
			System.out.println("Expected Title Found");
			
			WebElement HotelsMenu=driver.findElement(By.xpath("(//span[contains(.,'Hotels')])[1]"));
			HotelsMenu.click();
			
			if(driver.getTitle().contains("Hotels"))
				System.out.println("Hotels Page title verified");
			else
				System.out.println("Hotel Page Not Displayed");
		}
		else
		{
			System.out.println("Title not verified");
		}
		
	}

}
