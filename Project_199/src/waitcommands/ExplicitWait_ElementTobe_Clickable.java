package waitcommands;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_ElementTobe_Clickable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();// TODO Auto-generated method stub
		
		
		
		//Converting object not be  Clickable
		WebElement Element=driver.findElement(By.name("login"));
		((JavascriptExecutor)driver).executeScript("arguments[0].setAttribute('disabled','disabled')",Element);
		
		
		try {
			
			new WebDriverWait(driver, Duration.ofSeconds(100)).until
			(ExpectedConditions.elementToBeClickable(By.name("login")));
			System.out.println("Object is clickable");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
