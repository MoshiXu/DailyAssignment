package day4;

public class CheckSubString {

	public static void main(String[] args) {
		String sub="orange";
		String str="This is orange juice";
		
		Boolean r=checkPresent(sub,str);
		System.out.println(r);
	}

	private static Boolean checkPresent(String sub, String str) {
		// TODO Auto-generated method stub
		Boolean result=str.contains(sub);
		return result;
	}

}
