package selenium.AutoCompleteBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selection_Input_From_AutoComplete_Textbox 
{

	public static void main(String[] args) throws Exception
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://phppot.com/demo/jquery-ajax-autocomplete-country-example/");
		driver.manage().window().maximize();
		
		//Type Reference text into AutoComplete Editbox
		driver.findElement(By.id("search-box")).sendKeys("India");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//li[contains(.,'India')]")).click();
		
		
		/*
		 * AutoCompleteEdtibox:-->
		 * 			=> AutoComplete inputs only we can selection 
		 * 				from suggession list.
		 */

	}

}
