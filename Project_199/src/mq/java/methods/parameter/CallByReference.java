package mq.java.methods.parameter;

public class CallByReference 
{
	
	//Method Parameter with reference class
	public void method1(Products pro)
	{
		System.out.println(pro.productname);
		System.out.println(pro.price);
	}
	
	public static void main(String[] args)
	{
		
		CallByReference obj=new CallByReference();
		obj.method1(new Products());  //Calling method 

	}

}
