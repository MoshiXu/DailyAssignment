package day6;

import java.util.HashSet;
import java.util.Set;

//Find the first repeating element in an array of integers
//Input: arr[] = {10, 5, 3, 4, 3, 5, 6}
//Output: 5 [5 is the first element that repeats]
public class FindFirstRepeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,5,3,4,3,5,6};
		find(arr);
	}

	private static void find(int[] arr) {
		
		int min=-1;
		Set<Integer>set=new HashSet<>();
		
		for(int i=arr.length-1;i>=0;i--) {
			if(set.contains(arr[i])) {
				min=i;
			}else {
				set.add(arr[i]);
			}
		}
		
		if(min!=-1) {
			System.out.println("The first repeating element is "+arr[min]);
		}else {
			System.out.println("No");
		}
	}

}
