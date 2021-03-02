package day8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Assignments {
	
	public static void main(String[] args) {
		
		ArrayList<Integer>alist=new ArrayList<>();
		alist.add(1);
		alist.add(2);
		alist.add(3);
		alist.add(4);
		System.out.println("Orignial "+alist);
		
		//question1
		alist.add(2, 9);
		System.out.println("Question1 "+alist);
		
		//question2
		alist.remove(2);
		System.out.println("Question2 "+alist);
		
		//question3
		List<String>llist=new LinkedList<>();
		llist.add("A");
		llist.add("B");
		llist.add("C");
		System.out.println("LinkedList "+llist);
		List<String>arraylist=new ArrayList<String>(llist);
		System.out.println("Question3 "+arraylist);
		
		//question4
		Set<String>hset=new HashSet<>();
		hset.add("HA");
		hset.add("HB");
		hset.add("HC");
		System.out.println("HashSet");
		String[] array=new String[hset.size()];
		hset.toArray(array);
		System.out.println("Question4 ");
		for(String t:array) {
			System.out.println(t);
		}
		
		//question5
		System.out.println("Question5 ");
		System.out.println("Original: "+arraylist);
		for(int i=arraylist.size()-1;i>=0;i--) {
			//System.out.print(arraylist.get(i));
		}
		Collections.reverse(arraylist);
		System.out.println(arraylist);
	}

}
