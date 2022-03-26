package chrome_options;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilities_Merge_ChromeOptions {

	public static void main(String[] args) {
		
		
		DesiredCapabilities caps=new DesiredCapabilities();
		caps.setBrowserName("chrome");
		caps.setJavascriptEnabled(true);
		caps.setCapability(CapabilityType.ACCEPT_SSL_CERTS, false);
		caps.setPlatform(Platform.WINDOWS);
	
		
		ChromeOptions options=new ChromeOptions();
		options.merge(caps);
		options.setBrowserVersion("97");
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.get("http://selenium.dev");
	}

}
