package mq.java.variables;

public class String_Comparision_Commands {

	public static void main(String[] args) {
		
		
		/*
		 * String:--> 
		 * 			=> String accept set of charcters to store
		 * 			=> String is not only a datatype and also
		 * 				called as class
		 * 			=> Because string class cotains set of events
		 * 				to validate stored characters
		 */
		
		
		/*
		 * Equals:-->
		 * 		method verify equal comparision between
		 * 		two string and return boolean value true/false
		 * 
		 * 		Note:--> Comparision is casesensitive
		 */
		String Exp_result="Account Created Successfull";
		String Act_result="account Created Successfull";
		
		boolean flag=Exp_result.equals(Act_result);
		System.out.println("Equal Comparision is --> "+flag);
		
		
		/*
		 * EualIgnorecase:-->
		 * 			Method verify equal comparision between two
		 * 			string by ignoring case sensitive..
		 */
		boolean flag1=Exp_result.equalsIgnoreCase(Act_result);
		System.out.println("Equal Ignorecase comparision is -->"+flag1);
		
		
		
		/*
		 * contains:-->
		 * 	  Method verif partial characters available 
		 * 	  at given string and retur boolean value true/false.
		 * 
		 * 		Note:--> Only verify with in sequence
		 */
		String status="Account 100 Creation Completed";
		System.out.println(status.contains("Account"));
		System.out.println(status.contains("100"));
		System.out.println(status.contains("Creation Completed"));
		System.out.println(status.contains("100 Completed"));
				
		
		/*
		 * subString:-->
		 * 		Method pullout sub string characters from 
		 * 		main string.
		 */
		String AccountNumber="1111012348888";
		String Last_Digits=AccountNumber.substring(9);
		System.out.println("Account Last 4 digits are --> "+Last_Digits);
		
		String Middle_Digits=AccountNumber.substring(4,9);
		System.out.println("Account Middle Digits are -->"+Middle_Digits);


		/*
		 * length:-->
		 * 		Method return characters count available at string 
		 * 		with in integer format
		 */
		String mobilenumber="9030248855";
		int count=mobilenumber.length();
		System.out.println("mobile number length is ---> "+count);
		boolean flag4=count==10;
		System.out.println("Is Mobile number in 10 digits ---> "+flag4);
		
		
		
		/*
		 * startswith:-->
		 * 			Method verify given string started with expected characters
		 * 			and return boolean value
		 */
		boolean flag5=AccountNumber.startsWith("1111");
		System.out.println("Starts with Comparision is --> "+flag5);
		
		
		/*
		 * endswith:-->
		 * 			Method verify given string ends with expected characters
		 * 			and return boolean value
		 */
		boolean flag6=AccountNumber.endsWith("8888");
		System.out.println("ends with Comparision is --> "+flag6);
		
		
		/*
		 * isempty:-->
		 * 		method return characters available status in 
		 * 		boolean format
		 * 		=> Return true when string doesn't have any charactes
		 * 		=> Return false when string has characters
		 */
		String var="";
		String var1="Hello";
		System.out.println("var empty status is ---> "+var.isEmpty());
		System.out.println("Var1 empty status is ---> "+var1.isEmpty());
		
		
		/*
		 * charsAt:-->
		 * 		Method return single character using index number
		 */
		String browsername="Chrome,Firefox";
		char ch=browsername.charAt(7);
		System.out.println("charcters available at 7th index number ---> "+ch);
		
		
		/*
		 * ToLowerCase:-->
		 * 		method convert all Uppercase characters
		 * 		into lowercase
		 */
		String toolname="WebDriver";
		System.out.println(toolname.toLowerCase());
		
		/*
		 * toUppercase:-->
		 * 		method convert all lowercase characters 
		 * 		into uppercase
		 */
		System.out.println(toolname.toUpperCase());
		
		
		/*
		 * trim:--> 
		 * 			Method trim extra spaces with in String.
		 * 			It only trim left and right spaces
		 */
		String pincode="    500065    ";
		System.out.println("before Trim pincode length is --> "+pincode.length());
		String NewPincode=pincode.trim();
		System.out.println("After trim pincode length is --> "+NewPincode.length());
		
		
		/*
		 * concat:-->
		 * 			Method club two string 
		 */
		String NewBrowser=",Safari";
		System.out.println(browsername.concat(NewBrowser));
		
		
		/*
		 * replace:-->
		 * 		Replace old characters with New characters 
		 */
		String Rep=browsername.replace('F', 'G');
		System.out.println("After replace character is --> "+Rep);
		System.out.println(browsername.replaceAll("o", "i"));
		
		String Price="$2500";
		System.out.println(Price.replace("$", ""));
		
		

		//Replace characters using regular expressions
		String input = "hello I'm a java dev" +
				"no job experience needed" +
				"senior software engineer" +
				"java job available for senior software engineer";

		String fixedInput = input.replaceAll
					("(java|job|senior)", "<b>$1</b>");

		System.out.println(fixedInput);
		
		
		
		
		
		
	}

}
