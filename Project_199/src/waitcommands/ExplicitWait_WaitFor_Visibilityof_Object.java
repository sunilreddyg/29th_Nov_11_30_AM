package waitcommands;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_WaitFor_Visibilityof_Object {

	public static void main(String[] args) 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		WebElement Email=driver.findElement(By.id("email"));
		By Password_locator=By.id("pass");
		

		//enable explicit timeout on automation browser
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(50));
		
		//WebElement as argument
		wait.until(ExpectedConditions.visibilityOf(Email))
		.sendKeys("Darshan");
		
		//By locator as argument
		wait.until(ExpectedConditions.visibilityOfElementLocated(Password_locator))
		.sendKeys("Darshan");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
