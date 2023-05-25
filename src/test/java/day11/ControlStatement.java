package day11;

import java.util.Scanner;

public class ControlStatement {

	public static void main(String[] args) {
		
		//  Control Statement - If else 
		String s = "Java" ;
		String s1 = "Java" ;
		
		if(s.equals(s1))
		{
			System.out.println("Given Strings are Same");
		}
		else
		{
			System.out.println("Given statement are not same ");
		}
		
		String sq = "JAVA" ;
		String sp = "java" ;
		
		if(sq.equalsIgnoreCase(sp))
		{
			System.out.println("Given Strings are same");
		}
		else
		{
			System.out.println("Given strings are not same");
		}
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter some number");	
		String sz = sc.nextLine();
		
		System.out.println(s);
		System.out.println(sz);
		
		if(sz.isEmpty())
		{
			System.out.println("Plz enter something");
		}
		else
		{
			System.out.println("String is not empty");
		}		
}
	
}
