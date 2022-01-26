package mq.java.methods.staticmethos;

public class InputEvents 
{
	//static specifier method
	public static void mouse()
	{
		System.out.println("Mouse Executed");
	}
	
	//static specifier method
	public static  void keyboard()
	{
		System.out.println("Keyboard Executed");
		new InputEvents().touchinteractions();
	}
	
	//Instant method
	public void touchinteractions()
	{
		mouse();  //Static method can be used at instant method
		keyboard();
	}

	public static void main(String[] args)
	{
		//To Run Static method with in class no need of a classname
		mouse();
		keyboard();
		
		//Run Static methods  from different class
		InputEvents.mouse();
		InputEvents.keyboard();

	}

}
