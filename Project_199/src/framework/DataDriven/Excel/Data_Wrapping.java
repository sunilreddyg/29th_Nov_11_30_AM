package framework.DataDriven.Excel;

public class Data_Wrapping {

	public static void main(String[] args) 
	{
		
		/*
		 * Autoboxing:-->
		 * 		Converting primitive data types into
		 * 		non primitive datatypes
		 */
		boolean flag=true;
		Boolean obj=new Boolean(flag);
		System.out.println(obj.toString());
		
		double val=2500.25;
		Double dble=new Double(val);
		System.out.println(dble.intValue());
		System.out.println(dble.toString());
		
		/*
		 * unboxing:-->
		 * 		Converting Non primitive data types into
		 * 		primitive datatypes
		 */
		Integer i=new Integer(100);
		int x=i;
		System.out.println(x);
		
		
		
	}

}
