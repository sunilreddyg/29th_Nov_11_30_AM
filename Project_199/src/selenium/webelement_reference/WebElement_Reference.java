package selenium.webelement_reference;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_Reference {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		//Identifing object and storing into refence variable
		WebElement Email=driver.findElement(By.xpath("//input[@data-testid='royal_email']"));
		Email.clear();
		Email.sendKeys("qadarshan@gmail.com");
		
		
		
		

	}

}
