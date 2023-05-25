package day25_FinalandFinally;

import java.util.Scanner;

public class Finally {
	
//  Finally key word -- Whether try is going to run or catch is going to run 
	//  Finally it will run along with try 
	
	public void sum()
	{
		int a = 0 ;
		int b = 0 ;
		
		try
		{
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the First Number");
			a = s.nextInt();
		}
		catch(Exception e)
		{
			System.out.println("Enter the Proper Number" +e);
		}
		finally
		{
			System.out.println("Hint : Enter Only Numbers");
		}
		try
		{
			Scanner s1 = new Scanner(System.in);
			System.out.println("Enter the Second Number");
			b = s1.nextInt();
		}
		catch(Exception e)
		{
			System.out.println("Enter the Proper Number" +e);
		}
		finally
		{
			System.out.println("Hint : Enter Only Numbers");
		}
		int c = a+b;
		System.out.println(c);
		
		
	}


}
