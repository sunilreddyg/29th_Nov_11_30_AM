package pageobjects.Without_PageFacetory;

import org.openqa.selenium.By;

public class FB_Homepage 
{
	
	public static By Login_email=By.xpath("//input[@id='email']");
	public static By Login_password=By.xpath("//input[@id='pass']");
	public static By Login_Submit_button=By.xpath("//button[contains(.,'Log In')]");
	public static By Email_Field_error_location=By.xpath("//div[contains(@class,'_9ay7')]");
	public static By password_field_error_location=By.xpath("//a[contains(@href,'error')]");
	
	
	
}
