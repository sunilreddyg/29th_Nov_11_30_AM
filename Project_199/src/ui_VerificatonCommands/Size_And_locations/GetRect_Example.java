package ui_VerificatonCommands.Size_And_locations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRect_Example 
{

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();
		
		
		WebElement FreeTrail=driver.findElement(By.xpath("//a[@href='/contact-sales/']"));
		
		System.out.println(FreeTrail.getRect().getX());
		System.out.println(FreeTrail.getRect().getY());
		System.out.println(FreeTrail.getRect().getHeight());
		System.out.println(FreeTrail.getRect().getWidth());
		System.out.println(FreeTrail.getRect().getDimension());
		System.out.println(FreeTrail.getRect().getPoint());
	}

}
