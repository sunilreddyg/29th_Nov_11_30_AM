package common_librari;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonReusableActions 
{
	
	public WebDriver driver;
	public WebDriverWait wait;
	String MainwindowId;
	public String driver_path="C:\\Users\\MINDQ\\Desktop\\new_drivers\\";
	
	/*
	 * Keyword:--> Launch Browser [Chrome,Firefox, IE]
	 * Author:-->
	 * Parameters Used:-->  Local Parameter
	 */
	public void LaunchBrowser(String browsername)
	{
		switch (browsername) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", driver_path+"chromedriver.exe");
			driver=new ChromeDriver();
			break;

		case "firefox":
			System.setProperty("webdriver.gecko.driver", driver_path+"geckodriver.exe");
			driver=new FirefoxDriver();
			break;
			
		case "ie":
			System.setProperty("webdriver.ie.driver", driver_path+"IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			break;

		default: System.out.println("Browser name is mismatched");
			break;
		}
	}
	
	
	
	//To get Current Constructor driver to outside classes
	public  WebDriver getdriver()
	{
		return driver;
	}
	
	
	/*
	 * Keyword:--> set window size
	 * Aurhot:-->SunilReddy
	 * parameters used:--> Local parameters
	 */
	public void setwindow_size(int Width, int height)
	{
		driver.manage().window().setSize(new Dimension(Width, height));
	}
	
	
	/*
	 * Keyword:--> load webpage to browser window
	 * Aurhot:-->SunilReddy
	 * parameters used:--> Local parameters
	 */
	public void load_webpage(String url)
	{
		driver.get(url);
		MainwindowId=driver.getWindowHandle();
	}
	
	/*
	 * KeyWord:--> This keyword manage implicit timeout
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	 public void set_implicitwait(long time_in_sec)
	 {
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time_in_sec));
	 }
	 
	 
	 
	 
	 /*
	 * KeyWord:--> This keyword manage Page laod timeout
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	 public void set_page_load_timeout(long time_in_sec)
	 {
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(time_in_sec));
	 }
	 
		 /*
		 * KeyWord:--> This keyword set explicit wait time
		 * Author:--> SunilReddy
		 * Parameters Used:-->  Local Parameter
		 */
		 public void set_explicitwait_time(long Time_in_sec)
		 {
			wait=new WebDriverWait(driver, Duration.ofSeconds(Time_in_sec));
		 }
			
		 
		 /*
		 * KeyWord:--> This keyword Type text into editbox
		 * Author:--> SunilReddy
		 * Parameters Used:-->  Local Parameter
		 */
		 public void Type_text(WebElement element,String input)
		 {
			 
			 try {
				WebElement Element=wait.until(ExpectedConditions.visibilityOf(element));
				Element.sendKeys(input);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		 }
		 
		 /*
		 * KeyWord:--> This keyword Type text into editbox
		 * Author:--> SunilReddy
		 * Parameters Used:-->  Local Parameter
		 */
		 public void Type_text(String xpath,String input)
		 {
			 
			 try {
				WebElement Element=wait.until
						(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
				Element.sendKeys(input);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		 }
		 
		 
		 /*
		 * KeyWord:--> This keyword Type text into editbox using javascript
		 * Author:--> SunilReddy
		 * Parameters Used:-->  Local Parameter
		 */
		public void Type_text_using_js(WebElement element,String inputdata)
		{
			try {
				
				WebElement Element=wait.until(ExpectedConditions.visibilityOf(element));
				((JavascriptExecutor)driver).executeScript("arguments[0].value='text'", Element);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
			
		 
		 
		 /*
		 * KeyWord:--> This keyword Type text into editbox using keyboard interactions
		 * Author:--> SunilReddy
		 * Parameters Used:-->  Local Parameter
		 */
		public void Type_text_using_keyboard(WebElement element,String inputdata)
		{
			try {
				
				WebElement Element=wait.until(ExpectedConditions.visibilityOf(element));
				new Actions(driver).sendKeys(Element, inputdata).perform();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
		/*
		 * KeyWord:--> This keyword Click on location [Buttons,Radio,Checkbox,list---etc]
		 * Author:--> SunilReddy
		 * Parameters Used:-->  Local Parameter
		 */
		public void click_element(WebElement element)
		{
			try {
				wait.until(ExpectedConditions.visibilityOf(element)).click();
					
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		/*
		 * KeyWord:--> This keyword Click on location using mouse actions[Buttons,Radio,Checkbox,list---etc]
		 * Author:--> SunilReddy
		 * Parameters Used:-->  Local Parameter
		 */
		public void click_element_using_Mouse(WebElement element)
		{
			try {
				
				WebElement ele=wait.until(ExpectedConditions.visibilityOf(element));
				new Actions(driver).click(ele).perform();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		

		/*
		 * KeyWord:--> This keyword Click on location [Buttons,Radio,Checkbox,list---etc]
		 * Author:--> SunilReddy
		 * Parameters Used:-->  Local Parameter
		 */
		public void click_element__with_js(WebElement element)
		{
			
			try {
				
				WebElement ele=wait.until(ExpectedConditions.visibilityOf(element));
				((JavascriptExecutor)driver).executeScript("arguments[0].click()", ele);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
		/*
		 * Manage static timeout
		 */
		public void wait(int ms)
		{
			try {
				Thread.sleep(ms);
			} catch (Exception e) {
				
			}
		}
		
		 
		/*
		 * KeyWord:--> This keyword Select Dropdown Option using [text,value,index] numbers
		 * Author:--> SunilReddy
		 * Parameters Used:-->  Local Parameter
		 */
		public void select_dropdown(WebElement element,String selector,String option)
		{
			try {
				
				WebElement Element=wait.until(ExpectedConditions.visibilityOf(element));
				Select dropdown_selector=new Select(Element);
				switch (selector) {
				case "text":
					dropdown_selector.selectByVisibleText(option);
					break;
					
				case "value":
					dropdown_selector.selectByValue(option);
					break;
					
				case "index":
					int index = Integer.parseInt(option);
					dropdown_selector.selectByIndex(index);
					break;

				default:System.out.println("selector mismatch");
					break;
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		
		/*
		 * KeyWord:--> This keyword perform mouseHover action on element
		 * Author:--> SunilReddy
		 * Parameters Used:-->  Local Parameter
		 */
		public void mousehover(WebElement element)
		{
			try {
			
				WebElement ele=wait.until(ExpectedConditions.visibilityOf(element));
				new Actions(driver).moveToElement(ele).perform();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		/*
		 * KeyWord:--> This keyword perform RightClick action on element
		 * Author:--> SunilReddy
		 * Parameters Used:-->  Local Parameter
		 */
		public void RightClick_Action(WebElement Object)
		{
			try {
			
				WebElement element=wait.until(ExpectedConditions.visibilityOf(Object));
				new Actions(driver).contextClick(element).perform();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		/*
		 * KeyWord:--> This keyword perform DragAndDrop option
		 * Author:--> SunilReddy
		 * Parameters Used:-->  Local Parameter
		 */
		public void drag_element_to_Target(WebElement Sourcexpath,WebElement targetxpath)
		{
			
			try {
				WebElement Src=wait.until(ExpectedConditions.visibilityOf(Sourcexpath));
				WebElement Target=wait.until(ExpectedConditions.visibilityOf(targetxpath));
				new Actions(driver).dragAndDrop(Src, Target).perform();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		/*
		 * KeyWord:--> This keyword drag object to requried target
		 * Author:--> SunilReddy
		 * Parameters Used:-->  Local Parameter
		 */
		public void drag_element_to_required_coordinates(WebElement Sourcexpath,int xcoord, int ycoord)
		{
			
			try {
				WebElement Src=wait.until(ExpectedConditions.visibilityOf(Sourcexpath));
				new Actions(driver).dragAndDropBy(Src, xcoord, ycoord).perform();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		

		/*
		 * KeyWord:--> Send keys any requied location
		 * Author:--> SunilReddy
		 * Parameters Used:-->  Local Parameter
		 */
		public void Send_keyboard_keys(WebElement Object ,Keys key)
		{
			WebElement Src=Object;
			new Actions(driver).sendKeys(Src, key).perform();
		}
		
		/*
		 * KeyWord:--> Send keys any requied location
		 * Author:--> SunilReddy
		 * Parameters Used:-->  Local Parameter
		 */
		public void Send_keyboard_keys(Keys key)
		{
			new Actions(driver).sendKeys(key).perform();
		}
		
		
		/*
		 * KeyWord:--> CaptureScreen
		 * Author:--> SunilReddy
		 * Parameters Used:-->  Local Parameter
		 */
		public void capturescreen(String imagename)
		{
			//Get System Default Time
			Date date=new Date();    //import java.util;
			//create simple dataformat
			DateFormat df=new SimpleDateFormat("yyyy/MMM/dd/ hh-mm-ss");
			//Cover default system date using date formatter
			String time=df.format(date);
					
					
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			try {
				FileHandler.createDir(new File("Screens"));
				FileHandler.copy(src, new File("Screens\\"+time+imagename+".png"));
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		
		/*
		 * KeyWord:--> Switch to Next window
		 * Author:--> SunilReddy
		 * Parameters Used:-->  Local Parameter
		 */
		public void switchto_next_window()
		{
			Set<String> allwindowids=driver.getWindowHandles();
			for (String eachwindow : allwindowids) {
				driver.switchTo().window(eachwindow);
			}
		}
		
		
		/*
		 * KeyWord:--> Switch back to mainwindow
		 * Author:--> SunilReddy
		 * Parameters Used:-->  Local Parameter
		 */
		public void switchto_mainwindow()
		{
			driver.switchTo().window(MainwindowId);
		}
		
		
		
		/*
		 * KeyWord:--> Switch requried window using it's title
		 * Author:--> SunilReddy
		 * Parameters Used:-->  Local Parameter
		 */
		public void swithcto_window_using_page_title(String exp_title)
		{
			//Get All Dynamic WIndow ID's
			Set<String> AllWindowIDS=driver.getWindowHandles();
			//Using foreach loop iterate for number of windows
			for (String EachWindowID : AllWindowIDS) 
			{
				driver.switchTo().window(EachWindowID);
				
				//Get Current FoCused window tilte
				String runtime_title=driver.getTitle();
				//System.out.println(runtime_title);
				
				if(runtime_title.contains(exp_title))
				{
					break;  //IT stop iteration   [Break will stop iteration when required title found]
				}
				
			}
		}
		
		
		
		/*
		 * KeyWord:-->Verify Alert presented at webpage
		 * Author:--> SunilReddy
		 * Parameters Used:-->  Local Parameter
		 */
		public boolean isAlertPresented()
		{
			boolean flag=false;
			try {
				driver.switchTo().alert();
				flag=true;
				return flag;
			} catch (Exception e) {
				e.printStackTrace();
				return flag;
			}
		}
		
		/*
		 * KeyWord:--> CLose alert 
		 * Author:--> SunilReddy
		 * Parameters Used:-->  Local Parameter
		 */
		
		public void close_alert()
		{
			try {
				driver.switchTo().alert().accept();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		/*
		 * KeyWord:-->Verify alert text
		 * Author:--> SunilReddy
		 * Parameters Used:-->  Local Parameter
		 */
		public boolean verify_alert_text(String Exp_text)
		{
			boolean flag=false;
			try {
				String alert_text=driver.switchTo().alert().getText();
				flag=alert_text.equals(Exp_text);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return flag;
			
		}
		

		/*
		 * KeyWord:-->Verify Switch to frame
		 * Author:--> SunilReddy
		 * Parameters Used:-->  Local Parameter
		 */
		public void switchtoFrame_using_FrameName(String FrameID_or_name)
		{
			try {
				wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(FrameID_or_name));
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		

		/*
		 * KeyWord:-->Switch to frame using index number
		 * Author:--> SunilReddy
		 * Parameters Used:-->  Local Parameter
		 */
		public void switchtoFrame_using_frameindex(int frameIndex)
		{
			try {
				wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameIndex));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		/*
		 * KeyWord:-->Switch Control back to mainpage from frame
		 * Author:--> SunilReddy
		 * Parameters Used:-->  Local Parameter
		 */
		public void switch_from_frame_tomainwindow()
		{
			driver.switchTo().defaultContent();
		}
		
		/*
		 * KeyWord:-->Verify Expected page title presented
		 * Author:--> SunilReddy
		 * Parameters Used:-->  Local Parameter
		 */
		public boolean verify_titlePresented(String Exp_title)
		{
			boolean flag=false;
			try {
				wait.until(ExpectedConditions.titleIs(Exp_title));
				flag=true;
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			return flag;
		}
		
		
		
		/*
		 * KeyWord:-->Verify Expected url presented at webpage
		 * Author:--> SunilReddy
		 * Parameters Used:-->  Local Parameter
		 */
		public boolean verify_urlPresented(String Exp_url)
		{
			boolean flag=false;
			try {
				wait.until(ExpectedConditions.urlToBe(Exp_url));
				flag=true;
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			return flag;
		}
		
		
		/*
		 * KeyWord:-->Verify Expected element is presented at source
		 * Author:--> SunilReddy
		 * Parameters Used:-->  Local Parameter
		 */
		public boolean verify_Element_Presented_Source(String Xpath)
		{
			boolean flag=false;
			try {
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Xpath)));
				flag=true;
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			return flag;
		}
		
		/*
		 * KeyWord:-->Verify Text presented at location
		 * Author:--> SunilReddy
		 * Parameters Used:-->  Local Parameter
		 */
		public boolean verify_text_presented_At_location(String Xpath,String text)
		{
			boolean flag=false;
			try {
				wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath(Xpath), text));
				flag=true;
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			return flag;
		}
		
		
		/*
		 * KeyWord:-->THis keyword verify text presented at required location
		 * Author:--> SunilReddy
		 * Parameters Used:-->  Local Parameter
		 */
		public boolean Verify_element_text(String xpath,String exp_text)
		{
			String element_text=driver.findElement(By.xpath(xpath)).getText();
			boolean flag=element_text.equalsIgnoreCase(exp_text);
			return flag;
		}
		
		
		/*
		 * KeyWord:-->Verify Text visible at webpage
		 * Author:--> SunilReddy
		 * Parameters Used:-->  Local Parameter
		 */
		public boolean verify_text_visible_at_webpage(String Exp_text)
		{
			WebElement Page=driver.findElement(By.tagName("body"));
			String Act_Text=Page.getText();
			return Act_Text.equals(Exp_text);
		}
		
		
		/*
		 * KeyWord:-->Verify any inputvalue presented at editbox
		 * Author:--> SunilReddy
		 * Parameters Used:-->  Local Parameter
		 */
		public boolean verify_inputPresented_At_Textbox(WebElement Object,String exp_input)
		{
			boolean flag=false;
			try {
				wait.until(ExpectedConditions.textToBePresentInElement(Object, exp_input));
				flag=true;
			} catch (Exception e) {
				e.printStackTrace();
			}
			return flag;
		}
		
		
		/*
		 * Keyword:-->This keyword return selected value from dropdown
		 * Author:-->
		 * Parameters used:-->
		 */
		public String getSelectedValueInDropDown(WebElement Object)
		{
			String OptionText=new Select(Object).getFirstSelectedOption().getText();
			return OptionText;
		}
		
		
		/*
		 * Keyword:-->This keyword Verify runtime Attribute value
		 * Author:-->
		 * Parameters used:-->
		 */
		public boolean verify_runtime_Attribute_value(String xpath, String attributname,String exp_attibutevalue)
		{
			String Runtime_Attribute_Value=driver.findElement(By.xpath(xpath)).getAttribute(attributname);
			return Runtime_Attribute_Value.contains(exp_attibutevalue);
		}
		
		/*
		 * Keyword:-->Select Table Records Using Row and Cell
		 * Author:-->
		 * Parameters used:-->
		 */
		public void Click_Item_At_Table(String Xpath,int Row, int Cell)
		{
			WebElement Table=driver.findElement(By.xpath(Xpath));
			Table.findElements(By.tagName("tr"))
			.get(Row).findElements(By.tagName("td"))
			.get(Cell).findElement(By.tagName("a")).click();
		}
		
		/*
		 * Keyword:-->Scroll window vertical
		 * Author:-->
		 * Parameters used:-->
		 */
		public void ScollWindow_V()
		{
			try {
				((JavascriptExecutor)driver).executeScript("window.scroll(0,100)");
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		
		
		
		/*
		 * Keyword:-->Close Current Window
		 * Author:-->
		 * Parameters used:-->
		 */
		public void close_browser()
		{
			driver.close();
		}
		
		
		/*
		 * Keyword:-->Close all windows
		 * Author:-->
		 * Parameters used:-->
		 */
		public void close_Allwindows()
		{
			driver.quit();
		}
		
		
}
