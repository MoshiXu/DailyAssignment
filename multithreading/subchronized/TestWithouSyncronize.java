package subchronized;
class Table
{
  public void printTable(int n)
  {
	  for(int i=1;i<=10;i++)
	  {
		  System.out.println(n +"  *  "+i+"  =  "+(n*i));
		  try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   
	  }
		  
  }
  
}

public class TestWithouSyncronize {

	public static void main(String[] args) {
		Table t1=new Table();
		new Thread(){
			
			public void run(){t1.printTable(2);}
		}.start();
		
		Table t2=new Table();
		new Thread(){
			
			public void run(){t2.printTable(5);}
		}.start();
		
	}

}
