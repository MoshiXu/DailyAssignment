
public class TestTh1 extends Thread{
	/*public void start()
	{ 
		super.start();
		System.out.println("start");
		
	}*/
	public void run()    //running
	{
		System.out.println("Thread Job");
		for(int i=0;i<10;i++){
			System.out.println("Thread is sleeping"+Thread.currentThread().getName());
		try
		{
			Thread.sleep(1000);
		}
		catch (InterruptedException e) {
			// TODO: handle exception
	}	}}
	public void run(int a){
		System.out.println("Thread Job "+a);
		for(int i=0;i<10;i++){
			System.out.println("Thread is sleeping"+Thread.currentThread().getName());
		try
		{
			Thread.sleep(1000);
		}
		catch (InterruptedException e) {
			// TODO: handle exception
	}	}
	}
	
	//dead state

	public static void main(String[] args) {
		TestTh1 t1=new TestTh1();    //new state
		t1.setName("first thread");
		t1.run(78);
		t1.start(); //implicitly call call run() method 
		//entered in runnable state
		//TestTh1 t2=new TestTh1();
		//t2.setName("second thread");
		//t2.start();
		
		t1.start();
		for(int i=0;i<10;i++){
			System.out.print("Main Thread");}
		t1.run(56);
	}

}
