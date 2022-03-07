package mq.java.variables.initiation;

public class InitilizeData_Through_Constrcutor {

	int a;
	
	public InitilizeData_Through_Constrcutor(int x) 
	{
		a=x;
	}
	
	public void method1()
	{
		System.out.println(a*100);
	}

	public static void main(String[] args) {
		
		InitilizeData_Through_Constrcutor obj=new InitilizeData_Through_Constrcutor(5);
		obj.method1();

	}

}