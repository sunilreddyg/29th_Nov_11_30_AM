package findElemnts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownOptions {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		driver.manage().window().maximize();
		
		
		//Identifying Dropdown Location
		WebElement Month=driver.findElement(By.name("birthday_month"));
		
		//Get all Dropdown options and stored into List reference
		List<WebElement> DropdownOptions=new Select(Month).getOptions();
		
		
		for (WebElement EachOption : DropdownOptions) 
		{
			if(EachOption.getText().contains("May"))
			{
				EachOption.click();
				Thread.sleep(500);
			}
			
		}
		
		
	}

}
