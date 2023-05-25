package day18_Abstraction;

public class Working {

	public static void main(String[] args) {

		VotingRules VR = new VotingRules();
		
		VR.aadharno();
		VR.panno();
		VR.age();
		VR.nationality();
		
		System.out.println("Validation Successful");
		
}

}
