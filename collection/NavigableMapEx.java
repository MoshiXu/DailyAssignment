package list;

import java.util.*;
public class NavigableMapEx {
    public static void main(String[] args) {
        NavigableMap<String,String> t=new TreeMap<>();
        t.put("b","ball");
        t.put("c","cat");
        t.put("a","apple");
        t.put("d","dog");
        t.put("g","gun");
        t.put("f","fun");
        System.out.println(t);
        
        System.out.println(t.ceilingKey("c"));
        System.out.println(t.higherKey("e"));
        System.out.println(t.floorKey("e"));
        System.out.println(t.lowerKey("e"));
        System.out.println(t.pollFirstEntry());
        System.out.println(t.pollLastEntry());
        System.out.println(t.descendingMap());
        System.out.println(t);
        
    }
}
