package day5;

import java.util.ArrayList;

//Input: arr[] = {1, 2, 3, 4, 5}
//Output: arr[] = {5, 1, 2, 3, 4}

public class RotationArray {

	public static void main(String[] args) {
		
		int arr[] = {1, 2, 3, 4, 5};
		//Output: arr[] = {5, 1, 2, 3, 4};
		
		int[] r=rotate(arr);
		for(int i=0;i<r.length;i++) {
			System.out.println(r[i]);
		}
		
		rotate2(arr);
	}

	//array
	private static int[] rotate(int[] arr) {
		// TODO Auto-generated method stub
		
		int[] result=new int[arr.length];
		
		//first element
		result[0]=arr[arr.length-1];
		
		for(int i=1;i<arr.length-1;i++) {
			//System.out.println(arr[i]);
			result[i]=arr[i-1];
		}
		
		//last element
		result[arr.length-1]=arr[arr.length-2];
		
		return result;
	}
	
	//arraylist
	public static void rotate2(int[] arr) {
		
		ArrayList<Integer>result=new ArrayList<>();
		
		//first element
		result.add(arr[arr.length-1]);
		
		for(int i=0;i<arr.length-1;i++) {
			result.add(arr[i]);
		}
		
		System.out.println(result);
	}

}
