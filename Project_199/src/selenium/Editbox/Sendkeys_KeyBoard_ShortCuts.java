package selenium.Editbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys_KeyBoard_ShortCuts {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		driver.manage().window().maximize();
		
		//Typing text into editbox
		driver.findElement(By.name("firstname")).sendKeys("Newuser");
		
		//Typing text into surname using firsntame reference
		driver.findElement(By.name("firstname")).sendKeys(Keys.TAB+"Arjun");

		//Typing text into email using firstname reference
		driver.findElement(By.name("firstname"))
		.sendKeys(Keys.TAB,Keys.TAB+"Arjun@gmail.com");
		
	}

}
