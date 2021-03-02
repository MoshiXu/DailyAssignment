class MyThread1 extends Thread
{
    public void run()
    {
        for(int i=0;i<10;i++){
          Thread.yield();
            System.out.println("Child thread ");
        }
    }
}
public class ThreadYield {
    public static void main(String[] args) {
        MyThread1 m1=new MyThread1();
        m1.start();
        for(int i=0;i<10;i++){
            System.out.println("Main therad");
        }
    }
}
