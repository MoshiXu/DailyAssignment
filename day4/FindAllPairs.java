package day4;

public class FindAllPairs {

	public static void main(String[] args) {
		
		int[] arr= {15,12,4,16,9,8,24,0};
		int num=24;
		
		find(arr,num);
	}

	private static void find(int[] arr, int num) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				if(arr[i]+arr[j]==num && i!=j) {
					System.out.println(arr[i]+" ,"+arr[j]);
				}
			}
		}
	}

}
