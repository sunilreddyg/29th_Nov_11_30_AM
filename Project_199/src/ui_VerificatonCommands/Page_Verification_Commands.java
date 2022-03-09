package ui_VerificatonCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page_Verification_Commands {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.skyscanner.co.in/");
		driver.manage().window().maximize();
		
		
		//Getting Current window page title
		String pagetitle=driver.getTitle();
		System.out.println("Current Window Page title is --> "+pagetitle);
		
		
		//Getting Current window page url
		String PageUrl=driver.getCurrentUrl();
		System.out.println(PageUrl);
		
		//Getting Current window Dynamic ID [Only Genarate at runtime]
		String WindowID=driver.getWindowHandle();
		System.out.println(WindowID);
		
		//Getting Current window page source
		String PageSource=driver.getPageSource();
		System.out.println(PageSource);
		
		
		
		Thread.sleep(4000);
		driver.close();

	}

}
