package day6;

/*
 * 
 * Find the first non-repeating element in a given array of integers.
 */
//nput : -1 2 -1 3 2
//Output : 3
public class FindNonRepeating {

	public static int find(int[] arr,int n) {
		for (int i = 0; i < n; i++) { 
            int j; 
            for (j = 0; j < n; j++) 
                if (i != j && arr[i] == arr[j]) 
                    break; 
            if (j == n) 
                return arr[i]; 
        } 
  
        return -1; 
	}
	
	public static void main(String[] args) {
		
		int[] input={-1 ,2 ,-1 ,3 ,2};
		System.out.println(find(input,input.length));
	}

}
