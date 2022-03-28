package waitcommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		//Setting timeout until all object load at document object model
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
		
		//settting timeout to load all page objects to load at interface
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(200));
		
		//setting timeout to load asychronized source to webpage
		driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(100));
		
		
		long starttime=System.currentTimeMillis();
	
		try {
			driver.findElement(By.id("email123"));
			System.out.println("Object is Found");
			System.out.println(System.currentTimeMillis()-starttime);
			
		} catch (Exception e) {
			System.out.println("Object Not found");
			System.out.println(System.currentTimeMillis()-starttime);
		}
	
	
	
	
	
	
	
	
	
	
	

	}

}
