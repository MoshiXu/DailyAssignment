package day5;


//nput : arr[] = {12, 10, 5, 6, 52, 36}
//k = 2
//Output : arr[] = {5, 6, 52, 36, 12, 10}

public class RotateByK {

	public static void main(String[] args) {
		
		int arr[] = {1, 2, 3, 4, 5};
		//Output: arr[] = {5, 1, 2, 3, 4};
		int k=3;
		
		rotate(arr,k);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

	private static void rotate(int[] arr,int k) {
		k %= arr.length;
	    int temp, previous;
	    for (int i = 0; i < k; i++) {
	      previous = arr[arr.length - 1];
	      for (int j = 0; j < arr.length; j++) {
	        temp = arr[j];
	        arr[j] = previous;
	        previous = temp;
	      }
	    }
	}
	
	
}
