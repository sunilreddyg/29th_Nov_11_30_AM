package findElemnts.webtable;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Select_Checkbox_Inside_WebTable 
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		//Login into account
	    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	    driver.findElement(By.id("btnLogin")).click();
	    
	    driver.findElement(By.cssSelector("#menu_admin_viewAdminModule > b")).click();
	    Thread.sleep(3000);
	    
	    //identifying table
	    WebElement Table=driver.findElement(By.id("resultTable"));
	    
		
		//Find list of Rows available under table
		List<WebElement> rows=Table.findElements(By.tagName("tr"));
	    rows.remove(0);   //Skip Header
	    
	    rows.get(0).findElements(By.tagName("td")).get(0).click();
	  
	   
	    Table.findElements(By.tagName("tr"))
	    .get(2).findElements(By.tagName("td")).get(0).click();
	    
	    
	    Table.findElement(By.xpath("//tbody/tr[3]/td[1]/input")).click();

	}

}
