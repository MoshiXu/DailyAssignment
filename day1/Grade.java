package day1;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Quiz score: ");
		double quiz=sc.nextDouble();
		
		System.out.println("Mid-term score: ");
		double midterm=sc.nextDouble();
		
		System.out.println("Final score: ");
		double finalscore=sc.nextDouble();
		
		checkGrade(quiz,midterm,finalscore);
	}

	private static void checkGrade(double quiz, double midterm, double finalscore) {
		// TODO Auto-generated method stub
		double average=(quiz+midterm+finalscore)/3;
		if(average>=90) {
			System.out.println("Your grade is A");
		}else if(average>=70 && average<=90) {
			System.out.println("Your grade is B");
		}else if(average>=50 && average<70) {
			System.out.println("Your grade is C");
		}else {
			System.out.println("Your grade is F");
		}
	}

}
