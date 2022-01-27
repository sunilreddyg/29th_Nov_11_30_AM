package mq.java.methods.ReturnTypes;

public class Class_Reference
{
	
	static Profile getprofile()
	{
		return new Profile();
	}

	public static void main(String[] args) 
	{
		
		String Name=Class_Reference.getprofile().studentname;
		int Age=Class_Reference.getprofile().studentAge;
		System.out.println(Name);
		System.out.println(Age);
	}

}
