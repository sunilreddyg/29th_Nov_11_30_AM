package selenium.launchbrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome_Browser {

	public static void main(String[] args)
	{
		/*
		 * Download chromedriver.exe file
		 * 
		 * 		=> https://www.selenium.dev/downloads/
		 * 		=> Scroll down a page until receive Browsers
		 * 		=> Click  to open list of browser drivers
		 * 		=> under Chrome browser click on documentation link
		 * 		=> Check what version of chrome browser is installed
		 * 	
		 * 					Open ChromeBrowser --> click on settings
		 * 					---> Help Menu----> About google chrome
		 * 		=> Click on chromedriver version w.r.t chrome browser versino
		 * 		=> Select required operating system and click  on download
		 * 		=> After download unzip file to backup location
		 * 		=> After unzip you receive .exe file, Then set up
		 * 			environment variable for chromedriver.exe file..
		 * 
		 */
		
		//Setting Runtime Environment variable for chromedriver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
		
		//launching chrome browser and storing chrome into class reference
		ChromeDriver chrome=new ChromeDriver();
		
		//loading page into automation browser window
		chrome.get("http://facebook.com");
		
		//Printing current window title
		System.out.println(chrome.getTitle());
		
		//Close Browser window
		chrome.close();
		
		
	}

}
