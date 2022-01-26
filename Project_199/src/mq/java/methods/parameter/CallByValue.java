package mq.java.methods.parameter;

public class CallByValue 
{
	
	//method with string parameters
	public void method1(String name)
	{
		System.out.println(name);
	}
	
	//Method with Integer parameter
	public void method2(int x)
	{
		System.out.println(x);
	}
	
	//Method with multiple parameters with sequence parameters
	public void method3(int x, int y)
	{
		System.out.println(x+y);
	}
	
	//Method with multiple parameters with different data types
	public void method4(String name, int Age)
	{
		System.out.println(name);
		System.out.println(Age);
	}
	
	
	public static void main(String[] args) 
	{
		
		CallByValue obj=new CallByValue();
		obj.method1("Mindq");  //Calling method with string arguments
		obj.method2(100);	   //Calling method with integer arguments
		obj.method3(100, 200);
		obj.method4("Arjun", 25);

	}

}
