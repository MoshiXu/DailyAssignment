package list;

/*
The key of WeakHashMap has reference. 
If the key has been garbage collected, 
then the entry in WeakHashMap object
will automatically be deleted. 
It does not happen in normal HashMap.
The entry will not be deleted 
if the key is garbage collected. 
Find the example below. In the example we have taken one HashMap 
and one WeakHashMap. 
We will put entry in both the object and then later we will make
the reference key as null and
then garbage collected. And again check the entry. 
In the HashMap object entry will be there but in WeakHashMap
object there will not be entry present. 
 */
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
public class WeakHashMapTest {
	public static void main(String[] args) {
                   Map hashMap= new HashMap();
		
            Map weakHashMap = new WeakHashMap(); 
        String  keyHashMap = new String("keyHashMap");
        String  keyWeakHashMap = new String("keyWeakHashMap");  
       
        
        hashMap.put(keyHashMap, "Ankita");
        
        weakHashMap.put(keyWeakHashMap, "Atul");
        
        System.out.println("Before: hash map value:"+
                hashMap.get("keyHashMap")+" and weak hash map value:"+
               weakHashMap.get("keyWeakHashMap"));
        
        keyHashMap = null;
       keyWeakHashMap = null;
        System.gc();  
        
        System.out.println("After: hash map value:"+
                hashMap.get("keyHashMap")+" and weak hash map value:"+
                weakHashMap.get("keyWeakHashMap"));
    }
}