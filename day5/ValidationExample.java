package day5;

import java.util.Scanner;

/*
 * to validate the full name of an employee.
Create and throw a user defined exception if firstName and lastName is blank.
 */

public class ValidationExample {
	/*
	static boolean validate(String str1,String str2){
		
		try {
			str1
		}
		return false;
		
	}
	*/

	public static void main(String[] args) throws Exception {
		String firstName=null;
		String lastName=null;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Input your firstName: ");
		firstName=sc.nextLine();
		
		System.out.println("Input your lastName: ");
		lastName=sc.nextLine();
		
		if(firstName.length()==0 || lastName.length()==0) {
			throw new Exception("Don't be empty");
		}
		System.out.println("Your name entered: "+firstName+" "+lastName);
		System.out.println("Thank you");
		
		//boolean check = validate(firstName,lastName);
	}
}
