package findElemnts.webtable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_DynamicRow_Text {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.icicidirect.com/equity/sector-overview");
		driver.manage().window().maximize();
		
		
		WebElement table=driver.findElement(By.id("tbl_sector0"));
		
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		rows.remove(0);
		
		for (int j = 0; j < rows.size(); j++) 
		{
			//Target Specific row
			WebElement DynamicRow=rows.get(j);
			//Read each row text
			if(DynamicRow.getText().contains("Wipro"))
			{
				//Get list of Cell Under selected row
				List<WebElement> cells=DynamicRow.findElements(By.tagName("td"));
					
				for (int i = 0; i < cells.size(); i++) 
				{
					 String CellData=cells.get(i).getText();
					 System.out.println(CellData);
				}
			}
				
			
			
		}
		 
	}

}
