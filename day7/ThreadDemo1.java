package day7;

class MyThread2 extends Thread {
	public void start(){
		super.start();
		System.out.println("start");
	}
    
	public void run(){
            for(int i=0;i<5;i++)
            {
                    System.out.println("Child thread");
               }
    }
    
    public void run(int a)
    {
            for(int i=0;i<5;i++)
            {
                    System.out.println("Child thread "+a);
               }
    }
}
public class ThreadDemo1 {
    public static void main(String[] args) {
        MyThread2 m1=new MyThread2();
        //m1.start();
        m1.run(5);
        for(int i=0;i<5;i++){
            //System.out.println("main thread");
        }
    }
}