package day11;

public class Arrays {

	public static void main(String[] args) {

		// Advantages of Arrays 
		
		// Store more data's > 1 
		// Minimal time efforts 
		
	
		// Disadvantages of Array
		
		// It is a fixed memory 
		
		int[] empcode = {01,02,03,04,05};
					//	 0  1  2   3  4	
		// We can't increase the index size or memory size 
		
		int[] empid = new int[20];
		
		empid[0] = 01 ;
	
		String [] names = new String[05];
		names[0] = "Navin" ;
		names[1] = "Java" ;
		
		// Exceptions -- Array index of bound exception 
		
		names[11] = "Name" ;

	}

}
