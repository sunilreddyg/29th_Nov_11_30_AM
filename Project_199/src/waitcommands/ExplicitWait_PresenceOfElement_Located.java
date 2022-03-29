package waitcommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_PresenceOfElement_Located {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		
		try {
			
			new WebDriverWait(driver, Duration.ofSeconds(100)).until
			(ExpectedConditions.presenceOfElementLocated(By.className("sunil")));
			System.out.println("Object presented at source");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

		
		

	}

}
