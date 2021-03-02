package day7;

class MyThread3 implements Runnable{
	
	public void start() {
		System.out.println("start");
	}
	@Override
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
}

public class TestRunnable {

	public static void main(String[] args) {
		MyThread3 m=new MyThread3();
		Thread t1=new Thread(m);
		t1.start();
		
		Thread t2=new Thread(m);
		t2.start();
	}

}
