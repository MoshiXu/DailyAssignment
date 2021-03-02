package subchronized;
class Table1
{
  public synchronized void printTable(int n)
  {
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

public class TestSync {
	

	public static void main(String[] args) {
		Table1 t1=new Table1();
		
		new Thread(){
			
			public void run(){t1.printTable(2);}
		}.start();
		
		//Table1 t2=new Table1();
		new Thread(){
			
			public void run(){t1.printTable(5);}
		}.start();
		
	}

}
