package mq.java.conditional_Statements;

public class IF_Else_StateMent {

	public static void main(String[] args)
	{
		
		/*
		 * IF-Else:--> 
		 * 		=> Any two decisions to execute
		 * 		=> If condition execute only where value return true
		 * 		=> else condition execute where value return false.
		 */
		
		
		int Age=19;
		if (Age > 18) // >[greaterthan symbol return boolean value]
		{
			System.out.println("true Condition");
		} else {
			System.out.println("False Condition");
		}
		
		
		
		String Status="Available";
		if(Status.equals("Available"))
			System.out.println("Product available");
		else
			System.out.println("Prdouct not available");
		
		
		
		boolean flag=false;
		if(flag)
			System.out.println("True Condition");
		else
			System.out.println("False condition");
		
		
		//Verif Mobile number available in 10 digits
		if("9030248855".length() ==10)
			System.out.println("Ten Digit Number");
		else
			System.out.println("Not a 10 digit Number");
		
		
		boolean studentid=true;
		if(Age > 18  ||  studentid==true)
		{
			System.out.println("Single Criteria Is matching");
		}
		else
		{
			System.out.println("Or comparision Rejected");
		}
		
		
		//If Condition using And Comparision
		if(Age > 18  &&  studentid==true)
		{
			System.out.println("Both Criterias are matching");
		}
		else
		{
			System.out.println("And Comparision Rejected");
		}
			

	}

}
