package robot_window_interface;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class CopyStringTo_Clipboard {

	public static void main(String[] args) throws Exception 
	{

		Runtime.getRuntime().exec("notepad.exe");
		Thread.sleep(5000);
		
		Robot robot=new Robot();
		robot.setAutoDelay(500);
		
		
		String path="D:\\Manual Classnotes\\Defect_Handling\\MyResume.docx";
		
		//Copy String to clipbord
		StringSelection spath=new StringSelection(path);
		
		//Enable System Clipbaord
		Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
		
		//Selected Text set into Clipbaord memory
		clipboard.setContents(spath, spath);
		
		
		
		//Press Control+V using robot class..
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		
		
		
		
	}

}
