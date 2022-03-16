package capturescreen;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreen_With_Time_Stamp {

	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  		//Launch browser
		driver.get("https://www.instagram.com");    //Load webpage
		driver.manage().window().maximize();        //maximize browser window
		Thread.sleep(3000);
		
		//Get Current System
		Date d=new Date();
		//Create Simple Date format
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MMM-dd hh-mm-ss");
		//Covert system date using simple dateformatter
		String time=sdf.format(d);
		
		WebElement LoginForm=driver.findElement(By.id("loginForm"));
		File src=LoginForm.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("screens\\Image2"+time+".png"));
		
		

	}

}
