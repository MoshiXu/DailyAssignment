/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

class TestJoinMethod2 extends Thread{  
    
 public void run(){ 
     System.out.println(Thread.currentThread().getName());  
//  for(int i=1;i<=5;i++){  
//   try{  
//    Thread.sleep(500);  
//   }catch(Exception e){System.out.println(e);}  
//  System.out.println(i);  
//  }  
 }  
public static void main(String args[]){  
 TestJoinMethod2 t1=new TestJoinMethod2();  
 TestJoinMethod2 t2=new TestJoinMethod2();  
  
// System.out.println("Name of t1:"+t1.getName());  
//  System.out.println("Name of t2:"+t2.getName());  
//  System.out.println("id of t1:"+t1.getId());  
 
 
 t1.start();  
 
 t2.start();  
 
 t1.setName("sarika Thread");
 System.out.println("After changing name of t1:"+t1.getName());  
 
 }  
}

