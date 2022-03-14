package ui_VerificatonCommands.Size_And_locations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize {

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();
		
		
		WebElement FreeTrail=driver.findElement(By.xpath("//a[@href='/contact-sales/']"));
		
		//Get Object x and y coordinates
		int Obj_Height=FreeTrail.getSize().getHeight();
		int Obj_width=FreeTrail.getSize().getWidth();
		
		System.out.println("Object Height is --> "+Obj_Height);
		System.out.println("Object width is --> "+Obj_width);
		
		//Check object is visble at webpage
		if(Obj_Height > 0)
			System.out.println("Object visible at webpage");
		else
			System.out.println("Object not visible at webpage");
		
		
	}

}
