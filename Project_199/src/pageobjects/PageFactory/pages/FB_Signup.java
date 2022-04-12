package pageobjects.PageFactory.pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class FB_Signup
{

	WebDriver driver;
	
	public FB_Signup(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	

	@FindBy(xpath = "//input[@name='firstname']")
	public WebElement  FirstName;
	
	@FindBy(xpath = "//input[@name='lastname']")
	public WebElement  SurName;
	
	@FindBy(xpath = "//input[@name='reg_email__']")
	public WebElement  MobileNumber_or_Email;
	
	@FindBy(xpath = "//input[@name='reg_email_confirmation__']")
	public WebElement  Retype_Mobile_number_or_Email;
	
	@FindBy(xpath = "//input[@id='password_step_input']")
	public WebElement  Password;
	
	@FindBy(xpath = "//select[@id='day']")
	public WebElement  DOB_Day;
	
	@FindBy(xpath = "//select[@aria-label='Month']")
	public WebElement  DOB_month;
	
	@FindBy(xpath = "//select[@aria-label='Year']")
	public WebElement  DOB_year;
	
	@FindBy(xpath = "//input[@value='1']")
	public WebElement  Gender_Female;
	
	
	public boolean Verify_SignupTitle(String Exp_title)
	{
		return driver.getTitle().equals(Exp_title);
	}
	
	public void Enter_Registration_Details(String Fname,String Sname,String email,String Retypeemail,String password,String day,String month,String year)
	{
		FirstName.sendKeys(Fname);
		SurName.sendKeys(Sname);
		MobileNumber_or_Email.sendKeys(email);
		Retype_Mobile_number_or_Email.sendKeys(Retypeemail);
		Password.sendKeys(password);
		new Select(DOB_Day).selectByVisibleText(day);
		new Select(DOB_month).selectByVisibleText(month);
		new Select(DOB_year).selectByVisibleText(year);
	}



}