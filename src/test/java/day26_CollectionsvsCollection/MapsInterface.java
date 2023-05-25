package day26_CollectionsvsCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class MapsInterface {

	public static void main(String[] args) {

		//  Map is a Interface 
		
		//  You have a requirement to store subjects and marks 
		
		ArrayList<String> subj = new ArrayList<String>();
		subj.add("Tamil");
		subj.add("English");
		subj.add("Science");
		subj.add("Social");
		subj.add("Maths");
		
		ArrayList<String> marks = new ArrayList<String>();
		marks.add("70");
		marks.add("90");
		marks.add("80");
		marks.add("50");
		marks.add("40");
		
		if(subj.size()==marks.size())
		{
		for(int i = 0 ; i <subj.size() ; i++)
		{
			System.out.println(subj.get(i)+ marks.get(i));
		}
		}
		else 
		{
			for(int i = 0 ; i <subj.size() ; i++)
			{
				for(int j = 0 ; j <marks.size() ; j++)
				{
					System.out.println(subj.get(i)+ marks.get(j));
				}
			}
		}
		
		// Map will allow you to store in keys and values format 
		
		//  Keys is unique
		// Values can be duplicate 
		// No insertion order 
		
		// HashMap -- Class
		// Linked Map -- Class
		
		HashMap gm = new HashMap();
		
		// Instead of add it is put method
		
		gm.put("Tamil", 70);
		gm.put("English", 90) ;
		gm.put("Science", 80);
		gm.put("Social", 70);
		gm.put("Maths", 90);
		
		System.out.println(gm);
		
		// We are going to use Keyset method to retrieve the keys and values 
		
		for(Object e : gm.keySet())
		{
			System.out.println("Marks scored in " + e + " " + gm.get(e));
		}
		
		System.out.println("*************************");
		
		
		// INsertion order is maitained 
		// Sorting and retrieveal of data is quick as it involves data strutures cocepts 
		// Doubly linked list data structure is been involved in back end 
		
		
		LinkedHashMap lm = new LinkedHashMap();
		
		lm.put("Tamil", 70);
		lm.put("English", 90) ;
		lm.put("Science", 80);
		lm.put("Social", 70);
		lm.put("Maths", 90);
		
		for(Object e : lm.keySet())
		{
			System.out.println("Marks scored in " + e + " " + lm.get(e));
		}
		
		lm.size();
		
		lm.replace("Tamil", 70, 100);
		
		System.out.println("*************************");
		
		for(Object e : lm.keySet())
		{
			System.out.println("Marks scored in " + e + " " + lm.get(e));
		}

		
	}

}
