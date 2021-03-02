import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolEx {

	public static void main(String[] args) {
		ExecutorService executor=Executors.newFixedThreadPool(5);//creating pool
		for(int i=0;i<10;i++){                       
			WorkerThread w=new WorkerThread(""+i);
			executor.execute(w);// calling execute ,method of ExecutporService
		}
		executor.shutdown();
		while(!executor.isTerminated())
		{}
		
		System.out.println("Finish all the thread");
	}

}
/*
Runaable r
Thread t
start

Runnable r
excutor(r)
*/