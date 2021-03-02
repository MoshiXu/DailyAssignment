
public class TestInterruptingThread2 extends Thread{
    public void run(){  
for(int i=1;i<=50;i++)  
System.out.println(i);  
}  
  
public static void main(String args[]){  
TestInterruptingThread2 t1=new TestInterruptingThread2();  
t1.start();  
  
t1.interrupt();  
  
}  
    
}
