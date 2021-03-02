package day7;


class MyThread1 extends Thread{
	public void start() {
		super.start();
		System.out.println("start");
	}	
	
	public void run() {
		System.out.println("Thread job");
		for(int i=0;i<5;i++) {
			System.out.println("Thread is sleeping "+Thread.currentThread().getName());	
		}
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			
		}
	}
	
	public void run(int a) {
		System.out.println("Thread job "+a);
		for(int i=0;i<5;i++) {
			System.out.println("Thread is sleeping "+Thread.currentThread().getName());
		}
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			
		}
	}
}

public class ThreadExample extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread1 t=new MyThread1();
		t.setName("first thread");
		t.start();
		t.run(4);
	}

}
