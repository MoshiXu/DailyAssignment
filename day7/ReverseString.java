package day7;

public class ReverseString {
	
	public static void reverse(String str) {
		for(int i=str.length()-1;i>=0;i--) {
			System.out.println(str.charAt(i));
		}
	}

	public static void main(String[] args) {
		String str= "HelloWorld";

		reverse(str);
	}

}
