package list;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetEx1 {

	public static void main(String[] args) {
		Set<Integer> set=new HashSet<>();
		set.add(10);
		set.add(78);
		set.add(3);
		set.add(null);
		set.add(3);
		System.out.println(set);
		System.out.println(set.add(3));
		
		 set=new LinkedHashSet<>();
		set.add(10);
		set.add(78);
		set.add(3);
		set.add(null);
		set.add(3);
		System.out.println(set);
		//System.out.println(set.add(3));
	}

}
