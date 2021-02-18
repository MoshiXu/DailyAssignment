package day1;

import java.util.Scanner;

public class InputNumber {
	
	public static void printResult(int n1,int n2) {
		
		System.out.println("Add: "+(n1+n2));
		System.out.println("Subtract: "+(n1-n2));
		System.out.println("Multiply: "+n1*n2);
		System.out.println("Divide: "+(n1/n2));
		
	}
	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Input number1: ");
		int n1=sc.nextInt();
		
		System.out.println("Input number2: ");
		int n2=sc.nextInt();
		
		//System.out.println(n1+n2);
		
		printResult(n1,n2);
	}

}
