package list;
import java.util.*;

public class ArrayListEEx1 {

	public static void main(String[] args) {
		List<String> list= new ArrayList<String>();
		list.add("sarika");
		list.add("saqib");
		list.add("David");
		list.add("Moshi");
		list.add("10");
		
		System.out.println(list);
		list.add(0,"Asif");
		System.out.println(list);
		list.add("sarika");
		System.out.println(list);
		//list.set(1, "vriddhi");
		System.out.println(list);
		list.remove(1);
		System.out.println(list);
		System.out.println(list.contains("sarika"));
		
		
		//LinkedList
		list= new LinkedList<String>();
		list.add("sarika");
		list.add("saqib");
		list.add("David");
		list.add("Moshi");
		list.add("10");
		System.out.println("linkedList");
		System.out.println(list);
		
		
		
		
		Vector <String> v=new Vector<>();
		v.addElement("A");
		
		v.addElement("A");
		v.addElement(null);v.addElement("c");
		System.out.println(v);
		
		Enumeration en=v.elements();
		while(en.hasMoreElements())
		{
			System.out.println("Enumeration "+en.nextElement());
		}
		
		Stack s=new Stack();
		s.push("j");
		s.push("o");
		System.out.println(v);
		
		
	
		Iterator<String> itr=list.iterator();
		while(itr.hasNext()){
			
			String o=itr.next();
			System.out.println(o);
		}
		}
		
}
