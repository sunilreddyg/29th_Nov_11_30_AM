package findElemnts;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dropdown_GroupOPtions_With_ForLoop 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		//Identifying single element
		WebElement Dropdown=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
				
		//Finding list of options tag under dropdown
		List<WebElement> AllOptions=Dropdown.findElements(By.tagName("option"));
		System.out.println(AllOptions.size());
				
		//Iterate for number of links
		for (int i = 0; i < AllOptions.size(); i++) 
		{
			//Target EachOption using Index Number
			 WebElement EachOption=AllOptions.get(i);
			System.out.println(EachOption.getText());
					 
			//Click Each Options
			EachOption.click();
		    new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.id("nav-search-submit-button"))).click();
			System.out.println("     ==>   Search Button is clickable");
			
		
			//Restore all identification to avoid staleElement Exception
			Dropdown=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
			AllOptions=Dropdown.findElements(By.tagName("option"));
			
			
			
			}
		

	}

}
