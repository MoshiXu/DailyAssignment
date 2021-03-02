
class MyThread implements Runnable
{

	public void start()
	{
		System.out.println("start");
	}
	@Override
	public void run() {
		System.out.println("Thread Job");
		for(int i=0;i<10;i++){
			System.out.println("Thread is sleeping"+Thread.currentThread().getName());
		try
		{
			Thread.sleep(1000);
		}
		catch (InterruptedException e) {
			// TODO: handle exception
		}
		
	}}}

public class TestRunnable {

	public static void main(String[] args) {
		MyThread m=new MyThread();
		Thread t1=new Thread(m);
		t1.start();
		
		Thread t2 =new Thread(m);
		t2.start();
	}

}
