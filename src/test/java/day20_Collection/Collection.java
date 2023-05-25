package day20_Collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class Collection {
	
public static void main(String[] args) {
		
		// Collection is a interface 	
		//  What is the drawbacks of an Array ??
		//  Fixed Size 
		// 	We cannot increase memory or an index size 
		//  It is a datatype dependant ??
		
		String [] a = new String[20]; 
		// a[21] = "String" ;
		
		//  Collection came into picture ??
		
		//  Collection ur memory size will be increase drastically 
		//  No fixed size 
		//  No data type dependant 
		
		// Collection is a interface which implements collection framework 
		// List is an interface which implements collection
		// Array List [CLASS]
		
			// Will maintain insertion order 
		
		// Linked List [CLASS]
		// Vector List [CLASS]
		
		// Array List 
		
		ArrayList<String> StudentName = new ArrayList<String>();
		StudentName.add("Adithya");
		StudentName.add("Barani");
		StudentName.add("Pratima");
		StudentName.add("Shnrii");
		StudentName.add("Viswa");
		
		ArrayList<Object> NonDatatypeDependant = new ArrayList<Object>();
		
		NonDatatypeDependant.add("Stringofjava");
		NonDatatypeDependant.add(123345);
		NonDatatypeDependant.add(true);
		NonDatatypeDependant.add('c');
		
		System.out.println(StudentName.get(0));
		
		System.out.println(StudentName.contains("Viswa"));
		
		for(String s : StudentName)
		{
			System.out.println(s);
		}
		
		// Linked list -- It uses a data structure platform - doubly linked list 
		// where ur retrivl of objects will be sppeder 
		
		LinkedList<String> mailid = new LinkedList<String>();
		mailid.add("adithya.thiruvoth@gmail.com");
		mailid.add("barani.selvam78@gmail.com");
		mailid.add("sriniv523@gmail.com");
		mailid.add("pratimasadalagee@gmail.com");
		mailid.add("dviswanath00@gmail.com");
		
		System.out.println(mailid.get(0));
		
	}

}
