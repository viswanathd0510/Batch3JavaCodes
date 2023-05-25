package day21_CollectionPart2;

import java.util.ArrayList;
import java.util.LinkedList;

public class CollectionPart2 {

	public static void main(String[] args) {
		
		// Arraylits wil maintain insertion order 
		
		ArrayList<String> StudentName = new ArrayList<String>();
		StudentName.add("Adithya");
		StudentName.add("Barani");
		StudentName.add("Pratima");
		StudentName.add("Shnrii");
		StudentName.add("Viswa");
		
		// Length for Arrays 
		//  Size for Collections 
		
		System.out.println(StudentName.size());
		
		System.out.println(StudentName.get(2));
		
		// Set method which will insert before a index
		
		System.out.println("***************");
		
		StudentName.set(2, "Navin");
		
		//  Removing can be done by two types one is through index and another one is through object 
		
		StudentName.remove("Navin");
		
		System.out.println(StudentName.contains("Navin"));
		
		System.out.println(StudentName.get(2));
		
		// StudentName.remove(2);
		
		
		System.out.println(StudentName.contains("Viswa"));
		
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
		
		LinkedList<Character> ch = new LinkedList<Character>();
		ch.add('w') ;
		
		System.out.println(mailid.get(0));
		
		
		LinkedList<String> mailid1 = new LinkedList<String>();
		
		LinkedList<String> mailid2 = new LinkedList<String>();
		
		System.out.println(mailid1.isEmpty());
		
		System.out.println(mailid2.isEmpty());
		
		mailid1.containsAll(mailid2);


}
	
}
