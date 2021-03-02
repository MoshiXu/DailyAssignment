package day4;

public class FindConsonents {

	public static void main(String[] args) {
		String str="Hello, have a good day";
		String s=find(str);
		System.out.println(s);
	}

	private static String find(String str) {
		StringBuilder result=new StringBuilder();
	
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			c=Character.toLowerCase(c);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				continue;
			}else {
				result.append(c);
			}
		}
		return result.toString();
	}

}
