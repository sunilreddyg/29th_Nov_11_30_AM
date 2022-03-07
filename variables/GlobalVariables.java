package mq.java.variables;

public class GlobalVariables 
{
	//Global Variables  [Instant Variables]
	public String mobile="iphone";
	public int quantity=10;
	
	//Global Variables  [Static Variables]
	public static double price=250000.00;
	public static boolean productstatus=true;
	

	public static void main(String[] args) 
	{
		//Creating object to access instant variables
		GlobalVariables obj=new GlobalVariables();
		String name=obj.mobile;
		int count=obj.quantity;
		
		System.out.println(name);
		System.out.println(count);
		
		//Accessing static variables
		double objprice=GlobalVariables.price;
		boolean status=GlobalVariables.productstatus;
		
		System.out.println(objprice);
		System.out.println(status);
	}

}
