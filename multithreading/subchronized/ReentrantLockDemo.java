package subchronized;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo {
  public static void main(String[] args) {
    ReentrantLock rl = new ReentrantLock();
    ExecutorService ex = Executors.newFixedThreadPool(2);
    for(int i = 0; i < 4; i++){
      ex.execute(new RClass("Thread-"+i, rl));
    }
    ex.shutdown();
  }
}

class RClass implements Runnable {
  private String threadName;
  ReentrantLock rl;
  RClass(String threadName, ReentrantLock rl){
    this.threadName = threadName;
    this.rl = rl;
  }
  @Override
  public void run() {
    System.out.println("In run method trying to acquire lock- thread " + threadName);
    //acquiring lock
    boolean flag = rl.tryLock();
    if(flag){
      try {
        System.out.println("Thread " + threadName + " has got lock");
        lockMethod();
      } finally{  	
        rl.unlock();
        System.out.println("Count of locks held by thread " + threadName + 
             " - " + rl.getHoldCount());
      } 
    }else{
       System.out.println("Thread- " + threadName + " not able to acquire lock.");
    }
  }

  public void lockMethod(){
    System.out.println("In lockMethod, thread " + threadName + 
      " is waiting to get lock");            
    rl.lock();
    try {        	
      System.out.println("Count of locks held by thread " + threadName + 
          " - " + rl.getHoldCount());
    } finally{
      rl.unlock();
    }
  }    
} 