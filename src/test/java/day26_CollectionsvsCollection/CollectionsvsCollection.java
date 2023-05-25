package day26_CollectionsvsCollection;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsvsCollection {

	public static void main(String[] args) {

		//  What is a collections 
		
		// Collections is a class which will help u to do modifications
		
		// Collections vs collections 
		
		ArrayList<String> marks = new ArrayList<String>();
		marks.add("70");
		marks.add("90");
		marks.add("80");
		marks.add("50");
		marks.add("40");
		
		for(String p : marks)
		{
			System.out.println(p);
		}
		System.out.println("*************************");
		
		Collections.reverse(marks);
		
		for(String p : marks)
		{
			System.out.println(p);
		}
		
		Collections.sort(marks);
		
		System.out.println("*************************");
		
		for(String p : marks)
		{
			System.out.println(p);
		}	

	}

	}


