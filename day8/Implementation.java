package day8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;

public class Implementation {
	
	public static void main(String[] args) {
		
		//int id,String name,String author,String publisher
		Book b1=new Book(1,"Annie","Ben","Blizard");
		Book b2=new Book(2,"Ben","Cam","Riot");
		Book b3=new Book(3,"Cath","Don","Samsung");
		Book b4=new Book(4,"David","Zeggies","Honda");

		//arraylist
		List<Book>blist=new ArrayList<>();
		blist.add(b1);
		blist.add(b2);
		blist.add(b3);
		blist.add(b4);
		System.out.println("ArrayList"+blist);
		
		//linkedlist
		List<Book>llist=new LinkedList<>();
		llist.add(b1);
		llist.add(b2);
		llist.add(b3);
		llist.add(b4);
		System.out.println("Linkedlist"+llist);
		
		//vector
		Vector<Book>vlist=new Vector<>();
		vlist.add(b1);
		vlist.add(b2);
		vlist.add(b3);
		vlist.add(b4);
		System.out.println("Vector "+vlist);
		
		//stack
		Stack<Book>stlist=new Stack<>();
		stlist.add(b1);
		stlist.add(b2);
		stlist.add(b3);
		stlist.add(b4);
		System.out.println("Stack "+stlist);
		
		//set
		Set<Book>slist=new HashSet<>();
		slist.add(b1);
		slist.add(b2);
		slist.add(b3);
		slist.add(b4);
		System.out.println("Set"+slist);
	}

}
