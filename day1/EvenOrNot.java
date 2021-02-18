package day1;

import java.util.Scanner;

public class EvenOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number=sc.nextInt();
		checkEven(number);
	}

	private static void checkEven(int number) {
		// TODO Auto-generated method stub
		if(number%2==0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
	}

}
