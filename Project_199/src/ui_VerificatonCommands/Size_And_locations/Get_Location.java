package ui_VerificatonCommands.Size_And_locations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Location {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();
		
		
		WebElement FreeTrail=driver.findElement(By.xpath("//a[@href='/contact-sales/']"));
		
		
		int Objx=FreeTrail.getLocation().getX();
		int Objy=FreeTrail.getLocation().getY();
		
		System.out.println("Object x Coordinates are -->"+Objx);
		System.out.println("Object y Coordinates are --> "+Objy);
		
		
		if(Objx > 50  &&  Objx < 400)
			System.out.println("Object Available at left side");
		else
			System.out.println("Object available at right side");
		
		
		
		//Checking Object visibility using coordinates
		if(Objx > 0)
			System.out.println("Object is visible");
		else
			System.out.println("Object is Hidden");
		
		/*
		 * Note when object is at hidden state webdriver return 
		 * coordinates are zero..
		 */
		
		
	}

}
