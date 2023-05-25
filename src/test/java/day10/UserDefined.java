package day10;

import java.util.Scanner;

public class UserDefined {

	public static void main(String[] args) {

		// Scanner - User Defined - User is going to give the input 
		
		// Initializing - Hard coding 
				
		// Initializing scanner 
		
		Scanner SC  = new Scanner(System.in);
		
		System.out.println("Enter the first number" );
		
		int i = SC.nextInt();
		
		System.out.println("The number entered" +i);
		
		System.out.println("Enter the second number");
		
		int o = SC.nextInt() ;
		
		System.out.println("The number entered" +o);
		
		int c = i + o ;
		
		System.out.println("The addition of two numbers is " +c);

	}

}
