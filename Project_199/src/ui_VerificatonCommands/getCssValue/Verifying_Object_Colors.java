package ui_VerificatonCommands.getCssValue;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class Verifying_Object_Colors
{

	public static void main(String[] args) throws Exception
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();
		
		
		WebElement FreeTrail=driver.findElement(By.xpath("//a[@href='/contact-sales/']"));
		
		//GetCss value return color in RBGA format 
		String BG_Color=FreeTrail.getCssValue("background-color");
		System.out.println("Object BackGround color displayed is  "+BG_Color);
		
		String Exp_Color_inHex="#109246";
		
		
		Color Obj_Color=Color.fromString(Exp_Color_inHex);
		String HexTo_Rgba=Obj_Color.asRgba();
		
		if(HexTo_Rgba.equals(BG_Color))
			System.out.println("Testpass, Color is matching");
		else
			System.out.println("Testfail Color is mismatched");
		
		/*
		 * Refer this site:-->
		 * 		https://www.selenium.dev/documentation/webdriver/additional_features/colors/
		 */
		
		
	}

}
