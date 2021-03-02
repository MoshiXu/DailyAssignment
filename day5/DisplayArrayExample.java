package day5;

import java.util.Scanner;

public class DisplayArrayExample {

	public static void main(String[] args) {
		
		int sizeOfIntArray;
		//int n;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n: ");
		sizeOfIntArray=sc.nextInt();
		
		int[] arr1=new int[sizeOfIntArray];
		System.out.println("Enter numbers: ");
		for(int i=0;i<sizeOfIntArray;i++) {
			arr1[i]=sc.nextInt();
		}
		
		String[] arr2=new String[sizeOfIntArray];
		System.out.println("Enter Strings: ");
		for(int i=0;i<sizeOfIntArray;i++) {
			arr2[i]=sc.next();
		}
		
		//output 
		System.out.println("Displaying numbers");
		for(int i=0;i<sizeOfIntArray;i++) {
			System.out.println(arr1[i]);
		}
		System.out.println("Displaying Strings");
		for(int i=0;i<sizeOfIntArray;i++) {
			System.out.println(arr2[i]);
		}
		//System.out.println(arr2.length);
	}

}
