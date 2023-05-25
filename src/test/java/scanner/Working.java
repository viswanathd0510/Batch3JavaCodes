package scanner;

import java.util.Scanner;

public class Working {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the first number: ");
	
	int firstnum = sc.nextInt();
	
	System.out.println("Enter the second number: ");
	
	int secondnum  = sc.nextInt();
	
	Calculations add = new Calculations();
	
	System.out.println("Addition of two numbers is ");
	
	add.addition(firstnum, secondnum);
	
	System.out.println("***************************************");
	
	System.out.println("Enter the first number: ");
	
	int firstnum1 = sc.nextInt();
	
	System.out.println("Enter the second number: ");
	
	int secondnum1  = sc.nextInt();
	
	Calculations multi = new Calculations();
	
	System.out.println("Multiplication of two numbers is");

	multi.mulplication(firstnum1, secondnum1);
	
	System.out.println("****************************************");

	System.out.println("Enter the first number: ");
	
	int firstnum2 = sc.nextInt();
	
	System.out.println("Enter the second number: ");
	
	int secondnum2  = sc.nextInt();
	
	Calculations sub = new Calculations();
	
	System.out.println("Subraction of two numbers is");

	sub.subraction(firstnum2,secondnum2);
	
	System.out.println("****************************************");

	System.out.println("Enter the first number: ");
	
	int firstnum3 = sc.nextInt();
	
	System.out.println("Enter the second number: ");
	
	int secondnum3  = sc.nextInt();
	
	Calculations div = new Calculations();
	
	System.out.println("Division of two numbers is");

	div.division(firstnum3,secondnum3);
	
	System.out.println("****************************************");

	}

}
