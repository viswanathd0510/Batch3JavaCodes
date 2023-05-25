package day17LogicalOperators;

public class LogicalOperators {
	
	int age = 30 ;
	int uptoage = 55 ;
	int givenage = 10 ;
	int uptoage2 = 45 ; 
	String givencountry = "India" ;
	
	// Requirement - There is a job opening which a person 
	// should cross 30 and less than 55 
	// Requirement 2 - Any age can join this job with lesser age of 45 
	// Nationality can be anything 
	
	// Age should be greater than 18 
	//  Ur Studies be BE or BTECH 
	// Ur nationality should be India
	// u have to have aadhar and pan card
	
	 // && 
	 //  T T - T
	 //  T F - F
	 //  F T - F
	 //  F F - F
	
	// || 
	
	//   T T - T 
	//  F T - T
	// T F - T 
	//  F F - F
	
	// ! -  we dont use regularly 
	
	public void validateage()
	{
		if(givenage>age && givenage <= uptoage)
		{
			System.out.println("Age has been validated");
		}
		else
		{
			System.out.println("Age Vaidation failed");
		}
	}
	public void agevalidation ()
	{
		if(givenage<uptoage2 || givencountry == "usa")
		{
			System.out.println("Selected");
		}
		else 
			System.out.println("not selected");
	}
	public static void main(String[] args) {
	
		LogicalOperators LO =  new LogicalOperators();
		LO.validateage();
		LO.agevalidation();

	}

}
