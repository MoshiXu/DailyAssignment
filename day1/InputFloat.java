package day1;

import java.util.Scanner;

public class InputFloat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter value a: ");
		float f1=sc.nextFloat();
		System.out.println("The value of a before adding is "+f1);
		
		
		System.out.println("Enter value b: ");
		float f2=sc.nextFloat();
		
		System.out.println("The value of a after adding is "+(f1+f2));
	}

}
