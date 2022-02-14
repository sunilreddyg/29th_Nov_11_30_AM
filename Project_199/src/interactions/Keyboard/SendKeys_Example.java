package interactions.Keyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeys_Example 
{

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");    
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.skyscanner.co.in/");
		driver.manage().window().maximize();
		
		WebElement FromEB=driver.findElement(By.id("fsc-origin-search"));
		
		new Actions(driver)
		.click(FromEB).pause(1000)
		.sendKeys(Keys.BACK_SPACE).pause(1000)
		.sendKeys("HYD").pause(2000)
		.sendKeys(Keys.ARROW_DOWN).pause(1000)
		.sendKeys(Keys.ENTER).perform();
		
		

	}

}
