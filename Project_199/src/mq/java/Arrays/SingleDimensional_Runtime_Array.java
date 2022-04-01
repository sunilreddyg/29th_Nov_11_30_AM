package mq.java.Arrays;

public class SingleDimensional_Runtime_Array {

	public static void main(String[] args) 
	{
		
		//[Single Dimensional String array]
		String browsers[]= {"chrome","firefox","opera","edge","safari"};
		String chromebrowser=browsers[0];
		System.out.println(chromebrowser);
		System.out.println("length of array is -- "+browsers.length);
		
		
		//Static Array [Single dimensional Numeric array]
		int num[]= {100,200,300,400,500,600};
		int x=num[3];
		System.out.println("4th Index value is ---> "+x);
		
		
		//Store Group values [String, Integers]
		Object obj[]={"Samsung",true,76000.00,3};
		String ProductName=(String) obj[0];
		boolean productstatus=(boolean) obj[1];
		double prodcutprice=(double) obj[2];
		int productunits=(int) obj[3];
		
		
		System.out.println(ProductName+"\t"+productstatus
				+"\t"+prodcutprice+"\t"+productunits);
		
	}

}
