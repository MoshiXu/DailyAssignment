package collection;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListEx  extends Thread{
	static CopyOnWriteArrayList<String>  list=  new CopyOnWriteArrayList<>();       

		@Override
       public void run(){
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
         }
     public static void main(String[] args) throws  InterruptedException
     {
       
       list.add("A");
      CopyOnWriteArrayListEx d=new CopyOnWriteArrayListEx();
      d.run();
      //d.list.add("k");
         
         Iterator<String> itr=list.iterator();
         while(itr.hasNext()){
            // System.out.println("list  "+list);
             String str=itr.next();
             System.out.println(str);
         
        // get the iterator
        //manipulate list while iterating
        if(str.equals("2"))
            list.remove("5");
          if(str.equals("3"))
              list.add("3 found");
//below code don't throw ConcurrentModificationException
////because it doesn't change modCount variable of list
           //if(str.equals("4"))
             //  list.set(1, "4");
        }
         System.out.println(list);
    }

}
