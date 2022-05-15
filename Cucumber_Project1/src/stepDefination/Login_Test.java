package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_Test 
{
	WebDriver driver;
	
	@Given("User enter site url")
	public void user_enter_site_url() 
	{
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.get("http://facebook.com");
	   System.out.println("Browser is opened and site url typed");
	}
	@When("user enter username")
	public void user_enter_username() 
	{
		driver.findElement(By.id("email")).sendKeys("HariKiran");
	   System.out.println("Email Entry done");
	}
	@When("user enter password")
	public void user_enter_password() 
	{
		driver.findElement(By.id("pass")).sendKeys("HariKiran");
		System.out.println("password entry done");

	}
	@When("click on login button")
	public void click_on_login_button() 
	{
		driver.findElement(By.id("pass")).sendKeys(Keys.ENTER);
		System.out.println("Login button performed");

	}
	@Then("verify Inbox is displayed")
	public void verify_inbox_is_displayed() 
	{
		System.out.println("Inbox is Displayed");

	}

}
