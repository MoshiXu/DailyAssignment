package day4;

import java.util.concurrent.SynchronousQueue;

public class DeepCloneExample implements Cloneable{
	
	int i,j;
	DeepCloneExample(int i,int j){
		this.i=i;
		this.j=j;
	}

	public static void main(String[] args) throws CloneNotSupportedException {

		DeepCloneExample o1=new DeepCloneExample(4, 5);
		System.out.println(o1.i+" "+o1.j);
		
		DeepCloneExample o2=(DeepCloneExample) o1.clone();
		System.out.println(o2.i+" "+o2.j);
		
		System.out.println(o1==o2);
		System.out.println(o1.equals(o2));
		
		
		o2.i=500;
		o2.j=400;
		System.out.println(o1.i+" "+o1.j);
		System.out.println(o2.i+" "+o2.j);
		
	}

}
