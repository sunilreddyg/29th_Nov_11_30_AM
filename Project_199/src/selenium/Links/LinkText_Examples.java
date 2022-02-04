package selenium.Links;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText_Examples 
{

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com");
		driver.manage().window().maximize();
	
		driver.findElement(By.linkText("Locations")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("India")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Delhi")).click();
		Thread.sleep(3000);
		
		
		driver.findElement(By.partialLinkText("Capital of India")).click();
	}

}
