package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample1 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
        al.add("z");
        al.add("a");
        al.add("M");
        al.add("k");
        al.add("A");
        System.out.println("Arraylist "+ al);
        Collections.sort(al);
        System.out.println("sorted ArrayList "+al);
      System.out.println(Collections.binarySearch(al, "M"));

	}

}
