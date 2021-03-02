class MyThread2 extends Thread{
public void run(){
for(int i=0;i<10;i++){
    System.out.println("Thread 1");
    try
    {  System.out.println("thread  "+Thread.currentThread().getName());
        Thread.sleep(2000);
    }
    catch(InterruptedException e){}
}
}
}
public class JoinThread {
    public static void main(String[] args) throws InterruptedException {
     //   MyThread2 m1=new MyThread2();
       // m1.start();
        MyThread2 m2=new MyThread2();
        m2.start();
       m2.join();
        for(int i=0;i<10;i++){
            System.out.println("Main Thraed");
        }
    }
}
