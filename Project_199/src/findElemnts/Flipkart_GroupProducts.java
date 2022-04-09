package findElemnts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import mq.java.methods.parameter.Products;

public class Flipkart_GroupProducts {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		WebElement SearchBox=driver.findElement(By.xpath("//input[@name='q']"));
		SearchBox.sendKeys("iphone 11");
		SearchBox.submit();
		Thread.sleep(2000);
		
		
		boolean flag=false;
		WebElement Next_btn;
		
		do {
			
			
			
			WebElement ProductsFrame=driver.findElement(By.xpath("//div[@class='_1YokD2 _3Mn1Gg']"));
			List<WebElement> Prodcuts=ProductsFrame.findElements(By.className("col-12-12"));
			System.out.println(Prodcuts.size());
			
			for (int i = 1; i < Prodcuts.size()-2; i++) 
			{
				WebElement EachProduct=Prodcuts.get(i);
				
				//Read Product title
				String ProductName=EachProduct.findElement(By.className("_4rR01T")).getText();
				System.out.println(ProductName);
				
				//Read Product price
				String ProductPrice=EachProduct.findElement(By.xpath("//div[@class='_30jeq3 _1_WHN1']")).getText();
				System.out.println(ProductPrice);
				
				String Price=ProductPrice.substring(1).replace(",", "");
				System.out.println(Price);
				
				//Covert price to Integer
				int priceIn_integer=Integer.parseInt(Price);
				
				
				
			}
			
			
			
			
			
			
			
			try {
				Next_btn=driver.findElement(By.xpath("//span[contains(.,'Next')]"));
				flag=Next_btn.isDisplayed();
				new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(Next_btn));
				if(flag==true)
				{
					Next_btn.click();
					Thread.sleep(3000);
				}
				
			} catch (Exception e) {
				flag=false;
			}
		
		} while (flag==true);
		

	}

}
