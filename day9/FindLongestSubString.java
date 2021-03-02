package day9;

import java.util.HashSet;
import java.util.Set;

//How do you find the length of the longest substring without repeating characters
//For “ABDEFGABEF”, the longest substring are “BDEFGA” and “DEFGAB”, 
//with length 6BBBB” the longest substring is “B”, with length 1
public class FindLongestSubString {

	public static void find(String str) {
		//int max=1;
		//Set<Character>s=new HashSet<>();
		String result="";
		for(int i=0;i<str.length();i++) {
			Set<Character>s=new HashSet<>();
			int j=0;
			for(j=i;j<str.length();j++) {
				if(s.contains(str.charAt(j))) {
					break;
				}else {
					s.add(str.charAt(j));
				}
			}
			if(result.length()<j-i+1) {
				result=str.substring(i,j);
			}
		}
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		String str="ABDEFGABEF";
		find(str);
	}
}
