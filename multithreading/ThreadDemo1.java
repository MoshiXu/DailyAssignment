class MyThread extends Thread 
{
public void start()
{
    super.start();
    System.out.println("start");
}
    public void run()
    {
            for(int i=0;i<=10;i++)
            {
                    System.out.println("Child thread");
               }
    }
    
    public void run(int a)
    {
            for(int i=0;i<=10;i++)
            {
                    System.out.println("Child thread "+a);
               }
    }
}
public class ThreadDemo1 {
    public static void main(String[] args) {
        MyThread m1=new MyThread();
        m1.start();
        for(int i=0;i<=10;i++)
        {
            System.out.println("main thread");
        }
    }
}
