package mq.java.methods.instant;

public class TVRemote 
{
	//Reusable method
	public void turnon()
	{	
		System.out.println("Turnon executed");
	}
	
	//Reusable methods
	public void turnoff()
	{
		System.out.println("Turnoff executed");
	}

	//Runnable Method
	public static void main(String args[])
	{
		TVRemote obj=new TVRemote();
		obj.turnon();
		obj.turnoff();
	}
	
}


