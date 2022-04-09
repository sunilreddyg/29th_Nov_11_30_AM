package findElemnts.webtable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_Data_From_SpecificRow_And_Cell 
{


	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.icicidirect.com/equity/sector-overview");
		driver.manage().window().maximize();
		
		
		WebElement table=driver.findElement(By.id("tbl_sector0"));
		
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		rows.remove(0);
		
		 //Target Specific row
		WebElement SpecificRow=rows.get(2);
			
		//Get list of Cell Under selected row
		List<WebElement> cells=SpecificRow.findElements(By.tagName("td"));
			
		String Cname=cells.get(0).getText();
		String Cap=cells.get(1).getText();
		String Profit=cells.get(7).getText();
			
		System.out.println(Cname+"\t"+Cap+"\t"+Profit);
	
	}

}
