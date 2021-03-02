package subchronized;
class Table2
{
  public  void printTable(int n)
  {
	  synchronized(this){
	  for(int i=1;i<=10;i++)
	  {
		  System.out.println(n +"  *  "+i+"  =  "+(n*i));
		  try {
			Thread.sleep(400);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
	  }
		  
  }
  
}

public class TestSynchBlock {
	public static void main(String[] args){
	Table2 t1=new Table2();
	
	new Thread(){
		
		public void run(){t1.printTable(2);}
	}.start();
	
	//Table1 t2=new Table1();
	new Thread(){
		
		public void run(){t1.printTable(5);}
	}.start();
	

}}
