package day5;

import java.util.Scanner;

public class AgeExample {
	
	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Input age: ");		
		int age=sc.nextInt();
		
		if(age<=15) {
			throw new Exception("Not enough age.");
		}
		
		System.out.println("The age you entered: "+age);
	}

}
