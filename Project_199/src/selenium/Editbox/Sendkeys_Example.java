package selenium.Editbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys_Example {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://outlook.com");
		driver.manage().window().maximize();
		
		//Clicking on Singin button
		driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[1]")).click();
		
		//Typing email into textbox and press Enter Button
		driver.findElement(By.name("loginfmt"))
		.sendKeys("sunilreddy.gajjala@outlook.com"+Keys.ENTER);
		
		//Hold Execution for given timeout [Time in milliseconds]
		//Must Add throws Exception to method
		Thread.sleep(4000);
		
		
		//Typing password into textbox and press Enter Button
		driver.findElement(By.name("passwd"))
		.sendKeys("Hello@123"+Keys.ENTER);
		
		
		
		
		
		
		
		
		
		
		

	}

}
