package mq.java.methods.ReturnTypes;


public class SampleA 
{
	
	void method1()
	{
		String name="WebDriver";
		System.out.println(name);
	}
	
	String method2()
	{
		String name="Selenium";
		return name;
	}
	
	int method3(int x, int y)
	{
		int z=x+y;
		return z;
	}

	double method4(double product1,double product2)
	{
		return product1+product2;
	}
	
	boolean method5()
	{
		return false;
	}
	
	
	public static void main(String[] args) {
		
		SampleA obj=new SampleA();
		
		obj.method1();  //Calling void method	
		
		//Calling string return method
		String toolname=obj.method2(); 
		System.out.println(toolname);
		
		//Calling Integer return method
		int total=obj.method3(100, 240);
		System.out.println(total);
		
		//calling double return method
		double finalprice=obj.method4(10000.00, 25000.00);
		System.out.println(finalprice);
		
		//calling boolean return method
		boolean flag=obj.method5();
		System.out.println(flag);
		
		
		
		
	}

}
