package findElemnts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker_Select_Required_Date 
{

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/#default");
		driver.manage().window().maximize();
		
		
		//switch to frame
		driver.switchTo().frame(0);
		
		
		WebElement Calendar=driver.findElement(By.xpath("//input[@id='datepicker']"));
		Calendar.click();
		Thread.sleep(4000);
		
		String Exp_month="June 2022";
		String Exp_date="2";
		
		for (int i = 0; i < 12; i++) 
		{
			
			WebElement Month_Header_loc=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
			String Act_Month=Month_Header_loc.getText();
			System.out.println(Act_Month);
			
			if(Act_Month.equals(Exp_month))
			{
				driver.findElement(By.linkText(Exp_date)).click();
				break;
			}
			
			
			WebElement Next_btn=driver.findElement(By.xpath("//span[contains(.,'Next')]"));
			Next_btn.click();
			Thread.sleep(3000);
			
		}
		
		
		
		

	}

}
