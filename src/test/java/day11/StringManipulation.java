package day11;

public class StringManipulation {

	public static void main(String[] args) {

		String FullName = "Sivanya Viswanath Vidhya" ;
		
		System.out.println(FullName);
		
		String[] Names = FullName.split(" ");
		
		System.out.println(Names[0]);
		System.out.println(Names[1]);
		System.out.println(Names[2]);
		
		System.out.println("*********************");
		
		// Enhanced for loop 
		
		for(String x : Names)
		{
			System.out.println(x);
		}
		
		
		// Another Example
		
		
		String date = "20/03/2023" ;
		
		String[] splitted = date.split("/");
		
		// 20
		//03
		// 2023
		
		System.out.println(splitted[1]);
		
		System.out.println("************");
		
		for(String y :splitted )
		{
			System.out.println(y);
		}

	}

}
