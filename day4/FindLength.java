package day4;

public class FindLength {

	public static void main(String[] args) {
		String r="refrigerator";
		System.out.println("The length:"+findLength(r));
	}

	private static int findLength(String r) {
		int result=r.length();
		return result;
	}

}
