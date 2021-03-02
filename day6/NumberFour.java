package day6;

import java.util.Scanner;

class Shape{
	public static double length;
	public static double breath;
	
	static class Rectangle{
		public double computeRectangleArea() {
			return length*breath;
		}
	}
	
	static class Triangle{
		public double computeTriangleArea() {
			return 1/2*length*breath;
		}
	}
}

public class NumberFour {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the shape 1.Rectangle 2.Triangle");
		int option=sc.nextInt();
		
		System.out.println("Enter the length and breath: ");
		double length=sc.nextDouble();
		double breath=sc.nextDouble();
		double area=0;
		if(option==1) {
			
		}else {
			
		}

	}

}
