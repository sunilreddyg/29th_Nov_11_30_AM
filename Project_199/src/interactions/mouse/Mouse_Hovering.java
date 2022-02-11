package interactions.mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Mouse_Hovering 
{

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		
		WebElement Menu_Signin=driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
		new Actions(driver).moveToElement(Menu_Signin).perform();
		Thread.sleep(3000);
		
		WebElement CreateLink=driver.findElement(By.xpath("//span[contains(.,'Create a List')]"));
		new Actions(driver).click(CreateLink).perform();
		Thread.sleep(3000);
		
		
		//Get Focus on page
		new Actions(driver).click().perform();
		
		
	}

}
