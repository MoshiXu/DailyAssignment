package list;

import java.util.PriorityQueue;
public class PriorityDequeExample {
    public static void main(String[] args) {
        PriorityQueue<String> pq=new PriorityQueue<>();
        pq.add("C");
        pq.add("C++");
         pq.add("python");
        pq.add("java");

        for(String str: pq){
            System.out.println(str);
        }
            System.out.println(pq.offer("sarika"));
            
            for(String str1: pq){
            System.out.println(str1);
    }  
              System.out.println(pq.peek());
            System.out.println(pq.element());
            System.out.println("poll");
              System.out.println(pq.poll());
                System.out.println(pq.remove());
            
    }
}
