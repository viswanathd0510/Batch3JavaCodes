package day8;

public class StringandItsMethods {

	public static void main(String[] args) {

		//String Manipulation
		
		//Length
		
		String s = " What Is Your Name ? ";
		System.out.println(s.length());
		
		//Concatenation
		
		String FirstName = "Sivanya"+" ";
		String LastName = "Viswanath"+" ";
		String MiddleName = "Dharmalingam"+" ";
		String FullName = FirstName.concat(MiddleName);
		FullName = FullName.concat(LastName);
		System.out.println(FirstName);
		System.out.println(LastName);
		System.out.println(FullName);
		
		//Changing To Upper Case
		
		FullName = FullName.toUpperCase();
		System.out.println(FullName.toUpperCase());
		//System.out.println(FullName);
		
		//Changing to lower case 
		FullName = FullName.toLowerCase();
		System.out.println(FullName.toLowerCase());
		//System.out.println(FullName);
		
		
		// Comparing two string 
		
		String s1 = "sivanya" ;
		String s2 = "Sivanya";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		
		// Replacing a character
		
		String date = "15.03.2023" ;
		System.out.println(date);
		
		// Client has a requirement to change . to /
		
		date = date.replace('.', '/');
		System.out.println(date);
		
		// Contains 
		String s3 = "viswa" ;
		String s4 = "Viswa" ;
		System.out.println(s3.contains(s4));
		System.out.println(s3.equalsIgnoreCase(s4));
	}

}
