package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListExample {

	public static void main(String[] args) {
		 ArrayList<Integer> al=new ArrayList();
	        al.add(15);
	        al.add(0);
	        al.add(10);
	        al.add(20);
	        al.add(5);
	        System.out.println("Arraylist "+ al);
	        Collections.sort(al,new MyComparator());
	        System.out.println("sorted arrylist ");
	        System.out.println(al);        
	    
	        System.out.println("?????");
	        System.out.println(Collections.binarySearch(al, 10,new MyComparator() ));
	        System.out.println(Collections.binarySearch(al, 13,new MyComparator()));
	}

}

class MyComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer t1, Integer t2) {
		return t1.compareTo(t2);
	}
	
}
