
public class WorkerThread implements Runnable {
    private String message;
    
    
	public WorkerThread(String message) {
		super();
		this.message = message;
	}


	@Override
	public void run() {
		System.out.println("start"+Thread.currentThread().getName()+"  "+message);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("End"+Thread.currentThread().getName()+"  "+message);
		
	}
	

}
