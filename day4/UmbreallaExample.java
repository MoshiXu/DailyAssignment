package day4;

public class UmbreallaExample {

	public static void main(String[] args) {
		String str="Umbrella";
		Boolean r=checkPresent(str);
		System.out.println(r);
	}

	private static Boolean checkPresent(String str) {
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='e') {
				return true;
			}
		}
		return false;
	}

}
