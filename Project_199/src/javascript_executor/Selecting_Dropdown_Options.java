package javascript_executor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selecting_Dropdown_Options {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/reg/");
		
		
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		//Selecting dropdown option using value property
		js.executeScript("document.getElementById('day').value = '16'");

		//selecting  dropdown option using index
		js.executeScript("document.getElementById('month').selectedIndex='6'");
		
		
		
		
		
		
		
		
		
	}

}
