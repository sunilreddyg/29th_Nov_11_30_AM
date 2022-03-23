package switchcommands.ActiveElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActiveElement {

	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();     //Launching browser method
		driver.get("https://www.facebook.com");
	    driver.manage().window().maximize();
	    
	    Thread.sleep(4000);
	    
	    driver.switchTo().activeElement().sendKeys("qadarshan");
	    
	    
	    

	}

}
