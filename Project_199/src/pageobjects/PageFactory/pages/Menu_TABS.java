package pageobjects.PageFactory.pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Menu_TABS
{
	
	public Menu_TABS(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath = "//b[contains(.,'Admin')]")
	public WebElement  admin;
	
	@FindBy(xpath = "//a[contains(@id,'menu_pim_viewPimModule')]")
	public WebElement  pIM;
	
	@FindBy(xpath = "//b[contains(.,'Leave')]")
	public WebElement  leave;
	
	@FindBy(xpath = "//b[contains(.,'Time')]")
	public WebElement  time;
	
	@FindBy(xpath = "//b[contains(.,'Recruitment')]")
	public WebElement  recruitment;
	
	@FindBy(xpath = "//b[contains(.,'My Info')]")
	public WebElement  myInfo;
	
	@FindBy(xpath = "//b[contains(.,'Performance')]")
	public WebElement  performance;
	
	@FindBy(xpath = "//b[contains(.,'Dashboard')]")
	public WebElement  dashboard;
	
	@FindBy(xpath = "//b[contains(.,'Directory')]")
	public WebElement  directory;
	
	@FindBy(xpath = "//b[contains(.,'Maintenance')]")
	public WebElement  maintenance;
	
	@FindBy(xpath = "//b[contains(.,'Buzz')]")
	public WebElement  buzz;
	
	@FindBy(xpath = "//a[@id='welcome']")
	public WebElement  welcomeV;
	
	
	public void click_at_admin_tab()
	{
		admin.click();
	}



}