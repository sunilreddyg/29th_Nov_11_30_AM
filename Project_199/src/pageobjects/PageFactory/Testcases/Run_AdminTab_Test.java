package pageobjects.PageFactory.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import pageobjects.PageFactory.pages.Menu_TABS;
import pageobjects.PageFactory.pages.OrangeHRM_Login;

public class Run_AdminTab_Test {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		
		OrangeHRM_Login login=PageFactory.initElements(driver, OrangeHRM_Login.class);
		login.type_username("Admin");
		login.type_password("admin123");
		login.click_login_button();
		
		Menu_TABS tabs=new Menu_TABS(driver);
		tabs.click_at_admin_tab();
		
		

	}

}
