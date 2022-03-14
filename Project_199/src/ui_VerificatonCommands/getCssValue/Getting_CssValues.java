package ui_VerificatonCommands.getCssValue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getting_CssValues {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();
		
		
		WebElement FreeTrail=driver.findElement(By.xpath("//a[@href='/contact-sales/']"));
		
		
		String BG_Color=FreeTrail.getCssValue("background-color");
		System.out.println("Object BackGround color displayed is  "+BG_Color);
		
		String Color=FreeTrail.getCssValue("color");
		System.out.println("Font Color Displayed is --> "+Color);
		
		String FontFamily=FreeTrail.getCssValue("font-family");
		System.out.println("Font name displayed is -->"+FontFamily);
		
		String FontSize=FreeTrail.getCssValue("font-size");
		System.out.println("Font size displayed is --> "+FontSize);
		
		String Text_Transform=FreeTrail.getCssValue("text-transform");
		System.out.println("Font Available type is -->"+Text_Transform);
		
		
	}

}
