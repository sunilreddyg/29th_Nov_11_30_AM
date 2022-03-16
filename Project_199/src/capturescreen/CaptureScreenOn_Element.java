package capturescreen;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreenOn_Element {

	public static void main(String[] args) throws Exception 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  		//Launch browser
		driver.get("https://www.instagram.com");    //Load webpage
		driver.manage().window().maximize();        //maximize browser window
		Thread.sleep(3000);
		
		WebElement LoginForm=driver.findElement(By.id("loginForm"));
		File src=LoginForm.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("screens\\Image2.png"));
		
		
		
	}

}
