package mq.java.Loops;

public class Foreach_Loop {

	public static void main(String[] args) 
	{
		//Reading String array values using foreach loop
		String browsers[]= {"chrome","firefox","edge","safari","opera"};
		for (String eachbrowser : browsers) 
		{
			System.out.println(eachbrowser);
		}
		
		//Reading numeric values using foreach loop
		int num[]= {100,200,300,400};
		for (int i : num) 
		{
			System.out.println(i);
		}
		
		
		//Double Dimensional array
		String userdata[][]=
			{
					{"Newuser1","Newpwd1"},
					{"Newuser2","Newpwd2"},
					{"Newuser3","Newpwd3"},
					{"Newuser4","Newpwd4"},
					{"Newuser5","Newpwd5"},
					{"Newuser6","Newpwd6"},
					{"Newuser7","Newpwd7"},
					{"Arunk","Al123"},
					{"Akhil","Ak1234"},
			};
		
		//Reading double dimension array data using foreach loop
		for (String[] EachRow : userdata) 
		{
			System.out.println(EachRow[0]+"     "+EachRow[1]);
		}
		
		
		
	}

}
