class TestMultipleTask1 implements Runnable{  
public void run(){  
System.out.println("task one");  
}  
public static void main(String args[]){  
//Thread t1 =new Thread(new TestMultipleTask1());//passing annonymous object of TestMultitasking2 class  
//Thread t2 =new Thread(new TestMultipleTask1());  
//t1.start();  
//t2.start();  
    TestMultipleTask1 r1 = new TestMultipleTask1();
    Thread t1 = new Thread(r1);
    t1.start();
    Thread t2 = new Thread(r1);
    t2.start();
}  
}  