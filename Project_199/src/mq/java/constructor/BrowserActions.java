package mq.java.constructor;

public class BrowserActions
{
	//Constructor of class
	public BrowserActions() 
	{
		System.out.println("All Chrome Paths Has been setup");
	}
	
	//Instant Method
	public  void openbrowser()
	{
		System.out.println("browser is opened");
	}

	public static void main(String[] args)
	{
		new BrowserActions().openbrowser();
		 
		
	}

}
