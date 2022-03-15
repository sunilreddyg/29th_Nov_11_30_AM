package ui_VerificatonCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_page_Url {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		
		if(driver.getCurrentUrl().contains("https://"))
			System.out.println("Page is secured");
		else
			System.out.println("Page is not secured");
		
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		
		if(driver.getCurrentUrl().contains("index.php/dashboard"))
			System.out.println("Login page is displayed");
		else
			System.out.println("Login page is not displayed");
		
		
	}

}
