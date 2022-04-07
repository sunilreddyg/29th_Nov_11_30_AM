package findElemnts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Group_Links 
{

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		//Identifying single element
		WebElement Dropdown=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		
		//Select Book OPtions
		new Select(Dropdown).selectByVisibleText("Books");
		
		WebElement Search_button=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		Search_button.click();
		Thread.sleep(5000);
		
		
		
		//Taret Location
		WebElement Location=driver.findElement(By.xpath("//div[@class='left_nav browseBox']/ul[2]"));
		
		//Identifying links under location
		List<WebElement> All_links=Location.findElements(By.tagName("a"));
		
		//iterate for number of links
		for (int i = 0; i < All_links.size(); i++) 
		{
			//Target Each link
			WebElement Eachlink=All_links.get(i);
			String Linkname=Eachlink.getText();
			
			Eachlink.click();
			Thread.sleep(2000);
			
			System.out.println(Linkname+"      -->  "+driver.getTitle());
			
			driver.navigate().back();
			
			
			//To avoid stalelement referece exception restore all page identifications
			Location=driver.findElement(By.xpath("//div[@class='left_nav browseBox']/ul[2]"));
			All_links=Location.findElements(By.tagName("a"));
		}
		

	}

}
