package list;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetEx {
public static void main(String [] args){
	SortedSet al=new TreeSet();  // creating treeSet 
	//TreeSet al=new TreeSet(); 
	al.add("Sam");
	al.add("John");                            // adding element
	al.add("Rick");
	al.add("Tom");
	//al.add(null);// NPE

	Iterator<String> itr=al.iterator();
	while(itr.hasNext()){
	System.out.println(itr.next());
	}

	    System.out.println("first "+al.first());
	    System.out.println("last"+al.last());
	    System.out.println("headSet  "+al.headSet("Sam"));
	    System.out.println("tailset "+al.tailSet("Sam"));
	    System.out.println("subset "+al.subSet("John", "Sam"));
	    System.out.println(al.comparator());
	    
	    
	    
	    NavigableSet<Integer> t=new TreeSet();
        t.add(1000);
        t.add(2000);
        t.add(3000);
        t.add(4000);
        t.add(5000);
        System.out.println(t);
        System.out.println(t.ceiling(2000));
        System.out.println(t.higher(2000));
        System.out.println(t.floor(3000));
        System.out.println(t.lower(3000));
        System.out.println(t.pollFirst());
        System.out.println(t.pollLast());
        System.out.println(t.descendingSet());
        System.out.println(t);
        
        
       
	}
	}
