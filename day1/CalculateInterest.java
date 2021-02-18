package day1;

import java.util.Scanner;

public class CalculateInterest {
	
	public static void calculateInterest() {
		float amount;
		float rate;
		float interest;
		float tax;
		float tax_amount;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount of deposit: ");
		amount=sc.nextFloat();
		
		System.out.println("Enter yearly interest rate: ");
		rate=sc.nextFloat();
		
		interest=amount*rate/100;
		
		System.out.println("Enter income tax rate: ");
		tax=sc.nextFloat();
		
		tax_amount=interest*(tax/100);
		interest-=tax;
		System.out.println("The interest earned in the year: "+interest);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculateInterest();
	}

}
