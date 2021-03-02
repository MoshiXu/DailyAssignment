//Using Thread class
//class Multi extends Thread{    
//public void run(){  
//System.out.println("thread is running...");  
//}  
//
//public static void main(String args[]){  
//Multi t1=new Multi();  
//Multi t2=new Multi();
//t1.start();  
//t2.start();
// }  }  
/////Using Runnable interface


class Multi implements Runnable{  
public void run(){  
System.out.println("thread is running...");  
}    
public static void main(String args[]){  
Multi m1=new Multi();
Thread t1 =new Thread(m1);  
t1.setName("sarika threads");
System.out.println(t1.getName());
t1.start();  
Thread t2 =new Thread(m1);  
t2.setName("newthreads");
 System.out.println(t2.getName());
t2.start();
 }  
}  
