package mq.java.variables.initiation;

public class Variable_initiation 
{

	public static void main(String[] args)
	
	{
		int a=100;
		System.out.println("before override a value is --> "+a);
		a=200;
		System.out.println("After override a value is ---> "+a);
		
		
		int b;
		b=300;
		System.out.println("B value stored --> "+b);
		b=400;
		System.out.println("b value stored --> "+b);
		
		
		//Global initiation of variable with conditons
		String name;
		if(true)
		{
			 name="MQ";
		}
		System.out.println(name);
		
		
		
		//Global initiation of variable with conditons
		int age=19;
		boolean status;
		if(age > 18)
		{
			status=true;
		}
		else
		{
			status=false;
		}
		System.out.println(status);
		
		
		//Global initiation with loops
		int sum = 0;
		for (int i = 1; i <= 50; i++) 
		{
			sum=sum+i;
		}
		System.out.println("total value is ---> "+sum);

	}

}
