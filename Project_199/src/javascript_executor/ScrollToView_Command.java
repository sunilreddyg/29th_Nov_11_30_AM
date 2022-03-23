package javascript_executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollToView_Command {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
		
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		WebElement Element=driver.findElement(By.xpath("//span[contains(.,'Back to top')]"));
		js.executeScript("arguments[0].scrollIntoView(true)", Element);
		
		/*
		 * true - the top of the element will be aligned to the top of 
		 * 	the visible area of the scrollable ancestor
		 * 
		 * 				scrollIntoView(true)
		 *
		 *  false - the bottom of the element will be aligned to the 
		 *  bottom of the visible area of the scrollable ancestor.
		 *  
		 *  			scrollIntoView(false)
		 */
		
		
		/*Thread.sleep(4000);
		//Scroll the document to the horizontal position 40:
		js.executeScript("window.scrollTo(400, 0);", Element);
		
		
		//Scroll the document to the vertical position 300
		js.executeScript("window.scrollTo(0, -500);", Element);
		
		//Scroll the document to the view port using x and y coordination
		//window.scrollTo(x, y)
*/	}

}
