package selenium.launchbrowser;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {

	public static void main(String[] args) 
	{
		
		/*
		 * download geckodriver.exe file
		 * 
		 * 		=> https://www.selenium.dev/downloads/
		 * 		=> Scroll down page until find Browsers
		 * 		=> Click Browsers Tab to see list of browser drivers
		 * 		=> Under firefox click on documentation link
		 * 		=> Find suitable driver version 
		 * 		=> click on geckodriver releases
		 * 		=>  Latest version   [0.30.0 ] Supports [> 78 firefox version]
		 *      =>  Under  Selected version scroll down page until find Assets.
		 *      =>  Download Zip format file w.r.t  Operating system and hotspot size
		 *      =>  After download, unzip file to backup folder
		 *      => either set up environment variabe for geckodriver.exe
		 * 			file at system variables or set up runtime environment
		 * 			variable..
		 */
		
		//Setting Runtime environment variable for geckodriver.exe
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\geckodriver.exe");
	
		//Launching automation browser and storing into reference class
		FirefoxDriver firefox=new FirefoxDriver();
		
		//using Reference class loading new page into browser window
		firefox.get("http://facebook.com");
		
		//Printing current window tilte and url of browser window
		System.out.println(firefox.getTitle());
		System.out.println(firefox.getCurrentUrl());
		
		//Closing Browser Window.
		firefox.close();
	}

}
