package day18_Abstraction;

public abstract class OfficeRules {
	
	// Abstraction - Set of Rules that needs to be followed by ur code 
	
			// We will be creating a abstract class, 
		
				//  How to create a abstract class ?
						// Abstract keyword in front of ur class it will change to abstract class
		
					// Abstraction means it should not have implementation part 
						// it should have only method name
		
		// 100 % abstraction is not achieved as it allows non abstract methods also 
		//  Multiple inheritance cannot be achieved here hence move to interface 
		// You can create an object for abstract class
		//  You cannot create object for Interface 
		
		
		//  Create a voting system which will have 
		// Validation of Aadhar
		// Validation of pan
		// validation of age
		// Validation of Nationality 
		
		
		public abstract void timings();
		
		public abstract void dresscode();
		
		public abstract void confidentialityofofficedatas() ;
		
		public void assets()
		{
			System.out.println("Assets are important");
		}


}
