package mq.java.methods.instant;

public class InstantMethods 
{
	
	//instant method
	public void method1()
	{
		System.out.println("Method 1 is executed");
	}

	//Instant method
	public void method2()
	{
		System.out.println("Method 2 is executed");
	}
	
	//Instant method
	public void method3()
	{
		method1();  //With in class we can call any instant directly 
		method2();
	}

	public static void main(String[] args) 
	{
		//In Main method static specifier not allowed to access
		//Instant method without object creation.
		InstantMethods methods=new InstantMethods();
		methods.method3();
	}

}
