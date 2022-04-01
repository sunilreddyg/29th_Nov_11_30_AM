package mq.java.Arrays;

public class DoubleDimensional_StaticArray {

	public static void main(String[] args) 
	{
		
		
		//Double dimensional static array
		String data[][]=new String[2][2];
				
		//Data storing into first row
		data[0][0]="Arun";
		data[0][1]="9030";
				
		//Data storing into second row
		data[1][0]="krish";
		data[1][1]="9040";

		String seconduser=data[1][0];
		System.out.println(seconduser);
		System.out.println("Row length is ---> "+data.length);


	}

}
