package pageobjects.PageFactory.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OrangeHRM_Login 
{
	//Old format to declare object..
	@FindBy(how=How.ID,using="txtUsername") public WebElement UID;
	@FindBy(how=How.XPATH,using="//input[@id='txtPassword']") public WebElement PWD;
	@FindBy(how=How.CSS,using="#btnLogin") public WebElement Login_btn;

	//Latest format to decleare object
	@FindBy(id="txtUsername") public WebElement username;
	@FindBy(xpath="//input[@id='txtPassword']") public WebElement password;
	@FindBy(css="#btnLogin") public WebElement login_button;
	@FindBy(xpath="//a[contains(.,'Forgot your password?')]") public WebElement forgot_password;
	
	
	public void type_username(String loginid)
	{
		username.sendKeys(loginid);
	}
	
	public void type_password(String loginpwd)
	{
		password.sendKeys(loginpwd);
	}
	
	public void click_login_button()
	{
		login_button.click();
	}
	
	public void type_login_details(String loginId,String loginpwd)
	{
		type_username(loginId);
		type_password(loginpwd);
		click_login_button();
	}
	
}