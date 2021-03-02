public class TestDeadlockExample1 {
    public static void main(String[]   args) {
        final String resource1="sarika "; // t1  next it need t2
        final String resource2="osama";   //t2   next t1
         Thread t1 = new Thread()
        {  
      public void run() {  
          synchronized (resource1) {  
           System.out.println("Thread 1: locked resource 1");  
           try { Thread.sleep(100);} catch (Exception e) {}  
           synchronized (resource2) {  
            System.out.println("Thread 1: locked resource 2");  
           }        }        }  
    };      
         Thread t2 = new Thread() {  
      public void run() {  
        synchronized (resource2) {  
          System.out.println("Thread 2: locked resource 2");  
          try { Thread.sleep(100);} catch (Exception e) {}  
  
          synchronized (resource1) {  
            System.out.println("Thread 2: locked resource 1");  
          }          }  
      }  
    };   
    t1.start();  
    t2.start();  
  } }
    

