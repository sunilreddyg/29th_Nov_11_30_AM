package mq.java.variables.initiation;

public class Method_Initializer 
{
	int a;
	int b;
	
	//initilizer method
	public void methodA(int x, int y)
	{
		a=x;
		b=y;
	}
	
	public void methodB()
	{
		System.out.println(a);
		System.out.println(b);
	}
	
	
	public static void main(String[] args) 
	{
		
		Method_Initializer obj=new Method_Initializer();
		obj.methodA(10, 20);  //This method initlialize data to global variable
		obj.methodB();
	
	}

}
