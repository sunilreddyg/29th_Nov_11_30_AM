package mq.java.variables;

public class Final_Variable 
{
		int a=100;			//Allow to change variable value
		final int b=200;    //Doesn't allow to change variable value

		public static void main(String[] args) 
		{
			
			Final_Variable obj=new Final_Variable();
			System.out.println("Before change a value is --> "+obj.a);
			obj.a=400;
			System.out.println("After change a value is --> "+obj.a);
			
			
			
			
		
		}

	}

