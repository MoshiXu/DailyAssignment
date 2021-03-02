package list;

import java.util.ArrayDeque;
import java.util.Deque;
public class ArrayDequeExample {  
    public static void main(String[] args) {  
   //Creating Deque and adding elements  
   Deque<String> deque = new ArrayDeque<String>();  
   deque.add("Ravi");    
   deque.add("Vijay");     
   deque.add("Ajay");    
   //Traversing elements  
   for (String str : deque) {  
   System.out.println(str);  
   }
   //===========================
   
    Deque<String> deque1=new ArrayDeque<String>();  
    deque1.offer("arvind");  
    deque1.offer("vimal");  
    deque1.add("mukul");  
    deque1.offerFirst("jai");  
    deque1.offerLast("ka");
    System.out.println("After offerFirst Traversal...");  
    for(String s:deque1){  
        System.out.println(s);  
    }
    //deque1.poll();  
   deque1.pollFirst();//it is same as poll()  
    deque1.pollLast();  
    System.out.println("After pollLast() Traversal...");  
    for(String s:deque1){  
        System.out.println(s);
   }  
   }  }
    

