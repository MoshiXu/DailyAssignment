package list;
import java.util.*;
public class StudentTreeset {

	public static void main(String[] args) {
		Student s1=new Student(1,"aa",17);
		Student s2=new Student(2,"ag",15);
		Student s3=new Student(3,"aK",77);
		Student s4=new Student(4,"KK",45);
		
		TreeSet<Student> t1=new TreeSet<>();
		t1.add(s1);
		t1.add(s2);
		t1.add(s4);
		t1.add(s3);
		Student ss=null;
		System.out.println("Comparable");
		Iterator<Student> itr=t1.iterator();
		while(itr.hasNext()){
			 ss=itr.next();
			
		System.out.println(ss.name+" "+ss.age+"  "+ss.Id);
		}
		 t1=new TreeSet<>(new NameComparator());
		t1.add(s1);
		t1.add(s2);
		t1.add(s4);
		t1.add(s3);
		System.out.println("Comparator by name");
		itr=t1.iterator();
		while(itr.hasNext()){
			 ss=itr.next();
		System.out.println(ss.name+" "+ss.age+"  "+ss.Id);
		
		}	
		 t1=new TreeSet<>(new IdComparator());
		t1.add(s1);
		t1.add(s2);
		t1.add(s4);
		t1.add(s3);
		System.out.println("IdComparator");
	    itr=t1.iterator();
		while(itr.hasNext()){
		 ss=itr.next();
		System.out.println(ss.name+" "+ss.age+"  "+ss.Id);
		}
	

		}}
