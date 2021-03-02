package list;

import java.util.*;
/*
Queue in Java follows a FIFO approach i.e. it orders the elements in 
First In First Out manner. 
In a queue, the first element is removed first and last element is removed
in the end. 
Each basic method exists in two forms: 
one throws an exception if the operation fails, the other returns a 
special value.

Also, priority queue implements Queue interface. 
The elements of the priority queue are ordered according to their 
natural ordering,
or by a Comparator provided at the queue construction time. 
The head of this queue is the least element with respect to the
specified ordering.
*/
class QueueExample {
public static void main(String args[]){
    // creating priority queue
	
Queue<String> queue=new PriorityQueue(); 

queue.add("Amit");          // adding elements
queue.add("Rachit");
queue.add("Rahul");

System.out.println("head:"+queue.element());
System.out.println("peek:"+queue.peek());

System.out.println("iterating the queue elements:");
Iterator itr=queue.iterator();
while(itr.hasNext()){
    String s=(String)itr.next();
System.out.println(s);
}
    System.out.println("======");
  System.out.println(queue.remove());
System.out.println(queue.poll());
System.out.println("after removing two elements:");
Iterator<String> itr2=queue.iterator();
while(itr2.hasNext()){
System.out.println(itr2.next());
}
}
}