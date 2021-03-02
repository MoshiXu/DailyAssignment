package day6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberFive {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int input=0;
		System.out.println("Enter an integer input");
		
		try{
			input=sc.nextInt();
		}catch(InputMismatchException e) {
			System.out.println(e);
		}
		//System.out.println("You entered "+input);
	}

}
