package mq.java.Loops;

public class For_Example 
{

	public static void main(String[] args) 
	{
		
		//Print numbers from 1 to 10
		for (int i = 1; i < 11; i++) 
		{
			System.out.println(i);
		}
		
		
		//Print numbers from 10 to 1
		for (int i = 10; i > 0; i--) 
		{
			System.out.println(i);
		}
		
		
		//Print Array values using for loop
		String tools[]= {"IDE","RC","WD","GRID"};
		for (int i = 0; i < tools.length; i++) 
		{
			String eachtool = tools[i];
			System.out.println(eachtool);
			
		}
		
		
		//Conduct Sum between 1 to 100
		int sum=0;
		for (int i = 1; i <= 100; i++) 
		{
			sum=sum+i;
		}
		System.out.println("Total value is --> "+sum);
		
		
		//How to Reverse a string
		String toolname="webdriver";
		char ch[]=toolname.toCharArray();
		String str="";
		for (int i = ch.length-1; i >= 0; i--) 
		{
			str=str+ch[i];
		}
		System.out.println(str);
		
		
		//Reverse a string with string builder
		StringBuilder sb=new StringBuilder(str);
		System.out.println(sb.reverse().toString());
		
		
		//Break Keyword
		for (int i = 0; i < 5; i++) 
		{
			  if(i==3)
			  {
				  break;  //Break iteration and comeout from the loop
			  }
			  System.out.println(i);
		}
		
		
		//Continue Keyword
		for (int i = 0; i < 5; i++) 
		{
			if(i==2)
			{
				continue;  //It Skip Iteration on Condition
			}
			System.out.println(i);
		}
		

	}

}
