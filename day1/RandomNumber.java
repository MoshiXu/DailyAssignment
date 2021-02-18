package day1;

public class RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int min=1;
		int max=6;
		
		
		int result=(int)(Math.random()*(max-min+1)+min);
		System.out.println(result);
		
	}

}
