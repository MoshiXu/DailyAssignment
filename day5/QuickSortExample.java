package day5;

public class QuickSortExample {
	
	public static void main(String[] args) {
		int[] arr= {12, 13, 24, 10, 3, 6, 90, 70};
		
		quickSort(arr,0,arr.length-1);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

	public static void quickSort(int[] arr,int low,int high) {
		int middle = low + (high - low) / 2;
        int pivot = arr[middle];
 
        int i = low, j = high;
        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot){ 
                j--;
            }
        
            if (i <= j) {
                swap (arr, i, j);
                i++;
                j--;
            }
        }
        
        if (low < j){
            quickSort(arr, low, j);
        }
        if (high > i){
            quickSort(arr, i, high);
        }
	}

	public static void swap(int[]arr,int a, int b) {
		int temp=a;
		a=b;
		b=temp;
		
	}

}
