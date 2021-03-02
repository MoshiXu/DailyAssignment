package day7;

import java.util.HashMap;
import java.util.Map;

//find duplicate element in string
public class Duplicate {

	public static void find(String str) {
		
		char[] chars=str.toCharArray();
		Map<Character,Integer>map=new HashMap<>();
		
		for(char c:chars) {
			if(map.containsKey(c)) {
				int count=map.get(c);
				map.put(c, count++);
			}else {
				map.put(c, 1);
			}
		}
		
		for(char c:map.keySet()) {
			if(map.get(c)>1) {
				System.out.println(c);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="HelloWorld";
		find(str);
	}

}
