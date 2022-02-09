package selenium.AutoCompleteBox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompleteWith_ImplicitWait {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://phppot.com/demo/jquery-ajax-autocomplete-country-example/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Type Reference text into AutoComplete Editbox
		driver.findElement(By.id("search-box")).sendKeys("India");
		driver.findElement(By.xpath("//li[contains(.,'India')]"));
		driver.findElement(By.xpath("//li[contains(.,'India')]")).click();

	}

}
