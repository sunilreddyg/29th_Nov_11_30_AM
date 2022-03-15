package ui_VerificatonCommands.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Dropdown_Option_Count {

	public static void main(String[] args) throws Exception 
	{
		/*
		 * Given Site url https://www.cleartrip.com/
		 * When user select two adult
		 * Then verify child dropdown only contains 7 Options
		 * And verify infant dropdown only contains 2 Option
		 */
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		
		
		WebElement Adults=driver.findElement(By.xpath("(//select[@class='bc-neutral-100 bg-transparent'])[1]"));
		WebElement Children=driver.findElement(By.xpath("(//select[@class='bc-neutral-100 bg-transparent'])[2]"));
		WebElement Infants=driver.findElement(By.xpath("(//select[@class='bc-neutral-100 bg-transparent'])[3]"));
		
		
		//Select Adults dropdown
		new Select(Adults).selectByVisibleText("2");
		Thread.sleep(2000);
		
		//Get Children dropdown count
		int ChildCount=new Select(Children).getOptions().size();
		
		if(ChildCount==8)
			System.out.println("Children Count is matching");
		else
			System.out.println("Children count is mismatch");
		
		//Get Infant dropdown count
		int InfantCount=new Select(Infants).getOptions().size();
		if(InfantCount == 3)
			System.out.println("Infant Count is matching");
		else
			System.out.println("infant count is mismatched");
	}

}
