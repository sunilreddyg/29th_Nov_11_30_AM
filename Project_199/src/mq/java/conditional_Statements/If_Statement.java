package mq.java.conditional_Statements;

public class If_Statement {

	public static void main(String[] args)
	{
		
		
		/*
		 * if:-->
		 * 		=> If only accept boolean statement.
		 * 		=> If usefull to execute any block of statement.
		 */
		
		
		int Age=19;

		if (Age > 18)   //Here greater than symbol return boolean value
		{
			System.out.println("Statement1");
			System.out.println("Statement2");
			System.out.println("Statement3");
		}
		
		
		
		if(Age==18)   //For Single statemenet no need to define blocks
			System.out.println("Standard Age");
		
		
		//Condition Using Not Symbol
		if(Age!=0)
		{
			System.out.println("Wrong Age");
		}

}
}