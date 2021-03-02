package day4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicated {
	
	public static void main(String[] args) {
		int[]arr= {8,9,9,9,9,9};
		//remove(arr);
		removeDuplicated(arr);
	}

	private static void removeDuplicated(int[] arr) {
		Arrays.sort(arr);
		
		int[] temp=new int[arr.length];
		int j=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				temp[j++]=arr[i];
			}
			/*
			if(i==arr.length-2) {
				System.out.println(arr[i]);
				System.out.println("j: "+j);
				temp[j]=arr[i];
				*/
			}
		}
		temp[j++]=arr[arr.length-1];
		/*
		for(int i=0;i<j;i++) {
			arr[i]=temp[i];
		}
		*/
		
		for(int i=0;i<j;i++) {
			System.out.println(temp[i]);
		}
		
	}

	private static void remove(int[] arr) {
		Set<Integer>s=new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			s.add(arr[i]);
		}
		System.out.println(s);
	}
	
	
}
