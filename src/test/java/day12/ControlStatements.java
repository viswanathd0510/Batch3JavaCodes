package day12;

public class ControlStatements {

	public static void main(String[] args) {

		// Use control Statement 
		
		// 1 Check for Viswanath
		// 2 Dharmalingam
		// 3 Sivanya
		// 4 Nothing is there
		
		
		String s = "My Name Is Viswanath Dharmalingam" ;
		
		if(s.contains("Vidhya"))
		{
			System.out.println("It contains Vidhya");
		}
		
		else if (s.contains("Java"))
		{
			System.out.println("It contains Java");
		}
		
		else if(s.contains("Sivanya"))
		{
			System.out.println("It contains Sivanya");
		}
		
		else if (s.contains("Name"))
		{
			System.out.println("It contains Name");
		}
		
		else
		{
			System.out.println("Nothing is there ");
			
		}

	}

}
