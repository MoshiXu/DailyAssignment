package day6;

import java.util.HashMap;
import java.util.Map;

//Find the occurrence of an integer in the array

public class OccurenceExample {

	public static void find(int[] arr) {
		Map map=new HashMap();
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], (int)map.get(arr[i])+1);
			}else {
				map.put(arr[i], 1);
			}
		}
		System.out.println(map);
	}
	
	public static void find1(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			
		}
	}
	
	public static void main(String[] args) {
		int[] arr= {3,3,5,1,7};
		int[] arr1= {0, 5, 5, 5, 4};
		int x = 5;
		find(arr);

	}
}
