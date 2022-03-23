package javascript_executor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HighLight_object_With_JS {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();     //Launching browser method
		driver.get("https://www.facebook.com");
	    driver.manage().window().maximize();
	    
	    //Enabled javascript on automation browser
	    JavascriptExecutor js=((JavascriptExecutor)driver);
	    
	    //set background color and outline to Required Object
	    js.executeScript("document.getElementById('email').style.background='yellow'");
	    js.executeScript("document.getElementById('email').style.outline='red solid 2px'");
	    
	}

}
