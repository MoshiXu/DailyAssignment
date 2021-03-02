package day6;

import java.util.HashSet;

/*
 * 
 * Find the largest three distinct elements in an array
 */
//Input: arr[] = {10, 4, 3, 50, 23, 90}
//Output: 90, 50, 23
public class BigThreeExample {
	
	public static void find(int[] arr) {
		int first,second,third;
		
		third=second=first=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>first) {
				third=second;
				second=first;
				first=arr[i];
			}else if(arr[i]>second) {
				third=second;
				second=arr[i];
			}else if(arr[i]>third) {
				third=arr[i];
			}
		}
		System.out.println("Three largest elements are " + first + " " + second + " " + third);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,4,3,50,23,90};
		find(arr);
	}

}
