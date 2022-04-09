package findElemnts.webtable;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_Next_Page_Records 
{

	public static void main(String[] args) throws Exception 
	{
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.icicidirect.com/equity/index/overview");
		driver.manage().window().maximize();
		
		WebElement Next_button=driver.findElement(By.id("tblIdxMoment_next"));
		
		//Enabled javascript on automation browser
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView(true)", Next_button);
		Thread.sleep(4000);
		
		
		boolean flag=false;
		do {
			
			
			
			//Identifying table and finding list of rows under it
			WebElement table=driver.findElement(By.xpath("//table[@id='tblIdxMoment']"));
			List<WebElement> rows=table.findElements(By.tagName("tr"));
			rows.remove(0);  //removin header
			
			
			for (int i = 0; i < rows.size(); i++) 
			{
				  String RowText=rows.get(i).getText();
				  String Indexnames=rows.get(i).findElements
				  (By.tagName("td")).get(0).getText();
				  System.out.println(Indexnames);
			}
			

			flag=Next_button.getAttribute("class").contains("disabled");
			if(flag==false)
			{
				Next_button.click();
				System.out.println("Next button clicked");
				Thread.sleep(4000);
			}
			
			//Restore all references
			Next_button=driver.findElement(By.id("tblIdxMoment_next"));
		} while (flag==false);
		
		
	}

}
