package collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CollectionsDemo {
	public static void main(String[] args) {
	      
	      // create map
	      Map<String,String> map = new HashMap<String,String>();

	      // populate the map
	      map.put("1","TP"); 
	      map.put("2","IS");
	      map.put("3","BEST");

	      // create a synchronized map
	      Map<String,String> synmap = Collections.synchronizedMap(map);

	      System.out.println("Synchronized map is :"+synmap);
	   }
}
