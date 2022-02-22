package robot_window_interface;

import java.awt.Robot;
import java.awt.event.InputEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Mouse_Actions 
{

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.selenium.dev/downloads/");
		driver.manage().window().maximize();
		
		
		WebElement Download_Button=driver.findElement(By.xpath("(//a[contains(.,'4.1.2')])[1]"));
		Download_Button.click();
		
		//Create object for Robot awt class
		Robot robot=new Robot();
		robot.setAutoDelay(500);
		
		//Move cursor to required coordinations
		robot.mouseMove(473,347);
		
		//To Perform click action using mouse we shoud use Press and Release Options
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		

	}

}
