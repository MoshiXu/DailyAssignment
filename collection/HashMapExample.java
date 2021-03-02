package list;

/*
 HashMap is a Map based collection class that is used for storing Key 
& value pairs, 
it is denoted as HashMap<Key, Value> or HashMap<K, V>. 
This class makes no guarantees as to the 
order of the map. It is similar to the Hashtable class except that 
it is unsynchronized and permits nulls(null values and null key).
It is not an ordered collection which means it does not return the 
keys and values in the same order in which they have been inserted into the
HashMap. 
It does not sort the stored keys and Values. You must need to 
import java.util.HashMap
or its super class in order to use the HashMap class and methods
 */

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;
public class HashMapExample {
   public static void main(String args[]) {
      /* This is how to declare HashMap */
      Map<Integer, String> hmap = new HashMap<Integer, String>();
      /*Adding elements to HashMap*/
      hmap.put(12, "Chaitanya");
      hmap.put(2, "Rahul");
      hmap.put(7, "Singh");
      hmap.put(49, "Ajeet");
      hmap.put(3, "Anuj");
       System.out.println( "hashmap "+hmap);
      /* Display content using Iterator*/
      Set s1=hmap.entrySet();      
      Iterator iterator = s1.iterator();
      while(iterator.hasNext()) 
      {    
         Map.Entry    mentry = (Map.Entry)iterator.next();
         System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
         System.out.println(mentry.getValue());
      }

      /* Get values based on key*/
      String var= hmap.get(2);
      System.out.println("Value at key 2 is: "+var);
      

      /* Remove values based on key*/
      hmap.remove(3);
      System.out.println("Map key and values after removal:");
      Set set2 = hmap.entrySet();
      Iterator iterator2 = set2.iterator();
      while(iterator2.hasNext()) {
          Map.Entry mentry2 = (Map.Entry)iterator2.next();
          System.out.print("Key is: "+mentry2.getKey() + " & Value is: ");
          System.out.println(mentry2.getValue());
         
          Set s11= hmap.keySet();
          System.out.println("Key set "+ s11);
          Collection c=hmap.values();
          System.out.println("values  "+c);
          
       Set s3=hmap.entrySet();
       Iterator i=s3.iterator();
       while(i.hasNext())
       {
       Map.Entry<Integer ,String> m1=(Map.Entry<Integer ,String>) i.next();
           if(m1.getKey()==49)
           {               m1.setValue("sarika");}
                  System.out.println(m1);
            
       }
       }

   }
}
/*
HashMap Class Methods
 list of methods available in HashMap class. 
void clear(): It removes all the key and value pairs from the specified 
Map.
Object clone(): It returns a copy of all the mappings of a map and
used for cloning them into another map.
boolean containsKey(Object key): It is a boolean function which returns 
true or false based on whether the specified key is found in the map.
boolean containsValue(Object Value): Similar to containsKey() method,
however it looks for the specified value instead of key.
Value get(Object key): It returns the value for the specified key.
boolean isEmpty(): It checks whether the map is empty. If there are no 
key-value mapping present in the map then this function returns true
else false.
Set keySet(): It returns the Set of the keys fetched from the map.
value put(Key k, Value v): Inserts key value mapping into the map. 
Used in the above example.
int size(): Returns the size of the map – Number of key-value mappings.
Collection values(): It returns a collection of values of map.
Value remove(Object key): It removes the key-value pair for the
specified key. Used in the above example.
void putAll(Map m): Copies all the elements of a map to the another \
specified map.
*/
