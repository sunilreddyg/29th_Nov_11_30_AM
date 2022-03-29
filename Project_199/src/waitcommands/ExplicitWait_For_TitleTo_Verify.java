package waitcommands;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_For_TitleTo_Verify {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://outlook.com");
		driver.manage().window().maximize();
		System.out.println("Browser is Ready to automate");
		
		//Manage explicit wait until expected title load into webpage
		new WebDriverWait(driver, Duration.ofSeconds(50))
		.until(ExpectedConditions.titleIs("Outlook – free personal email and calendar from Microsoft"));
		System.out.println("Title is verified for outlook page");
		
		
		WebElement SignIn=driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[1]"));
		SignIn.click();
		
		
		//Manage explicit wait until expected/partial title load into webpage
		new WebDriverWait(driver, Duration.ofSeconds(30))
		.until(ExpectedConditions.titleContains("Sign in"));
		System.out.println("Sign in page title is verififed");
		
		
		//manage timeout until object visible at webpage
		new WebDriverWait(driver, Duration.ofSeconds(30))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='i0116']")))
		.sendKeys("sunilreddy.gajjala@outlook.com");
		
		
		
		
		
		

	}

}
