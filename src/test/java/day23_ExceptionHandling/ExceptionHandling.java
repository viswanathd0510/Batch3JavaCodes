package day23_ExceptionHandling;

import java.util.Scanner;

public class ExceptionHandling {
	
	public void addtion() 
	{
	int a = 0;
	int b = 0;
	try
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the First Number");
		a = s.nextInt();
	}
	catch (Exception e)
	{
		System.out.println("Enter The Proper Nmber"+e);
	}
	try
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The Second Number");
		b = s.nextInt();
	}
catch (Exception e)
	{
	System.out.println("Enter The Proper Number"+e);
}
	int c = a+b;
	System.out.println(c);	
	}
	
	
	public void subraction() 
	{
	int a1 = 0;
	int b1 = 0;
	try
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the First Number");
		a1 = s.nextInt();
	}
	catch (Exception e)
	{
		System.out.println("Enter The Proper Nmber"+e);
	}
	try
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The Second Number");
		b1 = s.nextInt();
	}
catch (Exception e)
	{
	System.out.println("Enter The Proper Number"+e);
}
	int c1 = a1-b1;
	System.out.println(c1);	
}
	
	
	public void multiplication() 
	{
	int a2 = 0;
	int b2 = 0;
	try
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the First Number");
		a2 = s.nextInt();
	}
	catch (Exception e)
	{
		System.out.println("Enter The Proper Nmber"+e);
	}
	try
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The Second Number");
		b2 = s.nextInt();
	}
catch (Exception e)
	{
	System.out.println("Enter The Proper Number"+e);
}
	int c2 = a2*b2;
	System.out.println(c2);	
}

	
	public void division() 
	{
	int a3 = 0;
	int b3 = 0;
	try
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the First Number");
		a3 = s.nextInt();
	}
	catch (Exception e)
	{
		System.out.println("Enter The Proper Nmber"+e);
	}
	try
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The Second Number");
		b3= s.nextInt();
	}
catch (Exception e)
	{
	System.out.println("Enter The Proper Number"+e);
}
	int c3 = a3/b3;
	System.out.println(c3);	
}	
}
