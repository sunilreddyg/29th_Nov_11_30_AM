package framework.Testng;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import java.io.File;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Testng_WebDriver_TestCase 
{
	
	WebDriver driver;
	String url="http://facebook.com";
	
	
	@Test
	public void Verify_Signup_Footer_link()
	{
		driver.findElement(By.xpath("//a[contains(.,'Sign Up')]")).click();
		String Exp_title="Sign up for Facebook | Facebook";
		Assert.assertEquals(driver.getTitle(), Exp_title);
	}
	
	@Test
	public void Verify_SignIn_Footer_link()
	{
		driver.findElement(By.xpath("//a[contains(.,'Log In')]")).click();
		String Exp_title="Log in to Facebook | Facebook";
		Assert.assertEquals(driver.getTitle(), Exp_title);
	}
	
	@Test
	public void Verify_Messenger_Footer_link()
	{
		driver.findElement(By.xpath("//a[contains(.,'Messenger')]")).click();
		String Exp_title="Messenger";
		Assert.assertEquals(driver.getTitle(), Exp_title);
	}
	
	
	
	
	
	
	
	
	
	
  @BeforeMethod
  public void beforeMethod() 
  {
	  driver.get(url);  //Loadwebpage before execute @Test method
  }

  @AfterMethod
  public void afterMethod(Method method) throws Exception 
  {
	  File src_file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(src_file, new File("screens\\"+method.getName()+".png"));
  }

  @BeforeClass
  public void beforeClass() 
  {
	  System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @AfterClass
  public void afterClass() throws Exception
  {
	  Thread.sleep(5000);
	  driver.close();
  }

}
