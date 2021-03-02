package day7;

//How do you check if two strings are anagrams of each other
public class Anagram {
	
	public static boolean check(String s1,String s2) {
		if(s1.length()!=s2.length()) {
			return false;
		}
		char[] count=new char[s1.length()];
		for(int i=0;i<s1.length();i++) {
			count[s1.charAt(i)-'a']++;
			count[s2.charAt(i)-'a']--;
		}
		
		for(int i=0;i<s1.length();i++) {
			if(count[i]!=0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
	
		String s1="GAINLY";
		String s2="LAYING";
		
		System.out.println(check(s1,s2));

	}

}
