package interactions.Keyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyDown_Action 
{

	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");    
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/selectable/default.html");
		driver.manage().window().maximize();
		
		//Press Control Down key
		new Actions(driver).keyDown(Keys.CONTROL).perform();
		
		driver.findElement(By.xpath("//li[contains(.,'Item 1')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[contains(.,'Item 3')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[contains(.,'Item 5')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[contains(.,'Item 7')]")).click();
		Thread.sleep(1000);
		
	
		//Release Control Down key
		new Actions(driver).keyUp(Keys.CONTROL).perform();
	}

}
